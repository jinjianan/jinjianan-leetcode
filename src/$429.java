import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 429. N 叉树的层序遍历
 */
public class $429 {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<Node> q = new ArrayDeque<>();
        q.offer(root);
        while (!q.isEmpty()) {
            List<Integer> cur = new ArrayList<>();
            for (int i = q.size(); i > 0; i--) {
                Node node = q.poll();
                for (var curNode : node.children)
                    q.offer(curNode);
                cur.add(node.val);
            }
            res.add(cur);
        }
        return res;
    }

    public List<List<Integer>> levelOrder1(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(root,res,1);
        return res;
    }

    public void dfs(Node cur,  List<List<Integer>> res , int depth){
        if (cur == null) return;
        if (res.size() < depth)
            res.add(new ArrayList<>());
        res.get(depth-1).add(cur.val);
        for (Node child : cur.children) {
            dfs(child, res, depth+1);
        }
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    ;

}
