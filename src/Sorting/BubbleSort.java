package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {3,4,2,1,5};
        SortInBubble(arr);
        System.out.println(Arrays.toString(arr));
        arr = new int[]{1,2,3,4,5};
        SortInBubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void SortInBubble(int[] arr){
        //Break case if no swap
        boolean isSwapped = false;
        // i -> Counter
        for(int i = 0; i< arr.length - 1;i++){
            // j -> will traverse the unsorted path
            isSwapped = false;
            for(int j = 1; j < arr.length -1 -i;j++){
                // Swap if smaller
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    isSwapped = true;
                }
            }
            // If array has no swap
            if(!isSwapped){
                break;
            }
        }
    }
}
