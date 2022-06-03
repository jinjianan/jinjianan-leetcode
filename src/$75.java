/**
 * 75. Sort Colors
 */
public class $75 {

    public void sortColors(int[] nums) {

        int lt = -1;
        int gt = nums.length;
        int i = 0;
        while (i < gt) {
            if (nums[i] == 0) {
                lt++;
                if (lt < i) {
                    int temp = nums[i];
                    nums[i] = nums[lt];
                    nums[lt] = temp;
                }
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                gt--;
                int temp = nums[i];
                nums[i] = nums[gt];
                nums[gt] = temp;
            }
        }
    }

}
