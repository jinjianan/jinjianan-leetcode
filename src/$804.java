import java.util.HashSet;
/**
 * 804. 唯一摩尔斯密码词
 */
public class $804 {

    public int uniqueMorseRepresentations(String[] words) {

        String[] l = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<String> set = new HashSet<>();
        for(var str : words){
            StringBuilder code = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                code.append(l[str.charAt(i) - 'a']);
            }
            set.add(code.toString());
        }
        return set.size();
    }
}