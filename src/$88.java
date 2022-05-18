/**
 * 88. 合并两个有序数组
 */
public class $88 {
/*    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        int[] temp = Arrays.copyOf(nums1,m);
        for (int k = 0; k < m + n; k++) {
            if (i >= m) {
                nums1[k] = nums2[j];
                j++;
            } else if (j >= n) {
                nums1[k] = temp[i];
                i++;
            } else if (temp[i] <= nums2[j]) {
                nums1[k] = temp[i];
                i++;
            } else {
                nums1[k] = nums2[j];
                j++;
            }
        }
    }*/

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1;
        for (int k = m + n - 1; k >= 0; k--) {
            if (p1 < 0)
                nums1[k] = nums2[p2--];
            else if (p2 < 0)
                nums1[k] = nums1[p1--];
            else if (nums1[p1] > nums2[p2])
                nums1[k] = nums1[p1--];
            else
                nums1[k] = nums2[p2--];
        }
    }

}
