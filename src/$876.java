/**
 * 876. 链表的中间结点
 */
public class $876 {

    public ListNode middleNode(ListNode head) {
        ListNode cur = head;
        int i = 0;
        while (cur != null) {
            i++;
            cur = cur.next;
        }

        cur = head;
        for (int j = 0; j < i / 2; j++)
            cur = cur.next;
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
