package mathForJava;

public class Prime {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if (checkPrimeNo(i)){
                System.out.println("Is Prime : " + i);
        }
        }
    }

    static boolean checkPrimeNo(int n){
        if(n <= 1) return false;
        int i =2;
        while( i*i <=n){
            if(n%i == 0) return false;
            i++;
        }
        return true;
    }
}
