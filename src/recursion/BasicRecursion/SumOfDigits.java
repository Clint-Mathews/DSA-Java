package recursion.BasicRecursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Sum of digits: "+SumDigits(1234));
    }
    static int SumDigits(int n){
        if(n==0) return 0;
        return (n%10)+SumDigits(n/10);
    }
}
