package SortingAlgorithms;

public class BubbleSort {
    public static void bubbleSort(int nums[]){
        int swaps = 0;
     for(int turn = 0;turn<nums.length-1;turn++){
        for(int j=0;j<nums.length-1-turn;j++){
            if(nums[j] > nums[j+1]){
                swaps++;
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
            }
        }
     }
     System.out.println("The total number of swaps is : " + swaps);   
    }
    public static void printArray(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        bubbleSort(arr);
        printArray(arr);
    }
}
