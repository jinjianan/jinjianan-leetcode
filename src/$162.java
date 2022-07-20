import java.util.Arrays;

/**
 * 162. 寻找峰值
 */
public class $162 {

    public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int m = (r - l) / 2 + l;
            if (compare(nums, m, m - 1) == 1 && compare(nums, m, m + 1) == 1) return m;
            else if (compare(nums, m, m + 1) == -1) l = m + 1;
            else r = m - 1;
        }
        return l;
    }

    /**
     *
     * @param nums 数组
     * @param mid  mid Index
     * @param side 需要与mid比较的前一位或者后一位
     * @return 大于 1 小于 -1
     */
    public int compare(int[] nums, int mid, int side) {
        if (side == 0 || side == nums.length)
            return 1;
        return nums[mid] > nums[side] ? 1 : -1;
    }


}
