/**
 * 709. 转换成小写字母
 */
public class $709 {

    public String toLowerCase(String s) {
        int d = 'A' - 'a';
        char [] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
            if ( chars[i] >= 'A' && chars[i] <= 'Z') chars[i] -= d;
        return new String(chars);
    }

}
