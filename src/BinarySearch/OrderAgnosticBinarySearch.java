package BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,89,702};
        int[] desArr = {702,455,234,89,12,2,1,-1,-45};
        int target = 89;
        System.out.println(OrderAgnosticBinSearch(arr, target));
        System.out.println(OrderAgnosticBinSearch(desArr, target));
    }
    static int OrderAgnosticBinSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        // Find whether array sorted in ascending or descending
        boolean isAscending = arr[start] < arr[end];
        // Index while is same as index values never changes from 0 till n-1
        while(start <= end){

            int middle = start + (end-start)/2;

            if(arr[middle] == target) {
                return middle;
            }
            if (isAscending){
                if(arr[middle] < target){
                    start = middle +1;
                }
                // arr[middle] > target
                else {
                    end = middle - 1;
                }
            } else {
                if(arr[middle] < target){
                    end = middle - 1;
                }
                // arr[middle] > target
                else {
                    start = middle + 1;
                }
            }
        }
        return -1;
    }
}
