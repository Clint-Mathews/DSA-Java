package recursion.BackTracking;

import java.util.ArrayList;

public class MazeIncludesDiag {
    public static void main(String[] args) {
        System.out.println(findNoPathsInMaze(3,3));
        System.out.println("All paths: ");
        printPathsInMaze("",3,3);
        System.out.println("All paths in Arraylist: ");
        ArrayList<String> data = printPathsInMazeReturn("",3,3);
        System.out.println(data);
    }

    static int findNoPathsInMaze(int r, int c){
        if( r ==1 || c == 1){
            return 1;
        }
        int count = 0;
        if(r>1 && c>1){
            count += findNoPathsInMaze(r-1,c-1);
        }
        count += findNoPathsInMaze(r-1,c);
        count += findNoPathsInMaze(r,c-1);
        return count;
    }
    static void printPathsInMaze(String path, int r, int c){
        if( r ==1 && c == 1){
            System.out.println(path);
        }
        if(r>1 && c>1){
            printPathsInMaze(path+"D" ,r-1,c-1);
        }
        if(r !=1){
            printPathsInMaze(path+"V" ,r-1,c);
        }
        if(c !=1){
            printPathsInMaze(path+"H",r,c-1);
        }
    }
    static ArrayList<String> printPathsInMazeReturn(String path, int r, int c){
        if( r ==1 && c == 1){
            ArrayList<String> data = new ArrayList<>();
            data.add(path);
            return data;
        }
        ArrayList<String> data = new ArrayList<>();
        if(r>1 && c>1){
            data.addAll(printPathsInMazeReturn(path+"D" ,r-1,c-1));
        }
        if(r !=1){
            data.addAll(printPathsInMazeReturn(path+"V" ,r-1,c));
        }
        if(c !=1){
            data.addAll(printPathsInMazeReturn(path+"H" ,r,c-1));
        }
        return data;
    }
}
