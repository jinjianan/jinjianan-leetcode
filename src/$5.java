/**
 * 5. 最长回文子串
 */
public class $5 {

    public static String longestPalindrome(String s) {
        if (s.length() == 0) return "";
        String res = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            if (s.length() - i <= res.length()) break;
            int fromIndex = s.length();
            while (true) {
                int index = s.lastIndexOf(s.charAt(i), fromIndex);
                // 若定位到目前元素，则最长串为1，直接break
                if (index == i) break;
                // 否则判断这个区间的串是否为回文
                String temp = s.substring(i, index + 1);
                if (isPalindrome(temp) && temp.length() > res.length()) {
                    res = temp;
                    break;
                }
                fromIndex = index - 1;
            }
        }

        return res;
    }

    public static boolean isPalindrome(String s) {
        int i = s.length() / 2 - 1; // 1
        int j = s.length() - 1; // 4
        for (int k = 0; k <= i; k++,j--)
            if (s.charAt(k) != s.charAt(j)) return false;
        return true;
    }

    /*    public static boolean isPalindrome(String s) {
            int i = s.length() / 2 - 1;
            int j = s.length() % 2 == 0 ? i + 1 : i + 2;
            String a = s.substring(0, i + 1);
            String b = s.substring(j);
            return a.equals(new StringBuffer(b).reverse().toString());
        }*/
    public static void main(String[] args) {
        String a = "abcba";
        System.out.println(isPalindrome(a));
    }
}
