import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 763. 划分字母区间
 */
public class $763 {

    public List<Integer> partitionLabels(String s) {
        int[] map = new int[26];
        List<Integer> res = new ArrayList<>();

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
            map[chars[i] - 'a'] = i;

        int l = 0, r = -1;
        for (int i = 0; i < s.length(); i++) {
            if ( map[chars[i] - 'a'] > r)
                r = map[chars[i] - 'a'];
            if (i == r) {
                res.add(r - l + 1);
                l = r + 1;
            }
        }

        return res;
    }
}
