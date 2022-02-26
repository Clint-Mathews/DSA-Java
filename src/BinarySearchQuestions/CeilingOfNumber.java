package BinarySearchQuestions;

public class CeilingOfNumber {
    public static void main(String args[]){
        int[] arr = {2,3,5,9,14,16,18};
        int target = 35;
        System.out.println(findCeling(arr,15));
        System.out.println(findFlorr(arr,567674));
    }

    // Return the smallest no >= target
    static int findCeling(int[] arr, int targ){
        if(targ > arr[arr.length - 1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start<= end){
            int middle = start + (end-start)/2;
            if(arr[middle] > targ) {
                end = middle - 1;
            } else if(arr[middle] < targ){
                start = middle + 1;
            } else {
                return arr[middle];
            }
        }
        return arr[start];
    }

    // Return the greatest
    // no <= target
    static int findFlorr(int[] arr, int targ){
        if(targ > arr[arr.length - 1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int middle = start + (end-start)/2;
            if(arr[middle] > targ) {
                end = middle -1;

            } else if(arr[middle] < targ){
                start = middle + 1;
            } else {
                return arr[middle];
            }
        }
        return arr[end];
    }
}
