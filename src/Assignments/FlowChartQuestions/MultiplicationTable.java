package Assignments.FlowChartQuestions;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = input.nextInt();
        printMultiplicationTable(number);
    }
    static void printMultiplicationTable(int num){
        System.out.println("Multiplication table for " + num);
        for(int i=1;i<=10;i++){
            System.out.println(num + " * " + i  + " = " + multiply(num,i));
        }
    }
    static int multiply(int num, int val){
        return num * val;
    }
}
