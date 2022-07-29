import java.util.ArrayList;
import java.util.List;

/**
 * 658. 找到 K 个最接近的元素
 */
public class $658 {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<>();
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int mid = (r - l + 1) / 2 + l;
            if (arr[mid] <= x) l = mid;
            else r = mid - 1;
        }
        if (l + 1 < arr.length && Math.abs(arr[l] - x) > Math.abs(arr[l + 1] - x))
            l++;

        res.add(arr[l]);
        int ll = l - 1, rr = l + 1, count = 1;
        while (count < k) {
            if (ll < 0) {
                res.add(arr[rr++]);
                count++;
            } else if (rr >= arr.length) {
                res.add(arr[ll--]);
                count++;
            } else if (Math.abs(arr[ll] - x) <= Math.abs(arr[rr] - x)) {
                res.add(arr[ll--]);
                count++;
            } else {
                res.add(arr[rr++]);
                count++;
            }
        }
        res.sort(Integer::compare);
        return res;
    }

    public List<Integer> findClosestElements1(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<>();
        int removeCount = arr.length - k;
        int l = 0;
        int r = arr.length - 1;
        while (removeCount > 0) {
            if (Math.abs(arr[l] - x) <= Math.abs(arr[r] - x))
                r--;
            else l++;
            removeCount--;
        }

        for (int i = l; i < l + k; i++)
            res.add(arr[i]);
        return res;
    }

}
