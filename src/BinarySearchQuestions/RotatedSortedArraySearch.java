package BinarySearchQuestions;
// Will not work for duplicate values
public class RotatedSortedArraySearch {
    public static void main(String[] args) {
        int[] nums = {2,9,2,};
        int target =9;
        int pivot = findPeak(nums);
        int res =-1;
        if(pivot == -1){
            // Normal binary serach since its normal ascending arrray
            res = BinarySearch(nums, target, 0, nums.length-1);
        } else {
            if(nums[pivot] == target ){res = pivot;} else if(nums[0] <= nums[pivot]){
                res = BinarySearch(nums, target, 0, pivot-1);
            }else{
                res = BinarySearch(nums, target, pivot+1, nums.length-1);
            }
        }

        System.out.println(res);
    }
    static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){
                return mid;
                } else if(arr[mid] < arr[mid-1]){
                return mid-1;
                } else {
                // Wont Work For duplicates
//                if(arr[start] >= arr[mid]){
//                    end = mid-1;
//                } else {
//                    start = mid+1;
//                }
                //For duplicte case skip duplicate
                if(arr[start] == arr[mid] && arr[end] == arr[mid]){
                    //Note if they are pivots
                    if(arr[start] > arr[start+1]){
                        return start;
                    }
                    start ++;
                    if(arr[end] < arr[end-1]){
                        return end-1;
                    }
                    end --;
                }
                // left side is sorted so pivot in right
                else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[end] < arr[mid]) ){
                    start = mid + 1;
                } else {
                    end = mid -1;
                }
            }
        }
        return -1;
    }
    static int BinarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            } else{
                    if(arr[mid] < target) {
                        start = mid+1;
                    } else {
                        end = mid -1;
                    }
                }
            }
        return -1;
    }
}
