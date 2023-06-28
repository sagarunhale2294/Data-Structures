public class PostorderTraversal {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    private void postorder(Node root) {
        if(root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
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
         *     1. Traverse left subtree
         *     2. Traverse the right subtree
         *     3. Visit the root
         */
        new PostorderTraversal().postorder(root);
    }
}
