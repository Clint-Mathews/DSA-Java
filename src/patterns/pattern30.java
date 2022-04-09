package patterns;
// Pattern considered
//         1
//       2 1 2
//     3 2 1 2 3
//   4 3 2 1 2 3 4
// 5 4 3 2 1 2 3 4 5

import java.util.stream.IntStream;

public class pattern30 {
    public static void main(String[] args){
        printPattern(5);
    }
    public static void printPattern(int numOfLevels){
        for(int i=1;i<= numOfLevels;i++){
            for(int k = 1; k<= 2*(numOfLevels-i);k++){
                System.out.print(" ");
            }
            int printNum = i;
            for(int j=1;j<=2*i-1;j++){
                System.out.printf("%d ",printNum );
                printNum = j >= i ?  printNum +1 : printNum-1;
            }
            System.out.println();
        }
    }
}
