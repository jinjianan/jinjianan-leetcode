package sum;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 225. 用队列实现栈
 * <a href="https://leetcode-cn.com/problems/implement-stack-using-queues/">题目链接</a>
 * 1个队列
 * push O(n)  pop O(1)  top O(1)
 */
public class $225_4 {

    Deque<Integer> q;

    public $225_4() {
        q = new ArrayDeque<>();
    }

    public void push(int x) {
        q.offer(x);
        for (int i = q.size(); i > 1; i--) {
            q.offer(q.poll());
        }
    }

    public int pop() {
        return q.poll();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
