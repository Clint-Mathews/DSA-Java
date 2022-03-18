package BinarySearchIn2DArray;

import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {11,23,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target = 29;
        System.out.println(Arrays.toString(serach2DArray(arr,target)));
    }
    static int[] serach2DArray(int[][] arr, int target){
        int row = 0;
        int col = arr.length-1;
        while(row < arr.length && col >=0){
            if( arr[row][col] == target){
                return new int[]{row,col};
            } else if (target < arr[row][col]){
                col --;
            } else {
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
