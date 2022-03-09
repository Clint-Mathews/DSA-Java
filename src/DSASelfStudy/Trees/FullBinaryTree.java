package DSASelfStudy.Trees;

public class FullBinaryTree {
    static class Node{
        int data;
        Node left,right;
        public Node(int val){
            data = val;
            left = right = null;
        }
    }
    static class BinaryTree{
        Node root;
        public BinaryTree(){
            root = null;
        }
        public BinaryTree(int val){
            root = new Node(val);
        }
        // Check for full binary tree
        private boolean checkBinaryTree(Node node){
            // Checking tree emptiness.
            if(node == null) return true;
            // check if node has no child nodes
            if(node.left == null && node.right == null) return true;
            // check if node has both child nodes and verification in its children
            if (node.left != null && node.right != null) {
                return checkBinaryTree(node.left) && checkBinaryTree(node.right);
            }
            return false;
        }
    }
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right = new Node(3);
        System.out.println("Is Full Binary Tree : " + tree.checkBinaryTree(tree.root));
    }
}
