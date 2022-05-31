import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/**
 * 350.两个数组的交集 II
 */
public class $350 {

    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (map.size() > nums2.length) break;
                if (map.containsKey(j)) continue;
                if (nums1[i] == nums2[j]) {
                    map.put(j, nums2[j]);
                    break;
                }
            }
        }
        int[] res = new int[map.size()];
        int i = 0;
        for (int val : map.values()) {
            res[i++] = val;
        }
        return res;
    }

}
