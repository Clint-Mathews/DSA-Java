package ArraysAndArrayList;

public class DynamicArray {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
            {1,2,23,12},{12,12,21,21}};
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
