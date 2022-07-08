import java.util.Arrays;

/**
 * 724. 寻找数组的中心下标
 */
public class $724 {

    public int pivotIndex(int[] nums) {
        if (nums.length == 1) return 0;
        int n = nums.length;
        int[] l = new int[n];
        int[] r = new int[n];
        r[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--)
            r[i] = r[i + 1] + nums[i];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (r[i + 1] == 0) return i;
                l[i] = nums[i];
            } else if (i == n - 1) {
                if (l[i - 1] == 0) return i;
            } else {
                if ( l[i - 1] == r[i + 1]) return i;
                l[i] += l[i - 1] + nums[i];
            }
        }

        return -1;
    }

    public int pivotIndex1(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum * 2 + nums[i] == total) return i;
            sum += nums[i];
        }
        return -1;
    }
}
