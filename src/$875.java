import java.util.Arrays;
/**
 * 875. 爱吃香蕉的珂珂
 */
public class $875 {

    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int l = 1;
        int r = piles[piles.length - 1];
        while (l < r) {
            int mid = (r - l) / 2 + l;
            if (eatingTime(piles, mid) <= h) r = mid;
            else l = mid + 1;
        }
        return r;
    }

    public int eatingTime(int[] piles, int k) {
        int time = 0;
        for (var num : piles) {
            time += (num % k == 0 ? num / k : num / k + 1);
        }
        return time;
    }
}
