import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 232. 用栈实现队列
 * <a href="https://leetcode-cn.com/problems/implement-queue-using-stacks/">题目链接</a>
 * <p>
 *
 */
public class $232_1 {

    Deque<Integer> stack1;
    int front;

    public $232_1() {
        stack1 = new ArrayDeque<>();
    }

    public void push(int x) {
        if (stack1.isEmpty()) front = x;
        stack1.push(x);
    }

    public int pop() {
        Deque<Integer> stack2 = new ArrayDeque<>();
        while (stack1.size() > 1){
            front = stack1.peek();
            stack2.push(stack1.pop());
        }
        int r = stack1.pop();
        while (!stack2.isEmpty())
            stack1.push(stack2.pop());
        return r;
    }

    public int peek() {
        return front;
    }

    public boolean empty() {
        return stack1.isEmpty();
    }


}
