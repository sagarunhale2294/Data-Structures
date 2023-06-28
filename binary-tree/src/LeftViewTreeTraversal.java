import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeftViewTreeTraversal {

    static class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.right = new Node(4);
        root.left.right = new Node(5);

        System.out.println(new LeftViewTreeTraversal().levelOrderTraversal(root));
    }

    private List<Integer> levelOrderTraversal(Node root) {
        List<Integer> ans = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        if(root == null) {
            return ans;
        }
        while(true) {
            int data = 0;
            int size = queue.size();
            if(size == 0) {
                break;
            }
            while(size != 0) {
                Node temp = queue.poll();
                if(temp.right != null) {
                    queue.add(temp.right);
                }
                if(temp.left != null) {
                    queue.add(temp.left);
                }
                data = temp.data;
                size--;
            }
            ans.add(data);
        }
        return ans;
    }
}
