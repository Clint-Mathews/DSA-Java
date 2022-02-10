package ArraysAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> data = new  ArrayList<>();
        // Initilaize
        for(int i=0;i<3;i++){
            data.add(new ArrayList<>());
        }
        // Add
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                data.get(i).add(input.nextInt());
            }
        }

        System.out.println(data);
    }
}
