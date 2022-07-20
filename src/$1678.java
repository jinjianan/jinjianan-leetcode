/**
 * 1678. 设计 Goal 解析器
 */
public class $1678 {

    public String interpret(String command) {
        int p = 0;
        StringBuilder r = new StringBuilder();
        while (p < command.length()) {
            if (command.charAt(p++) == 'G')
                r.append('G');
            else if (command.charAt(p++) == ')')
                r.append('o');
            else if (command.charAt(p++) == 'l') {
                r.append("al");
                p++;
            }
        }
        return r.toString();
    }


}
