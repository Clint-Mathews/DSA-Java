package numbersystem;

public class Power {
    public static void main(String[] args) {
        int base =2;
        int power =4;
        int ans=1;
        while(power >0){
            // 1 & 1 == 1 condition on last element
            if((power & 1) == 1) {
                ans *= base;
            }
            base *=base;
            power = power >> 1;
        }
        System.out.println(ans);
    }
}
