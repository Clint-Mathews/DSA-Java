package recursion.BasicRecursion;

public class SumOfNNumbers {
    public static void main(String[] args) {
        System.out.println("SUM: "+ Sum(5));
    }
    static int Sum(int n){
        if(n==1) return 1;
        return n + Sum(n-1);
    }
}
