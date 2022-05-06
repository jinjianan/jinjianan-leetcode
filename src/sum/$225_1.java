package sum;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 225. 用队列实现栈
 * <a href="https://leetcode-cn.com/problems/implement-stack-using-queues/">题目链接</a>
 *
 * push O(n)  pop O(1)  top O(1)
 */
public class $225_1 {

    Deque<Integer> q;

    public $225_1() {
        q = new ArrayDeque<>();
    }

    public void push(int x) {
        Deque<Integer> q2 = new ArrayDeque<>();
        while (!q.isEmpty()){
            q2.offer(q.poll());
        }
        q.offer(x);
        while (!q2.isEmpty()){
            q.offer(q2.poll());
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
