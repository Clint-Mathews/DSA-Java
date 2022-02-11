package LeetCode;

//Find the number of even number of digits in an array of numbers
//Input: [12,2212,3,322,122]
//Output: 2
public class FindEvenNumberDigitsNumberInArray {
    public static void main(String[] args) {
        int[] arr = {12,2212,3,322,122};
        System.out.println(FindNoOfEvendigitNumber(arr));
        System.out.println(CheckCountIfEven(1212212));

    }
    static int FindNoOfEvendigitNumber(int[] arr){
        int count =0;
        for(int el:arr){
            if(CheckEvenDigitsInNumber(el)){
                count++;
            }
        }
        return count;
    }

    static boolean CheckEvenDigitsInNumberString(int num){
        return ((num+"").length() %2 == 0);
    }

    static boolean CheckEvenDigitsInNumber(int num){
        if(num < 0) {
            num = num*-1;
        }
        if(num ==0){
            return false;
        }
        int count =0;
        while(num >0){
            count++;
            num=num/10;
        }
        return count%2==0;
    }

    static boolean CheckCountIfEven(int num){
        if(num < 0) {
            num =num*-1;
        }
        System.out.println(num);
        System.out.println(Math.log10(num));
        System.out.println((int)(Math.log10(num)));

        return ((int)(Math.log10(num)) + 1 )%2==0;
    }
}
