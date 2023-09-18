package DSA_90Days_Practice.LinkedLists;

import java.util.LinkedList;

public class JCF{
    public static void main(String args[]){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(0);
        System.out.println(ll);
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
        System.out.println(ll.isEmpty());
    }
}