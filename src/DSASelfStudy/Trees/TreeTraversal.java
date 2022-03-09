package DSASelfStudy.Trees;

public class TreeTraversal {
    private static class Node{
        int item;
        Node left;
        Node right;
        public Node(int val){
            item = val;
            left = right = null;
        }
    }
    private static class BinaryTree{
        Node root;
        public BinaryTree(){
            root = null;
        }
    }
    private static void inOrderTraversal(Node node){
        if(node == null){
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.item + " -> ");
        inOrderTraversal(node.right);
    }

    private static void preOrderTraversal(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.item + " -> ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    private static void postOrderTraversal(Node node){
        if(node == null){
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.item + " -> ");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.left = new Node(6);
        System.out.println("InOrder");
        inOrderTraversal(tree.root);
        System.out.println("PreOrder");
        preOrderTraversal(tree.root);
        System.out.println("PostOrder");
        postOrderTraversal(tree.root);
        // Without Binary Tree class
        Node a = new Node(7);
        Node b = new Node(8);
        Node c = new Node(9);
        Node d = new Node(10);
        Node e = new Node(11);
        Node f = new Node(12);
        a.left = b;
        a.right = c;
        b.right = d;
        c.left = e;
        d.right = f;
        System.out.println("InOrder");
        inOrderTraversal(a);
        System.out.println("PreOrder");
        preOrderTraversal(a);
        System.out.println("PostOrder");
        postOrderTraversal(a);
    }
}
