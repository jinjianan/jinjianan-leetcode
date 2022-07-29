/**
 * 1482. 制作 m 束花所需的最少天数
 */
public class $1482 {

    public int minDays(int[] bloomDay, int m, int k) {
        if (bloomDay.length < m * k) return -1;
        int l = Integer.MAX_VALUE, r = Integer.MIN_VALUE;
        for (var day : bloomDay) {
            l = Math.min(day, l);
            r = Math.max(day, r);
        }
        while (l < r) {
            int mid = (r - l) / 2 + l;
            if (can(bloomDay, m, k, mid)) r = mid;
            else l = mid + 1;
        }

        return l;
    }

    public boolean can(int[] bloomDay, int m, int k, int day) {
        int days = 0;
        int number = 0;
        for (int j : bloomDay) {
            if (j <= day)
                number++;
            else number = 0;

            if (number == k) {
                number = 0;
                days++;
                if (days >= m)return true;
            }
        }
        return days >= m;
    }
}
