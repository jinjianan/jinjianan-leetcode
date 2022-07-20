/**
 * 303. 区域和检索 - 数组不可变
 */
public class $303 {

    class NumArray {

        int[] nums;
        boolean[] isCal;
        int[] sum;

        public NumArray(int[] nums) {
            this.nums = nums;
            isCal = new boolean[nums.length];
            sum = new int[nums.length];
        }

        public int sumRange(int left, int right) {
            return sum(right) - sum(left) + nums[left];
        }

        public int sum(int index) {
            if (isCal[index]) return sum[index];

            if (index == 0) sum[index] = nums[index];
            else sum[index] = nums[index] + sum(index - 1);
            isCal[index] = true;
            return sum[index];
        }
    }


}
