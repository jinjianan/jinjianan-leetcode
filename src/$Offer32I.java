import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/**
 * 剑指 Offer 32 - I. 从上到下打印二叉树
 */
public class $Offer32I {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int[] levelOrder(TreeNode root) {
        if (root == null) return new int[0];
        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        ArrayList<Integer> list = new ArrayList<>();
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            list.add(node.val);
            if (node.left != null) q.offer(node.left);
            if (node.right != null) q.offer(node.right);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
