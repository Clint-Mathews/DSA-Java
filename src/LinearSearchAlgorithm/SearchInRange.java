package LinearSearchAlgorithm;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {12,12,1,21,2,1,21,21,124,3434};
        System.out.println(linearSearch(arr,21, 2, 7));
    }
    // Search in an array if success return index else -1;
    static int linearSearch(int[] arr, int check, int startindex, int endindex){
        if (arr.length == 0 || startindex <0 || endindex > arr.length) {
            return -1;
        }
        for(int index=startindex;index<=endindex;index++){
            if(arr[index] == check){
                return index;
            }
        }
        // Element doesnot exist
        return -1;
    }
}
