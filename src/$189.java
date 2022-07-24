/**
 * 189. 轮转数组
 */
public class $189 {

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int [] temp = new int[k];
        System.arraycopy(nums,nums.length - k, temp,0,k);
        System.arraycopy(nums,0, nums,k,nums.length - k);
        System.arraycopy(temp,0, nums,0,k);
    }

}
