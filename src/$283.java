import java.util.Arrays;

/**
 * 283. 移动零
 */
public class $283 {

    public void moveZeroes(int[] nums) {
        int l = nums.length;
        int q = -1;
        for (int i = l - 1; i >= 0; i--) {
            if (nums[i] == 0 && q != -1) {
                for (int j = i; j < q; j++)
                    nums[j] = nums[j + 1];
                nums[q] = 0;
                q -= 1;
            } else if (q == -1)
                q = i;
        }
    }

    public void moveZeroes1(int[] nums) {
        int p = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (p == -1 && nums[i] != 0)
                p = i;
            else if (nums[i] == 0 && p != -1) {
                System.arraycopy(nums, i + 1, nums, i, p - i + 1);
                nums[p] = 0;
                p--;
            }
        }
    }

    public void moveZeroes2(int[] nums) {
        int p = 0 , q = 0;
        while (q < nums.length){
            if (nums[q] != 0)
                nums[p++] = nums[q];
            q++;
        }

        for (int i = p; i < nums.length; i++)
            nums[i] = 0;
    }
}
