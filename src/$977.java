import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 977. 有序数组的平方
 */
public class $977 {

    public int[] sortedSquares(int[] nums) {
        int p = 0, q = nums.length - 1, pos = nums.length - 1;
        int[] ans = new int[nums.length];
        while (p <= q) {
            int q1 = nums[q] * nums[q];
            int p1 = nums[p] * nums[p];
            if (p1 > q1) {
                ans[pos] = p1;
                p++;
            } else {
                ans[pos] = q1;
                q--;
            }
            pos--;
        }
        return ans;
    }

    private void swap(int[] nums, int x, int y) {
        int t = nums[x];
        nums[x] = nums[y];
        nums[y] = nums[x];
    }

}
