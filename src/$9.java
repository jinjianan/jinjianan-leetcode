/**
 * 9. 回文数
 */
public class $9 {
    public boolean isPalindrome(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            if (chars[i] != chars[j]) return false;
            i++;
            j--;
        }
        return true;
    }

}
