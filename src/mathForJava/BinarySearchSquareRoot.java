package mathForJava;

public class BinarySearchSquareRoot {
    public static void main(String[] args) {
        int n= 40;
        int p = 3;
        System.out.printf("%.2f",sqrt(n,p));
    }

    static double sqrt(int n, int p){
        int start =0;
        int end = n;
        double ans = 0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid * mid == n){
                return mid;
            }
            if(mid*mid > n){
                end = mid -1;
            } else{
                start = mid+1;
            }
        }
        ans = end;
        double incr = .1;
        for(int i=1;i<=p;i++){
            while(ans * ans < n){
                ans+=incr;
            }
            ans -=incr;
            incr /=10;
        }
        return ans;
    }
}
