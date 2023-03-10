package ByCategory.Tree.BST.check;
/*
             3
           /   \
          2     5
         / \
        1   4
*/
public class Main {
    public static void main(String[] args) {
        Node child1 = new Node(1, null, null);
        Node child4 = new Node(4, null, null);
        Node child2 = new Node(2, child1, child4);
        Node child5 = new Node(4, null, null);
        Node tree = new Node(3, child2, child5);

        System.out.println(check(tree, Integer.MIN_VALUE, Integer.MAX_VALUE));

    }

    static boolean check(Node node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.key <= min || node.key >= max) {
            return false;
        }
        return check(node.left, min, node.key) && check(node.right, node.key, max);
    }

    static class Node {
        int key;
        Node left;
        Node right;

        public Node(int key, Node left, Node right) {
            this.key = key;
            this.left = left;
            this.right = right;
        }
    }

}
