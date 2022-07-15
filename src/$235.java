import java.util.ArrayList;
import java.util.List;

/**
 * 235. 二叉搜索树的最近公共祖先
 */
public class $235 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> list = new ArrayList<>();
        f(root, p, list);
        for (TreeNode node : list)
            if (f(node, q, new ArrayList<>())) return node;
        return null;
    }

    private boolean f(TreeNode node, TreeNode p, List<TreeNode> l) {
        if (node == null) return false;
        if (node.val == p.val || (node.val > p.val && f(node.left, p, l)) || (node.val < p.val && f(node.right, p, l))) {
            l.add(node);
            return true;
        }
        return false;
    }

    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode cur = root;
        while (true) {
            if (p.val < cur.val && q.val < cur.val)
                cur = cur.left;
            else if (p.val > cur.val && q.val > cur.val)
                cur = cur.right;
            else break;
        }
        return cur;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
