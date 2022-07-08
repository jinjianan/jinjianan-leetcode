/**
 * 1137. 第 N 个泰波那契数
 */
public class $1137 {

    public int tribonacci(int n) {
        //T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2
        int a = 0;
        int b = 1;
        int c = 1;
        if (n == 0) return a;
        else if (n == 1) return b;
        for (int i = 3; i <= n ; i++) {
            int t = a + b + c;
            a = b;
            b = c;
            c = t;
        }
        return c;
    }

}
