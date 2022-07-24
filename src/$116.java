import java.util.*;

/**
 * 116. 填充每个节点的下一个右侧节点指针
 */
public class $116 {
    public Node connect(Node root) {
        if (root == null) return null;
        Queue<Node> q = new ArrayDeque<>();
        q.offer(root);
        while (!q.isEmpty()) {
            for (int i = q.size(); i > 0; i--) {
                Node cur = q.poll();
                if (i > 1) cur.next = q.peek();
                if (cur.left != null) q.offer(cur.left);
                if (cur.right != null) q.offer(cur.right);
            }
        }
        return root;
    }

    public Node connect1(Node root) {
        if (root == null || root.left == null) return root;
        root.left.next = root.right;
        if (root.next != null)
            root.right.next = root.next.left;
        connect1(root.left);
        connect1(root.right);
        return root;
    }

    private class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    ;
}
