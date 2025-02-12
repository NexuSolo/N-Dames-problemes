package exercice;

import java.util.List;

public class App {

    public static void main(String[] args) {
    }

    public static List<Plateau> getNDames(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be greater than 0");
        }
        Plateau plateau = new Plateau(n);
        char[][] board = plateau.getBoard();
        board[0][0] = 'D';
        return List.of(plateau);
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        // lignes
        for (int i = 0; i < board.length; i++) {
            System.out.println("row: " + row + " i: " + i + " board[row][i]: " + board[row][i]);
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