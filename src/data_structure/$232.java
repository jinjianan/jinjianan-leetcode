package data_structure;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 232. 用栈实现队列
 * <a href="https://leetcode-cn.com/problems/implement-queue-using-stacks/">题目链接</a>
 *
 * 均摊为全 O(1)
 */
public class $232 {

    Deque<Integer> stack1;
    Deque<Integer> stack2;
    int front;

    public $232() {
        stack1 = new ArrayDeque<>();
        stack2 = new ArrayDeque<>();
    }

    public void push(int x) {
        if (stack1.isEmpty()) front = x;
        stack1.push(x);
    }

    public int pop() {
        if(!stack2.isEmpty())
            return stack2.pop();

        while(stack1.size() > 1)
            stack2.push(stack1.pop());

        return stack1.pop();
    }

    public int peek() {
        if (stack2.isEmpty())
            return front;
        return stack2.peek();
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }


}
