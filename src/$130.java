import java.util.LinkedList;
import java.util.Queue;

/**
 * 130. 被围绕的区域
 */
public class $130 {


    int[] dx = new int[]{1, -1, 0, 0};
    int[] dy = new int[]{0, 0, 1, -1};

    public void solve(char[][] board) {

        int m = board.length, n = board[0].length;
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (board[0][i] == 'O') {
                board[0][i] = 'A';
                queue.offer(new int[]{0, i});
            }

            if (board[m - 1][i] == 'O') {
                board[m - 1][i] = 'A';
                queue.offer(new int[]{m - 1, i});
            }
        }

        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') {
                board[i][0] = 'A';
                queue.offer(new int[]{i, 0});
            }
            if (board[i][n - 1] == 'O') {
                board[i][n - 1] = 'A';
                queue.offer(new int[]{i, n - 1});
            }
        }

        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            int x = pos[0], y = pos[1];
            for (int i = 0; i < 4; i++) {
                int xx = x + dx[i], yy = y + dy[i];
                if (xx >= 0 && xx < m && yy >= 0 && yy < n && board[xx][yy] == 'O') {
                    board[xx][yy] = 'A';
                    queue.offer(new int[]{xx, yy});
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O')
                    board[i][j] = 'X';
                else if (board[i][j] == 'A')
                    board[i][j] = 'O';
            }
        }

    }

    public void solve1(char[][] board) {

        int m = board.length, n = board[0].length;

        for (int i = 0; i < n; i++) {
            if (board[0][i] == 'O') {
                dfs(board, 0, i);
            }

            if (board[m - 1][i] == 'O') {
                dfs(board, m - 1, i);
            }
        }

        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') {
                dfs(board, i, 0);

            }
            if (board[i][n - 1] == 'O') {
                dfs(board, i, n - 1);

            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O')
                    board[i][j] = 'X';
                else if (board[i][j] == 'A')
                    board[i][j] = 'O';
            }
        }

    }

    public void dfs(char[][] board, int x, int y) {
        int m = board.length, n = board[0].length;
        board[x][y] = 'A';
        for (int i = 0; i < 4; i++) {
            int xx = x + dx[i], yy = y + dy[i];
            if (xx >= 0 && xx < m && yy >= 0 && yy < n && board[xx][yy] == 'O') {
                dfs(board, xx, yy);
            }
        }
    }

}
