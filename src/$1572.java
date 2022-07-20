/**
 * 1572. 矩阵对角线元素的和
 */
public class $1572 {

    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int p = 0, q = mat[0].length - 1;
        for (int[] ints : mat) {
            if (p != q)
                sum += ints[q];
            sum += ints[p];
            p++;
            q--;
        }
        return sum;
    }

}
