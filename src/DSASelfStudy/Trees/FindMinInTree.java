package DSASelfStudy.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class FindMinInTree {
    static class Node{
        int val;
        Node left,right;
        Node(int data){
            val= data;
            left=right=null;
        }
    }
    static Node CreateNode(){
        Node root = new Node(3);
        root.left = new Node(11);
        root.right = new Node(4);
        root.left.left = new Node(4);
        root.left.right = new Node(-2);
        root.right.right = new Node(1);
        return root;
    }
    public static void main(String[] args) {
        Node root = CreateNode();
        System.out.println("Smallest - FindMinDepth : "+FindMinDepth(root));
        System.out.println("Smallest - FindMinBreadth : "+FindMinBreadth(root));
        System.out.println("Smallest - FindMinRec : "+FindMinRec(root));

    }
    static int FindMinDepth(Node node){
        if(node == null) return 0;
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        int smallest = Integer.MAX_VALUE;
        while(!stack.isEmpty()){
            Node currrent = stack.pop();
            if(smallest > currrent.val) {
                smallest = currrent.val;
            }
            if(currrent.right != null) {stack.push(currrent.right);}
            if(currrent.left != null) {stack.push(currrent.left);}
        }
        return smallest;
    }

    static int FindMinBreadth(Node node){
        if(node == null) return 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        int smallest = Integer.MAX_VALUE;
        while(!queue.isEmpty()){
            Node currrent = queue.remove();
            if(smallest > currrent.val) {
                smallest = currrent.val;
            }
            if(currrent.left != null) {queue.add(currrent.left);}
            if(currrent.right != null) {queue.add(currrent.right);}
        }
        return smallest;
    }
    static int FindMinRec(Node node){
        if(node == null) return Integer.MAX_VALUE;
        int leftMin = FindMinRec(node.left);
        int rigthMin = FindMinRec(node.right);
        return node.val < leftMin ? (node.val < rigthMin ? node.val : rigthMin) : (leftMin < rigthMin ? leftMin : rigthMin);
    }
}
