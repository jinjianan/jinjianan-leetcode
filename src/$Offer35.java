import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 剑指 Offer 35. 复杂链表的复制
 */
public class $Offer35 {

    public Node copyRandomList(Node head) {
        Node ocur = head;
        Map<Node, Node> map = new HashMap<>();
        Node newHead = new Node(-1);
        Node cur = newHead;
        while (ocur != null) {
            cur.next = new Node(ocur.val);
            cur = cur.next;
            map.put(ocur, cur);
            ocur = ocur.next;
        }

        ocur = head;
        cur = newHead.next;
        while (ocur != null && cur != null) {
            if (ocur.random != null)
                cur.random = map.get(ocur.random);
            ocur = ocur.next;
            cur = cur.next;
        }
        return newHead.next;
    }


    public Node copyRandomList1(Node head) {
        Map<Node, Node> map = new HashMap<>();
        return f(head, map);
    }

    private Node f(Node head, Map<Node, Node> map) {
        if (head == null) return null;
        if (map.containsKey(head)) return map.get(head);
        Node newNode = new Node(head.val);
        map.put(head, newNode);
        newNode.next = f(head.next, map);
        newNode.random = f(head.random, map);
        return newNode;
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
