package Stack;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackUsingQueue {
    static class Stack<T>{
        Queue<T> q1,q2;
        Stack(){
            q1 = new ArrayDeque<>();
            q2 = new ArrayDeque<>();
        }
        void add(T item){
            // Copy all items to the next queue
            while(!q1.isEmpty()){
                q2.add(q1.peek());
                q1.poll();
            }
            // Add new element
            q1.add(item);
            while(!q2.isEmpty()){
                q1.add(q2.peek());
                q2.poll();
            }
        }
        void print(){
            if(!q1.isEmpty()){
                System.out.println("Stack: ");
                for (T s : q1) System.out.println(s);
            } else {
                System.out.println("Stack empty!");
            }
        }
        T remove(){
            // Check if empty underflow
            if(q1.isEmpty()){
                System.out.println("Queue empty");
            }
            T item = q1.poll();
            return item;
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] keys = {1,2,3,4,5};
        for(int key:keys){
            stack.add(key);
            System.out.println("Added : " + key);
        }
        stack.print();
        for(int key:keys){
            int data = stack.remove();
            System.out.println("Deleted : " + data);
        }
        stack.print();
    }
}
