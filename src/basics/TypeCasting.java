package basics;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int data = input.nextInt();
//        System.out.println(data);
//        int data = (int)(45.34f);
//        System.out.println(data);
//        int data = 200;
//        byte a = (byte)(data);
//        System.out.println(a);
//        byte a =40;
//        byte b=50;
//        byte c=100;
//        int d = a*b /c;
//        System.out.println(d);

//        byte v = 50;
//        v = v*20;
//        int data = 'A';
//        System.out.println(data);

        byte b =42;
        char c ='a';
        short s = 1024;
        int i =50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b) + (i/c) + (d-s);
        System.out.println((f*b) + " " + (i/c) + " " + (d-s));
        System.out.println(result);
    }
}
