/**
 * 19. 删除链表的倒数第 N 个结点
 */
public class $19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(-1, head);
        f(dummyNode, n );
        return dummyNode.next;
    }

    public int f(ListNode head, int n) {
        if (head == null) return 0;
        int cur = 1 + f(head.next, n);
        if (cur == n + 1)
            head.next = head.next.next;
        return cur;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
