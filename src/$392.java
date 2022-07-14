/**
 * 392. 判断子序列
 */
public class $392 {

    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        if (t.length() == 0) return false;
        int s1 = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(s1)) {
                s1++;
                if (s1 == s.length()) return true;
            }
        }
        return false;
    }

}
