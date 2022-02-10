package ArraysAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] b = new int[][]{
                {1,2,3},
                {2,3,4}
        };
        int[][] c = new int[][]{
                {1,2},
                {2,3,4},
                {12,12,12,2,121,12}
        };
        System.out.println(b[0][1]);
        int[][] a =  new int[2][2];
        for (int row=0;row<a.length;row++){
            for(int col=0;col<a[row].length;col++){
                a[row][col] = input.nextInt();
            }
        }
        for (int row=0;row<a.length;row++){
            for(int col=0;col<a[row].length;col++){
                System.out.print(a[row][col] + " ");
            }
            System.out.println();
        }

        for (int row=0;row<a.length;row++){
            System.out.println(Arrays.toString(a[row]));
        }

        for (int[] row: a ){
            System.out.println(Arrays.toString(row));
        }

        String[] str = new String[]{
                "Hello","Clint","Yup!"
        };

        for (String st : str) {
            System.out.println(st);
        }
    }
}

