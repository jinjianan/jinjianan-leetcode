import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 剑指 Offer 32 - II. 从上到下打印二叉树 II
 */
public class $Offer32II {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Deque<TreeNode> now = new ArrayDeque<>();
        now.offer(root);
        while (true){
            List<Integer> temp = new ArrayList<>();
            Deque<TreeNode> next = new ArrayDeque<>();
            while (!now.isEmpty()) {
                TreeNode node = now.poll();
                temp.add(node.val);
                if(node.left != null) next.offer(node.left);
                if(node.right != null)  next.offer(node.right);
            }
            res.add(temp);
            while (!next.isEmpty())
                now.offer(next.poll());
            if (now.isEmpty())break;
        }
        return res;
    }

    public List<List<Integer>> levelOrder1(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> cur = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                cur.add(node.val);
                if(node.left != null) queue.offer(node.left);
                if(node.right != null)  queue.offer(node.right);
            }
            res.add(cur);
        }
        return res;
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}


