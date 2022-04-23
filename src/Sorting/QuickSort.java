package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        QuickSortArray(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void QuickSortArray(int[] arr, int low, int high){
        if (low >= high) return;
        int s = low;
        int e = high;
        int p = s+(e-s)/2;
        int pivot = arr[p];
        while(s<=e){
            // Already sorted then it will not swap
            while(arr[s] < pivot){
                s++;
            }
            while (arr[e] > pivot){
                e--;
            }
            // Check if start less than end
            if(s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e]= temp;
                s++;
                e--;
            }
        }
        // Now pivot at correct index, please sort the two halfs
        QuickSortArray(arr,low,e);
        QuickSortArray(arr,s,high);
    }
}
