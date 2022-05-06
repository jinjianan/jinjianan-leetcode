import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 232. 用栈实现队列
 * <a href="https://leetcode-cn.com/problems/implement-queue-using-stacks/">题目链接</a>
 * <p>
 *
 */
public class $232_2 {

    Deque<Integer> stack1;
    int front;

    public $232_2() {
        stack1 = new ArrayDeque<>();
    }

    public void push(int x) {
        Deque<Integer> stack2 = new ArrayDeque<>();
        while (!stack1.isEmpty())
            stack2.push(stack1.pop());
        stack1.push(x);
        while (!stack2.isEmpty())
            stack1.push(stack2.pop());
    }

    public int pop() {
        return stack1.pop();
    }

    public int peek() {
        return stack1.peek();
    }

    public boolean empty() {
        return stack1.isEmpty();
    }


}
