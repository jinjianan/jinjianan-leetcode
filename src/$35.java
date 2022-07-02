/**
 * 35. 搜索插入位置
 */
public class $35 {

    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length;
        while (l < r) {
            int mid = (r - l ) / 2 + l;
            if (target <= nums[mid])
                r = mid;
            else l = mid + 1;
        }
        return l;
    }

}
