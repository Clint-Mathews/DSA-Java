package BinarySearchQuestions;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SplitArrayBinarySearch {
    public static void main(String[] args) {
        int[] arr = {7,2,5,8,10};
        int m = 2;
        splitArray(arr, m);
    }
    static void splitArray(int[] arr, int split){
        int start = 0;
        int end = 0;
        for(int i =0;i<arr.length;i++){
            start = Math.max(start,arr[i]);
            end += arr[i];
        }
        findArraySplit(arr,start,end, split);
        System.out.println(findMaxInMinArray(arr,start,end, split));
    }

    static int findMaxInMinArray(int[] arr,int start, int end, int split){
        while(start<end) {
            int sum = 0;
            int pieces = 1;
            int mid = start + (end - start) / 2;
            for (int num : arr) {
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces > split) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        // start == end
        return end;
    }

    static void findArraySplit(int[] arr, int start, int end, int split){
        ArrayList<ArrayList<Integer>> data = new ArrayList<ArrayList<Integer>>();
        while(start< end){
            int mid = start + (end-start)/2;
            data = splitGivenArray(arr, mid);
            int pieces = data.size();
            // Pieces based on which the size needs to be updated for the arrays, ie start  goes up if pieces increases or else end
            // No: of pieces are more increase start, ie : start = mid +1
            // No: of pieces are less increase end, ie : end = mid
            if( split < pieces){
                start = mid+1;

            } else {
                end = mid;
            }
        }
        // When the start == end we go out
        System.out.println(data.toString());
    }
    static ArrayList<ArrayList<Integer>> splitGivenArray(int[] arr, int maxVal){
        int max =0;
        ArrayList data = new ArrayList();
        ArrayList<Integer> innerData = new ArrayList();
        for(int i=0;i<arr.length;i++){
            if(max+arr[i] < maxVal){
                innerData.add(arr[i]);
                max += arr[i];
            } else{
                max = arr[i];
                data.add(innerData);
                innerData = new ArrayList();
                innerData.add(arr[i]);
            }
        }
        data.add(innerData);
        return data;
    }
}
