import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 225. 用队列实现栈
 * <a href="https://leetcode-cn.com/problems/implement-stack-using-queues/">题目链接</a>
 *
 *
 */
public class $225_2 {

    private Deque<Integer> data;
    private Deque<Integer> reverse;
    boolean hasPop = false;
    boolean hasPush = false;
    public $225_2() {
        data = new ArrayDeque<>();
        reverse = new ArrayDeque<>();
    }
    private void setReverse(Deque<Integer> from, Deque<Integer> to) {
        to = new ArrayDeque<>();
        int[] temp = new int[from.size()];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = from.poll();
        }
        for (int i = temp.length - 1; i >= 0; i--) {
            to.offer(temp[i]);
        }
        reverse = to;
    }

    public void push(int x) {
        if (hasPop)setReverse(reverse,data);
        data.offer(x);
        hasPush = true;
        hasPop = false;
    }



    public int pop() {
        if (empty()) throw new IllegalArgumentException("队列空");
        if (hasPush)setReverse(data,reverse);
        hasPush=false;
        hasPop=true;
        return reverse.poll();
    }

    public int top() {
        if (empty()) throw new IllegalArgumentException("队列空");
        if (hasPush)setReverse(data,reverse);
        hasPush=false;
        hasPop=true;
        return reverse.peek();
    }

    public boolean empty() {
        return Math.max(data.size(),reverse.size()) == 0;
    }

    public static void main(String[] args) {
        $225_2  a = new $225_2();
        a.push(1);
        a.push(2);
        System.out.println(a.top());;
        System.out.println(a.pop());;
    }
}
