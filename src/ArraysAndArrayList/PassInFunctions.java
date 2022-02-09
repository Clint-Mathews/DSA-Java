package ArraysAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class PassInFunctions {
    public  static void main(String[] args) {
        int[] a = new int[]{1,2,3,45,5};
        System.out.println(Arrays.toString(a));
        UpdateArray(a);
        System.out.println(Arrays.toString(a));
    }
    public static void UpdateArray(int[] b){
        b[b.length -1] = 2334;
    }
}
