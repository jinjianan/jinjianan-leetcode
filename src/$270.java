/**
 * 270. 最接近的二叉搜索树值
 */
public class $270 {
    public int closestValue(TreeNode root, double target) {
        int r = root.val;
        while (root != null) {
            if (Math.abs(root.val - target) < Math.abs(r - target))
                r = root.val;
            if (root.val > target)
                root = root.left;
            else root = root.right;
        }
        return r;
    }

    public class TreeNode {
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
