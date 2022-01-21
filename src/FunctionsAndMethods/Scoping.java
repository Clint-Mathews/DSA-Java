package FunctionsAndMethods;

public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b=10;
        viewData();
    }

    static void viewData(){
        int fc=12;
        System.out.println(fc);
    }
}
