package leetcode;
import java.util.HashSet;
public class P36b {

    public static boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') continue;

                int boxIndex = (i / 3) * 3 + (j / 3);

                if (!rows[i].add(c)) return false;
                if (!cols[j].add(c)) return false;
                if (!boxes[boxIndex].add(c)) return false;
            }
        }

        return true;
    }
}
