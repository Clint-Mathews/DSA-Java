package recursion.BasicRecursion;

public class ReverseANumber {
    public static void main(String[] args) {
        System.out.println(ReversNum(1234));
        ReversNumUsingSum(1234);
        System.out.println(sum);
        System.out.println(ReverseWay2(1234));
        System.out.println(ReverseWay2Same(1234));

    }
    static int sum = 0;
    static void ReversNumUsingSum(int n){
        if(n == 0) return;
        sum = sum * 10 + (n%10);
        ReversNumUsingSum(n/10);
    }

    static int ReverseWay2(int n){
        if(n%10 ==n) return n;
        int digits = (int)(Math.log10(n));
        return ((n%10) * (int)Math.pow(10,digits)) + ReverseWay2(n/10);
    }
    static int ReverseWay2Same(int n){
        int digits = (int)(Math.log10(n));
        return helper(n,digits);
    }
    static int helper(int n, int digits){
        if(n%10 ==n) return n;
        return ((n%10) * (int)Math.pow(10,digits)) + helper(n/10,digits-1);
    }
    static int ReversNum(int n){
        if(n%10 == n) return n;
        return (n%10) * (int)Math.pow(10,(""+n).length()-1) + ReversNum(n/10);
    }
}
