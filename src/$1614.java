import java.util.*;
/**
 * 1614. 括号的最大嵌套深度
 */
public class $1614 {

    public int maxDepth(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        int max = 0;
        for(int i = 0 ; i<s.length();i++){
            char c = s.charAt(i);
            if(c == '('){
                stack.push(c);
                max = Math.max(stack.size(),max);
            }
            if(c == ')')
                stack.pop();
        }
        return max;
    }
}
