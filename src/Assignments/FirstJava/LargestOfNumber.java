package Assignments.FirstJava;

import java.util.Scanner;

public class LargestOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number1: ");
        int num1 = input.nextInt();
        System.out.println("Enter Number1: ");
        int num2 = input.nextInt();
        System.out.println("Largest: " + (num1 > num2 ? num1 : num2));
    }
}
