package DSA_90Days_Practice.Arrays;
import java.util.*;
public class LargestNum {
    public static int largestNum(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int arr[] = {4,5,6,1,2,9,3};
        System.out.println("The largest number in the array is : " + largestNum(arr));
    }
}
