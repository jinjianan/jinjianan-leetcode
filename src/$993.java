import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 993. 二叉树的堂兄弟节点
 */
public class $993 {

    public boolean isCousins(TreeNode root, int x, int y) {
        int tarDepth = -1;
        Queue<TreeNode> q = new ArrayDeque<>();
        if (root == null || root.val == x || root.val == y) return false;
        q.offer(root);
        int depth = 0;
        while (!q.isEmpty()) {
            for (int i = q.size(); i > 0; i--) {
                TreeNode cur = q.poll();
                if (cur.left != null && cur.right != null && (cur.left.val == x || cur.left.val == y) && (cur.right.val == x || cur.right.val == y))
                    return false;
                if (cur.left != null) {
                    q.offer(cur.left);
                    if (cur.left.val == x || cur.left.val == y){
                        if (tarDepth == -1) tarDepth = depth;
                        else return tarDepth == depth;
                    }
                }

                if (cur.right != null) {
                    q.offer(cur.right);
                    if (cur.right.val == x || cur.right.val == y){
                        if (tarDepth == -1) tarDepth = depth;
                        else return tarDepth == depth;
                    }
                }
            }


            depth++;
        }

        return false;
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
