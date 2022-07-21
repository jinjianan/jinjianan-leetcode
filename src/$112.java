/**
 * 112. 路径总和
 */
public class $112 {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        int c = targetSum - root.val;
        if (root.left == null && root.right == null)
            return c == 0;

        return hasPathSum(root.left, c) || hasPathSum(root.right, c);
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
