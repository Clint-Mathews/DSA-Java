package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[]){
       SelectSortArray(new int[]{4,5,1,2,3});
    }

    static void SelectSortArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            int max = getMax(arr, arr.length -i);
            swap(arr, max, arr.length - i - 1);
        }
        System.out.println(Arrays.toString(arr));
    }
    static int getMax(int[] arr, int end ){
        int max =0;
        for(int j=1;j<end;j++){
            if(arr[max] < arr[j]){
                max = j;
            }
        }
        return  max;
    }
    static void swap(int[] arr, int max, int currIndex ){
        int temp = arr[currIndex];
        arr[currIndex] = arr[max];
        arr[max] = temp;
    }
}
