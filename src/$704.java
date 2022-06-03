/**
 * 704. 二分查找
 */
public class $704 {

    public int search(int[] nums, int target) {
        return searchRecursion(nums,0,nums.length-1,target);

    }

    public static int searchRecursion(int[] arr, int l, int r, int t) {
        if (r < l) return -1;
        int mid = (r - l) / 2 + l;
        if (arr[mid] == t) return mid;
        else if (arr[mid] > t) return searchRecursion(arr, l, mid - 1, t);
        else return searchRecursion(arr, mid + 1, r, t);
    }
}
