/**
 * 206. 反转链表
 * <a href="https://leetcode.cn/problems/reverse-linked-list/">题目链接</a>
 */
public class $206 {
    /**
     * 递归方式
     *
     * @param head
     * @return
     */
    public ListNode reverseListRecursion(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode temp = reverseListRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }

    /**
     * 迭代方式
     *
     * @param head
     * @return
     */
    public ListNode reverseListForeach(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    public static class ListNode {
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
