package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {5,3,4,1,2};
        InsertionSortImp(arr);
    }
    static void InsertionSortImp(int[] arr){
        for(int i=0;i<arr.length - 1;i++){
            for(int j = i+ 1; j > 0;j--){
                if(arr[j-1] < arr[j]){
                    break;
                } else {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}