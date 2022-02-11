package LinearSearchAlgorithm;

public class LinearSearch {
public static void main(String[] args){
    int[] arr = {12,2323232,21,2,1,21,2,12,1,21,223432432,432,3,243,24,3232};
    int index = searchArrayIndex(arr, 2323232);
    System.out.println("position " + index);
    System.out.println("Element " + searchArrayElement(arr, 432));
    System.out.println("Element exists: " + searchArrayExist(arr, 111432));
}



// Search in an array if success return index else -1;
static int searchArrayIndex(int[] arr, int check){
    if (arr.length == 0) {
        return -1;
    }
    for(int index=0;index<arr.length;index++){
        if(arr[index] == check){
            return index;
        }
    }
    // Element doesnot exist
    return -1;
}

    // Search in an array if success return index else -1;
    static int searchArrayElement(int[] arr, int check){
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        for(int el:arr){
            if(el == check){
                return el;
            }
        }
        // Element doesnot exist
        return Integer.MAX_VALUE;
    }


    // Search in an array if success return index else -1;
    static boolean searchArrayExist(int[] arr, int check){
        if (arr.length == 0) {
            return false;
        }
        for(int el:arr){
            if(el == check){
                return true;
            }
        }
        // Element doesnot exist
        return false;
    }
}
