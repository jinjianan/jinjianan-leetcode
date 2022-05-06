import java.util.ArrayList;
import java.util.List;

/**
 * 155. 最小栈
 * <a href="https://leetcode-cn.com/problems/min-stack/">题目链接</a>
 *
 */
public class $155 {

    private List<Integer> data;
    private int min;

    public $155() {
        data = new ArrayList<>();
        min = (int) Double.POSITIVE_INFINITY;
    }

    public void push(int val) {
        min = Math.min(min, val);
        data.add(val);
    }

    public void pop() {
        int r = data.remove(data.size() - 1);
        if (data.isEmpty()) min = (int) Double.POSITIVE_INFINITY;
        else if (r == min && !data.contains(r)) {
            min = data.get(0);
            for (int i = 0; i < data.size(); i++) {
                min = min > data.get(i) ? data.get(i) : min;
            }
        }
    }

    public int top() {
        return data.get(data.size() - 1);
    }

    public int getMin() {
        return min;
    }

}
