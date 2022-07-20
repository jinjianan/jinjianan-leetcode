/**
 * 33. 搜索旋转排序数组
 */
public class $33 {

    public static int search(int[] nums, int target) {
        int l = 0;
        for (int i = 1; i < nums.length; i++)
            if (nums[i] < nums[i - 1]) l = i;
        int r = l + nums.length - 1;
        while (l <= r) {
            int mid = (r - l) / 2 + l;
            int index = mid % nums.length;
            if (nums[index] == target) return index;
            else if (nums[index] > target) r = mid - 1;
            else l = mid + 1;
        }
        return -1;
    }

    // 1 2 3 4 5 6
    // 5 6 1 2 3 4
    public static int search1(int[] nums, int target) {
        int lb = nums[0], rb = nums[nums.length - 1];
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (r - l) / 2 + l;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) {
              if (target < lb && nums[mid] >= lb) l = mid +1;
              else r = mid - 1;
            } else {
                if (target >= lb && nums[mid] < lb) r = mid -1;
                else l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(nums, 0));
        ;
    }

}
