package com.clint;

public class While {
    public static void main(String[] args) {
//        if(true) {
//            System.out.println("True");
//        }
        int count = 0;
        while(count < 5) {
            System.out.println("True" + count);
            count++;
        }
        for (int c = 0; c < 5; c++) {
            System.out.println("True" + c);
        }
    }
}
