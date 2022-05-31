import java.util.Arrays;

/**
 * 剑指 Offer 51. 数组中的逆序对
 */
public class Offer51 {

    public int reversePairs(int[] nums) {
        int[] temp = nums.clone();
        return recursion(nums, 0, nums.length - 1, temp);
    }

    public int recursion(int[] nums, int s, int l, int[] temp) {
        int res = 0;
        if (l - s <= 0) return res;
        int mid = (l + s) / 2;
        res += recursion(nums, s, mid, temp);
        res += recursion(nums, mid + 1, l, temp);
        res += merge(nums, s, mid, l, temp);
        return res;
    }

    public int merge(int[] nums, int s, int mid, int l, int[] temp) {
        int res = 0;
        System.arraycopy(nums, s, temp, s, l - s + 1);
        int j = s;
        int k = mid + 1;
        for (int i = s; i <= l; i++) {
            if (j > mid) {
                nums[i] = temp[k];
                k++;
            } else if (k > l) {
                nums[i] = temp[j];
                j++;
            } else if (temp[j ] > temp[k ]) {
                res += mid - j + 1;
                nums[i] = temp[k];
                k++;
            } else {
                nums[i] = temp[j];
                j++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {};
        new Offer51().reversePairs(a);
    }
}
