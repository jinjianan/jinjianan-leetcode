import java.util.Arrays;

/**
 * 1309. 解码字母到整数映射
 */
public class $1309 {

    public String freqAlphabets(String s) {
        StringBuilder r = new StringBuilder();

        char[] chars = s.toCharArray();
        for (int i = s.length() - 1; i >= 0; ) {
            if (chars[i] == '#') {
                r.append((char)('a' + (chars[i - 2] - '0') * 10 +  (chars[i - 1] - '1')));
                i -= 3;
            } else {
                r.append((char)('a' + (chars[i] - '1') ));
                i--;
            }
        }
        return r.reverse().toString();
    }

    public static void main(String[] args) {
        char c = '1';
        System.out.println(c + 0);
    }
}
