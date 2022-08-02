import java.util.*;

/**
 * 417. 太平洋大西洋水流问题
 */
public class $417 {
    int[] xx = new int[]{1, -1, 0, 0};
    int[] yy = new int[]{0, 0, 1, -1};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length, n = heights[0].length;
        List<List<Integer>> res = new ArrayList<>();

        boolean[][] v = new boolean[m][n];
        boolean[][] v2 = new boolean[m][n];
        for (int i = 0; i < n; i++)
            if (!v[0][i]) bfsA(heights, v, 0, i);

        for (int i = 0; i < m; i++)
            if (!v[i][0]) bfsA(heights, v, i, 0);

        for (int i = 0; i < n; i++)
            if (!v2[m - 1][i]) bfsB(heights, v, v2, m - 1, i, res);

        for (int i = 0; i < m; i++)
            if (!v2[i][n - 1]) bfsB(heights, v, v2, i, n - 1, res);

        return res;
    }

    public void bfsA(int[][] heights, boolean[][] v, int x, int y) {
        v[x][y] = true;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});

        while (!q.isEmpty()) {
            int[] curPos = q.poll();
            x = curPos[0];
            y = curPos[1];
            for (int i = 0; i < 4; i++) {
                int x1 = x + xx[i], y1 = y + yy[i];
                if (x1 >= 0 && x1 < heights.length && y1 >= 0 && y1 < heights[0].length && heights[x1][y1] >= heights[x][y] && !v[x1][y1]) {
                    v[x1][y1] = true;
                    q.offer(new int[]{x1, y1});
                }
            }
        }
    }

    public void bfsB(int[][] heights, boolean[][] v, boolean[][] v2, int x, int y, List<List<Integer>> res) {
        v2[x][y] = true;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});

        while (!q.isEmpty()) {
            int[] curPos = q.poll();
            x = curPos[0];
            y = curPos[1];
            if (v[x][y])
                res.add(Arrays.asList(x, y));
            for (int i = 0; i < 4; i++) {
                int x1 = x + xx[i], y1 = y + yy[i];
                if (x1 >= 0 && x1 < heights.length && y1 >= 0 && y1 < heights[0].length && heights[x1][y1] >= heights[x][y] && !v2[x1][y1]) {
                    v2[x1][y1] = true;
                    q.offer(new int[]{x1, y1});
                }
            }
        }
    }


}
