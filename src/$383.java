/**
 * 383. 赎金信
 */
public class $383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] map = new int[26];
        for (int i = 0; i < magazine.length(); i++)
            map[magazine.charAt(i) - 'a'] += 1;

        for (int i = 0; i < ransomNote.length(); i++) {
            map[ransomNote.charAt(i) - 'a'] -= 1;
            if (map[ransomNote.charAt(i) - 'a'] < 0) return false;
        }
        return true;

    }

}
