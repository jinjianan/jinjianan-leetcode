import java.util.LinkedList;
import java.util.Queue;

/**
 * 909. 蛇梯棋
 */
public class $909 {

    public  int snakesAndLadders(int[][] board) {
        int n = board.length, tar = n * n;
        Queue<Integer> q = new LinkedList<>();

        boolean[] v = new boolean[n * n + 1];
        q.offer(1);
        v[1] = true;
        int step = -1;
        while (!q.isEmpty()) {
            step++;
            for (int i = q.size(); i > 0; i--) {
                int cur = q.poll();
                if (cur >= tar) return step;
                for (int s = 1; s <= 6; s++) {
                    int tCur = Math.min(cur + s, tar);
                    if (!v[tCur]) {
                        v[tCur] = true;
                        int[] pos = calPos(tCur, n);
                        int x = pos[0], y = pos[1];
                        if (board[x][y] != -1)
                            tCur = board[x][y];
                        q.offer(tCur);
                    }
                }
            }
        }
        return -1;
    }

    public  int[] calPos(int cur, int n) {
        boolean isOdd = n % 2 == 0;
        cur -= 1;
        int x = n - 1 - cur / n;
        boolean isRowOdd = (x + 1) % 2 == 0;
        int y = cur % n;
        if ((isOdd && !isRowOdd) || (!isOdd && isRowOdd))
            y = n - 1 - y;

        return new int[]{x, y};
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(calPos(1, 6)));
//        System.out.println(Arrays.toString(calPos(18, 6)));
//        System.out.println(Arrays.toString(calPos(25, 6)));

        int[][] b = new int[][]{
                {-1, -1, 128, -1, -1, -1, 136, -1, -1, -1, 109, -1},
                {-1, -1, -1, -1, -1, 103, -1, -1, 56, 10, -1, -1},
                {-1, -1, -1, -1, -1, -1, 116, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, 50, -1, 67, 107},
                {-1, 40, -1, -1, -1, 20, -1, 59, -1, 67, -1, -1},
                {-1, -1, -1, -1, -1, -1, 112, 133, 111, -1, -1, -1},
                {-1, -1, 112, -1, 74, -1, -1, -1, -1, -1, -1, -1},
                {23, -1, 115, -1, 129, 126, -1, -1, -1, -1, -1, -1},
                {106, 143, 81, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, 26, 102, 1, 29},
                {26, -1, -1, -1, -1, -1, -1, -1, 27, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}
        };
    }
}
