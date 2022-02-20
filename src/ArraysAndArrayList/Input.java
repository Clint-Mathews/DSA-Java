package ArraysAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0]=0;
        arr[2]=2;
        arr[1]=1;
        arr[4]=4;
        arr[3]=3;
        System.out.println(Arrays.toString(arr));
        Scanner input = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        for(int num : arr){
            System.out.print(num + " ");
        }

        String[] arrData = new String[3];
        for(int i=0;i<arrData.length;i++){
            arrData[i] = input.next();
        }
        arrData[2] = "Hello";
        System.out.println(Arrays.toString(arrData));
    }
}
