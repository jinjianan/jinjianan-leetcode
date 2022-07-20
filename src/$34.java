/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 */
public class $34 {

    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1, -1};
        int p = binarySearch(nums, target);
        if (p >= nums.length || nums[p] != target)
            return new int[]{-1, -1};
        int q = binarySearch(nums, target + 1);
        return new int[]{p, q - 1};
    }

    public int binarySearch(int[] nums, int target) {
        int l = 0, r = nums.length;
        while (l < r) {
            int mid = (r - l) / 2 + l;
            if (nums[mid] >= target) r = mid;
            else l = mid + 1;
        }
        return l;
    }
}
