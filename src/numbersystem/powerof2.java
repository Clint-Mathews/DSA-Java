package numbersystem;

public class powerof2 {
    public static void main(String[] args) {
        int n=32;// fix for n =0
        boolean ans = ((n & (n-1)) == 0);
        if(n==0){
            System.out.println(false);
        } else{
            System.out.println(ans);
        }
    }
}
