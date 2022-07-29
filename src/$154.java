/**
 * 154. 寻找旋转排序数组中的最小值 II
 */
public class $154 {

    public static int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (r - l) / 2 + l;
            if (nums[mid] < nums[r]) r = mid;
            else if (nums[mid] > nums[r]) l = mid + 1;
            else r -= 1;
        }
        return nums[l];
    }

    public static void main(String[] args) {
        findMin(new int[]{1, 3, 3});
    }
}
