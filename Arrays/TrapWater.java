package DSA_90Days_Practice.Arrays;

public class TrapWater {
    public static int trapRainWater(int heights[]){
        int n = heights.length;
        //Calculate left Max boundary
        int leftMax[] = new int[n];
        leftMax[0] = heights[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(heights[i],leftMax[i-1]);
        }
        //Calculate right Max boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = heights[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(heights[i],rightMax[i+1]);
        }
        int trappedWater = 0;
        for(int i=0;i<n;i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            trappedWater += waterLevel-heights[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int heights[] = {4,2,0,6,3,2,5};
        System.out.println("The trapped water is : " + trapRainWater(heights));
    }
}
