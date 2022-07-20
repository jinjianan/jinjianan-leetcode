/**
 * 153. 寻找旋转排序数组中的最小值
 */
public class $153 {

    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (r - l) / 2 + l;
            if (nums[mid] >= nums[0] && nums[mid] > nums[nums.length - 1]) l = mid + 1;
            else r = mid;
        }
        return nums[l];
    }


}
