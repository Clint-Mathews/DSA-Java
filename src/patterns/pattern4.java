package patterns;
// Pattern considered
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

public class pattern4 {
    public static void main(String[] args){
        printPattern(5);
    }
    public static void printPattern(int numOfLevels){
        for(int i=1;i<=numOfLevels;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%d ",j);
            }
            System.out.println();
        }
    }
}