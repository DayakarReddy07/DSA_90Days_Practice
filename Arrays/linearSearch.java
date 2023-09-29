package DSA_90Days_Practice.Arrays;

public class linearSearch {
    public static int search(int arr[],int key){

        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {5,4,7,2,9,6,10};
        int index = search(arr, 10);
        if(index == -1){
            System.out.println("Key not found in the Index");
        }else{
            System.out.println("Key was found on the index: " + index);
        }
    }
}
