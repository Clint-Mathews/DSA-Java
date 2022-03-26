package BinarySearchIn2DArray;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String args[]){
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int target = 11;
        System.out.println(Arrays.toString(search(arr,target)));
    }

    // Search in row provided between the col range provided
    static int[] BinarySearch(int[][] arr, int row, int colStart,int colEnd, int target ){
        while(colStart <= colEnd){
            int mid = colStart + (colEnd-colStart)/2;
            if(arr[row][mid] == target){
                return new int[]{row,mid};
            } else if(arr[row][mid] < target) {
                colStart = mid+1;
            } else {
                colEnd = mid-1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][] arr, int target){
        int rows = arr.length;
        int columns = arr[0].length; // be cautions matrix may be empty
        if(rows == 1){
            BinarySearch(arr, 0,0,columns-1,target);
        }
        int rowStart = 0;
        int rowEnd= rows-1;
        int colMid = columns/2;

        //Run the loop 2 rows are remaining
        while(rowStart<rowEnd-1){
            int mid = rowStart + (rowEnd-rowStart)/2;
            if(arr[mid][colMid] == target){
                return new int[]{mid,colMid};
            } else if (arr[mid][colMid] < target) {
                rowStart = mid;
            } else{
                rowEnd = mid;
            }
        }
        // Now we have 2 rows
        //Check if target in columns of two rows
        if(arr[rowStart][colMid] == target){
            return new int[]{rowStart,colMid};
        }
        if(arr[rowEnd][colMid] == target){
            return new int[]{rowEnd,colMid};
        }

        //Search in 1st half, 2nd or 4th half

        if(target <= arr[rowStart][colMid-1])
        {
            return BinarySearch(arr, rowStart,0,colMid-1,target);
        }
        if(target >= arr[rowStart][colMid+1] && target < arr[rowStart][columns-1])
        {
            return BinarySearch(arr, rowStart,colMid+1,columns-1,target);
        }
        if(target >= arr[rowStart+1][colMid-1])
        {
            return BinarySearch(arr, rowStart+1,0,colMid-1,target);
        }

        if(target >= arr[rowStart+1][colMid+1] && target < arr[rowStart+1][columns-1])
        {
            return BinarySearch(arr, rowStart+1,colMid+1,columns-1,target);
        }
        else {
            return new int[]{-1,-1};
        }
        // Not Found

    }
}
