import java.util.*;
public class swapTwonos {
    public static void swap(ArrayList<Integer> list ,int idx1,int idx2) {
            int temp = list.get(idx1);
            list.set(idx1,list.get(idx2));
            list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(56);
        list.add(100);
        System.out.println("The original array list is : " + list);
        int idx1 = 1;
        int idx2 = 3;
        swap(list, idx1, idx2);
         System.out.println("The swapped array list is : " + list);
         Collections.sort(list);
         System.out.println(list);
         Collections.sort(list,Collections.reverseOrder());
         System.out.println(list);
    }
}
