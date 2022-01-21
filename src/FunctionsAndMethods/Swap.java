package FunctionsAndMethods;

public class Swap {
    public static void main(String[] args) {
        int a =10,b=30;
        int temp = a;
        a=b;
        b=temp;
        swapNumber(a,b);
        System.out.println(a+"-"+b);

        String names = "Clint";
        updateName(names);
        System.out.println(names);
    }
    static void updateName(String name){
        name ="ffdsfsdf";
    }

    static void swapNumber(int a, int b){
        int temp = a;
        a=b;
        b=temp;
    }
}
