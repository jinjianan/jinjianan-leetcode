import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

/**
 * 剑指 Offer 04. 二维数组中的查找
 */
public class $Offer04 {

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {

        if (matrix.length == 0 || matrix[0].length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int l = -1;
        int r = m - 1;
        while (l < r) {
            int mid = (r - l + 1) / 2 + l;
            if (matrix[mid][0] == target) return true;
            else if (matrix[mid][0] < target) l = mid;
            else r = mid - 1;
        }
        if (l < 0) return false;
        int a = l;
        r = a + 1;
        l = 0;
        while (l < r) {
            // 1 6
            int mid = (r - l) / 2 + l;
            if (matrix[mid][n - 1] == target) return true;
            else if (matrix[mid][n - 1] < target) l = mid + 1;
            else r = mid;
        }
        if (l == a + 1) return false;

        for (int i = 0; i <= a; i++) {
            l = 0;
            r = n - 1;
            while (l <= r) {
                int mid = (r - l) / 2 + l;
                if (matrix[i][mid] == target) return true;
                else if (matrix[i][mid] > target) r = mid - 1;
                else l = mid + 1;
            }
        }

        return false;
    }

    static class Index {
        int l;
        int r;

        public Index(int l, int r) {
            this.l = l;
            this.r = r;
        }
    }

    public static boolean findNumberIn2DArray1(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) return false;
        boolean[][] v = new boolean[matrix.length][matrix[0].length];
        Deque<Index> s = new ArrayDeque<>();
        s.push(new Index(0, 0));
        while (!s.isEmpty()) {
            Index cur = s.pop();
            int x = cur.l;
            int y = cur.r;
            v[x][y] = true;
            if (matrix[x][y] == target) return true;
            else if (matrix[x][y] < target) {
                if (x + 1 < matrix.length && !v[x+1][y]) s.push(new Index(x + 1, y));
                if (y + 1 < matrix[0].length && !v[x][y+1]) s.push(new Index(x, y + 1));
            }
        }

        return false;
    }

}
