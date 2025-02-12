package exercice;

public class Plateau {
    private int size;
    private char[][] board;

    public Plateau(int size) {
        this.size = size;
        this.board = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = 'O';
            }
        }
    }

    public int getSize() {
        return size;
    }

    public char[][] getBoard() {
        return board;
    }
}
