import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 1034. 边界着色
 */
public class $1034 {
    int m, n;
    boolean[][] v;
    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};

    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        m = grid.length;
        n = grid[0].length;
        v = new boolean[m][n];
        List<int[]> list = new LinkedList<>();
        dfs(grid, list, row, col, grid[row][col]);
        for (int[] arr : list)
            grid[arr[0]][arr[1]] = color;
        return grid;
    }

    public void dfs(int[][] grid, List<int[]> list, int x, int y, int color) {
        v[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int xx = x + dx[i], yy = y + dy[i];
            if (xx < 0 || yy < 0 || xx >= m || yy >= n || grid[xx][yy] != color)
                list.add(new int[]{x,y});
            else if (!v[xx][yy])
                dfs(grid,list,xx,yy,color);
        }
    }

}
