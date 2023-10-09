package DSA_90Days_Practice.BinaryTrees;

public class DiameterOfTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        public int height(Node root){
            if(root == null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh,rh)+1;
        }

        // Inefficient calculation of Diameter of tree (O(n^2))
        public int diameter2(Node root){
            if(root == null){
                return 0;
            }
            int ld = diameter2(root.left);
            int lh = height(root.left);
            int rd = diameter2(root.right); 
            int rh = height(root.right);
            int sd = lh + rh + 1;
            return Math.max(sd,Math.max(ld,rd));
        }
    }

    static class Info{
        int ht;
        int diam;
        public Info(int ht,int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static Info diameter(Node root){
        if(root == null){
            return new Info(0,0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht,rightInfo.ht) + 1;
        return new Info(ht,diam);
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("The Diameter of the tree is : " + diameter(root).diam);
        System.out.println("The height of the tree is : " + diameter(root).ht);
    }
}
