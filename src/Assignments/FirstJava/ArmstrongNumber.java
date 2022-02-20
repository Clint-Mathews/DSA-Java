package Assignments.FirstJava;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = input.nextInt();
        int num2 = input.nextInt();
        String number = Integer.toString(num);
        String number2 = Integer.toString(num2);
        System.out.println("Number "+ num + " is Armstrong " + (checkArmstrong(num) == num));
        System.out.println("Number "+ num2 + " is Armstrong " + (checkArmstrong(num2) == num2));
        System.out.println("Number "+ number + " is Armstrong " + (checkArmstrongString(number).equals(number)));
        System.out.println("Number "+ number2 + " is Armstrong " + (checkArmstrongString(number2).equals(number2)));
    }
    static int checkArmstrong(int num){
        int sum = 0;
        while(num >0){
           int rem = num%10;
           sum += rem * rem * rem;
           num = num/10;
        }
        return sum;
    }
    static String checkArmstrongString(String num){
        int sum =0;
        for(int i=0;i<num.length();i++){
            sum += Math.pow(Integer.parseInt(String.valueOf(num.charAt(i))),3);
        }
        return Integer.toString(sum);
    }
}
