package recursion.BasicRecursion;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println("Product of digits: "+ProductDigits(1234));
    }
    static int ProductDigits(int n){
//        if(n==0) return 1;
        if(n%10 == n) return n;
        return (n%10)*ProductDigits(n/10);
    }
}
