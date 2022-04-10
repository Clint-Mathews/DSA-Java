package recursion;

public class numbersexample {
    public static void main(String[] args){
        printNum(1);
    }

    static void printNum(int n){
        System.out.println(n);
        if(n == 5) return;
        printNum(++n);
    }
}
