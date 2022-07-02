import java.util.HashMap;
import java.util.Map;

/**
 * 70. 爬楼梯
 */
public class $70 {

    public static int climbStairs(int n) {
        int p = 1, q = 2, r = 0;
        if (n == 1) return p;
        for (int i = 3; i <= n; i++) {
            int t = p + q;
            p = q;
            q = t;
        }
        return q;
    }

}
