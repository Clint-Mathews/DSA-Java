package patterns;
// Pattern considered
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *
public class pattern1 {
    public static void main(String[] args){
        printPattern(5);
    }

    static void printPattern(int n){
        for(int i= 1;i <= n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
