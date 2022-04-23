package recursion.RecursionString;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSequence {
    public static void main(String[] args) {
        findSubSequence("","abc");
        ArrayList<String> data = findSubSequenceRet("","abc");
        System.out.println(data);
        ArrayList<String> response = new ArrayList<>();
        findSubSequenceWithRet("","abc",response);
        System.out.println(response);
    }
    static void findSubSequence(String processed, String data){
        if(data.isEmpty()) {
            System.out.println(processed);
            return;
        }
        findSubSequence(processed,data.substring(1));
        findSubSequence(processed+data.charAt(0),data.substring(1));
    }
    static ArrayList<String> findSubSequenceRet(String processed,String data){
        if(data.isEmpty()) {
            ArrayList<String> res = new ArrayList<>();
            res.add(processed);
            return res;
        }
        ArrayList<String> left = findSubSequenceRet(processed+data.charAt(0),data.substring(1));
        ArrayList<String> right = findSubSequenceRet(processed,data.substring(1));
        left.addAll(right);
        return left;
    }
    static void findSubSequenceWithRet(String processed,String data, ArrayList<String> res){
        if(data.isEmpty()) {
            res.add(processed);
            return;
        }
        findSubSequenceWithRet(processed+data.charAt(0),data.substring(1),res);
        findSubSequenceWithRet(processed,data.substring(1),res);
    }
}
