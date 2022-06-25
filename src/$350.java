import java.util.*;
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

    public int[] intersect2(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for(var num : nums1) {
            if (map1.containsKey(num)) map1.put(num, map1.get(num) + 1);
            else map1.put(num, 1);
        }
        for (var num : nums2){
            if (map1.containsKey(num)){
                int n = map1.get(num);
                if (n > 1)
                    map1.put(num, n -1);
                else map1.remove(num);

                if (map2.containsKey(num))map2.put(num, map2.get(num) + 1);
                else map2.put(num,1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for (var key : map2.keySet()){
            for (int i = 0; i < map2.get(key); i++) {
                list.add(key);
            }
        }
        int [] res = new int[list.size()];
        int i = 0 ;
        for(var num : list){
            res[i++] = num;
        }
        return res;
    }
}
