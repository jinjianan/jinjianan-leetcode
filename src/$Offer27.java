/**
 * 剑指 Offer 27. 二叉树的镜像
 */
public class $Offer27 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        TreeNode node = new TreeNode(root.val);
        node.right = mirrorTree(root.left);
        node.left = mirrorTree(root.right);
        return node;
    }

}