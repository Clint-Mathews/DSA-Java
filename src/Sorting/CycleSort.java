package Sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args){
        CyclicSort(new int[] {3,5,2,1,4});
        CyclicSortOtherWay(new int[] {3,5,2,1,4});
    }

    static void CyclicSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            while(arr[i] - 1 != i){
                swap(i,arr[i] - 1, arr);
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // Correct method will break when we have duplicates
    static void CyclicSortOtherWay(int[] arr){
        int i = 0;
        while(i< arr.length){
            int correct = arr[i]-1;
            if(arr[correct] != arr[i]){
                swap(i, correct, arr);
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int first, int second, int[] arr){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second ] = temp;
    }
}
