import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * 496. 下一个更大元素 I
 */
public class $496 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            boolean flag = false;
            for (int j = 0; j < nums2.length; j++) {
                System.out.println(nums1[i] + "," + nums2[j]);
                if (nums1[i] == nums2[j]) flag = true;
                System.out.println(flag);
                if (flag && nums2[j] > nums1[i]) {
                    nums1[i] = nums2[j];
                    flag = false;
                    break;
                }
            }
            if (flag) nums1[i] = -1;
        }
        return nums1;
    }

    // 1 3 4 2  top
    public int[] nextGreaterElement1(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums2[i] > stack.peek())
                stack.pop();
            map.put(nums2[i], stack.isEmpty() ? -1 : stack.peek());
            stack.push(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++)
            nums1[i] = map.getOrDefault(nums1[i], -1);

        return nums1;
    }

}
