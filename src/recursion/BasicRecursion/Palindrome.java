package recursion.BasicRecursion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Number 123454321 is Palindrome: " + Palindrome(123454321));
        System.out.println("Number 34543543 is Palindrome: " + Palindrome(34543543));
        String c = "chahc";
        System.out.printf("\nString %s is palindrome: %b",c, checkPalindrome(c,0, c.length()-1));
        int x = 12321;
        String v = Integer.toString(x);
        System.out.printf("\nString %s is palindrome: %b",c, checkPalindrome(v,0, v.length()-1));
    }

    static boolean Palindrome(int n){
        return n == rev(n);
    }
    static int rev(int n){
        if(n%10 ==n) return n;
        return ((n%10) * (int)Math.pow(10,(int)Math.log10(n))) + rev(n/10);
    }

    static boolean checkPalindrome(String n, int start, int end){
       if(end < start) return true;
       return n.charAt(start) == n.charAt(end) && checkPalindrome(n,++start,--end);

    }
}
