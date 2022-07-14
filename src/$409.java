import java.util.HashSet;
import java.util.Set;

/**
 * 409. 最长回文串
 */
public class $409 {

    public int longestPalindrome(String s) {
        int r = 0;
        Set<Character> set = new HashSet<>();
        for ( char c : s.toCharArray())
            if (!set.add(c)) {
                set.remove(c);
                r += 2;
            }
        return set.isEmpty() ? r : r + 1;
    }

}
