/**
 * 557. 反转字符串中的单词 III
 */
public class $557 {

    public String reverseWords(String s) {
        String[] ss = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String value : ss)
            sb.append(reverseString(value.toCharArray())).append(" ");
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private String reverseString(char[] s) {
        int p = 0, q = s.length - 1;
        while (p < q) {
            char t = s[p];
            s[p++] = s[q];
            s[q--] = t;
        }
        return new String(s);
    }

}
