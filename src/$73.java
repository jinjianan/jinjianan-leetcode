import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 73. 矩阵置零
 */
public class $73 {

    public void setZeroes(int[][] matrix) {
        int xl = matrix.length;
        int yl = matrix[0].length;
        boolean [] x = new boolean[xl];
        boolean [] y = new boolean[yl];
        for (int i = 0; i < xl; i++) {
            for (int j = 0; j < yl; j++) {
                if (matrix[i][j] == 0) {
                    x[i] = y[j] = true;
                }
            }
        }
        for (int i = 0; i < xl; i++) {
            for (int j = 0; j < yl; j++) {
                if ( x[i] || y[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

    }

}
