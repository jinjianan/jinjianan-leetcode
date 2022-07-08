import java.util.HashSet;

/**
 * 141. 环形链表
 */
public class $141 {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode cur = head;
        while (cur.next != null){
            if (!set.add(cur))
                return true;
            cur = cur.next;
        }
        return false;
    }

    public boolean hasCycle1(ListNode head) {
        ListNode slow = new ListNode(-1);
        slow.next = head;
        ListNode fast = head;
        while (slow != fast){
            if (fast == null || fast.next ==null)return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
