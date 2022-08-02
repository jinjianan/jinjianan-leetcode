/**
 * 面试题13. 机器人的运动范围
 */
public class $Offer13 {

    public int movingCount(int m, int n, int k) {
        return dfs(m, n, new boolean[m][n], k, 0, 0);
    }

    public int dfs(int m, int n, boolean[][] v, int k, int x, int y) {
        if (x < 0 || x >= m || y < 0 || y >= n || !can(x, y, k) || v[x][y])
            return 0;
        System.out.println(x+","+y + "," + can(x, y, k));
        int sum = 0;
        v[x][y] = true;
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        for (int i = 0; i < 4; i++) {
            sum += dfs(m, n, v, k, x + dx[i], y + dy[i]);
        }
        return 1 + sum;
    }

    public boolean can(int x, int y, int k) {
        int sum = 0;
        while (x != 0 || y != 0) {
            sum += x % 10;
            sum += y % 10;
            x /= 10;
            y /= 10;
        }
        return sum <= k;
    }

}
