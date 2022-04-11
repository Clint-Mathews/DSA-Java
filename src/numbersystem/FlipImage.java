package numbersystem;

import java.util.Arrays;

class FlipImage {
    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        flipAndInvertImage(arr);
    }
    static void flipAndInvertImage(int[][] image) {
        for(int[] row : image){
            System.out.println(Arrays.toString(row));
            for (int i = 0; i < (image[0].length +1 )/2; i++) {
                int temp = row[i]^1;
                row[i] = row[image[0].length -1 -i]^1;
                row[image[0].length -1 -i] = temp;
            }
            System.out.println(Arrays.toString(row));
        }
    }
}