package FunctionsAndMethods;

import java.util.Arrays;

public class VArgs {
    public static void main(String[] args) {
        fun(12,12,21,21,21,1,21);
        fun1(1,2,"adas","sadsadasd","ad","asdas","da","das","d","asda");
    }

    public static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    public static void fun1(int a, int v, String ...x){
        System.out.println(Arrays.toString(x));
    }
}
