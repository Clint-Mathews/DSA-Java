package conditionalsandloops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input from user till he press x
        while(true){
            System.out.println("Enter Operation: ");
            char ch = input.next().trim().charAt(0);
            System.out.println();
            if(ch == '+' || ch == '-'|| ch == '/'|| ch=='*' || ch=='%') {
                // Input 2 numbers
                System.out.println("Enter two numbers: ");
                int n1 = input.nextInt();
                int n2 = input.nextInt();
                System.out.println();
                int ans = 0;
                if(ch== '+') {
                    ans = n1 + n2;
                }
                if(ch== '-') {
                    ans = n1-n2;
                }
                if(ch== '/') {
                    if(n2>0) {
                        ans = n1 / n2;
                    }
                }
                if(ch== '*') {
                    ans = n1*n2;
                }
                if(ch== '%') {
                ans =n1%n2;
                }
                System.out.print("Output: "+ans);
            } else if(ch == 'x' || ch == 'X') {
                System.out.println("Exiting.....");
                break;
            } else {
                System.out.println("Invalid Operation!");
            }
            System.out.println();
        }
    }
}
