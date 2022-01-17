package conditionalsandloops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Trim to remove whitespace at the front and back
        // charAt get character at 1st index ie 0
        char c = input.next().trim().charAt(0);
        System.out.println(c);
        int val = c;
        System.out.println(val);
        if(c  >= 'a' && c<= 'z') {
            System.out.println("LowerCase");
        } else if(c >= 'A' && c <='Z'){
            System.out.println("UpperCase");
        } else {
            System.out.println("Invaild Charcter");
        }

    }
}
