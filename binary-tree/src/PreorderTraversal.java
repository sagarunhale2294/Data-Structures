public class PreorderTraversal {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    void preorder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        /**
         *          1
         *        /   \
         *       2     3
         *      / \
         *     4   5
         *
         *     Algorithm:
         *     1. Visit the root
         *     2. Traverse left subtree
         *     3. Traverse the right subtree
         */

        new PreorderTraversal().preorder(root);
    }
}
