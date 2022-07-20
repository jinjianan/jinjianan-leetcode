import java.util.Arrays;

/**
 * 242. 有效的字母异位词
 */
public class $242 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return String.valueOf(s1).equals(String.valueOf(s2));
    }

}
