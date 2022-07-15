/**
 * 1790. 仅执行一次字符串交换能否使两个字符串相等
 */
public class $1790 {

    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        if (s1.equals(s2)) return true;
        int p = -1;
        char[] cs = s1.toCharArray();
        for (int i = 0; i < s1.length(); i++) {
            if (cs[i] != s2.charAt(i)) {
                if (p == -1) p = i;
                else {
                    //swap and check
                    char t = cs[i];
                    cs[i] = cs[p];
                    cs[p] = t;
                    return String.valueOf(cs).equals(s2);
                }
            }
        }
        return false;
    }
}
