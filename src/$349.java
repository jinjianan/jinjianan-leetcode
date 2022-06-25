import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class $349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(var i : nums1)
            set.add(i);
        for (var i:nums2){
            if (set.contains(i)){
                set2.add(i);
            }
        }

        int [] r = new int[set2.size()];
        int j = 0;
        for(var i : set2)
            r[j++] = i;
        return r;
    }
}
