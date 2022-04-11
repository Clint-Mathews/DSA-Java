package mathForJava;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        FindFactors(36);
        FindFactorsUingSqrt(36);
        FindFactorsUingSqrtPrint(36);
    }

    //O(n)
    static void FindFactors(int n){
        System.out.println("Factors of " + n);
        for (int i = 1; i <= n; i++) {
            if(n%i==0) {
                System.out.print(i + " ");
            }
        }
    }

    //O(sqrt(n))
    static void FindFactorsUingSqrt(int n){
        System.out.println("Factors of " + n);
        for (int i = 1; i*i <= n; i++) {
            if(n%i==0) {
                System.out.print(i + " ");
                if( i != n/i){
                    System.out.print(n/i + " ");
                }
            }
        }
    }

    //O(sqrt(n)) // Print in sorted order
    static void FindFactorsUingSqrtPrint(int n){
        System.out.println("Factors of " + n);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 1; i*i <= n; i++) {
            if(n%i==0) {
                System.out.print(i + " ");
                if( i != n/i){

                    arr.add(n/i);
                }
            }
        }
        for (int i = arr.size()-1; i >=0; i--) {
            System.out.print(arr.get(i)+ " ");
        }
    }
}
