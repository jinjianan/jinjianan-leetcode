/**
 * 441. 排列硬币
 */
public class $441 {

    public int arrangeCoins(int n) {
        int r = 1;
        while (n >= 0)
            n -= r++;
        return r - 2;
    }

    public int arrangeCoins1(int n) {

        int l = 1, r = n;
        while (l < r) {
            int mid = (r - l + 1) / 2 + l;
            if ((long) (1 + mid) * mid <= n * 2L) l = mid;
            else r = mid - 1;
        }
        return l;
    }


}
