/**
 * 1254. 统计封闭岛屿的数目
 */
public class $1254 {

    int m, n;

    public int closedIsland(int[][] grid) {
        m = grid.length;
        n = grid[0].length;

        for (int i = 0; i < m; i++) {
            dfs(grid, i, 0);
            dfs(grid, i, n - 1);
        }

        for (int i = 0; i < n; i++) {
            dfs(grid, 0, i);
            dfs(grid, m - 1, i);
        }

        int r = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    dfs(grid, i, j);
                    r++;
                }
            }
        }
        return r;
    }

    public void dfs(int[][] grid, int x, int y) {
        if (x < 0 || y < 0 || x >= m || y >= n || grid[x][y] == 1)
            return;
        grid[x][y] = 1;
        dfs(grid, x + 1, y);
        dfs(grid, x - 1, y);
        dfs(grid, x, y + 1);
        dfs(grid, x, y - 1);
    }
}
