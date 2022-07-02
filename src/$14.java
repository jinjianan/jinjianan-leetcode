import java.util.Arrays;

/**
 * 14. 最长公共前缀
 */
public class $14 {

    public String longestCommonPrefix(String[] strs) {

        String r = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (r.length() == 0) return "";
            while (r.length() > 0) {
                if (strs[i].startsWith(r)) break;
                r = r.substring(0, r.length() - 1);
            }
        }
        return r;
    }


    public static void main(String[] args) {
        Arrays.sort(args, (o1, o2) -> {
            return Integer.compare(o1.length(), o2.length());
        });
    }
}
