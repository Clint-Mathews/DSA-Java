package recursion.PatternSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.println(Arrays.toString(arr));
        BubbleSortArray(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void BubbleSortArray(int[] arr, int i, int j){
        if(i ==0) return;
        if(j<i){
            if(arr[j] > arr[j+1]){
                swap(arr,j,j+1);
            }
            BubbleSortArray(arr,i,++j);
        } else {
            BubbleSortArray(arr,--i,0);
        }
    }

    static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
