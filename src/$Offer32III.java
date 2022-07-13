import java.util.*;

/**
 * 剑指 Offer 32 - III. 从上到下打印二叉树 III
 */
public class $Offer32III {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offer(root);
        boolean fromLeft = true;
        while (!deque.isEmpty()) {
            List<Integer> cur = new ArrayList<>();
            for (int i = deque.size(); i > 0; i--) {
                TreeNode node = deque.poll();
                cur.add(node.val);
                if (node.left != null) deque.offer(node.left);
                if (node.right != null) deque.offer(node.right);
            }
            if (!fromLeft) Collections.reverse(cur);
            res.add(cur);
            fromLeft = !fromLeft;
        }
        return res;
    }

    public List<List<Integer>> levelOrder1(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offer(root);
        boolean fromLeft = true;
        while (!deque.isEmpty()) {
            LinkedList<Integer> cur = new LinkedList<>();
            for (int i = deque.size(); i > 0; i--) {
                TreeNode node = deque.poll();
                if (fromLeft) cur.addLast(node.val);
                else cur.addFirst(node.val);
                if (node.left != null) deque.offer(node.left);
                if (node.right != null) deque.offer(node.right);
            }
            res.add(cur);
            fromLeft = !fromLeft;
        }
        return res;
    }


}
