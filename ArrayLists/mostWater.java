import java.util.*;

public class mostWater {
    // Brute force approach
    // public static int storeWater(ArrayList<Integer> height) {
    //     int max = 0;
    //     for(int i=0;i<height.size();i++){
    //         for(int j=0;j<height.size();j++){
    //             int ht = Math.min(height.get(i),height.get(j));
    //             int width = j-i;
    //             int currWater = ht * width;
    //             max = Math.max(max,currWater);
    //         }
    //     }
    //     return max;
    // }

    // Two Pointer approach
    public static int storeWater(ArrayList<Integer> height){
        int lp = 0;
        int rp = height.size()-1;
        int maxWater = 0;
        while(lp < rp){
            int ht = Math.min(height.get(lp),height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater,currWater);
            if(height.get(lp) < height.get(rp)){
                lp++;
            } else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> height = new ArrayList<>();
        System.out.println("Enter the number of heights : ");
        int n = sc.nextInt();
        System.out.println("Enter the heights: ");
        for(int i=0;i<n;i++){
            height.add(sc.nextInt());
        }
        sc.close();
        System.out.println("The maximum area to store water is : " + storeWater(height));
    }
}
