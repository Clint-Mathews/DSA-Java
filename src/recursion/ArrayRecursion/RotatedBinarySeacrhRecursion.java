package recursion.ArrayRecursion;

public class RotatedBinarySeacrhRecursion {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println("Target exists in index : " + serach(arr,7, 0, arr.length-1));
        System.out.println("Target exists in index : " + serach(arr,3, 0, arr.length-1));
        System.out.println("Target exists in index : " + serach(arr,56, 0, arr.length-1));
    }

    static int serach(int[] arr, int target, int start, int end){
        if(start > end) return -1;
        int mid = start + (end-start)/2;
        if(arr[mid]== target) return mid;
        if(arr[start] <= arr[mid]){
            if(target <= arr[mid] && target >= arr[start]){
                return serach(arr,target, start, mid-1);
            } else {
                return serach(arr,target, mid+1, end);
            }
        }
        if(target >= arr[mid] && target<=arr[end]){
            return serach(arr,target, mid+1, end);
        }
        return serach(arr,target, start, mid-1);
    }
}
