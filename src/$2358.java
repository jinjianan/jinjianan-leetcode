import java.util.Arrays;

/**
 * 2358. 分组的最大数量
 */
public class $2358 {

    public int maximumGroups(int[] grades) {
        Arrays.sort(grades);
        int l = 1, r = grades.length;
        while (l < r) {
            int mid = (r - l + 1) / 2 + l;
            if (can(grades, mid)) l = mid;
            else r = mid - 1;
        }
        return l;
    }

    public boolean can(int[] grades, int group) {
        int prevSum = grades[0];
        int prevNum = 1;

        int nowSum = 0;
        int nowNum = 0;

        int nowGroup = 1;
        for (int i = 1; i < grades.length; i++) {
            nowSum += grades[i];
            nowNum++;
            if (nowSum > prevSum && nowNum > prevNum) {
                prevSum = nowSum;
                nowSum = 0;
                prevNum = nowNum;
                nowNum = 0;
                nowGroup++;
                if (nowGroup >= group) return true;
            }
        }
        return false;
    }


    public int maximumGroups1(int[] grades) {
        int len = grades.length;
        int cur = 1, sum = 0;
        while (sum +cur <= len) {
            sum += cur;
            cur++;
        }
        return cur-1;
    }
}
