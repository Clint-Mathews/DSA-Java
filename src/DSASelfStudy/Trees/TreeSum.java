package DSASelfStudy.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeSum {

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
        root.left.right = new Node(2);
        root.right.right = new Node(1);
        return root;
    }
    public static void main(String[] args) {
        Node root = CreateNode();
        System.out.println("FindSumOnTree : "+FindSumOnTree(root));
        System.out.println("FindSumInterative : "+FindSumInterative(root));
    }
    static int FindSumOnTree(Node node){
        if(node == null) return 0;
        return node.val + FindSumOnTree(node.left) + FindSumOnTree(node.right);
    }
    static int FindSumInterative(Node node){
        if(node == null) return 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        int sum =0;
        while(!queue.isEmpty()){
            Node current = queue.remove();
            sum+= current.val;
            if(current.left != null) queue.add(current.left);
            if(current.right != null) queue.add(current.right);
        }
        return sum;
    }
}
