package Graphs;

import java.util.LinkedList;

public class AdjacencyListUsingLinkedList {
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
    static class Graph{
        int vertices;
        LinkedList<Integer> list[];
        Graph(int v){
            vertices = v;
            list = new LinkedList[v];
            for (int i = 0; i < v; i++) {
                list[i] = new LinkedList<>();
            }
        }
        void addToGraph(int v, int eval){
            list[v].add(eval);
            // Undirected
            //list[eval].add(v);
        }
        void printGraph(){
            for (int i = 0; i < vertices; i++) {
                System.out.print(i);
                if(list[i].size() > 0){
                    for (int j = 0; j < list[i].size(); j++) {
                        System.out.print( " -> " + list[i].get(j));
                    }
                }
                System.out.println();
            }
        }
    }

    static class GraphWeighted{
        int vertices;
        LinkedList<Edge> list[];
        GraphWeighted(int v){
            vertices = v;
            list = new LinkedList[v];
            for (int i = 0; i < v; i++) {
                list[i] = new LinkedList<>();
            }
        }
        void addToGraph(int v, int eval, int weight){
            Edge edge = new Edge(v,eval,weight);
            list[v].add(edge);
            // Undirected
            //list[eval].add(v);
        }
        void printGraph(){
            for (int i = 0; i < vertices; i++) {
                System.out.print(i);
                if(list[i].size() > 0){
                    for (int j = 0; j < list[i].size(); j++) {
                        Edge edge = list[i].get(j);
                        System.out.print( " -> " + "("+edge.destination + "," + edge.weight + ")");
                    }
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Undirected");
        Graph graph = new Graph(5);
        graph.addToGraph(0,1);
        graph.addToGraph(0,4);
        graph.addToGraph(1,1);
        graph.addToGraph(1,2);
        graph.addToGraph(1,3);
        graph.addToGraph(1,4);
        graph.addToGraph(3,2);
        graph.addToGraph(3,4);
        graph.printGraph();
        System.out.println("Undirected weighted");
        GraphWeighted graphWeighted = new GraphWeighted(5);
        graphWeighted.addToGraph(0,1,1);
        graphWeighted.addToGraph(0,4,5);
        graphWeighted.addToGraph(1,1,2);
        graphWeighted.addToGraph(1,2,3);
        graphWeighted.addToGraph(1,3,4);
        graphWeighted.addToGraph(1,4,2);
        graphWeighted.addToGraph(3,2,2);
        graphWeighted.addToGraph(3,4,5);
        graphWeighted.printGraph();
    }
}
