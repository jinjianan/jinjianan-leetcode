/**
 * 50. Pow(x, n)
 */
public class $50 {

    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        long b = n;
        double res = 1;
        while (b > 0) {
            if (b % 2 != 0)
                res *= x;
            x *= x;
            b /= 2;
        }
        return res;
    }

}
