/**
 * 1588. 所有奇数长度子数组的和
 */
public class $1588 {

    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int len = 1; len <= arr.length; len += 2) {
            for (int i = 0; i + len <= arr.length; i++) {
                for (int j = i; j - i < len; j++) {
                    sum += arr[j];
                }
            }
        }
        return sum;
    }

}
