/**
 * 226. 翻转二叉树
 */
public class $226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode t = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = t;
        return root;
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
