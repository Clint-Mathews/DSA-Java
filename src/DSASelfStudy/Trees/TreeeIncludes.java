package DSASelfStudy.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeeIncludes {
    static class Node{
        char val;
        Node left,right;
        Node(char data){
            val = data;
            left = right = null;
        }
    }
    public static void main(String[] args) {
        Node root = new Node('a');
        root.left = new Node('b');
        root.right = new Node('c');
        root.left.left = new Node('d');
        root.left.right = new Node('e');
        root.right.right = new Node('f');
        System.out.println("BreadthFirstCheck : "+BreadthFirstCheck(root,'e'));
        System.out.println("DepthFirstSearch recurssion : "+DepthFirstSearchRec(root,'e'));
        System.out.println("DepthFirstSearch recurssion : "+DepthFirstSearch(root,'e'));
        System.out.println("BreadthFirstCheck : "+BreadthFirstCheck(root,'x'));
        System.out.println("DepthFirstSearch recurssion : "+DepthFirstSearchRec(root,'x'));
        System.out.println("DepthFirstSearch recurssion : "+DepthFirstSearch(root,'x'));
    }

    static boolean BreadthFirstCheck(Node node, char check){
        if(node == null) return false;
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node current = queue.remove();
            if(current.val == check) return true;
            if(current.left != null) queue.add(current.left);
            if(current.right != null) queue.add(current.right);
        }
        return false;
    }

    static boolean DepthFirstSearchRec(Node node, char check){
        if(node == null) return false;
        if(node.val == check) return true;
        return DepthFirstSearchRec(node.left, check) || DepthFirstSearchRec(node.right, check);
    }

    static boolean DepthFirstSearch(Node node, char check){
        if(node == null) return false;
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()){
            Node current = stack.pop();
            if(current.val == check) return true;
            if(current.right != null) stack.push(current.right);
            if(current.left != null) stack.push(current.left);
        }
        return false;
    }

}
