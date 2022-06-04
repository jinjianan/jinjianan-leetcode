import java.util.Arrays;
import java.util.Random;

/**
 * 215. 数组中的第K个最大元素
 */
public class $215_1 {

    public int findKthLargest(int[] nums, int k) {
        Random random = new Random();
        k = nums.length - k;
        return find(nums, k, random);
    }

    public int find(int[] nums, int k, Random random) {
        int l = 0;
        int r = nums.length;
        while (l < r) {
            int mid = partition(nums, l, r, random);
            if (mid == k) return nums[k];

            if (mid > k)
                r = mid;
            else l = mid + 1;

        }
        return -1;
    }

    public int partition(int[] nums, int l, int r, Random random) {
        int i = l + 1;
        int mid = l;
        swap(nums, l, random.nextInt(r - l ) + l);
        while (i < r) {
            if (nums[i] <= nums[l]) {
                mid++;
                swap(nums, mid, i);
            }
            i++;
        }
        swap(nums, mid, l);
        return mid;
    }

    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 1, 5, 6, 4};
        System.out.println(new $215_1().findKthLargest(a, 2));
        System.out.println(Arrays.toString(a));
    }
}
