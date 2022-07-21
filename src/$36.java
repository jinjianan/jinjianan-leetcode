import java.util.HashSet;
import java.util.Set;

/**
 * 36. 有效的数独
 */
public class $36 {

    public boolean isValidSudoku(char[][] board) {
        boolean[] x = new boolean[9];
        boolean[] y = new boolean[9];
        boolean[] box = new boolean[9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !isValidSudoku(board, x, y, box, i, j))
                    return false;
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board, boolean[] x, boolean[] y, boolean[] box, int i, int j) {
        Set<Character> set;
        if (!x[i]) {
            set = new HashSet<>();
            for (int k = 0; k < 9; k++)
                if (board[i][k] != '.' && !set.add(board[i][k])) return false;
            x[i] = true;
        }
        if (!y[j]) {
            set = new HashSet<>();
            for (int k = 0; k < 9; k++)
                if (board[k][j] != '.' && !set.add(board[k][j])) return false;
            y[j] = true;
        }
        int boxIndex = j / 3 * 3 + i / 3;
        if (!box[boxIndex]){
            set = new HashSet<>();
            for (int k = i / 3 * 3; k < i / 3 * 3 + 3; k++) {
                for (int l = j / 3 * 3; l < j / 3 * 3 + 3; l++) {
                    if (board[k][l] != '.' && !set.add(board[k][l])) return false;
                }
            }
            box[boxIndex] = true;
        }
        return true;
    }

}
