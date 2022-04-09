package patterns;


// Pattern considered
//     *
//    * *
//   * * *
//  * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *

import java.util.stream.IntStream;

public class pattern28 {
    public static void main(String[] args){
        printPattern(5);
    }
    public static void printPattern(int numOfLevels){
        for(int i=1;i<= numOfLevels * 2 - 1;i++){
            int col = i > numOfLevels ? numOfLevels - i%numOfLevels : i;
            for(int k = 1; k<= numOfLevels - col;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}