import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightViewTreeTraversal {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public List<Integer> levelOrderTraversal(Node root) {
        List<Integer> ans = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        if(root==null) {
            return ans;
        }
        while(true) {
            int size = queue.size();
            int data = 0;
            if(size == 0) {
                break;
            }
            while(size!=0) {
                Node temp = queue.poll();
                if(temp.left!=null) {
                    queue.add(temp.left);
                }
                if(temp.right!=null) {
                    queue.add(temp.right);
                }
                data = temp.data;
                size --;
            }
            ans.add(data);
        }
        return ans;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.right = new Node(4);
        root.left.right = new Node(5);

        System.out.println(new RightViewTreeTraversal().levelOrderTraversal(root));
    }
}
