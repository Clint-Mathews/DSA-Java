package DSASelfStudy.Trees;

public class CompleteBinaryTree {
    private static class Node{
        int data;
        Node left,right;
        Node(int val){
            data = val;
            left = right = null;
        }
    }
    private static class CompleteTree{
        Node root;
        CompleteTree(int val){
            root = new Node(val);
        }
    }

    private static int findNumberOfNodes(Node node){
        if(node  == null) return 0;
        return (1 + findNumberOfNodes(node.left) + findNumberOfNodes(node.right));
    }

    private static boolean checkCompleteBinaryTree(Node node, int index, int noOfNodes){
        if(node == null){
            return true;
        } else if(index >= noOfNodes){
            return false;
        }
        return checkCompleteBinaryTree(node.left, index*2 +1 , noOfNodes) && checkCompleteBinaryTree(node.right, index*2 +2 , noOfNodes);
    }
    public static void main(String[] args){
        CompleteTree tree = new CompleteTree(1);
        tree.root.left =new Node(2);
        tree.root.right =new Node(3);
        tree.root.left.left =new Node(4);
        tree.root.left.right =new Node(5);
        tree.root.right.left =new Node(6);
        tree.root.right.right =new Node(7);
        if(checkCompleteBinaryTree(tree.root,0, findNumberOfNodes(tree.root))){
            System.out.println("Complete Binary Tree");
        } else {
            System.out.println("Not a Complete Binary Tree");

        }
    }
}
