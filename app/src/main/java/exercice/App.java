package exercice;

import java.util.List;

public class App {

    public static void main(String[] args) {
        Plateau plateau = new Plateau(1);
    }

    public static List<Plateau> getNDames(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n should be greater than 0");
        }
        Plateau plateau = new Plateau(n);
        char[][] board = plateau.getBoard();
        board[0][0] = 'D';
        return List.of(plateau);
    }

}