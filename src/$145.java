import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 145. 二叉树的后序遍历
 */
public class $145 {

    public List<Integer> postorderTraversal1(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        f(root,l);
        return l;
    }
    public void f(TreeNode node , List<Integer> list){
        if (node == null) return;
        f(node.left,list);
        f(node.right,list);
        list.add(node.val);
    }
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
