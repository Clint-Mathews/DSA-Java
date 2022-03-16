package DSASelfStudy.Trees;


public class PerfectBinaryTree {
    private static class Node{
        int data;
        Node left,right;
        Node(int val){
            data = val;
            left = right = null;
        }
    }
    private static class PerfectTree{
        Node root;
        PerfectTree(int val){
            root = new Node(val);
        }
    }
    private static int checkDepth(Node node){
        int depth = 0;
        while(node != null){
            depth ++;
            node = node.left;
        }
        return depth;
    }
    private static boolean checkPerfectBinaryTree(Node node, int depth, int level){
        if(node == null){
            return true;
        } else if(node.left == null && node.right == null){
            return (depth == level+1);
        } else if(node.left == null || node.right == null){
            return false;
        }
        return checkPerfectBinaryTree(node.left, depth, level +1) && checkPerfectBinaryTree(node.right, depth, level +1);
    }
    public static void main(String[] args){
        PerfectTree tree = new PerfectTree(1);
        tree.root.left =new Node(2);
        tree.root.right =new Node(3);
        tree.root.left.left =new Node(4);
        tree.root.left.right =new Node(5);
        tree.root.right.left =new Node(6);
        tree.root.right.right =new Node(7);
        if(checkPerfectBinaryTree(tree.root, checkDepth(tree.root), 0)){
            System.out.println("Perfect Binary Tree");
        } else {
            System.out.println("Not a Perfect Binary Tree");

        }
    }
}
