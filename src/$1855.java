/**
 * 1855. 下标对中的最大距离
 */
public class $1855 {
    public int maxDistance(int[] nums1, int[] nums2) {
        int max = 0;
        for (int i = 0; i < nums1.length; i++) {
            int tar = nums1[i];

            int l = i - 1, r = nums2.length - 1;
            while (l < r) {
                int mid = (r - l + 1) / 2 + l;
                if (nums2[mid] >= tar) l = mid;
                else r = mid - 1;
            }
            max = Math.max(l < i ? 0 : l - i, max);
        }
        return max;
    }

    public int maxDistance1(int[] nums1, int[] nums2) {
        int max = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = i + max; j < nums2.length; j++) {
                if (nums2[j] >= nums1[i]) max = Math.max(max, j - i);
                else break;
            }
        }
        return max;
    }

}
