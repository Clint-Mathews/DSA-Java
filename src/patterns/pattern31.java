package patterns;

// Pattern considered
//   4 4 4 4 4 4 4
//   4 3 3 3 3 3 4
//   4 3 2 2 2 3 4
//   4 3 2 1 2 3 4
//   4 3 2 2 2 3 4
//   4 3 3 3 3 3 4
//   4 4 4 4 4 4 4

public class pattern31 {
    public static void main(String[] args){
        printPattern(4);
    }
    public static void printPattern(int n){
        int org = n;
        n = 2*n-1;
        for(int i=0;i< n;i++){
            for(int j=0;j< n;j++){
                int printVal = Math.min(Math.min(i,j), Math.min(n-i-1,n-j-1));
                System.out.printf("%d ",org-printVal);
            }
            System.out.println();
        }
    }
}
