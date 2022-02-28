package BinarySearch;

// Find the position of an element in a sorted array of infinite numbers
public class PostionOfElementInSortedArray {
    public static void main(String[] args) {
        int start =0;
        int end = 1;
        int i=0;
        int target = 23;
        int arr[] = {2,3,4,5,6,7,8,9,12,23,34,45,67,67,78,122,43434,12121212};
        System.out.println("Index :"+findRange(arr,target));
    }

    static int findRange(int[] arr,int target){
        int start = 0;
        int end = 1;
        while(arr[end] < target){
            int temp = end +1;
            // Double the box value
            // end = previous end  + sizeofbox * 2
            // SizeofBox = end - start + 1
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return search(start,end,arr,target);
    }

    public static int search(int start, int end, int[] arr, int target){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] < target){
                start = mid +1;
            } else if(arr[mid]>target) {
                end = mid -1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
