package Stack;

public class ArrayStack {
    static class Stack{
        int[] arr;
        int top;
        int capacity;
        Stack(int size){
            arr = new int[size];
            top = -1;
            capacity = size;
        }
        private void push(int data){
            if(capacity == top+1){
                System.out.println("Stack full!");
                return;
            }
            System.out.println("Added to "+ data +" Stack full!");
            arr[++top] = data;
        }
        private void pop(){
            if(top == -1){
                System.out.println("Stack empty!");
                return;
            }
            System.out.println(arr[top] + " Popped from Stack!");
            top--;
        }
        private void peek(){
            if(top == -1){
                System.out.println("Stack empty!");
                return;
            }
            System.out.println("Top element : "+ arr[top]);
        }
        private int size(){
            return top+1;
        }
        private void printStack(){
            for(int i = top; i>-1;i--){
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.peek();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.peek();
        System.out.println(stack.size());
        stack.printStack();
        stack.pop();
        System.out.println(stack.size());

        stack.printStack();


    }
}
