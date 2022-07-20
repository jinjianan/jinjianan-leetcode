import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 1346. 检查整数及其两倍数是否存在
 */
public class $1346 {
    public static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) continue;
                if (arr[i] == arr[j] * 2) return true;
            }
        }
        return false;
    }

    public static boolean checkIfExist1(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int tar = arr[i];
            int l, r;
            if (tar >= 0) {
                l = 0;
                r = i - 1;
            } else {
                l = i + 1;
                r = arr.length - 1;
            }
            while (l <= r) {
                int mid = (r - l) / 2 + l;
                if (arr[mid] * 2 == tar) return true;
                    // -4 -3 -2 0 3 6 (-6) (8)
                else if (arr[mid] * 2 > arr[i])
                    r = mid - 1;
                else l = mid + 1;
            }
        }
        return false;
    }

    public static boolean checkIfExist2(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (var num : arr)
            set.add(num);

        boolean zeroFlag = false;
        for (var num : arr) {
            if (set.contains(num * 2)) {
                if (num == 0 && !zeroFlag) {
                    zeroFlag = true;
                }
                else return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[]{-10, 12, -20, -8, 15}));
    }
}
