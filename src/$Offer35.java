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
        Map<Node,Integer> map = new HashMap<>();
        List<Node> list = new ArrayList<>();
        Node newHead = new Node(-1);
        Node cur = newHead;
        int i= 0;
        while (ocur != null){
            cur.next = new Node(ocur.val);
            cur = cur.next;
            list.add(cur);
            map.put(ocur,i++);
            ocur = ocur.next;
        }

        ocur = head;
        i = 0;
        while (ocur!=null){
            if (ocur.random != null)
                list.get(i++).random = list.get(map.get(ocur.random));
            ocur = ocur.next;
        }
        return newHead.next;
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
