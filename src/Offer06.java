import java.util.*;

/**
 * 剑指 Offer 06. 从尾到头打印链表
 */
public class Offer06 {

    public int[] reversePrint(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head!= null) {
            list.add(head.val);
            head = head.next;
        }
        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] reversePrint1(ListNode head) {
        Deque<Integer> stack = new ArrayDeque<>();
        while (head!= null) {
            stack.push(head.val);
            head = head.next;
        }

        int[] res = new int[stack.size()];
        int i = 0;
        while (!stack.isEmpty())
            res[i++] = stack.pop();
        return res;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }


}
