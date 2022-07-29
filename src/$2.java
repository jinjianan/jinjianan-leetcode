/**
 * 2. 两数相加
 */
public class $2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2, int num) {
        if (l1 == null && l2 == null) {
            if (num == 0) return null;
            else return new ListNode(num);
        }

        ListNode newNode;
        if (l1 == null) {
            newNode = new ListNode((l2.val + num) % 10);
            newNode.next = addTwoNumbers(null, l2.next, (l2.val + num) / 10);
        } else if (l2 == null) {
            newNode = new ListNode((l1.val + num) % 10);
            newNode.next = addTwoNumbers(l1.next, null, (l1.val + num) / 10);
        } else {
            int sum = l1.val + l2.val + num;
            newNode = new ListNode(sum % 10);
            newNode.next = addTwoNumbers(l1.next, l2.next, sum / 10);
        }
        return newNode;
    }


    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1);
        int temp = 0;
        ListNode cur = dummyHead;
        while (l1 != null || l2 != null || temp != 0) {
            int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + temp;
            temp = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return dummyHead.next;
    }

    private class ListNode {
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
