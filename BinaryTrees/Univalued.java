package DSA_90Days_Practice.BinaryTrees;

public class Univalued {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean univaluedTree(Node root){
        
    }
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(5);
        root.left.right = new Node(2);
        univaluedTree(root);
    }
}
