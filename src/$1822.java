/**
 * 1822. 数组元素积的符号
 */
public class $1822 {

    public int arraySign(int[] nums) {
        int r = 0;
        for (var n : nums) {
            if (n == 0) return 0;
            else if (n < 0) r++;
        }
        return r % 2 == 0 ? 1 : -1;
    }
}
