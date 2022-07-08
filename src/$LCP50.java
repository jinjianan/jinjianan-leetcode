import java.util.Arrays;

/**
 * LCP 50. 宝石补给
 */
public class $LCP50 {
    public int giveGem(int[] gem, int[][] operations) {
        for (int[] o : operations) {
            int give = gem[o[0]] / 2;
            gem[o[0]] += give;
            gem[o[1]] += give;
        }

        // 快排是 O(nlogn) 好看不一定好用
//        Integer.MAX_VALUE
//        Arrays.sort(gem);
//        return gem[gem.length - 1 ] - gem[0];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int j : gem) {
            max = Math.max(max, j);
            min = Math.min(min, j);
        }
        return max - min;
    }
}
