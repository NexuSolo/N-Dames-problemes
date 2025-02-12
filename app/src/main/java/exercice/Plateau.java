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

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
