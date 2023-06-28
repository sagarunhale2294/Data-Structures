public class BinaryTreeInit {
    static class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void print(Node root) {
        Node temp = root;
        while(temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.left;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);

        boolean ans = true;
        ans = ans && false;
        ans = ans && true;
        System.out.println(ans);

        print(root);
    }
}
