import java.util.HashSet;

/**
 * 1539. 第 k 个缺失的正整数
 */
public class $1539 {
    public int findKthPositive(int[] arr, int k) {
        int count = 0;
        int i = 0, num = 1;
        while (count < k) {
            if (i < arr.length && arr[i] == num)
                i++;
            else
                count++;
            num++;
        }
        return num - 1;
    }

    public int findKthPositive1(int[] arr, int k) {
        //缺失的数量 = num - 1 - index
        int l = -1, r = arr.length - 1;
        while (l < r) {
            int mid = (r - l + 1) / 2 + l;
            if (arr[mid] - 1 - mid < k) l = mid;
            else r = mid - 1;
        }

        if (l == -1)
            return k;
        else
            return arr[l] + k - (arr[l] - 1 - l);
    }
}
