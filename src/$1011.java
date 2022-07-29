import java.util.Arrays;

/**
 * 1011. 在 D 天内送达包裹的能力
 */
public class $1011 {

    public int shipWithinDays(int[] weights, int days) {
        int l = 1;
        int r = 0;
        for (var num : weights) {
            r += num;
            l = Math.max(l, num);
        }
        while (l < r) {
            int mid = (r - l) / 2 + l;
            if (calDays(weights, mid) <= days)
                r = mid;
            else l = mid + 1;
        }
        return l;
    }

    public int calDays(int[] weights, int dailyNum) {
        int days = 1;
        int cur = 0;
        for (var w : weights) {
            if (cur + w > dailyNum) {
                cur = w;
                days++;
            } else cur += w;
        }
        return days;
    }

    public static void main(String[] args) {
        int[] a = {3, 3, 3};
        System.out.println(new $1011().calDays(a, 9));
    }
}
