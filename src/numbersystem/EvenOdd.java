package numbersystem;

public class EvenOdd {
    public static void main(String[] args){
        System.out.println("Is Odd "+checkEvenOrOdd(46));
    }
    static boolean checkEvenOrOdd(int num){
        return (num &1) == 1;
    }
}
