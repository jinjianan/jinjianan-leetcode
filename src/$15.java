import java.util.*;

/**
 * 15. 三数之和
 */
public class $15 {

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<String> set = new HashSet<>();
        if (nums.length == 0) return res(set);
        Arrays.sort(nums);
        int zeroNum = 0;
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int num : nums) {
            if (num < 0) {
                if (map1.containsKey(num)) map1.put(num, map1.get(num) + 1);
                else map1.put(num, 1);
            } else if (num == 0)
                zeroNum++;
            else {
                if (map2.containsKey(num)) map2.put(num, map2.get(num) + 1);
                else map2.put(num, 1);
            }
        }

        if ( zeroNum >= 3) set.add("0,0,0");
        if (map1.isEmpty() || map2.isEmpty())
            return res(set);

        for (var key1 : map1.keySet()) {
//            System.out.print("key1:" + key1 + ",");
            for (var key2 : map2.keySet()) {
//                System.out.print("key2:" + key2 + ",");
                int value = -key2 - key1;
//                System.out.println("value:" + value);
                if (map2.containsKey(value)) {
                    if (value == key2 && map2.get(key2) <= 1)
                        continue;
                    if (key2 > value)
                        set.add(key1 + "," + value + "," + key2);
                    else set.add(key1 + "," + key2 + "," + value);
                }
                if (map1.containsKey(value)) {
                    if (value == key1 && map1.get(key1) <= 1)
                        continue;
                    if (key1 > value)
                        set.add(value + "," + key1 + "," + key2);
                    else set.add(key1 + "," + value + "," + key2);
                }
//                System.out.println("zeroNum" + zeroNum);
                if (value == 0 && zeroNum > 0)
                    set.add(key1 + "," + value + "," + key2);
            }
        }
        return res(set);
    }


    private static List<List<Integer>> res(Set<String> set){
        List<List<Integer>> res = new ArrayList<>();
        for(var s : set){
            ArrayList<Integer> r = new ArrayList<>();
            for(var num : s.split(","))
                r.add(Integer.valueOf(num));
            res.add(r);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0};
        threeSum(nums);
    }
}
