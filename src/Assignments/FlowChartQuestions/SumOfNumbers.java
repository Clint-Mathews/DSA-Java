package Assignments.FlowChartQuestions;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number for a: ");
        int a = input.nextInt();
        System.out.println("Enter number for b: ");
        int b = input.nextInt();
        System.out.println("Sum: " + sum(a,b));
    }
    static int sum(int a, int b){
        return a + b;
    }
}
