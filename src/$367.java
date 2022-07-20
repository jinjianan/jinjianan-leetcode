/**
 * 367. 有效的完全平方数
 */
public class $367 {

    public boolean isPerfectSquare(int num) {
        int l = 1, r = num;
        while (l < r) {
            System.out.println(l+","+r);
            int mid = (r - l) / 2 + l;
            if (mid * mid >= num) r = mid;
            else l = mid + 1;
        }

        return l*l == num;
    }

}
