package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        System.out.println(Arrays.toString(Sort(arr)));

        int[] arr2 = {8,3,4,0,12,5,6};
        SortInPlace(arr2,0,arr2.length);
        System.out.println(Arrays.toString(Sort(arr2)));
    }

    static int[] Sort(int[] arr){
        if(arr.length ==1) return arr;
        int mid = arr.length/2;
        int[] leftArr = Sort(Arrays.copyOfRange(arr,0,mid));
        int[] rightArr = Sort(Arrays.copyOfRange(arr,mid,arr.length));
        return mergeArray(leftArr,rightArr);
    }

    static int[] mergeArray(int[] left,int[] right){
        int[] res = new int[left.length + right.length];
        int i=0;
        int j=0;
        int k=0;
        while(j < left.length && k < right.length){
            if(left[j] < right[k]){
                res[i] = left[j];
                j++;
            } else {
                res[i] = right[k];
                k++;
            }
            i++;
        }
        //Copy the remaining elements
        if( j == left.length){
            while(k<right.length){
                res[i] = right[k];
                i++;
                k++;
            }
        } else {
            while(j<left.length){
                res[i] = left[j];
                i++;
                j++;
            }
        }
        return res;
    }

    static void SortInPlace(int[] arr, int start, int end){
        if(end-start == 1) return;
        int mid = start + (end-start)/2;
        SortInPlace(arr,start,mid);
        SortInPlace(arr,mid,end);
        mergeArrayInPLace(arr, start, mid , end);
    }

    static void mergeArrayInPLace(int[] arr, int start, int mid, int end){
        int[] mix = new int[end-start];
        int i=start;
        int j=mid;
        int k=0;
        while(i < mid && j < end){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        //Copy the remaining elements
            while(i < mid){
                mix[k] = arr[i];
                i++;
                k++;
            }
            while(j < end){
                mix[k] = arr[j];
                j++;
                k++;
        }
        // Copy to original array
        for(int c =0;c<mix.length;c++){
            arr[start+c] = mix[c];
        }
    }
}
