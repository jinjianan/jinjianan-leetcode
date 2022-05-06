import java.util.ArrayList;
import java.util.List;

/**
 * 1381. 设计一个支持增量操作的栈
 * <a href="https://leetcode-cn.com/problems/design-a-stack-with-increment-operation/">题目链接</a>
 */
public class $1381_1 {

    private int[] data;
    private int[] add;
    private int top;

    public $1381_1(int maxSize) {
        data = new int[maxSize];
        add = new int[maxSize];
        top = -1;
    }

    public void push(int x) {
        if (top < data.length - 1) {
            top++;
            data[top] = x;
        }
    }

    public int pop() {
        if (top == -1) return -1;
        int val =  data[top] + add[top];
        if (top > 0)
            add[top-1] += add[top];
        add[top] = 0;
        top--;
        return val;
    }

    public void increment(int k, int val) {
        int index = Math.min(k, top + 1) - 1;
        if (index>=0)
            add[index] += val;
    }

}
