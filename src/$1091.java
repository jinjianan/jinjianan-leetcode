import java.util.LinkedList;
import java.util.Queue;

/**
 * 1091. 二进制矩阵中的最短路径
 */
public class $1091 {
    static int[] xx = new int[]{1, -1, 0, 0, -1, 1, 1, -1};
    static int[] yy = new int[]{0, 0, -1, 1, -1, 1, -1, 1};

    public static int shortestPathBinaryMatrix(int[][] grid) {

        Queue<int[]> queue = new LinkedList<>();
        int d = 0;
        if (grid[0][0] == 0) {
            grid[0][0] = 1;
            queue.offer(new int[]{0, 0});
        }

        while (!queue.isEmpty()) {
            d++;
            for (int ii = queue.size(); ii > 0; ii--) {
                int[] pos = queue.poll();
                int x = pos[0], y = pos[1];
                if (x == grid.length - 1 && y == grid[0].length - 1) return d;
                for (int i = 0; i < xx.length; i++) {
                    int x1 = x + xx[i], y1 = y + yy[i];
                    if (x1 >= 0 && x1 < grid.length && y1 >= 0 && y1 < grid[0].length && grid[x1][y1] == 0) {
                        grid[x1][y1] = 1;
                        queue.offer(new int[]{x1, y1});
                    }
                }
            }
        }
        return -1;
    }

    public static int shortestPathBinaryMatrix1(int[][] grid) {
        return dfs(grid, new boolean[grid.length][grid.length], 0, 0);
    }

    public static int dfs(int[][] grid, boolean[][] v, int x, int y) {
        int n = grid.length;
        if (x < 0 || x >= n || y < 0 || y >= n || grid[x][y] == 1 || v[x][y])
            return -1;
        if (x == n - 1 && y == n - 1)
            return 1;

        v[x][y] = true;
        int d = Integer.MAX_VALUE;
        for (int i = 0; i < 8; i++) {
            int x1 = x + xx[i], y1 = y + yy[i];
            int r = dfs(grid, v, x1, y1);
            if (r != -1) d = Math.min(r + 1, d);
        }
        v[x][y] = false;
        return d == Integer.MAX_VALUE ? -1 : d;
    }

    public static void main(String[] args) {
        int [][] grid = new int[][]{{0,1,0,0,1,1,0},{1,0,0,0,0,0,0},{1,0,0,1,1,1,1},{0,1,0,0,0,0,0},{1,0,0,0,0,0,1},{1,0,0,1,0,0,0},{1,0,1,0,0,1,0}};
        System.out.println(shortestPathBinaryMatrix1(grid));
        System.out.println(shortestPathBinaryMatrix(grid));
    }
}
