package FunctionsAndMethods;

public class Shadowing {
    static int val =190; // Class variable
    public static void main(String[] args) {
        System.out.println(val);
        // Shadowing started for val
        int val =89; // Shadowed class variable at line 4
        System.out.println(val);
    showVal();
    }

    static void showVal(){
        System.out.println(val);
    }
}
