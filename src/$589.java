import java.util.*;

/**
 * 589. N 叉树的前序遍历
 */
public class $589 {

    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            res.add(node.val);
            if (node.children != null) {
//                Collections.reverse(node.children);
//                node.children.forEach(stack::push);
                for (int i = node.children.size() - 1; i >= 0; i--)
                    stack.push(node.children.get(i));
            }
        }
        return res;
    }


    public List<Integer> preorder1(Node root) {
        List<Integer> res = new ArrayList<>();
        preorder1r(root, res);
        return res;
    }

    public void preorder1r(Node root, List<Integer> res) {
        if (root == null) return;
        res.add(root.val);
        if (root.children == null) return;
        root.children.forEach( o -> preorder1r(o,res));
    }

    private class Node {
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
}
