import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 剑指 Offer 28. 对称的二叉树
 */
public class $Offer28 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public boolean isSymmetric(TreeNode root) {
        return root == null || f(root.left, root.right);
    }

    public boolean f(TreeNode l, TreeNode r) {
        if (l == null && r == null) return true;
        else if (l == null || r == null || l.val != r.val) return false;
        return f(l.left, r.right) && f(l.right, r.left);
    }
}
