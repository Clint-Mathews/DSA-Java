package Assignments.FlowChartQuestions;

import java.util.Scanner;

public class HCFANDLCM {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int a = input.nextInt();
        System.out.println("Enter Number 2: ");
        int b = input.nextInt();
        int hcf = findHCF(a,b);
        int lcm = findLCM(a,b,hcf);
        System.out.println("HCF for "+a+" and "+b+" : "+hcf);
        System.out.println("LCM for "+a+" and "+b+" : "+lcm);
    }
    static int findHCF(int a, int b){
        // Largest or smallest doesn't matter as the first division will largest be with 0 and will auto find the gcf or hcf
        while(a%b != 0){
            int rem = a%b;
            a = b;
            b = rem;
        }
        return b;
    }
    static int findLCM(int a, int b, int gcd){
        // GCD * LCM = n1 * n2
        int lcm = (a*b)/gcd;
        return lcm;
    }
}
