package leetcode;

import java.util.HashSet;

//Valid Sudoku
public class P36 {
    public static boolean isValidSudoku(char[][] board) {
        return (rowCheck(board) && columnCheck(board) && boxCheck(board));
    }

    public static boolean rowCheck(char[][] board) {
        for (char[] row : board) {
            HashSet<Character> seen = new HashSet<>();
            for (char num : row) {
                if (seen.contains(num)) return false;
                if (num != '.') seen.add(num);
            }
        }
        return true;
    }
    public static boolean columnCheck(char[][] board) {
        for (int column = 0; column <= 8; column++) {
            HashSet<Character> seen = new HashSet<>();
            for (int row = 0; row <= 8; row++) {
                char num = board[row][column];
                if (seen.contains(num)) return false;
                if (num != '.') seen.add(num);
            }
        }
        return true;
    }
    public static boolean boxCheck(char[][] board) {   
        for (int row = 0; row <= 8; row += 3) {
            for (int column = 0; column <= 8; column += 3) {
                HashSet<Character> seen = new HashSet<>();
                for (int i = row; i < row + 3; i++) {
                    for (int j = column; j < column + 3; j++) {
                        char num = board[i][j];
                        if (seen.contains(num)) return false;
                        if (num != '.') seen.add(num);
                    }
                }
               
            }
        }
        return true;
    }
}
