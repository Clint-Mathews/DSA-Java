package Assignments.FirstJava;

import java.util.Scanner;

public class RuppesToUSD {
    static double CONVERSION_TO_USD_FACT = 75.35;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Amount in Rupees: ");
        float amount = input.nextFloat();
        System.out.println("USD : " + convertToUSD(amount));
    }
    static double convertToUSD(float amount){
        return amount / CONVERSION_TO_USD_FACT;
    }
}
