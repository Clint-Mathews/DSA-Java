package conditionalsandloops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Get counter: ");
        int count = input.nextInt();
        for(int i=1;i<=count;i+=2){
            System.out.println(i);
        }
//        for (int i = 0; i < count*count; i++) {
//            System.out.println(i);
//        }
//
        int i=0;
        while(i<count){
            System.out.println(i);
            i++;
        }

        i=0;
        do {
            System.out.println(i);
            i+=10;
        }
        while(i<count);
    }
}
