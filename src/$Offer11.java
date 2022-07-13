import java.util.Arrays;

/**
 * 剑指 Offer 11. 旋转数组的最小数字
 */
public class $Offer11 {

    public int minArray(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    // 1 2 3
    // 2 3 1
    // 1 2 3 4 5 6
    // 4 5 6 1 2 3
    // 5 5 5 1 5
    // 5 1 5 5 5
    public int minArray1(int[] numbers) {
        if (numbers.length < 2) return numbers[0];
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            int mid = (r - l) / 2 + l;
            if (numbers[mid] > numbers[r]) l = mid + 1;
            else if (numbers[mid] < numbers[r]) r = mid;
            else r--;
        }

        return numbers[l];
    }

}
