package patterns;
// Pattern considered
// * * * * *
// * * * *
// * * *
// * *
// *

public class pattern3 {
    public static void main(String[] args){
        printPattern(5);
    }
    public static void printPattern(int numOfLevels){
        for(int i=1;i<=numOfLevels;i++){
            for(int j=1;j<=numOfLevels - i + 1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
