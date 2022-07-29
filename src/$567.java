import java.util.*;

/**
 * 567. 字符串的排列
 */
public class $567 {

    public boolean checkInclusion(String s1, String s2) {
        int[] o = new int[26];
        int[] l = new int[26];
        for (char c : s1.toCharArray())
            o[c - 'a'] += 1;

        for (int q = 0, p = 0; q < s2.length(); q++) {
            int i = s2.charAt(q) - 'a';
            if (o[i] == 0) {
                while (p <= q) {
                    int j = s2.charAt(p++) - 'a';
                    l[j] -= 1;
                }
            } else {
                l[i] += 1;
                while (l[i] > o[i]) {
                    int j = s2.charAt(p++) - 'a';
                    l[j] -= 1;
                }
                if (q - p + 1 == s1.length()) return true;
            }
        }
        return false;
    }

}
