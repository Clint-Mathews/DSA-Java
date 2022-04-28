package recursion.CompanyQuestions;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        printPhoneComb("23","");
        ArrayList<String> data = printPhoneCombRet("23","");
        System.out.println(data);
        int count = printPhoneCount("23","");
        System.out.println(count);
    }
    static void printPhoneComb(String unprocessed, String processed){
        if(unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        int digit = unprocessed.charAt(0) - '0'; // Convert '2' into 2
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char c = (char)('a' + i);
            printPhoneComb(unprocessed.substring(1),c+processed);
        }
    }
    static ArrayList<String> printPhoneCombRet(String unprocessed, String processed){
        if(unprocessed.isEmpty()) {
            ArrayList<String> res = new ArrayList<>();
            res.add(processed);
            return res;
        }
        ArrayList<String> res = new ArrayList<>();
        int digit = unprocessed.charAt(0) - '0'; // Convert '2' into 2
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char c = (char)('a' + i);
            ArrayList<String> data = printPhoneCombRet(unprocessed.substring(1),c+processed);
            res.addAll(data);
        }
        return res;
    }
    static int printPhoneCount(String unprocessed, String processed){
        if(unprocessed.isEmpty()) {
            return 1;
        }
        int count =0;
        int digit = unprocessed.charAt(0) - '0'; // Convert '2' into 2
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char c = (char)('a' + i);
            count += printPhoneCount(unprocessed.substring(1),c+processed);
        }
        return count;
    }
}
