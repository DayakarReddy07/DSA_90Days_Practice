import java.util.*;
public class maxNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list: ");
        int n = sc.nextInt();
        System.out.println("Enter "+ n + " numbers: ");
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            // if(list.get(i) > max){
            //     max = list.get(i);
            // }  or
            max = Math.max(max,list.get(i));
            
        }
        System.out.println("The maximum in the list is " + max);
    }
}
