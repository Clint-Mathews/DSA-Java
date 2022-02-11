package LinearSearchAlgorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionalSerach {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {2,33,4,5},
                {4,5}
        };
        System.out.println(findElement(arr,23));
        System.out.println(Arrays.toString(findElementFor(arr,33)));
        System.out.println(findMaxElementFor(arr));
    }
    static boolean findElement(int[][] arr,int check){
        for(int[] el:arr){
            for(int innerEl:el){
                if(innerEl == check){
                    return true;
                }
            }
        }
        return false;
    }

    static int[] findElementFor(int[][] arr,int check){
        for(int row =0; row<arr.length;row++){
            for(int col =0; col< arr[row].length;col++){
                if(arr[row][col] == check){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{};
    }

    static int findMaxElementFor(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int row =0; row<arr.length;row++){
            for(int col =0; col< arr[row].length;col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
