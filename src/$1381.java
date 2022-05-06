import java.util.ArrayList;
import java.util.List;

/**
 * 1381. 设计一个支持增量操作的栈
 * <a href="https://leetcode-cn.com/problems/design-a-stack-with-increment-operation/">题目链接</a>
 */
public class $1381 {

    private List<Integer> l;
    private final int maxSize;

    public $1381(int maxSize) {
        this.maxSize = maxSize;
        l = new ArrayList<>();
    }

    public void push(int x) {
        if (l.size()<maxSize)
            l.add(x);
    }

    public int pop() {
        if (l.size()==0)return -1;
        return l.remove(l.size()-1);
    }

    public void increment(int k, int val) {
        for (int i = 0; i < Math.min(k, l.size()); i++) {
            l.set(i,l.get(i)+val);
        }
    }

}
