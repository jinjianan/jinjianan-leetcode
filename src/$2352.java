import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 2352. 相等行列对
 */
public class $2352 {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int [][] g2 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                g2[i][j] = grid[j][i];
            }
        }

        int r = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Arrays.equals(grid[i],g2[j]))
                    r++;
            }
        }

        return r;
    }
}
