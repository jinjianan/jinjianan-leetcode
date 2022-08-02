import java.util.LinkedList;
import java.util.Queue;

/**
 * 934. 最短的桥
 */
public class $934 {

    static int[] dx = new int[]{1, -1, 0, 0};
    static int[] dy = new int[]{0, 0, 1, -1};

    public static int shortestBridge(int[][] grid) {
        int m = grid.length;
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] v = new boolean[m][m];

        Outer:
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    dfsIsland(grid, queue, v, i, j);
                    break Outer;
                }
            }
        }

        int d = -1;
        while (!queue.isEmpty()) {
            d++;
            for (int i = queue.size(); i > 0; i--) {
                int[] pos = queue.poll();
                int x = pos[0], y = pos[1];
                for (int j = 0; j < 4; j++) {
                    int xx = x + dx[j], yy = y + dy[j];
                    if (xx >= 0 && xx < grid.length && yy >= 0 && yy < grid.length && !v[xx][yy]) {
                        if (grid[xx][yy] == 1)
                            return d;
                        queue.offer(new int[]{xx, yy});
                        v[xx][yy] = true;
                    }
                }
            }
        }

        return -1;
    }

    public static void dfsIsland(int[][] grid, Queue<int[]> queue, boolean[][] v, int x, int y) {
        v[x][y] = true;
        grid[x][y] = 0;
        queue.offer(new int[]{x, y});
        for (int i = 0; i < 4; i++) {
            int xx = x + dx[i], yy = y + dy[i];
            if (xx >= 0 && xx < grid.length && yy >= 0 && yy < grid.length && grid[xx][yy] == 1)
                dfsIsland(grid, queue, v, xx, yy);
        }
    }

    public static void main(String[] args) {
//        int [][] grid = new int[][]{{0,1,0},{0,0,0},{0,0,1}};
        int[][] grid = new int[][]{{1, 1, 0, 0, 0}, {1, 0, 0, 0, 0}, {1, 0, 0, 0, 0}, {0, 0, 0, 1, 1}, {0, 0, 0, 1, 1}};
        shortestBridge(grid);
    }
}
