/**
 * 1290. 二进制链表转整数
 */
public class $1290 {

    public int getDecimalValue(ListNode head) {
        StringBuilder s = new StringBuilder();
        while (head != null){
            s.append(head.val);
            head = head.next;
        }
        return Integer.parseUnsignedInt(s.toString(),2);
    }

   private class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
