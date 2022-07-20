import java.util.Arrays;

/**
 * 1672. 最富有客户的资产总量
 */
public class $1672 {

    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] account : accounts)
            max = Math.max(Arrays.stream(account).sum(),max);
        return max;
    }

}
