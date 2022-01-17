package com.clint;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.println("Temperature Conversion");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        float temp = input.nextFloat();
        float ftemp = (temp * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + ftemp);
    }
}
