package sum;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 225. 用队列实现栈
 * <a href="https://leetcode-cn.com/problems/implement-stack-using-queues/">题目链接</a>
 *
 * push O(1)  pop O(n)  top O(1)
 */
public class $225 {

    Deque<Integer> q1;

    int front;

    public $225() {
        q1 = new ArrayDeque<>();
    }

    public void push(int x) {
        q1.offer(x);
        front = x;
    }

    public int pop() {

        Deque<Integer> q2 = new ArrayDeque<>();
        while (q1.size() > 1) {
            front = q1.peek();
            q2.offer(q1.poll());
        }
        int r = q1.poll();
        q1 = q2;
        return r;
    }

    public int top() {
        return front;
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
