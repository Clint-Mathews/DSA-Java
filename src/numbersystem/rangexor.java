package numbersystem;

public class rangexor {
    public static void main(String[] args) {
        // range xor a,b = xor(b)^xor(a-1)
        int a = 3;
        int b = 9;
        int ans = xor(b) ^ xor(a-1);
        System.out.println(ans);
        // Check result, will give TLE for large result
        int ans2 = 0;
        for(int i=a;i<=b;i++){
            ans2 ^= i;
        }
        System.out.println(ans2);
    }

    static int xor(int n){
        if(n%4 == 0) {
            return n;
        }
        if(n%4 == 1) {
            return 1;
        }
        if(n%4 == 2) {
            return n+1;
        }

        return 0;
    }
}
