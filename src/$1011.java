import java.util.Arrays;

/**
 * 1011. 在 D 天内送达包裹的能力
 */
public class $1011 {

    public int shipWithinDays(int[] weights, int days) {
        int l = Arrays.stream(weights).max().getAsInt();
        int r = Arrays.stream(weights).sum();
        while (l < r) {
            int mid = (r - l) / 2 + l;
            System.out.println("L->" + l + ",r->" + r);
            System.out.println("weight : " + Arrays.toString(weights) + ", mid :" + mid);
            if (calDays(weights, mid) <= days)
                r = mid;
            else l = mid + 1;
        }
        return l;
    }

    public int calDays(int[] weights, int dailyNum) {
        int cur = 0;
        int days = 0;
        for (var w : weights) {
            if (cur + w <= dailyNum) cur += w;
            else {
                days++;
                cur = w;
            }
        }
        days++;
        return days;
    }

    public static void main(String[] args) {
        int [] a = {3,3,3};
        System.out.println(new $1011().calDays(a,9));
    }
}
