package DSA_90Days_Practice.BinarySearchTree;

public class Arr2BST {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node sortedArr2BST(int arr[],int si,int ei){
        if(si > ei){
            return null;
        }
        int mid = (si + ei)/2;
        Node root = new Node(arr[mid]);
        root.left = sortedArr2BST(arr, si, mid-1);
        root.right = sortedArr2BST(arr, mid+1, ei);
        return root;
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        int arr[] = {3,5,6,8,10,11,12};
        Node root = sortedArr2BST(arr, 0, arr.length-1);
        preOrder(root);
    }
}
