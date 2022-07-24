/**
 * 695. 岛屿的最大面积
 */
public class $695 {

    public int maxAreaOfIsland(int[][] grid) {
        int r = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1)
                    r = Math.max(calSize(grid, i, j), r);
            }
        }
        return r;
    }

    int[] xx = new int[]{1, -1, 0, 0};
    int[] yy = new int[]{0, 0, -1, 1};

    private int calSize(int[][] grid, int x, int y) {
        int sum = 1;
        grid[x][y] = 0;
        for (int i = 0; i < 4; i++) {
            int x1 = x + xx[i];
            int y1 = y + yy[i];
            if (x1 >= 0 && x1 < grid.length && y1 >= 0 && y1 < grid[0].length && grid[x1][y1] != 0)
                sum += calSize(grid, x1, y1);
        }
        return sum;
    }

    private int calSize1(int[][] grid, int x, int y) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == 0) return 0;
        int sum = 1;
        grid[x][y] = 0;
        sum += calSize(grid, x + 1, y);
        sum += calSize(grid, x - 1, y);
        sum += calSize(grid, x, y + 1);
        sum += calSize(grid, x, y - 1);
        return sum;
    }

}
