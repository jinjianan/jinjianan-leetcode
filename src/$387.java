import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 387. 字符串中的第一个唯一字符
 */
public class $387 {


    public int firstUniqChar(String s) {
        int[] map = new int[26];
        for (int i = 0; i < s.length(); i++)
            map[s.charAt(i) - 'a'] += 1;

        for (int i = 0; i < s.length(); i++)
            if (map[s.charAt(i) - 'a'] == 1) return i;
        return -1;
    }


}
