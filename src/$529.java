import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 529. 扫雷游戏
 */
public class $529 {
    int[] dx = new int[]{1, 1, -1, -1, 1, -1, 0, 0};
    int[] dy = new int[]{1, -1, 1, -1, 0, 0, 1, -1};

    public char[][] updateBoard(char[][] board, int[] click) {
        int x = click[0], y = click[1];
        int m = board.length, n = board[0].length;

        if (board[x][y] == 'M') {
            board[x][y] = 'X';
            return board;
        }

        board[x][y] = 'B';
        Queue<int[]> q = new LinkedList<>();
        q.offer(click);
        while (!q.isEmpty()) {
            int[] pos = q.poll();
            x = pos[0];
            y = pos[1];
            int bombCount = 0;
            for (int i = 0; i < 8; i++) {
                int xx = x + dx[i], yy = y + dy[i];
                if (xx >= 0 && xx < m && yy >= 0 && yy < n) {
                    if (board[xx][yy] == 'M')
                        bombCount++;
                }
            }
            if (bombCount > 0) {
                board[x][y] = (char) (bombCount + '0');
            } else {
                for (int i = 0; i < 8; i++) {
                    int xx = x + dx[i], yy = y + dy[i];
                    if (xx >= 0 && xx < m && yy >= 0 && yy < n && board[xx][yy] == 'E') {
                        board[xx][yy] = 'B';
                        q.offer(new int[]{xx, yy});
                    }
                }
            }
        }

        return board;
    }

    public char[][] updateBoard1(char[][] board, int[] click) {
        int x = click[0], y = click[1];

        if (board[x][y] == 'M')
            board[x][y] = 'X';
        else
            dfs(board, x, y);

        return board;
    }

    public void dfs(char[][] board, int x, int y) {
        int m = board.length, n = board[0].length;
        board[x][y] = 'B';
        int bombCount = 0;
        for (int i = 0; i < 8; i++) {
            int xx = x + dx[i], yy = y + dy[i];
            if (xx >= 0 && xx < m && yy >= 0 && yy < n && board[xx][yy] == 'M')
                bombCount++;
        }

        if (bombCount > 0)
            board[x][y] = (char) ('0' + bombCount);
        else {
            for (int i = 0; i < 8; i++) {
                int xx = x + dx[i], yy = y + dy[i];
                if (xx >= 0 && xx < m && yy >= 0 && yy < n && board[xx][yy] == 'E')
                    dfs(board, xx, yy);
            }
        }
    }

}
