package leetcode;

public class P999RookCaptures {
    public static void main(String[] args) {
        char[][] board = new char[][] {{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'p','p','.','R','.','p','B','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','B','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','.','.','.','.','.'}};
        System.out.println(numRookCaptures(board));
    }

    public static int numRookCaptures(char[][] board) {
        int pawns = 0;
        int rRook = -1;
        int cRook = -1;

        for (int row = 0; row < 8; row++) {
            for (int column = 0; column < 8; column++) {
                if (board[row][column] == 'R') {
                    rRook = row;
                    cRook = column;
                }
            }
        }

        //down
        for (int row = rRook+1; row < 8; row++) {
            if (board[row][cRook] == 'p') {
                pawns++;
                break;
            }
            if (board[row][cRook] != '.') break;
        }

        //up
        for (int row = rRook-1; row >= 0; row--) {
            if (board[row][cRook] == 'p') {
                pawns++;
                break;
            }
            if (board[row][cRook] != '.') break;
        }

        //right
        for (int col = cRook+1; col < 8; col++) {
            if (board[rRook][col] == 'p') {
                pawns++;
                break;
            }
            if (board[rRook][col] != '.') break;
        }

        //left
        for (int col = cRook-1; col >= 0; col--) {
            if (board[rRook][col] == 'p') {
                pawns++;
                break;
            }
            if (board[rRook][col] != '.') break;
        }

        return pawns;
    }
}
