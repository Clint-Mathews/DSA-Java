package Assignments.FirstJava;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principal: ");
        int principal = input.nextInt();
        System.out.println("Enter no: of years: ");
        int years = input.nextInt();
        System.out.println("Enter rate of interest: ");
        int rate = input.nextInt();
        System.out.println("Simple Interest: " + calculateSimpleIntr(principal,years,rate));
    }
    static float calculateSimpleIntr(int p, int y, float r){
        return p*y*(r/100);
    }
}
