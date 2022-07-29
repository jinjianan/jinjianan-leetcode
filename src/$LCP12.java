
/**
 * LCP 12. 小张刷题计划
 */
public class $LCP12 {

    public static int minTime(int[] time, int m) {
        int l = 0, r = 0;
        for (int t : time)
            r += t;

        while (l < r) {
            int mid = (r - l) / 2 + l;
            if (calDays(time, mid) > m) l = mid + 1;
            else r = mid;
        }
        return l;
    }

    public static int calDays(int[] time, int n) {
        int r = 1;
        int daily = 0;
        boolean zhang = false;
        int max = 0;
        for (int i = 0; i < time.length; i++) {
            max = Math.max(max, time[i]);
            if (daily + time[i] > n) {
                if (!zhang) {
                    zhang = true;
                    if (max != time[i])
                        daily = daily - max + time[i];
                } else {
                    r++;
                    daily = 0;
                    max = 0;
                    zhang = false;
                    i--;
                }
            } else daily += time[i];
        }

        return r;
    }

    public static void main(String[] args) {
        System.out.println(calDays(new int[]{82, 35, 6, 53, 37, 75, 69, 69, 53, 18}, 71));
    }

}
