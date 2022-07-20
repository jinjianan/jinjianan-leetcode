/**
 * 1351. 统计有序矩阵中的负数
 */
public class $1351 {
    // 4   3   2  -1
    // 3   2   1  -1
    // 1   1  -1  -2
    //-1  -1  -2  -3
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] < 0) count += grid[0].length;
            else {

                int l = 0, r = grid[0].length;
                while (l < r) {
                    int mid = (r - l) / 2 + l;
                    if (grid[i][mid] < 0) r = mid;
                    else l = mid + 1;
                }
                if (l < grid[0].length) count += grid[0].length - l;
            }
        }
        return count;
    }

}
