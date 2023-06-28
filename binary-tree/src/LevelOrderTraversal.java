import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    static class Node {
        int val;
        Node left, right;
        public Node(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    public List<List<Integer>> levelOrderTraverse2(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        if(root == null) {
            return list;
        }
        while (true) {
            int size = queue.size();
            List<Integer> data = new ArrayList<>();
            if(size == 0) {
                break;
            }
            while (size>0) {
               Node temp = queue.poll();
               if(temp.left != null) {
                   queue.add(temp.left);
               }
               if(temp.right != null) {
                   queue.add(temp.right);
               }
               data.add(temp.val);
               size--;
            }
            list.add(data);
        }
        return list;
    }

    public List<Integer> levelOrderTraverse(Node root) {
        List<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        if(root == null) {
            return list;
        }
        while(!queue.isEmpty()) {
            Node temp = queue.poll();
            if(temp.left!=null) {
                queue.add(temp.left);
            }
            if(temp.right!=null) {
                queue.add(temp.right);
            }
            list.add(temp.val);
        }
        return list;
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.left.right = new Node(11);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        System.out.println(new LevelOrderTraversal().levelOrderTraverse(root));
        System.out.println(new LevelOrderTraversal().levelOrderTraverse2(root));
    }
}
