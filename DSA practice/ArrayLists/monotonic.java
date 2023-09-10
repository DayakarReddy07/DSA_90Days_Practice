import java.util.*;
public class monotonic {
    public static boolean isMonotonic(ArrayList<Integer> list){
        boolean inc = true;
        boolean dec = true;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i) > list.get(i+1)){
                inc = false;
            }
            if(list.get(i)<list.get(i+1)){
                dec = false;
            }
        }
        return inc || dec;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the list: ");
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println(isMonotonic(list));
    }
}
