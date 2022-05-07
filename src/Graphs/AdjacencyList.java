package Graphs;

import java.util.ArrayList;

public class AdjacencyList {
    static class Edge{
        int source;
        int destination;
        int weight;
        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }
    static void add(ArrayList<ArrayList<Integer>> data, int index, int v){
        data.get(index).add(v);
    }
    static void addWeighted(ArrayList<ArrayList<Edge>> data, int index, int v, int weight){
        Edge edge = new Edge(index,v,weight);
        data.get(index).add(edge);
    }
    static void print(ArrayList<ArrayList<Integer>> data){
        for(int i=0; i< data.size();i++){
            System.out.print(i);
            for(int el : data.get(i)){
                System.out.print( " -> " + el);
            }
            System.out.println();
        }
    }
    static void printWeighted(ArrayList<ArrayList<Edge>> data){
        for(int i=0; i< data.size();i++){
            System.out.print(i);
            for(Edge el : data.get(i)){
                System.out.print( " -> " + "("+el.destination + "," + el.weight + ")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Undirected");
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new ArrayList<Integer>());
        }
        add(list,0,1);
        add(list,0,4);
        add(list,1,1);
        add(list,1,2);
        add(list,1,3);
        add(list,1,4);
        add(list,3,2);
        add(list,3,4);
        print(list);

        System.out.println("Undirected weighted");
        ArrayList<ArrayList<Edge>> weightedList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            weightedList.add(new ArrayList<Edge>());
        }
        addWeighted(weightedList,0,1,1);
        addWeighted(weightedList,0,4,5);
        addWeighted(weightedList,1,1,2);
        addWeighted(weightedList,1,2,3);
        addWeighted(weightedList,1,3,4);
        addWeighted(weightedList,1,4,2);
        addWeighted(weightedList,3,2,2);
        addWeighted(weightedList,3,4,3);
        printWeighted(weightedList);
    }
}
