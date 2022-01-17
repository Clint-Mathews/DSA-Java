package conditionalsandloops;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number to be reversed: ");
        int num = input.nextInt();
        int rev =0;
        while(num > 0){
            int digit = num%10;
            // if num =123 , then at the end we have like 32 *10 + 1
            rev = rev*10+ digit;
            num /= 10;
        }
        System.out.println("Reverse of number: "+ rev);
    }
}
