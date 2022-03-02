package BinarySearchQuestions;

public class FindSearchInMountainArray {
    // Peak Index in a Mountain Array
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,2,1};
        int target = 4;
        int peak = findPeak(arr);
        int ans = binarySearch(arr,target,true,0,peak);
        if(ans == -1){
            ans = binarySearch(arr,target,false,peak,arr.length-1);
        }
        System.out.println(ans);
    }
    static int binarySearch(int[] arr,int target, boolean isAscending, int startIndex , int endIndex ){
        int start = startIndex;
        int end = endIndex;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(isAscending){
                if(arr[mid] > target){
                    end = mid -1;
                } else if(arr[mid] < target){
                    start = mid +1;
                } else {
                    return mid;
                }
            } else{
                if(arr[mid] > target){
                    start = mid +1;
                } else if(arr[mid] < target){
                    end = mid -1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
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
        return start;
    }
}
