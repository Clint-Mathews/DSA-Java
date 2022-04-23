package recursion.BasicRecursion;

public class CountZeros {
    public static void main(String[] args) {
        int n = 1020122;
        CountZeros(n);
        System.out.printf("Count of zeros in %d: %d",n,count);
        System.out.printf("\nCount of zeros in %d: %d",n,CountZerosCount(n));
        System.out.printf("\nCount of zeros in %d: %d",n,CountZerosByArg(n,0));
    }
    static int count =0;
    static void CountZeros(int n){
        if (n == 0) return;
        if(n%10 ==0) count++;
        CountZeros(n/10);
    }
    static int CountZerosCount(int n){
        if (n==0) return 0;
        return ((n%10 ==0) ? 1: 0) + CountZerosCount(n/10);
    }
    static int CountZerosByArg(int n, int count){
        if (n==0) return count;
        return CountZerosByArg(n/10, (n%10)==0 ? ++count: count);
    }
}
