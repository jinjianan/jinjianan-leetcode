import java.util.HashMap;
import java.util.Map;

/**
 * 953. 验证外星语词典
 */
public class $953 {

    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < order.length(); i++)
            map.put(order.charAt(i), i);

        for (int i = 1; i < words.length; i++) {
            String s1 = words[i - 1];
            String s2 = words[i];
            if (s2.length() < s1.length() && s1.contains(s2)) return false;
            if (s1.length() < s2.length() && s2.contains(s1)) continue;
            for (int j = 0; j < s2.length() && j < s1.length(); j++) {
                if (s2.charAt(j) != s1.charAt(j)){
                    if (map.get(s1.charAt(j)) < map.get(s2.charAt(j))) break;
                    else return false;
                }
            }
        }

        return true;
    }

}
