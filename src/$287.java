/**
 * 287. 寻找重复数
 */
public class $287 {

    public int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) return nums[i];
            }
        }
        return -1;
    }

    public int findDuplicate1(int[] nums) {
        int n = nums.length - 1;
        int l = 1, r = n;
        while (l < r) {
            int mid = (r - l) / 2 + l;
            int count = 0;
            for (var num : nums)
                if (num <= mid) count++;
            if (count <= mid) l = mid + 1;
            else r = mid;
        }
        return l;
    }

}
