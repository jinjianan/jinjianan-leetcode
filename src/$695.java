import java.util.LinkedList;
import java.util.Queue;

/**
 * 695. 岛屿的最大面积
 */
public class $695 {

    int[] xx = new int[]{1, -1, 0, 0};
    int[] yy = new int[]{0, 0, -1, 1};

    public int maxAreaOfIsland(int[][] grid) {
        int r = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1)
                    r = Math.max(dfs1(grid, i, j), r);
            }
        }
        return r;
    }

    private int dfs(int[][] grid, int x, int y) {
        int sum = 1;
        grid[x][y] = 0;
        for (int i = 0; i < 4; i++) {
            int x1 = x + xx[i];
            int y1 = y + yy[i];
            if (x1 >= 0 && x1 < grid.length && y1 >= 0 && y1 < grid[0].length && grid[x1][y1] != 0)
                sum += dfs(grid, x1, y1);
        }
        return sum;
    }

    private int dfs1(int[][] grid, int x, int y) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == 0) return 0;
        int sum = 1;
        grid[x][y] = 0;
        sum += dfs1(grid, x + 1, y);
        sum += dfs1(grid, x - 1, y);
        sum += dfs1(grid, x, y + 1);
        sum += dfs1(grid, x, y - 1);
        return sum;
    }

    public int maxAreaOfIsland1(int[][] grid) {
        int r = 0;
        boolean[][] v = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && !v[i][j])
                    r = Math.max(bfs(grid,v, i, j), r);
            }
        }
        return r;
    }
    private int bfs(int[][] grid,boolean[][] v, int x, int y) {
        int r = 0;
        Queue<Integer[]> q = new LinkedList<>();
        q.offer(new Integer[]{x, y});
        while (!q.isEmpty()) {
            Integer[] c = q.poll();
            int x1 = c[0], y1 = c[1];
            if (!v[x1][y1]){
                r++;
                v[x1][y1] = true;
                for (int i = 0; i < 4; i++) {
                    int x2 = x1 + xx[i], y2 = y1 + yy[i];
                    if (x2 >= 0 && x2 < grid.length && y2 >= 0 && y2 < grid[0].length && grid[x2][y2] == 1 && !v[x2][y2])
                        q.offer(new Integer[]{x2,y2});
                }
            }
        }
        return r;
    }


}
