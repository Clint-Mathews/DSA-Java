package recursion.PatternSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,8};
        System.out.println(Arrays.toString(arr));
        SortSelection(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }

    static void SortSelection(int[] arr, int i,int j, int lar){
        if( i ==0 ) return;
        if(j<=i){
            if(arr[j] > arr[lar]) {
                lar = j;
            }
            SortSelection(arr,i,++j,lar);
        } else {
            int temp = arr[i];
            arr[i] = arr[lar];
            arr[lar] = temp;
            SortSelection(arr,--i,0,0);
        }
    }
}
