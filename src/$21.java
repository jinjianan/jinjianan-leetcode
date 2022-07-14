/**
 * 21. 合并两个有序链表
 */
public class $21 {
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode r = new ListNode();
        ListNode cur = r;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                cur.next = new ListNode(list2.val);
                list2 = list2.next;
            } else if (list2 == null) {
                cur.next = new ListNode(list1.val);
                list1 = list1.next;
            } else if (list1.val > list2.val) {
                cur.next = new ListNode(list2.val);
                list2 = list2.next;
            } else {
                cur.next = new ListNode(list1.val);
                list1 = list1.next;
            }
            cur = cur.next;
        }
        return r.next;
    }

    public ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        ListNode newNode;
        if (list1 == null)
            return list2;
        else if (list2 == null)
            return list1;
        else if (list1.val > list2.val) {
            newNode = new ListNode(list2.val);
            newNode.next = mergeTwoLists1(list2.next, list1);
        } else {
            newNode = new ListNode(list1.val);
            newNode.next = mergeTwoLists1(list2, list1.next);
        }
        return newNode;
    }

}



