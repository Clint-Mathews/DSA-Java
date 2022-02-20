package Assignments.FlowChartQuestions;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = input.nextInt();
        System.out.println("Is a leap year: " + checkLeapYear(year));
    }

    static boolean checkLeapYear(int year){
        // If year divisible by 400 - leap year
        // If year not divisible by 100 - not a leap year
        // Then if year divisible by 4 - leap year
        return (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0));
    }
}
