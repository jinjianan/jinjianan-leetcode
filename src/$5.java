/**
 * 5. 最长回文子串
 */
public class $5 {

    public String longestPalindrome(String s) {
        int len = s.length();
        char[] arr = s.toCharArray();
        while (len > 0) {
            for (int i = 0; i + len - 1 < s.length(); i++) {
                if (isPalindrome(arr, i, i + len - 1))
                    return String.valueOf(arr, i, len);
            }
            len--;
        }
        return "";
    }

    public boolean isPalindrome(char[] arr, int l, int r) {
        while (l <= r) {
            if (arr[l] != arr[r]) return false;
            l++;
            r--;
        }
        return true;
    }

    public  static String longestPalindrome1(String s) {
        int len = s.length();
        if (len < 2) return s;

        boolean[][] v = new boolean[len][len];
        for (int i = 0; i < len; i++)
            v[i][i] = true;

        char[] chars = s.toCharArray();

        int maxLen = 1;
        int begin = 0;
        for (int i = 2; i <= len; i++) {
            for (int l = 0; l < len; l++) {
                int r = l + i - 1;

                if (r >= len)
                    break;

                if (chars[l] == chars[r]) {
                    if (l + 1 > r - 1 || v[l + 1][r - 1]) {
                        v[l][r] = true;
                        if (r - l + 1 > maxLen) {
                            maxLen = r - l + 1;
                            begin = l;
                        }
                    }
                }
            }
        }

        return s.substring(begin, begin + maxLen);
    }

    public static void main(String[] args) {
        longestPalindrome1("baba");
    }
}
