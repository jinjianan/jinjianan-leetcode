import java.util.List;

public class $203 {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        head.next = removeElements(head.next, val);
        if (head.val == val) return head.next;
        else return head;
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
        System.out.println(new $203().removeElements(node, 6));
        ;
    }
}

