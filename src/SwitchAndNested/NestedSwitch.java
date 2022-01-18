package SwitchAndNested;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empId = input.nextInt();
        String dep = input.next();
        switch (empId){
            case 1:
                System.out.println("Clint");
                break;
            case 2:
                System.out.println("Clins");
                break;
            case 3:
                switch(dep){
                    case "PH":
                        System.out.println("PH");
                        break;
                    case "OP":
                        System.out.println("OP");
                        break;
                    default: System.out.println("Invalid department");
                }
                break;
            default:
                System.out.println("Invalid Employee");
                break;
        }
    }
}
