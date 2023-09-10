import java.util.*;
public class pairSum2 {
    public static boolean pairSortedsum(ArrayList<Integer> list,int target){
        int bp=0;
        int n = list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }
        int lp = bp+1;
        int rp = bp;
        while(lp != rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            if(list.get(lp) + list.get(rp) < target){
                lp = (lp+1)%n;
            }else {
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(11);
        al.add(15);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
       System.out.println(pairSortedsum(al, 17));
    }
}
