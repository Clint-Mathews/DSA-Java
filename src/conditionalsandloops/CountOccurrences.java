package conditionalsandloops;

import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Get number: ");
        int number = input.nextInt();
        System.out.println("Get check number");
        int num = input.nextInt();
        int count =0;
        while(number > 0 ){
            int check = number % 10;
            if(num == check) {
                count++;
            }
            number = number/10;
        }
        System.out.println("There are "+count + " of number "+ num);
    }
}
