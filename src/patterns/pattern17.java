package patterns;

// Pattern considered
//     1
//    212
//   32123
//  4321234
// 543212345
//  4321234
//   32123
//    212
//     1

import java.util.stream.IntStream;

public class pattern17 {
    public static void main(String[] args){
        printPattern(5);
    }
    public static void printPattern(int numOfLevels){
        for(int i=1;i<= 2*numOfLevels-1;i++){
            int col = i>numOfLevels ? numOfLevels - i%numOfLevels : i;
            for(int k = 1; k<= numOfLevels - col;k++){
                System.out.print(" ");
            }
            int printNum = col;
            for(int j=1;j<=2*col-1;j++){
                System.out.printf("%d",printNum );
                printNum = j >= col ?  printNum +1 : printNum-1;
            }
            System.out.println();
        }
    }
}
