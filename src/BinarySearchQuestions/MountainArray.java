package BinarySearchQuestions;

public class MountainArray {
    // Peak Index in a Mountain Array
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        System.out.println(findPeak(arr));
    }
    static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length -1;
        int ans = -1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){
                // Decreasing part of array check in left
                end = mid;
            } else {
                // (arr[mid] < arr[mid + 1])
                // Increasing part of array. mid + 1 is > mid
                start = mid + 1;
            }
        }
        // In the End, start==end . Since the checks will be to find the max element.
        // Hence if we point to same element means max
        //
        return arr[start];
    }
}
