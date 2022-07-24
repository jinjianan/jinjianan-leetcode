/**
 * 344. 反转字符串
 */
public class $344 {

    public void reverseString(char[] s) {
        int p = 0, q = s.length - 1;
        while (p < q) {
            char t = s[p];
            s[p++] = s[q];
            s[q--] = t;
        }
    }

}
