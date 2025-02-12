package exercice;

public class Plateau {
    private int size;
    private char[][] board;

    public Plateau(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("n must be greater than 0");
        }
        this.size = size;
        this.board = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = 'O';
            }
        }
    }

    public Plateau(int size, char[][] board) {
        this.size = size;
        this.board = board;
    }

    public int getSize() {
        return size;
    }

    public char[][] getBoard() {
        return board;
    }

    // public void printBoard() {
    // for (int i = 0; i < size; i++) {
    // for (int j = 0; j < size; j++) {
    // System.out.print(board[i][j] + " ");
    // }
    // System.out.println();
    // }
    // }

    public static boolean isSafe(char[][] board, int row, int col) {
        // lignes
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == 'D') {
                return false;
            }
        }

        // colonnes
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'D') {
                return false;
            }
        }

        // haut gauche
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'D') {
                return false;
            }
        }

        // haut droit
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'D') {
                return false;
            }
        }

        // bas gauche
        for (int i = row, j = col; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 'D') {
                return false;
            }
        }

        // bas droite
        for (int i = row, j = col; i < board.length && j < board.length; i++, j++) {
            if (board[i][j] == 'D') {
                return false;
            }
        }

        return true;
    }
}
