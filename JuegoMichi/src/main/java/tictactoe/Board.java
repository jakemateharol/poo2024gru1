
package tictactoe;


public class Board {
    private final char[][] board;

    public Board() {
        board = new char[3][3];
        initializeBoard();
    }

    public final void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '9';
            }
        }
    }

    public boolean isValidMove(int row, int col) {
        return row >= 0 && col >= 0 && row < 3 && col < 3 && board[row][col] == '-';
    }

    public void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    public boolean isWinner(char symbol) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) {
                return true;
            }
        }
        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) {
                return true;
            }
        }
        // Check diagonals
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
            return true;
        }
        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public char getCell(int row, int col) {
        return board[row][col];
    }
}

