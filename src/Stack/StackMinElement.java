package Stack;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class StackMinElement {
    static class Stacks {
        Stack<Integer> s1, aux;

        Stacks() {
            s1 = new Stack<Integer>();
            aux = new Stack<Integer>();
        }

        void push(int item) {
            s1.push(item);
            if (aux.isEmpty() || aux.peek() >= item) {
                aux.push(item);
            }
        }

        int pop() {
            if (s1.isEmpty()) {
                System.out.println("Queue empty");
                System.exit(0);
            }
            int item = s1.pop();
            if (aux.peek() == item) aux.pop();
            return item;
        }

        int peek() {
            if (s1.isEmpty()) {
                System.out.println("Queue empty");
                System.exit(0);
            }
            return s1.peek();
        }

        int min() {
            if (aux.isEmpty()) {
                System.out.println("Queue empty");
                System.exit(0);
            }
            return aux.peek();
        }
    }

    public static void main(String[] args) {
        Stacks queue = new Stacks();
        int[] keys = {5,4,3,2,1};
        for (int key : keys) {
            queue.push(key);
            System.out.println("Added : " + key);
        }
        System.out.println("Top : " + queue.peek());
        System.out.println("Min : " + queue.min());
        for (int key : keys) {
            int data = (int) queue.pop();
            System.out.println("Deleted : " + data);
            System.out.println("Top : " + queue.peek());
            System.out.println("Min : " + queue.min());
        }
        queue.peek();
    }
}

