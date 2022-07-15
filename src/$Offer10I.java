/**
 * 剑指 Offer 10- I. 斐波那契数列
 */
public class $Offer10I {

    public int fib(int n) {
        if (n == 0) return 0;
        int p = 0;
        int q = 1;
        for (int i = 2; i <= n; i++) {
            int r = p + q;
            p = q;
            q = r % 1000000007;
        }
        return q;
    }

}
