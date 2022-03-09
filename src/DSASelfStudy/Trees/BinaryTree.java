package DSASelfStudy.Trees;
// Binary Tree implementation
public class BinaryTree {
    // Node creation
    private static class Node{
        int data;
        Node left;
        Node right;
        public Node(int key){
            data = key;
            left = right = null;
        }
    }
    // BinaryTree Creation
    private static class BinTree{
        Node root;
        BinTree(int key){
            root = new Node(key);
        }
        BinTree(){
            root = null;
        }
    }
    private static void TraverseInOrder(Node node){
        if(node != null){
            TraverseInOrder(node.left);
            System.out.print(" " + node.data);
            TraverseInOrder(node.right);
        }
    }
    private static void TraversePreOrder(Node node){
        if(node != null){
            System.out.print(" " + node.data);
            TraversePreOrder(node.left);
            TraversePreOrder(node.right);
        }
    }
    private static void TraversePostOrder(Node node){
        if(node != null){
            TraversePostOrder(node.left);
            TraversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
    public static void main(String[] args) {
        BinTree tree = new BinTree(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        System.out.println("InOrder");
        TraverseInOrder(tree.root);
        System.out.println("");
        System.out.println("PreOrder");
        TraversePreOrder(tree.root);
        System.out.println("");
        System.out.println("PostOrder");
        TraversePostOrder(tree.root);
    }
}
