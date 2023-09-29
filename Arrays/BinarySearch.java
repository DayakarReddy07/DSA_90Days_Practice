package DSA_90Days_Practice.Arrays;

public class BinarySearch {
    public static int binarySearch(int numbers[],int key){
        int start = 0;
        int end = numbers.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] > key){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {5,4,8,7,1,9,2,3};
        int index = binarySearch(numbers, 9);
        System.out.println("The key was found on index : " + index);
    }
}
