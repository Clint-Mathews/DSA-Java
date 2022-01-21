package FunctionsAndMethods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int sum = getSum();
        System.out.println("Sum:" + sum);
        System.out.println("Sum:" + getSumData());
    }

    public static int getSum(){
        System.out.println("Sum of 2 Numbers");
        Scanner input = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("Enter number 1: ");
        num1 = input.nextInt();
        System.out.println("Enter number 2: ");
        num2 = input.nextInt();
        sum = num1+num2;
        return sum;
    }

    public static int getSumData(){
        System.out.println(showName(2));
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = input.nextInt();
        return getSum1(num1,num2);
    }

    static String showName(int number){
        return "Sum of "+ number +" Numbers";
    }
    public static int getSum1(int num1, int num2){
        int sum = num1+num2;
        return sum;
    }
}
