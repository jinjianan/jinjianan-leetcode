import java.util.Arrays;

/**
 * 剑指 Offer 53 - II. 0～n-1中缺失的数字
 */
public class $Offer53II {

    public int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) return nums[i] - 1;
        }
        return nums.length;
    }


    public static int missingNumber1(int[] nums) {
        int l = 0;
        int r = nums.length;
        while (l < r) {
            // 0 1 2 (3)
            int mid = (r - l) / 2 + l;
            if (mid == nums[mid])
                l = mid + 1;
            else r = mid;
        }
        return l;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber1(new int[]{0, 1, 2, 3}));
    }

}
