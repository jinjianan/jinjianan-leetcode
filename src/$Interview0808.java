import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 面试题 08.08. 有重复字符串的排列组合
 */
public class $Interview0808 {
    public static String[] permutation(String s) {
        Set<String> res = new HashSet<>();
        char[] chars = s.toCharArray();
        boolean[] v = new boolean[chars.length];
        Arrays.sort(chars);
        dfs(chars, v, "", 0, res);

        String[] r = new String[res.size()];
        int i = 0;
        for (var str : res)
            r[i++] = str;
        return r;
    }

    public static void dfs(char[] chars, boolean[] v, String str, int depth, Set<String> res) {
        if (depth == chars.length) {
            res.add(str);
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            if ( (i > 0 && chars[i] == chars[i-1] && !v[i-1]) || v[i])
                continue;
            v[i] = true;
            dfs(chars, v, str +chars[i], depth + 1, res);
            v[i] = false;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(permutation("ab")));;
    }
}
