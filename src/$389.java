import java.util.HashMap;

/**
 * 389. 找不同
 */
public class $389 {

    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

        for (int i = 0; i < t.length(); i++) {
            if (map.getOrDefault(t.charAt(i), 0) - 1 < 0)
                return t.charAt(i);
            else map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
        }

        return t.charAt(0);
    }

    public char findTheDifference1(String s, String t) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++)
            count[s.charAt(i) - 'a'] += 1;

        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a'] -= 1;
            if (count[t.charAt(i) - 'a'] < 0)
                return t.charAt(i);
        }

        return t.charAt(0);
    }

}
