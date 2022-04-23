package DSASelfStudy.Trees;

import java.util.*;

public class BinaryTreeTest {
    static class Node{
        char val;
        Node left;
        Node right;
        public Node(){
            val = 0;
            left = right = null;
        }
        public Node(char data){
            val = data;
            left = right = null;
        }
    }
    static class BinTree{
        Node root;
        BinTree(){
            root = null;
        }
        BinTree(char data){
            root = new Node(data);
        }
    }
    public static void main(String[] args) {
        BinTree tree = CreateBinTree();
//        System.out.println("InOrder");
//        inorder(tree.root);
        System.out.println("PreOrder");
        preorder(tree.root);
        System.out.println(Arrays.toString(preOrderReturns(tree.root).toArray()));
//        System.out.println("Post'Order");
//        postorder(tree.root);
        System.out.println("Depth first search");
        System.out.println(Arrays.toString(depthFirst(tree.root).toArray()));
        System.out.println(Arrays.toString(depthFirst(new Node()).toArray()));
        System.out.println("Breadth first search");
        System.out.println(Arrays.toString(breadthFirst(tree.root).toArray()));
        System.out.println(Arrays.toString(breadthFirst(new Node()).toArray()));
    }

    static void preorder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.val);
        preorder(node.left);
        preorder(node.right);
    }
    static ArrayList<Character> preOrderReturns(Node node){
        if(node == null) return new ArrayList<>();
        ArrayList<Character> data = new ArrayList<Character>();
        data.add(node.val);
        data.addAll(preOrderReturns(node.left));
        data.addAll(preOrderReturns(node.right));
        return data;
    }

    static void postorder(Node node){
        if(node == null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.val);
    }

    static void inorder(Node node){
        if(node == null){
            return;
        }
        inorder(node.left);
        System.out.println(node.val);
        inorder(node.right);
    }

    static BinTree CreateBinTree(){
//                   a
//                  / \
//                 b   c
//                / \  /
//               d   e f
        BinTree tree = new BinTree();
        tree.root = new Node('a');
        tree.root.left = new Node('b');
        tree.root.right = new Node('c');
        tree.root.left.left = new Node('d');
        tree.root.left.right = new Node('e');
        tree.root.right.left = new Node('f');
        return tree;
    }

    static ArrayList<Character> depthFirst(Node node){
        ArrayList<Character> result = new ArrayList<Character>();
        if(node == null){
            return result;
        }
        Stack<Node> stack = new Stack<Node>();
        stack.push(node);
        while(!stack.isEmpty()){
            Node data = stack.pop();
            System.out.println(data.val);
            result.add(data.val);
            if(data.right != null) stack.push(data.right);
            if(data.left != null) stack.push(data.left);
        }
        return result;
    }

    static ArrayList<Character> breadthFirst(Node node){
        ArrayList<Character> result = new ArrayList<Character>();
        if(node == null) return result;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node dat = queue.remove();
            if(dat == null) return  result;
            result.add(dat.val);
            queue.add(dat.left);
            queue.add(dat.right);
        }
        return result;
    }
}
