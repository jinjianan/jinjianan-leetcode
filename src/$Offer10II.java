/**
 * 剑指 Offer 10- II. 青蛙跳台阶问题
 */
public class $Offer10II {

    public int numWays(int n) {
        //f(0) 1  f1  1  f2  2  f3 3 f4 5
        if (n < 2) return 1;
        int p = 0, q = 1, r = 1;
        for (int i = 2; i <= n; i++) {
            p = q;
            q = r;
            r = (p + q) % 1000000007;
        }
        return r;
    }
}
