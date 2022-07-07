/**
 * 674. 最长连续递增序列
 */
public class $674 {
    public int findLengthOfLCIS(int[] nums) {

        int l = 0;
        int len = 1;
        int temp = 1;
        for(int i = 1;i <nums.length;i++){
            if(nums[i] > nums[i-1]){
                l++;
                temp++;
            }
            else{
                len = Math.max(temp,len);
                l = i;
                temp = 1;
            }
        }
        return Math.max(temp,len);
    }
}
