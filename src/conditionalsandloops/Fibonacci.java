package conditionalsandloops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which fibonacci element? ");
        int n = input.nextInt();
        int a =0,b=1;
        for (int i=2; i<=n;i++){
            int temp = b;
            b=a+b;
            a=temp;
        }
        System.out.println(n + "th fibonacci element : " + b);
        int a1 =0,b1=1;
        int count =2;
        while(count<=n){
            int temp = b1;
            b1= b1+a1;
            a1= temp;
            count++;
        }
        System.out.println(n + "th fibonacci element : " + b1);
    }
}
