/**
 * 509. 斐波那契数
 */
public class $509 {

    public int fib(int n) {
        // f0 = 0 ,f1 = 1
        int q = 0;
        int p = 1;
        if (n == 0) return q;
        for (int i = 2; i <= n; i++) {
            int t = q + p;
            q = p;
            p = t;
        }

        return p;
    }

}
