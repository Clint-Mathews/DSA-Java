package recursion.Permutations;

public class StringPermutation {
    public static void main(String[] args) {
        findPermutations("","abc");
    }
    static void findPermutations(String processed, String unprocessed){
        if(unprocessed.isEmpty())
        {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        int end =  processed.length();
        for(int  i=0;i<=end;i++){
            String first = processed.substring(0,i);
            String second = processed.substring(i,end);
            findPermutations(first + ch + second,unprocessed.substring(1));
        }
    }
}
