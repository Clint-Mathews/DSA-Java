package Graphs;

import java.util.ArrayList;

public class IncidenceMatrix {
    static class Edge{
        int destination;
        int edge;
        Edge(int dest, int edg){
            destination = dest;
            edge = edg;
        }
    }
    static void add(int[][] arr, int i,int j,int e){
        arr[i][e] = 1;
        // Edge pointing to same vertex
        if(i != j){
            arr[j][e] = -1;
        }
    }

    static void addList(ArrayList<ArrayList<Edge>> arr, int i, int j, int e){
        arr.get(i).add(new Edge(j,e));
    }
    static void printList(ArrayList<ArrayList<Edge>> arr){
        System.out.print( "     ");
        for (int i = 0; i < arr.get(0).size(); i++) {
            System.out.print( i+ "    ");
        }
        System.out.println();
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(i);
            for(Edge el:arr.get(i)){
                System.out.print(" -> " + "( "+el.edge + ","+ el.destination+ " )");
            }
            System.out.println();
        }
    }
    static void print(int[][] arr){
        System.out.print( "     ");
        for (int i = 0; i < arr[0].length; i++) {
            System.out.print( i+ "    ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i);
            for(int el:arr[i]){
                System.out.print("   " + el);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Incidence Matrix");
        int[][] arr = new int[5][8];
        // graph,start,end,edge
        add(arr,0,1,0);
        add(arr,0,4,1);
        add(arr,1,4,2);
        add(arr,1,3,3);
        add(arr,1,1,5);
        add(arr,1,2,6);
        add(arr,3,4,4);
        add(arr,3,2,7);
        print(arr);

        System.out.println("Incidence List");
        // Incidence List
        ArrayList<ArrayList<Edge>> mat = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            mat.add(new ArrayList<Edge>());
        }
        // graph,start,end,edge
        addList(mat,0,1,0);
        addList(mat,0,4,1);
        addList(mat,1,4,2);
        addList(mat,1,3,3);
        addList(mat,1,1,5);
        addList(mat,1,2,6);
        addList(mat,3,4,4);
        addList(mat,3,2,7);
        printList(mat);

    }
}
