import java.util.Arrays;

/**
 * 1385. 两个数组间的距离值
 */
public class $1385 {

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;
        for (var num : arr1) {
            int p = binarySearch(arr2, num);
            if (
                    Math.min(
                            p >= arr2.length ? Integer.MAX_VALUE : Math.abs(num - arr2[p]),
                            p - 1 < 0 ? Integer.MAX_VALUE : Math.abs(num - arr2[p - 1])
                    ) > d
            )
                count++;
        }
        return count;
    }

    //返回 >= tar 的最小值
    public int binarySearch(int[] a, int tar) {
        int l = 0, r = a.length;
        while (l < r) {
            int mid = (r - l ) / 2 + l;
            if (a[mid] >= tar) r = mid;
            else l = mid + 1;
        }
        return l;
    }


}
