import java.util.Arrays;

/**
 * 剑指 Offer 53 - I. 在排序数组中查找数字 I
 */
public class $Offer53 {

    public int search(int[] nums, int target) {
        return (int) Arrays.stream(nums).filter((o1)->o1 == target).count();
    }

    public int search1(int[] nums, int target) {
        int count = 0;
        for(int i : nums)
            if (i == target) count++;
            else if (i > target) break;
        return count;
    }

}
