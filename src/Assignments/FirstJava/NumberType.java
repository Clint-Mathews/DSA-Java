package Assignments.FirstJava;

import java.util.Scanner;

public class NumberType {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = input.nextInt();
        String type = checkType(num);
        System.out.println(num + " is " + type);
    }
    static String checkType(int num){
        return num%2==0 ? "Even" : "Odd";
    }
}
