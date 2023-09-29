package DSA_90Days_Practice.Arrays;

public class ReverseArray {
    // Brute Force approch
    // public static void reverseArray(int arr[]){
    //     for(int i=arr.length-1;i>=0;i--){
    //         System.out.print(arr[i] + " ");
    //     }
    // }

    public static void reverseArray(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[]  = {1,2,3,4,5};
        System.out.print("The original array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        reverseArray(arr);
         System.out.print("The reversed array is : " );  
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
         }
    }
}
