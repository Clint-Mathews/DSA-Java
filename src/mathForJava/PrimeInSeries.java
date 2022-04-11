package mathForJava;

public class PrimeInSeries {
    public static void main(String[] args) {
        int n= 40;
        boolean[] primes = new boolean[n+1];
        sieves(n,primes);
    }

    // False in array means number is prime
    // True means number is visited so not prime
    static void sieves(int n,boolean[] primes){
        // Checks till root as the data gets duplicated after
        for (int i = 2; i*i < n; i++) {
            // false case is correct as prime
            if(!primes[i]){
                // Check for other factors
                for(int j =2*i;j<= n;j+=i){
                    primes[j] = true;
                }
            }
        }
        for(int i =2; i< n;i++){
            if(!primes[i]){
                System.out.print(" Prime : " + i);
            }
        }
    }
}
