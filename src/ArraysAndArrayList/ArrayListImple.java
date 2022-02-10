package ArraysAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListImple {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList();
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>(20);
        arr1.add(12);
        arr1.set(0,1122);
        arr1.remove(0);
        System.out.println(arr1.contains(12));
        System.out.println(arr1);
        Scanner input = new Scanner(System.in);
        for(int i=0;i<10;i++){
            arr1.add(input.nextInt());
        }
        System.out.println(arr1);
        for(int i=0;i<10;i++){
            System.out.print(arr1.get(i) + " ");
        }
    }
}
