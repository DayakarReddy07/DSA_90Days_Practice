package DSA_90Days_Practice.BinarySearchTree;
import java.util.*;
public class RootTOLeafPath {
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
        }else if(root.data < val){
            root.right = insert(root.right,val);
        }
        return root;
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i) +  " -> ");
        }
        System.out.println("N");
    }

    public static void printRoot2path(Node root,ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null & root.right == null){
            printPath(path);
        }
        printRoot2path(root.left, path);
        printRoot2path(root.right, path);
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        int val[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i=0;i<val.length;i++){
            root = insert(root, val[i]);
        }
        printRoot2path(root,new ArrayList<>());
        // printPath(new ArrayList<>());
    }
}
