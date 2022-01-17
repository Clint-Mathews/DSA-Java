package conditionalsandloops;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Numbers: ");
        int a =input.nextInt();
        int b =input.nextInt();
        int c =input.nextInt();
        // 1st Method
        if(a>b){
            if(a>c) {
                System.out.println(a + " Largest");
            } else {
                System.out.println(c + " Largest");
            }
        } else {
            if(b>c) {
                System.out.println(b + " Largest");
            } else {
                System.out.println(c + " Largest");
            }
        }
        //2nd Method

        if(c>a && c>b) {
            System.out.println(c+ " Largest");
        } else {
            if(a>b){
                System.out.println(a+ " Largest");
            } else {
                System.out.println(b+ " Largest");
            }
            }

        // 3rd Method
        if(c>a && c>b) {
        System.out.println(c+ " Largest");
    } else if(a>b) {
            System.out.println(a+ " Largest");
        } else {
            System.out.println(b+ " Largest");
        }


        // 4th Method
        int max = a;
        if(b > max) {
            max =b;
        }
        if(c>max) {
            max =c;
        }
        System.out.println(max + " Largest");


        int maximum = Math.max(a,b);
        maximum = Math.max(maximum,c);
        System.out.println(maximum + " Largest");
}
    }
