/**
 * 203. 移除链表元素
 * <a href="https://leetcode.cn/problems/remove-linked-list-elements/">题目链接</a>
 *
 */
public class $203_3 {

    public void removeElements(ListNode node, int val) {
        if (node.next==null)return;
        removeElements(node.next,val);
        if (node.next.val == val)node.next = node.next.next;
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

        ListNode(int[] arr) {
            if (arr.length < 1) throw new IllegalArgumentException("长度不对");
            ListNode dummyHead = new ListNode(-1);
            ListNode prev = dummyHead;
            for (var i : arr) {
                prev.next = new ListNode(i);
                prev = prev.next;
            }
            this.val = dummyHead.next.val;
            this.next = dummyHead.next.next;
        }

        @Override
        public String toString() {
            StringBuilder res = new StringBuilder();
            res.append("[");
            ListNode cur = this;
            while (cur != null) {
                res.append(cur.val);
                cur = cur.next;
                if (cur != null) res.append(",");
            }
            res.append("]");
            return res.toString();
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 6, 3, 4, 5, 6};
        ListNode node = new ListNode(a);
        System.out.println(node);
        new $203_3().removeElements(new ListNode(-1,node), 6);
        System.out.println(node);
        ;
    }
}

