import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 26. 删除有序数组中的重复项
 */
public class $26 {

    public int removeDuplicates(int[] nums) {
        int max = nums[nums.length - 1] + 1;
        Set<Integer> set = new HashSet<>();
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                num++;
                nums[i] = max;
            } else set.add(nums[i]);
        }

        Arrays.sort(nums);
        return nums.length - num;
    }

    public int removeDuplicates1(int[] nums) {
        int now = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[now]) {
                now++;
                nums[now] = nums[i];
            }
        }
        return now + 1;
    }
}
