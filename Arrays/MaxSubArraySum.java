package DSA_90Days_Practice.Arrays;

public class MaxSubArraySum {
    // Brute Force Approach
    public static void maxSubArraySum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum = 0;
                for(int k=i;k<=j;k++){
                    currSum += arr[k];
                }
                System.out.print(currSum + "  ");
                 if(maxSum < currSum){
                maxSum = currSum;
            }
            // System.out.println();
            }
            System.out.println();
        }
        System.out.println("The maximum sub array in the array is : " + maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        maxSubArraySum(arr);
    }
}
