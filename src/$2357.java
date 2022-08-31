import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 2357. 使数组中所有元素都等于零
 */
public class $2357 {

    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);
        return set.contains(0) ? set.size() - 1 : set.size();
    }
}
