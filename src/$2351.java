/**
 * 2351. 第一个出现两次的字母
 */
public class $2351 {

    public char repeatedCharacter(String s) {
        int[] v = new int[26];
        for (char c : s.toCharArray()) {
            int num = c - 'a';
            if (v[num] == 1) return c;
            v[num] += 1;
        }
        return ' ';
    }
}
