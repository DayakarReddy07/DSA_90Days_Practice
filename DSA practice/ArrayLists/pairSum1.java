import java.util.*;

 public class pairSum1 {
  /*   Brute Force approach
    public static boolean pairSum(ArrayList<Integer>list,int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    } */

    public static void pairSum(ArrayList<Integer> list,int target){
        int lp = 0;
        int rp = list.size()-1;
        while(lp<rp){
            if(list.get(lp) + list.get(rp) == target){
                System.out.println("The possible case is : "+ list.get(lp) + " and " + list.get(rp));
                return;
            }
            if(list.get(lp) + list.get(rp) < target){
                lp++;
            }
            if(list.get(lp)+list.get(rp) > target){
                rp--;
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(-1);
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
       pairSum(al, 1);
    }
}
