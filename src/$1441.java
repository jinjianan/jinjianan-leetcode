import java.util.ArrayList;
import java.util.List;

/**
 * 1441. 用栈操作构建数组
 * <a href="https://leetcode-cn.com/problems/build-an-array-with-stack-operations/">题目链接</a>
 *
 */
public class $1441 {

    public List<String> buildArray(int[] target, int n) {
        List<String> r = new ArrayList<>();
        int t = 0;
        for (int i = 1; i <= n; i++) {
            if (i == target[t]) {
                t++;
                r.add("Push");
                if (t == target.length) break;
            } else {
                r.add("Push");
                r.add("Pop");
            }
        }
        return r;
    }
}
