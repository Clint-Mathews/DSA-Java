package Assignments.FlowChartQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class FindSumOFNumberTillLimit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String in = "";
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(true) {
            System.out.println("Enter Value: ");
            in= input.next();
            // == compares References not value
            // .equals compares values
            if(in.equals("x")){
                break;
            }
            if(!checkIfNumber(in)){
               System.out.println("Not a number");
               continue;
            }
            arr.add(Integer.parseInt(in));
        }
        System.out.println("Sum: " + sum(arr));
    }
    static int sum(ArrayList<Integer> arr){
        int sum =0;
        for(int data: arr){
            sum+= data;
        }
        return sum;
    }
    static boolean checkIfNumber(String num){
        try{
           Integer.parseInt(num);
           return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
