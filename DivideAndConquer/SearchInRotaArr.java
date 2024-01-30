

public class SearchInRotaArr {
    public static int search(int arr[],int si,int ei,int tar){
        if(si>ei){
            return -1;
        }
        int mid = si+(ei-si)/2;
        // Element found
        if(arr[mid] == tar){
            return mid;
        }
        // Case1: Mid found on l1
        if(arr[si]<=arr[mid]){
            // Case a: Left
            if(arr[si] <= tar && tar <= arr[mid]){
                return search(arr,si,mid-1,tar);
            }
            // Case b: Right
            else{
                return search(arr,mid+1,ei,tar);
            }
        }
        // Case2: Mid found on L2
        else{
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr,mid+1,ei,tar);
            }else{
                return search(arr,mid-1,ei,tar);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println("The element was found on the index of " + search(arr, 0, arr.length-1, 1));
    }
}
