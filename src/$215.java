import java.util.Arrays;
import java.util.Random;

/**
 * 215. 数组中的第K个最大元素
 */
public class $215 {

    public int findKthLargest(int[] nums, int k) {
        Random random = new Random();
        k = nums.length - k;
        return find(nums,0,nums.length-1,k,random);
    }

    public int find(int[] nums, int l, int r, int k, Random random) {
        int i = l + 1;
        int mid = l;
        swap(nums, l, random.nextInt(r - l + 1) + l);
        while (i <= r) {
            if (nums[i] <= nums[l]) {
                mid++;
                swap(nums, mid, i);
            }
            i++;
        }
        swap(nums, mid, l);
        if (mid == k) return nums[k];
        else if (mid > k) return find(nums, l, mid - 1, k, random);
        else return find(nums, mid + 1,r, k, random);
    }

    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        int [] a = {3,2,1,5,6,4};
        System.out.println(new $215().findKthLargest(a,2));
        System.out.println(Arrays.toString(a));
    }
}
