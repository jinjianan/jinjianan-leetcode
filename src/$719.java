import java.util.ArrayList;
import java.util.Arrays;

/**
 * 719. 找出第 K 小的数对距离
 */
public class $719 {

    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int l = 0, r = nums[n - 1] - nums[0];
        while (l < r) {
            int mid = (r - l) / 2 + l;
            if (cal(nums, mid) < k)
                l = mid + 1;
            else r = mid;
        }
        return l;
    }

    /**
     * 计算nums中，数对距离小于等于 distance 的个数
     *
     * @param nums
     * @param distance
     * @return
     */
    private int cal(int[] nums, int distance) {
        int count = 0;
        for (int l = 0, r = 0; r < nums.length; r++) {
            while (nums[r] - nums[l] > distance)
                l++;
            count += r - l;
        }
        return count;
    }

}
