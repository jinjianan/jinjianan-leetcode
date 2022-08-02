import java.util.LinkedList;
import java.util.Queue;

/**
 * 1020. 飞地的数量
 */
public class $1020 {
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};

    public int numEnclaves(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        int r = 0;
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 1)
                dfs(grid, i, 0);
            if (grid[i][n - 1] == 1)
                dfs(grid, i, n - 1);
        }

        for (int i = 0; i < n; i++) {
            if (grid[0][i] == 1)
                dfs(grid, 0, i);
            if (grid[m - 1][i] == 1)
                dfs(grid, m - 1, i);
        }

        for (int[] ints : grid) {
            for (int i : ints) {
                if (i == 1) r++;
            }
        }

        return r;
    }

    public void dfs(int[][] grid, int x, int y) {
        int m = grid.length, n = grid[0].length;
        grid[x][y] = 0;
        for (int i = 0; i < 4; i++) {
            int xx = x + dx[i], yy = y + dy[i];
            if (xx >= 0 && xx < m && yy >= 0 && yy < n && grid[xx][yy] == 1)
                dfs(grid, xx, yy);
        }
    }


    public int numEnclaves1(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        int r = 0;
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 1)
                q.offer(new int[]{i, 0});
            if (grid[i][n - 1] == 1)
                q.offer(new int[]{i, n - 1});
        }

        for (int i = 0; i < n; i++) {
            if (grid[0][i] == 1)
                q.offer(new int[]{0, i});
            if (grid[m - 1][i] == 1)
                q.offer(new int[]{m - 1, i});
        }

        while (!q.isEmpty()) {
            int[] pos = q.poll();
            int x = pos[0], y = pos[1];
            grid[x][y] = 0;
            for (int i = 0; i < 4; i++) {
                int xx = x + dx[i], yy = y + dy[i];
                if (xx >= 0 && xx < m && yy >= 0 && yy < n && grid[xx][yy] == 1) {
                    grid[xx][yy] = 0;
                    q.offer(new int[]{xx, yy});
                }
            }
        }


        for (int[] ints : grid) {
            for (int i : ints) {
                if (i == 1) r++;
            }
        }
        return r;
    }


}
