import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 剑指 Offer 47. 礼物的最大价值
 */
public class $Offer47 {

    public int maxValue(int[][] grid) {
        int[][] max = new int[grid.length][grid[0].length];
        f(grid, max, 0, 0);
        return max[0][0];
    }

    private int f(int[][] grid, int[][] max, int x, int y) {
        if (x >= grid.length || y >= grid[0].length) return 0;
        if (max[x][y] == 0)
            max[x][y] = grid[x][y] + Math.max(f(grid, max, x + 1, y), f(grid, max, x, y + 1));
        return max[x][y];
    }
}
