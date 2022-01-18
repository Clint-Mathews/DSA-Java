package SwitchAndNested;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
//        String a = "Clint";
//        String b = "Clint";
//        System.out.println(a.equals(b));
//        System.out.println(a==b);
        switch(fruit){
            case "apple":
                System.out.println(fruit);
            case "orange":
                System.out.println(fruit);
            default:
                System.out.println("Default");
        }

        int day = input.nextInt();
        switch(day){
            case 1 -> {
                // Multiple switch statements
                System.out.println("Monday");}
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            default -> System.out.println("Holiday");
        }

        switch(day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
        }

        switch(day){
            case 1,2,3,4,5 -> {
                System.out.println("Weekday");
//                break;
            }
            case 6,7 -> {
                System.out.println("Weekend");
//                break;
            }
        }
    }
}
