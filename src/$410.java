
/**
 * 410. 分割数组的最大值
 */
public class $410 {

    public int splitArray(int[] nums, int m) {
        int max = 0;
        int sum = 0;

        for (int num : nums) {
            max = Math.max(max, num);
            sum += num;
        }
        int l = max, r = sum;
        while (l < r) {
            int mid = (r - l) / 2 + l;
            if (splitCount(nums, mid) > m)
                l = mid + 1;
            else r = mid;
        }
        return l;
    }

    public int splitCount(int[] nums, int max) {
        int r = 1;
        int sum = 0;
        for (int num : nums) {
            if (sum + num > max) {
                r++;
                sum = 0;
            }
            sum += num;
        }
        return r;
    }

}
