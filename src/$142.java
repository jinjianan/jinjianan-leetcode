import java.util.HashSet;
import java.util.Set;

/**
 * 142. 环形链表 II
 */
public class $142 {

    public ListNode detectCycle(ListNode head) {

        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (!set.add(head)) return head;
            head = head.next;
        }
        return null;
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
