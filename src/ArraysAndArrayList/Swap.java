package ArraysAndArrayList;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = new int[]{1,23,45,656,213};
        System.out.println(Arrays.toString(arr));
        swap(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        reverseTheArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1]= arr[index2];
        arr[index2] = temp;
    }
    static void reverseTheArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
