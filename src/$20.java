import java.util.*;

/**
 * 20. 有效的括号
 */
public class $20 {

    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> map = new HashMap<>() {{
            put('(', ')');
            put('[', ']');
            put('{', '}');
        }};


        for (var c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else {
                if (stack.isEmpty() || !(c == map.get(stack.pop())))
                    return false;
            }
        }
        return stack.size() == 0;
    }
}
