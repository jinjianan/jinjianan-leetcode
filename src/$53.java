/**
 * 53. 最大子数组和
 * <a href="https://leetcode.cn/problems/maximum-subarray/">题目链接</a>
 */
public class $53 {

    public static int maxSubArray(int[] nums) {
        var maxSum = Integer.MIN_VALUE;
        var tempSum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (tempSum < 0) {
                tempSum = num;
            } else
                tempSum += num;

            maxSum = Math.max(maxSum, tempSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println($53.maxSubArray(new int[]{31, -41, 59, 26}));;
        System.out.println($53.maxSubArray(new int[]{31, -41, 59, 26, -53, 58, 97}));
        System.out.println($53.maxSubArray(new int[]{31, -41, 59, 26, -53, 58, 97, -93, -23, 84}));
    }
}
