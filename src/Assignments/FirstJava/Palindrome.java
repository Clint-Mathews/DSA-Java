package Assignments.FirstJava;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = input.nextInt();
        String num2 = input.next();
        System.out.println("Number is palindrome: " + (num == checkPalindrome(num)));
        System.out.println("Number is palindrome: " + checkPalindromeString1(num2));
        System.out.println("Number is palindrome: " + checkPalindromeString2(num2));
    }
    static int checkPalindrome(int num){
        int reverse = 0;
        while(num > 0){
            int rem = num%10;
            reverse = reverse * 10 + rem;
            num = num /10;
        }
        System.out.println(reverse);
        return reverse;
    }
    static boolean checkPalindromeString1(String num){
        int len = num.length();
        for(int i =0;i< len/2;i++){
            if(num.charAt(i) != num.charAt(len - i -1)){
                return false;
            }
        }
        return true;
    }
    static boolean checkPalindromeString2(String num){
        int len = num.length();
        String rev = new String();
        for(int i =len-1;i>=0;i--){
            rev += num.charAt(i);
        }
        return num.equals(rev);
    }
}
