package DSASelfStudy.Trees;

public class FindMaxPathSum {
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
        System.out.println("FindMaxPathInTree : " + FindMaxPathInTree(root));
    }

    static int FindMaxPathInTree(Node node){
        // No left/right leaf node case
        if(node == null) return Integer.MIN_VALUE;
        // When we end up in the leaf node
        if(node.left == null && node.right == null) return node.val;
        int leftSum= FindMaxPathInTree(node.left);
        int rightSum= FindMaxPathInTree(node.right);
        return node.val + (leftSum > rightSum ? leftSum : rightSum);
    }
}
