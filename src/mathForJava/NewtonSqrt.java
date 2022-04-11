package mathForJava;

public class NewtonSqrt {
    public static void main(String[] args) {
        System.out.println(findSqrt(40));
    }

    static double findSqrt(double n){
        double x =n;
        double root =0;
        while(true){
            root = .5*(x + (n/x));
            if(Math.abs(root - x) < 1){
                break;
            }
            x = root;
        }
        return root;
    }
}
