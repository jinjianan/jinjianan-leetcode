import java.util.HashSet;

/**
 * 202. 快乐数
 */
public class $202 {

    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (true) {
            int t = n;
            n = 0;
            while (t != 0) {
                n += (t % 10) * (t % 10);
                t = t / 10;
            }
            if (n == 1) return true;
            else if (!set.add(n)) return false;
        }
    }

}
