package DSA_90Days_Practice.BinarySearchTree;

public class SearchBST {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
        }
    }

    public static Node buildBST(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = buildBST(root.left, val);
        }else{
            root.right = buildBST(root.right, val);
        }
        return root;
    }

    public static boolean searchBST(Node root,int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data > key){
            return searchBST(root.left, key);
        }else{
            return searchBST(root.right, key);
        }
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        preOrder(root.left);
        System.out.print(root.data + " ");
        preOrder(root.right);
    }
    public static void main(String[] args) {
        int arr[] = {3,4,1,2,5,7};
        Node root = null;
        for(int i=0;i<arr.length;i++){
            root = buildBST(root, arr[i]);
        }
        preOrder(root);
        System.out.println();
        int k = 7;
        if(searchBST(root, k)){
            System.out.println("The key " + k + " was found in the Tree ");
        }else{
            System.out.println("The key " + k + " was not found in the Tree");
        }

    }
}
