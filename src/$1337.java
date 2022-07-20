import java.util.*;

/**
 * 1337. 矩阵中战斗力最弱的 K 行
 */
public class $1337 {

    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] r = new int[mat.length][2];
        for (int i = 0; i < mat.length; i++)
            r[i] = new int[]{calPower(mat[i]), i};

        Arrays.sort(r, (o1, o2) -> {
            if (o1[0] == o2[0]) return Integer.compare(o1[1], o2[1]);
            return Integer.compare(o1[0], o2[0]);
        });

        int[] res = new int[k];
        for (int i = 0; i < k; i++)
            res[i] = r[i][1];
        return res;
    }

    public int calPower(int[] arr) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = (r - l) / 2 + l;
            if (arr[mid] < 1) r = mid;
            else l = mid + 1;
        }
        return l;
    }

}
