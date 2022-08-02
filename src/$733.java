import java.util.LinkedList;
import java.util.Queue;

/**
 * 733. 图像渲染
 */
public class $733 {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        f(image, new boolean[image.length][image[0].length], sr, sc, image[sr][sc], color);
        return image;
    }

    public void f(int[][] image, boolean[][] v, int x, int y, int tar, int color) {
        if (x < 0 || y < 0 || x >= image.length || y >= image[0].length || v[x][y]) return;
        if (image[x][y] == tar) {
            v[x][y] = true;
            image[x][y] = color;
        } else return;
        f(image, v, x + 1, y, tar, color);
        f(image, v, x - 1, y, tar, color);
        f(image, v, x, y + 1, tar, color);
        f(image, v, x, y - 1, tar, color);
    }


    public int[][] floodFill1(int[][] image, int sr, int sc, int color) {
        int m = image.length, n = image[0].length;
        boolean[][] v = new boolean[m][n];
        int[] dx = new int[]{1, -1, 0, 0};
        int[] dy = new int[]{0, 0, 1, -1};
        int tar = image[sr][sc];
        Queue<int[]> q = new LinkedList<>();
        v[sr][sc] = true;
        q.offer(new int[]{sr, sc});
        while (!q.isEmpty()) {
            int[] pos = q.poll();
            int x = pos[0], y = pos[1];
            image[x][y] = color;
            for (int i = 0; i < 4; i++) {
                int xx = x + dx[i], yy = y + dy[i];
                if (xx >= 0 && yy >= 0 && xx < m && yy < n && image[xx][yy] == tar && !v[xx][yy]) {
                    q.offer(new int[]{xx, yy});
                    v[xx][yy] = true;
                }
            }
        }
        return image;
    }
}
