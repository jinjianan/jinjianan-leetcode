/**
 * 852. 山脉数组的峰顶索引
 */
public class $852 {

    public int peakIndexInMountainArray(int[] arr) {
        int l = 1, r = arr.length - 2;
        while (l < r) {
            int mid = (r - l) / 2 + l;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) return mid;
            else if (arr[mid] <= arr[mid - 1]) r = mid - 1;
            else l = mid + 1;
        }
        return -1;
    }

}
