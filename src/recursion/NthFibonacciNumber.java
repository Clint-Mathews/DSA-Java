package recursion;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        System.out.println(findNthFibNumber(7));
        System.out.println(fiboFormula(50));
    }

    static int fiboFormula(int n){
        //Time complexity
        //return (long)Math.pow(((1+Math.sqrt(5))/2),n);
        // Fibo number based on formula
        //return (int)((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
        return (int)(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }
    static int findNthFibNumber(int n) {
        if(n<2){
            return n;
        }
        return findNthFibNumber(n-1) + findNthFibNumber(n-2);
    }
}
