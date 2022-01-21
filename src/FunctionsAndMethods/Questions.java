package FunctionsAndMethods;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner input = new Scanner(System.in);
        int data = input.nextInt();
        System.out.println("Is " + data+ " prime : " + checkPrime(data));
        System.out.println("Is " + data+ " prime : " + checkPrimeWhile(data));
        System.out.println("Is " + data+ " Armstrong : " + checkArmstrong(data));
        for(int i=1;i<1000;i++){
            if(checkArmstrong(i)) {
            p    System.out.printf(i +" ");
            }
        }
    }

    static boolean checkPrime(int num){
        if (num <= 1){
            return  false;
        }
        for(int i=2;i*i<=num;i++){
            if (num%i == 0){
                return false;
            }
        }
        return true;
    }

    static boolean checkPrimeWhile(int num){
        if (num <= 1){
            return  false;
        }
        int i=2;
        while(i*i<=num){
            if (num%i == 0){
                return false;
            }
            i++;
        }
        return i*i > num;
    }

    // Print all the 2 digit armstrong numbers
    public static boolean checkArmstrong(int num){
        int sum =0;
        int org = num;
        while(num >0){
            int rem = num%10;
            sum += rem* rem * rem;
            num = num/10;
        }
        return  sum==org;
    }
}
