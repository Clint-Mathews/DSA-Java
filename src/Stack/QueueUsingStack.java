package Stack;

import java.util.Stack;

public class QueueUsingStack {
    static class Queue<T>{
        Stack<T> s1, s2;
        Queue(){
            s1 = new Stack<>();
            s2 = new Stack<>();
        }
        void enqueue(T item){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(item);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        T dequeue(){
            if (s1.isEmpty()) {
                System.out.println("Queue empty");
                System.exit(0);
            }
            T item = s1.pop();
            return item;
        }
        T peek(){
            if (s1.isEmpty()) {
                System.out.println("Queue empty");
                System.exit(0);
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue queue = new Queue<Integer>();
        int[] keys = {1,2,3,4,5};
        for(int key:keys){
            queue.enqueue(key);
            System.out.println("Added : " + key);
        }
        queue.peek();
        for(int key:keys){
            int data = (int) queue.dequeue();
            System.out.println("Deleted : " + data);
        }
        queue.peek();
    }
}
