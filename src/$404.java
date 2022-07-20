/**
 * 404. 左叶子之和
 */
public class $404 {

    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeaves(root, false);
    }

    public int sumOfLeftLeaves(TreeNode root, boolean left) {
        if (root == null) return 0;
        if (root.left == null && root.right == null && left) return root.val;
        return sumOfLeftLeaves(root.left, true) + sumOfLeftLeaves(root.right, false);
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
