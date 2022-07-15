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
        }else return;
        f(image, v, x + 1, y, tar, color);
        f(image, v, x - 1, y, tar, color);
        f(image, v, x, y + 1, tar, color);
        f(image, v, x, y - 1, tar, color);
    }

}
