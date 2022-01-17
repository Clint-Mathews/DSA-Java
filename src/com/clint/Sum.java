package com.clint;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        float n1 = input.nextFloat();
        System.out.println("Enter 2nd number: ");
        float n2 = input.nextFloat();
        float sum =  n1+n2;
        System.out.println("Sum: " +sum);
    }
}
