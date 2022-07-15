/**
 * 剑指 Offer 42. 连续子数组的最大和
 */
public class $Offer42 {

    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int now = 0;
        for (int num : nums) {
            if (now < 0)
                now = num;
            else
                now += num;
            max = Math.max(max, now);
        }
        return max;
    }

}
