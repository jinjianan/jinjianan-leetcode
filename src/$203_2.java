/**
 * 203. 移除链表元素
 * <a href="https://leetcode.cn/problems/remove-linked-list-elements/">题目链接</a>
 *
 */
public class $203_2 {

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1,head);
        ListNode prev = dummyHead;
        while (prev.next!=null){
            if (prev.next.val == val){
                prev.next = prev.next.next;
            }
            else {
                prev = prev.next;
            }
        }
        return dummyHead.next;
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

