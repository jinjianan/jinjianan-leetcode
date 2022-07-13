import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 剑指 Offer 26. 树的子结构
 */
public class $Offer26 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) return false;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(A);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (cur.val == B.val && f(cur, B)) return true;
            if (cur.left != null) queue.offer(cur.left);
            if (cur.right != null) queue.offer(cur.right);
        }
        return false;
    }

    public boolean isSubStructure1(TreeNode A, TreeNode B) {
        if (B == null) return false;
        if (A == null) return false;
        return f(A, B) || isSubStructure1(A.left, B) || isSubStructure1(A.right, B);
    }

    public boolean f(TreeNode A, TreeNode B) {
        if (B == null) return true;
        if (A == null) return false;
        if (A.val != B.val) return false;

        return f(A.left, B.left) && f(A.right, B.right);
    }

}
