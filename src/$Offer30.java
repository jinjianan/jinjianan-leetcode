import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 剑指 Offer 30. 包含min函数的栈
 */
public class $Offer30 {

    Deque<Integer> stack;
    Deque<Integer> stackMin;
    public $Offer30() {
        stack = new ArrayDeque<>();
        stackMin = new ArrayDeque<>();
        stackMin.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        stack.push(x);
        stackMin.push(Math.min(x,stackMin.peek()));
    }

    public void pop() {
        stack.pop();
        stackMin.pop();
    }


    public int top() {
        return stack.peek();
    }

    public int min() {
        return stackMin.peek();
    }
}
