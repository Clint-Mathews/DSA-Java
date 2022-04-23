package recursion.PatternSort;

public class Pattern1 {
    public static void main(String[] args) {
        printPattern(4,0);
        printPattern2(4,0);
    }

    static void printPattern(int r , int c){
        if(r <= 0) return;
        if(r == c) {
            System.out.println();
            printPattern(r-1,0);
        } else {
            System.out.print( "*" );
            printPattern(r,++c);
        }
    }
    static void printPattern2(int r , int c){
        if(r <= 0) return;
        if(r == c) {
            printPattern2(r-1,0);
            System.out.println();
        } else {
            printPattern2(r,++c);
            System.out.print( "*" );
        }
    }
}
