package FunctionsAndMethods;

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        funx(1);
        funx(1000,2);
        funx();
        demo("asdadsa","asdsadasd","asdsadsa");
        
    }

    static void demo(int ...a){
        System.out.println(Arrays.toString(a));
    }

    static void demo(String ...a){
        System.out.println(Arrays.toString(a));
    }

    static void funx(int a){
        System.out.println("1");
    }


    static void funx(){
        System.out.println("2");
    }

    static void funx(int a, int v){
        System.out.println(a+v);
    }
}
