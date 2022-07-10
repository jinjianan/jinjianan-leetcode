/**
 * 剑指 Offer 24. 反转链表
 */
public class $Offer24 {

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        return f(head,null);
    }

    private ListNode f(ListNode cur,ListNode prev){
        ListNode next = cur.next;
        cur.next = prev;
        if (next == null) return cur;
        return f(next,cur);
    }

    public ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
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
