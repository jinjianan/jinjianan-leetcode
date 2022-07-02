//TODO
public class $33 {

    public static int search(int[] nums, int target) {
        int i = 0,j = 0;
        if(nums.length == 1) return nums[0] == target ? 0 : -1;
        while (j < nums.length) {
            if (nums[j] > nums[j + 1]) {
                i = j;
                break;
            }
            j++;
        }
        int l = i + 1;
        int r = l + nums.length;
        while (l < r) {
//            System.out.println(String.format("l -> %d , r -> %d", l, r));
            int mid = (r - l + 1) / 2 + l;
            int midIndex = mid >= nums.length ? mid - nums.length : mid;
//            System.out.println("midIndex ->" + midIndex);
            if (target >= nums[midIndex])
                l = mid;
            else r = mid - 1;
        }
        return nums[l] == target ? (l >= nums.length ? l - nums.length : l) : -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(nums, 0));
        ;
    }

}
