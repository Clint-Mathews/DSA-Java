package Stack;

import java.util.Stack;

public class LinkedListStack {
    static class Node{
        int data;
        Node link;
        Node(int data){
            this.data = data;
            link = null;
        }
    }
    static Node top;
    LinkedListStack(){
        this.top = null;
    }
    static void Push(int data){
        Node node = new Node(data);
        if(node == null) {
            System.out.println("Heap full");
            return;
        }
        // FIFO implemented here
        node.link = top;
        top = node;
    }
    static void Pop(){
        if(top == null){
            System.out.println("Stack empty");
            return;
        }
        top = top.link;
    }
    static void Peek(){
        if(top == null){
            System.out.println("Stack empty");
            return;
        }
        Node temp = top;
        while(temp != null){
            System.out.printf("%d -> ",temp.data);
            temp = temp.link;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.Push(1);
        stack.Push(2);
        stack.Push(3);
        stack.Push(4);
        stack.Push(5);
        stack.Peek();
        stack.Pop();
        stack.Pop();
        stack.Peek();
    }
}
