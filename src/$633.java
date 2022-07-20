/**
 * 633. 平方数之和
 */
public class $633 {

    public boolean judgeSquareSum(int c) {
        int sc = (int) Math.sqrt(c);
        for (int a = 0; a <= sc; a++) {
            double b = Math.sqrt(c - a *a );
            if (b == (int)b) return true;
        }
        return false;
    }

}
