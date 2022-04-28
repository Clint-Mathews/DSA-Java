package recursion.Permutations;

import java.util.ArrayList;

public class StringPermutationsReturn {
    public static void main(String[] args) {
        ArrayList<String> res = findPermutations("","abc");
        System.out.println(res);
    }
    static ArrayList<String> findPermutations(String processed, String unprocessed){
        if(unprocessed.isEmpty())
        {
            ArrayList<String> res = new ArrayList<>();
            res.add(processed);
            return res;
        }
        ArrayList<String> res = new ArrayList<>();
        char ch = unprocessed.charAt(0);
        int end =  processed.length();
        for(int  i=0;i<=end;i++){
            String first = processed.substring(0,i);
            String second = processed.substring(i,end);
            ArrayList<String> permutations = findPermutations(first + ch + second,unprocessed.substring(1));
            res.addAll(permutations);
        }
        return res;
    }
}
