package Assignments.FirstJava;

import java.util.Scanner;

public class Simplecalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number1: ");
        float n1 = input.nextFloat();
        System.out.println("Enter Number2: ");
        float n2 = input.nextFloat();
        System.out.println("Enter Operator(+, -, *, /): ");
        char op = input.next().charAt(0);
        calc(n1,n2,op);
    }
    static void calc(float a, float b, char op){
        if(op == '+'){
            System.out.println("Sum: " + (a+b));
        }
        else if(op == '-'){
            System.out.println("Difference: " + (a-b));
        }
        else if(op == '*'){
            System.out.println("Multiplication: " + (a*b));
        }
        else if(op == '/'){
            System.out.println("Division: " + (a/b));
        }
        else {
            System.out.println("Invalid Operator");
        }
    }
}
