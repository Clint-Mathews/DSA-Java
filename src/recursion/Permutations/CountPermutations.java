package recursion.Permutations;

public class CountPermutations {
    public static void main(String[] args) {
        int count = findPermutations("","abcd");
        System.out.println("Number of permutations : " +count);
        int countArg = findPermutationsArg("","abcd",0);
        System.out.println("Number of permutations : " + countArg);
    }
    static int findPermutations(String processed, String unprocessed){
        if(unprocessed.isEmpty())
        {
            //System.out.println(processed);
            return 1;
        }
        int count = 0;
        char ch = unprocessed.charAt(0);
        int end =  processed.length();
        for(int  i=0;i<=end;i++){
            String first = processed.substring(0,i);
            String second = processed.substring(i,end);
            count += findPermutations(first + ch + second,unprocessed.substring(1));
        }
        return count;
    }
    static int findPermutationsArg(String processed, String unprocessed, int count){
        if(unprocessed.isEmpty())
        {
            return 1;
        }
        char ch = unprocessed.charAt(0);
        int end =  processed.length();
        for(int  i=0;i<=end;i++){
            String first = processed.substring(0,i);
            String second = processed.substring(i,end);
            count += findPermutationsArg(first + ch + second,unprocessed.substring(1),0);
        }
        return count;
    }
}
