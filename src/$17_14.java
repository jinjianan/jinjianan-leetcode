import java.util.Arrays;
import java.util.Random;

/**
 * 面试题 17.14. 最小K个数
 */
public class $17_14 {

    public int[] smallestK(int[] arr, int k) {
        k -= 1;
        Random random = new Random();
        sort(arr, 0, arr.length - 1, k, random);
        return Arrays.copyOfRange(arr, 0, k + 1);
    }

    public void sort(int[] arr, int l, int r, int k, Random random) {
        if (r <= l) return;
        int i = l + 1;
        int mid = l;
        swap(arr, l, random.nextInt(r - l + 1) + l);
        while (i <= r) {
            if (arr[i] < arr[l]) {
                mid++;
                swap(arr, mid, i);
            }
            i++;
        }
        swap(arr, mid, l);

        if (mid >= k) sort(arr, l, mid - 1, k, random);
        else {
            sort(arr, l, mid - 1, k, random);
            sort(arr, mid + 1, r, k, random);
        }
    }


    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        int [] a = {1,3,5,7,2,2,4,8};

        System.out.println(Arrays.toString(new $17_14().smallestK(a,4)));
        System.out.println(Arrays.toString(a));

    }
}
