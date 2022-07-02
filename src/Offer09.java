import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 剑指 Offer 09. 用两个栈实现队列
 */
public class Offer09 {

    Deque<Integer> s1;
    Deque<Integer> s2;

    public Offer09() {
        s1 = new ArrayDeque<>();
        s2 = new ArrayDeque<>();
    }

    public void appendTail(int value) {
        s1.push(value);
    }

    public int deleteHead() {
        if (s1.isEmpty() && s2.isEmpty()) return -1;
        if (s2.isEmpty()){
            while (s1.size() > 1)
                s2.push(s1.pop());
            return s1.pop();
        }
        return s2.pop();
    }
}
