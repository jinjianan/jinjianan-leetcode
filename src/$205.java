import java.util.HashMap;

/**
 * 205. 同构字符串
 */
public class $205 {

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> a = new HashMap<>();
        HashMap<Character,Character> b = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character cs = s.charAt(i);
            Character ts = t.charAt(i);
            if ( (a.containsKey(cs) && a.get(cs) !=ts) || (b.containsKey(ts) && b.get(ts) != cs) ) return false;
            a.put(cs,ts);
            b.put(ts,cs);
        }

        return true;
    }
}
