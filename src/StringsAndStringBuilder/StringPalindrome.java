package StringsAndStringBuilder;

public class StringPalindrome {
    public static void main(String[] args) {
        String test = "abcdcba";
        int start =0;
        if(test == null || test.length() == 0) {
            System.out.println("Not Palindrome");
        } else{
            while(start <= test.length()/2){
                if(test.charAt(start) != test.charAt(test.length() - start -1)){
                    System.out.println("Not Palindrome");
                    break;
                } else {
                    start ++;
                }
            }
            if(start == test.length()/2)System.out.println("Palindrome");
        }
    }
}
