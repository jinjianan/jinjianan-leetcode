import java.util.Arrays;

/**
 * 27. 移除元素
 */
public class $27 {

    public int removeElement(int[] nums, int val) {
        int now = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) nums[++now] = nums[i];
        }
        return now + 1;
    }

}
