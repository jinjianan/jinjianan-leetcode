/**
 * 4. 寻找两个正序数组的中位数
 */
public class $4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int j = 0;
        int k = 0;
        int [] r = new int[nums1.length + nums2.length];
        for(int i = 0 ; i < nums1.length + nums2.length ; i ++ ){
            if(j >= nums1.length) r[i] = nums2[k++];
            else if(k >= nums2.length) r[i] = nums1[j++];
            else if(nums1[j] < nums2[k]) r[i] = nums1[j++];
            else r[i] = nums2[k++];
        }

        if(r.length % 2 == 0 )
            return (double)(r[ (r.length - 1 )/ 2] + r[r.length / 2]) / 2 ;
        return (double)(r[(r.length -1) /2]);
    }

}
