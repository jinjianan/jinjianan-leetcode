import java.util.Arrays;

/**
 * 1502. 判断能否形成等差数列
 */
public class $1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int t = arr[1] - arr[0];
        for (int i = 2; i < arr.length ; i++) {
            if (arr[i] - arr[i-1] != t) return false;
        }
        return true;
    }
}
