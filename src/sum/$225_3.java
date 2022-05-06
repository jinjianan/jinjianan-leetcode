package sum;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 225. 用队列实现栈
 * <a href="https://leetcode-cn.com/problems/implement-stack-using-queues/">题目链接</a>
 * 1个队列
 * push O(1)  pop O(n)  top O(1)
 */
public class $225_3 {

    Deque<Integer> q;

    int front;

    public $225_3() {
        q = new ArrayDeque<>();
    }

    public void push(int x) {
        q.offer(x);
        front = x;
    }

    public int pop() {
        for (int i = q.size(); i > 1; i--) {
            front = q.peek();
            q.offer(q.poll());
        }
        return q.poll();
    }

    public int top() {
        return front;
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
