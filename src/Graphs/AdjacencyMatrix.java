package Graphs;

public class AdjacencyMatrix {
    static void add(int[][] matrix , int i, int j){
        matrix[i][j] = 1;
    }
    static void print(int[][] matrix){
        for(int[] row : matrix){
            for(int val: row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        add(matrix,0,1);
        add(matrix,0,4);
        add(matrix,1,1);
        add(matrix,1,2);
        add(matrix,1,3);
        add(matrix,1,4);
        add(matrix,3,2);
        add(matrix,3,4);
        print(matrix);
    }
}
