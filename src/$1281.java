/**
 * 1281. 整数的各位积和之差
 */
public class $1281 {
    public int subtractProductAndSum(int n) {
        int j = 1;
        int sum = 0;
        while (n != 0) {
            int t = n % 10;
            j *= t;
            sum += t;
            n = n / 10;
        }
        return j - sum;
    }

}
