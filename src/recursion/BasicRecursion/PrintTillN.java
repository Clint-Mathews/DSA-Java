package recursion.BasicRecursion;

public class PrintTillN {
    public static void main(String[] args) {
        System.out.println("Reverse: ");
        PrintNumberNto1(5);
        System.out.println("\nNumber: ");
        PrintNumber1toN(5);
        System.out.println("\nBoth: ");
        PrintBoth(5);
    }
    static void PrintNumberNto1(int n){
        if(n==0) return;
        System.out.printf("%d ",n);
        PrintNumberNto1(n-1);
    }
    static void PrintNumber1toN(int n){
        if(n==0) return;
        PrintNumber1toN(n-1);
        System.out.printf("%d ",n);
    }

    static void PrintBoth(int n){
        if(n==0) return;
        System.out.printf("%d ",n);
        PrintBoth(n-1);
        System.out.printf("%d ",n);
    }
}
