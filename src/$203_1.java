/**
 * 203. 移除链表元素
 * <a href="https://leetcode.cn/problems/remove-linked-list-elements/">题目链接</a>
 *
 */
public class $203_1 {

    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val)
            head = head.next;
        if (head == null) return null;

        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val)
                prev.next = prev.next.next;
            else
                prev = prev.next;
        }
        return head;
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

