package DSA_90Days_Practice.BinarySearchTree;

public class IsvalidBST {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right,val);
        }
        return root;
    }
     public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }


    public static boolean isvalidBst(Node root,Node min,Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }else if(max != null && root.data >= max.data){
            return false;
        }
        return isvalidBst(root.left, min, root) && isvalidBst(root.right, root, max);
    }
    
   
    public static void main(String[] args) {
        int val[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i=0;i<val.length;i++){
            root = insert(root, val[i]);
        }
        inorder(root);
        System.out.println();
       if(isvalidBst(root, null,null)){
        System.out.println("This is a valid binary search tree");
       }else{
        System.out.println("This is Invalid binarySearch tree");
       }
    }
}
