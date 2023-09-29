package DSA_90Days_Practice.Arrays;
// To print maximum sub array sum in an efficient way
public class KadanesAlgo {
    public static void kadanesAlgo(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currSum = currSum + arr[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum,maxSum);
        }
        System.out.println("The maximum subarray sum in the array is : " + maxSum);
    }
    public static void main(String args[]){
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanesAlgo(arr);
    }
}
