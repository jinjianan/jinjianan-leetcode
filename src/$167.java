/**
 * 167. 两数之和 II - 输入有序数组
 */
public class $167 {

    public int[] twoSum(int[] numbers, int target) {

        for (int i = 0; i < numbers.length - 1; i++) {
            int r = binarySearch(numbers, i + 1, target - numbers[i]);
            if (r != -1) return new int[]{i+1, r+1};
        }

        throw new IllegalArgumentException("no solution");
    }

    public int binarySearch(int[] numbers, int start, int target) {
        int l = start;
        int r = numbers.length - 1;
        while (l <= r) {
            //1 2 3
            int mid = (r - l) / 2 + l;
            if (numbers[mid] == target) return mid;
            else if (target < numbers[mid]) r = mid - 1;
            else l = mid + 1;
        }

        return -1;
    }

}
