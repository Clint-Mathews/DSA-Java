package Assignments.FirstJava;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = input.next();
        System.out.println("Hello "+ name);
    }
}
