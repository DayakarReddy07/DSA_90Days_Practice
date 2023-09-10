import java.util.*;
public class Operations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // al.add(1);
        // al.add(2);
        // al.add(3);
        // al.add(5);
        // System.out.println(al);
        // System.out.println(al.get(2));
        // al.remove(2);
        // System.out.println(al);
        // al.set(2,10);
        // System.out.println(al);
        // System.out.println(al.contains(6));
        // al.add(1,25);
        // System.out.println(al);
        // System.out.println(al.size());
        // for(int i=0;i<al.size();i++){
        //     System.out.print(al.get(i) + " ");
        // }
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.print("The original order is : " );
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.print("The reverse order is :  ");
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i) + " ");
        }
    }
}
