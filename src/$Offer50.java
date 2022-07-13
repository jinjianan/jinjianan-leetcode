import java.util.*;
import java.util.stream.Stream;

/**
 * 剑指 Offer 50. 第一个只出现一次的字符
 */
public class $Offer50 {

    public char firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);

        for(char c:s.toCharArray())
            if (map.get(c) == 1) return c;

        return ' ';
    }

}
