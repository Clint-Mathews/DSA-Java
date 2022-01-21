package FunctionsAndMethods;

import java.util.Scanner;

public class MAin {
    public static void main(String[] args) {

        // Q: Take 2 inputs and print the sum?
        Scanner input = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("Enter number 1: ");
        num1 = input.nextInt();
        System.out.println("Enter number 2: ");
        num2 = input.nextInt();
        sum = num1+num2;
        System.out.println("Sum:" + sum);
    }
}
