package BinarySearch;

public class BinarySearchImplementation {
    public static void main(String[] args) {
        // Sorted array.
        int arr[] = {-18,-9,-6, 0, 2,4,6,9,12,14,20,36,48};
        int target = 20;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        while(start <= end){
            // Might exceed the integer range start+end
            // int middle = (start+end)/2; So
            int middle = start + (end-start)/2;
            if(arr[middle] < target){
                start = middle +1;
            }
            else if(arr[middle] > target){
                end = middle -1;
            }
            //(arr[middle] == target)
            else{
                return middle;
            }
        }
        return -1;
    }
}
