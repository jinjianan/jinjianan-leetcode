/**
 * 1768. 交替合并字符串
 */
public class $1768 {

    public String mergeAlternately(String word1, String word2) {
        char[] r = new char[word1.length() + word2.length()];
        int p = 0;
        for (int i = 0; i < word1.length() || i < word2.length(); i++) {
            if ( i < word1.length()) r[p++] = word1.charAt(i);
            if ( i < word2.length()) r[p++] = word2.charAt(i);
        }
        return new String(r);
    }

}
