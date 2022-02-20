package Assignments.FirstJava;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Limit: ");
        int limit = input.nextInt();
        printFibonacci(limit);
    }
    static void printFibonacci(int limit){
        if(limit < 0){
            System.out.println("Invalid limit");
            return;
        }
        System.out.println("Fibonacci Series: ");
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for(int n = 2;n<limit;n++){
            int c = b+ a;
            a = b;
            b = c;
            n++;
            System.out.print(c + " ");
        }
    }
}
