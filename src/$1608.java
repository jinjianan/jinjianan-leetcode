import java.util.Arrays;

/**
 * 1608. 特殊数组的特征值
 */
public class $1608 {
    // 0 3 6 7 7
    //
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length; i++) {

            int l = 0, r = nums.length;
            while (l < r) {
                int mid = (r - l) / 2 + l;
                if (nums[mid] >= i) r = mid;
                else l = mid + 1;
            }
            if (nums.length - l == i) return i;
        }
        return -1;
    }

    public int specialArray1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] >= i) {
                    count = nums.length - j;
                    break;
                }
            }
            if (count == i)return i;
        }
        return -1;
    }

}
