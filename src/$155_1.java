import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 155. 最小栈
 * <a href="https://leetcode-cn.com/problems/min-stack/">题目链接</a>
 *
 */
public class $155_1 {

    private Deque<Integer> dataStack;
    private Deque<Integer> minStack;

    public $155_1() {
        dataStack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        dataStack.push(val);
        minStack.push(Math.min(minStack.peek(), val));
    }

    public void pop() {
        dataStack.pop();
        minStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

}
