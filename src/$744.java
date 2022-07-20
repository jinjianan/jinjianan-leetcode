/**
 * 744. 寻找比目标字母大的最小字母
 */
public class $744 {

    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0, r = letters.length;
        while (l < r) {
            int mid = (r - l) / 2 + l;
            if (letters[mid] > target) r = mid;
            else l = mid + 1;
        }
        return l == letters.length ? letters[0] : letters[l];
    }

}
