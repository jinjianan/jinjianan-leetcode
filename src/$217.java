import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 217. 存在重复元素
 * <a href="https://leetcode.cn/problems/contains-duplicate/">题目链接</a>
 */
public class $217 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(var i : nums){
            if (!set.add(i))
                return true;
        }
        return false;
    }

}
