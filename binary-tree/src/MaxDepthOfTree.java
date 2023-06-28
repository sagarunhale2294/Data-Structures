
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class MaxDepthOfTree {
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public boolean checkRootIsEqualToChildSum(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) {
            return true;
        }
        int leftsum = 0, rightsum = 0;
        if(root.left!=null) {
            leftsum = root.left.val;
        }
        if(root.right!=null) {
            rightsum = root.right.val;
        }

        return (root.val == (leftsum + rightsum) && checkRootIsEqualToChildSum(root.left) && checkRootIsEqualToChildSum(root.right));
    }

    /************************************************************************************
     * Balanced binary tree
     ************************************************************************************
     */
    public boolean isBalanced(TreeNode root) {
        boolean ans = true;
        return inorderUtil(root, ans);
    }

    public boolean inorderUtil(TreeNode root, boolean ans) {
        if(root!=null){
            ans = ans && inorderUtil(root.left, ans);
            int lh = height(root.left);
            int rh = height(root.right);
            if(Math.abs(lh-rh)>1) {
                ans = ans && false;
            }
            ans = ans && inorderUtil(root.right, ans);
        }
        return ans;
    }

    public int height(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}