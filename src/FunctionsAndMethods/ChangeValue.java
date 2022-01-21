package FunctionsAndMethods;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] a = {1,2,3,324,43,2};
        change(a);
        System.out.println(Arrays.toString(a));
    }

    static void change(int[] nums){
        nums[0]=1212;
    }
}
