import java.util.HashSet;
import java.util.Set;

/**
 * 3. 无重复字符的最长子串
 */
public class $3 {

    public int lengthOfLongestSubstring(String s) {
        boolean[] v = new boolean[127];
        int r = 0;
        for (int i = 0, p = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (v[c]) {
                while (s.charAt(p) != c)
                    v[s.charAt(p++)] = false;
                p++;
            }
            v[c] = true;
            r = Math.max(r, i - p + 1);
        }
        return r;
    }

}
