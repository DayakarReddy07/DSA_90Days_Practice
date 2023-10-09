package DSA_90Days_Practice.BinarySearchTree;

public class DeleteNode {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left, val);
        }
        if(root.data < val){
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static Node deleteNode(Node root,int val){
        if(root.data < val){
            root.right = deleteNode(root.right, val);
        }else if(root.data > val){
            root.left = deleteNode(root.left, val);
        }else{
            // Case 1: Leaf Node
            if(root.left == null && root.right == null){
                return null;
            }
            // Case 2: root with one child
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }
            // Case 3: Root with two children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = deleteNode(root.right, val);
        }
        return root;
    }

    

    public static void Inorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static void main(String[] args) {
        int val[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i=0;i<val.length;i++){
            root = insert(root, val[i]);
        }
        System.out.println();
        Inorder(root);
        System.out.println();
        root = deleteNode(root, 10);
        
        Inorder(root);
    }
}
