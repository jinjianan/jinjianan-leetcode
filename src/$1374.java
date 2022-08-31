/**
 * 1374. 生成每种字符都是奇数个的字符串
 */
public class $1374 {

    public String generateTheString(int n) {
        boolean flag = n % 2 == 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i == n -1 && flag)
                sb.append("b");
            else sb.append("a");
        }
        return sb.toString();
    }

}
