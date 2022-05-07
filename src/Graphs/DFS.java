package Graphs;

import java.util.LinkedList;
import java.util.Stack;

public class DFS {
    static class Graph{
        int size;
        LinkedList<Integer>[] list;
        boolean[] visited;
        Graph(int size){
            this.size = size;
            list = new LinkedList[size];
            visited = new boolean[size];
            for (int i = 0; i < size; i++) {
                list[i] = new LinkedList<Integer>();
            }
        }
        void add(int u, int v){
            list[u].add(v);
            list[v].add(u);
        }
        void print(){
            System.out.println("Graph");
            for(int i=0; i< list.length;i++){
                System.out.print(i + " : ");
                int count = 0;
                for(int el : list[i]){
                    System.out.print( el);
                    count++;
                    if(count < list[i].size()) {
                        System.out.print( " -> ");
                    }
                }
                System.out.println();
            }
        }
        void DFS(int start){
            System.out.println("DFS");
            Stack<Integer> stack = new Stack<>();
            stack.push(start);
            visited[start] = true;
            while (!stack.isEmpty()){
                int edge = stack.pop();
                System.out.print(edge + " ");
                for (int i = 0; i < list[edge].size(); i++) {
                    int vertex = list[edge].get(i);
                    if(!visited[vertex]){
                        stack.push(vertex);
                        visited[vertex] = true;
                    }
                }
            }
            while(!checkAllTrue(visited)){
                int newStart = 0;
                for (int i = 0; i < visited.length; i++) {
                    if(!visited[i]){
                        newStart = i;
                        break;
                    }
                }
                System.out.println();
                DFS(newStart);
            }
            System.out.println();
        }
        void DFSRec(int edge){
            if(checkAllTrue(visited)){
                return;
            }
            visited[edge] = true;
            System.out.print(edge + " ");
            for (int i = 0; i < list[edge].size(); i++) {
                int vertex = list[edge].get(i);
                if(!visited[vertex]){
                    DFSRec(vertex);
                }
            }
        }
    }
    public static boolean checkAllTrue(boolean[] array)
    {
        for(boolean b : array) if(!b) return false;
        return true;
    }
    public static void main(String[] args) {
        Graph graph = new Graph(7);
        graph.add(0,1);
        graph.add(0,3);
        graph.add(1,2);
        graph.add(2,3);
        graph.add(3,4);
        graph.add(2,6);
        graph.add(5,6);
        graph.add(4,5);
        graph.print();
        graph.DFS(0);
        Graph graph2 = new Graph(9);
        graph2.add(0,1);
        graph2.add(0,3);
        graph2.add(1,2);
        graph2.add(2,3);
        graph2.add(4,5);
        graph2.add(6,7);
        graph2.add(6,8);
        graph2.add(7,8);
        graph2.print();
        graph2.DFS(0);
        Graph graph3 = new Graph(7);
        graph3.add(0,1);
        graph3.add(0,3);
        graph3.add(1,2);
        graph3.add(2,3);
        graph3.add(3,4);
        graph3.add(2,6);
        graph3.add(5,6);
        graph3.add(4,5);
        graph3.print();
        System.out.println("DFS Recursive");
        graph3.DFSRec(0);
    }
}
