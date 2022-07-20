import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * 104. 二叉树的最大深度
 */
public class $104 {

    public int maxDepth(TreeNode root) {
        int depth = 0;
        if (root == null) return 0;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while (!q.isEmpty()) {
            depth++;
            for (int i = q.size() - 1; i >= 0; i--) {
                TreeNode node = q.poll();
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
        }
        return depth;
    }

    public int maxDepth1(TreeNode root) {
        return maxDepth1(root, 1);
    }

    public int maxDepth1(TreeNode root, int depth) {
        if (root == null) return depth - 1;
        return Math.max(maxDepth1(root.left,depth + 1),maxDepth1(root.right,depth + 1));
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
