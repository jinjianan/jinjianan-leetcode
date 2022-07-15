/**
 * 191. 位1的个数
 */
public class $191 {

    public int hammingWeight(int n) {
        int r = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0)
                r++;
        }
        return r;
    }


}
