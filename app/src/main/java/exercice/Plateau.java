package exercice;

public class Plateau {
    private int size;
    private char[][] board;

    public Plateau(int size) {
        this.size = size;
        this.board = new char[size][size];
        this.board[0][0] = 'O';
    }

    public int getSize() {
        return size;
    }

    public char[][] getBoard() {
        return board;
    }
}
