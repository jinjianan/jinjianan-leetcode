import java.util.*;
import java.util.function.BiConsumer;

/**
 * 350.两个数组的交集 II
 */
public class $350 {

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (var num : nums1)
            map.put(num, map.getOrDefault(num, 0) + 1);

        List<Integer> rl = new ArrayList<>();
        for (var num : nums2)
            if (map.getOrDefault(num, 0) > 0) {
                rl.add(num);
                map.put(num, map.getOrDefault(num, 0) - 1);
            }

        int[] res = new int[rl.size()];
        int i = 0;
        for (int val : rl)
            res[i++] = val;
        return res;
    }
}
