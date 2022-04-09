package patterns;

// Pattern considered
// *
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *

public class pattern5 {
    public static void main(String[] args){
        printPattern(5);
    }
    public static void printPattern(int numOfLevels){
        for(int i=1;i<= numOfLevels * 2 - 1;i++){
            // Can do like 2*n - i
            int col = i > numOfLevels ? numOfLevels - i%numOfLevels : i;
            for(int j=1;j<=col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}