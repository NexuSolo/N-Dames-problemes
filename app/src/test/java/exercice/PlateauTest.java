package exercice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class PlateauTest {

    @Test
    public void testCreationPlateau0() {
        int n = 0;
        assertThrows(IllegalArgumentException.class, () -> {
            new Plateau(n);
        });
    }

    @Test
    public void testCreationPlateau1() {
        int n = 1;
        Plateau plateau = new Plateau(n);
        char[][] board = plateau.getBoard();
        assertEquals(n, plateau.getSize());
        assertEquals(n, board.length);
        assertEquals(n, board[0].length);
        assertEquals('O', board[0][0]);
    }

    @Test
    public void testCreationPlateauN() {
        int n = 2;
        Plateau plateau = new Plateau(n);
        char[][] board = plateau.getBoard();
        assertEquals(n, plateau.getSize());
        assertEquals(n, board.length);
        assertEquals(n, board[0].length);
        assertEquals('O', board[0][0]);
        assertEquals('O', board[0][1]);
        assertEquals('O', board[1][0]);
        assertEquals('O', board[1][1]);

        n = 3;
        plateau = new Plateau(n);
        board = plateau.getBoard();
        assertEquals(n, plateau.getSize());
        assertEquals(n, board.length);
        assertEquals(n, board[0].length);
        assertEquals('O', board[0][0]);
        assertEquals('O', board[0][1]);
        assertEquals('O', board[0][2]);
        assertEquals('O', board[1][0]);
        assertEquals('O', board[1][1]);
        assertEquals('O', board[1][2]);
        assertEquals('O', board[2][0]);
        assertEquals('O', board[2][1]);
        assertEquals('O', board[2][2]);
    }

    @Test
    public void isSafeTestPlateauDiagonales() {
        char[][] board = {
                { 'O', 'O', 'O' },
                { 'O', 'D', 'O' },
                { 'O', 'O', 'O' }
        };
        assertEquals(false, Plateau.isSafe(board, 0, 0));
        assertEquals(false, Plateau.isSafe(board, 0, 1));
        assertEquals(false, Plateau.isSafe(board, 0, 2));
        assertEquals(false, Plateau.isSafe(board, 1, 0));
        assertEquals(false, Plateau.isSafe(board, 1, 1));
        assertEquals(false, Plateau.isSafe(board, 1, 2));
        assertEquals(false, Plateau.isSafe(board, 2, 0));
        assertEquals(false, Plateau.isSafe(board, 2, 1));
        assertEquals(false, Plateau.isSafe(board, 2, 2));
    }

    @Test
    public void isSafeTestPlateau() {
        char[][] board = { { 'D', 'O', 'O' }, { 'O', 'O', 'O' }, { 'O', 'O', 'O' } };

        assertEquals(true, Plateau.isSafe(board, 1, 2));
        assertEquals(true, Plateau.isSafe(board, 2, 1));
    }

    @Test
    public void testCopyBoard() {
        int n = 4;
        Plateau plateau = new Plateau(n);
        char[][] originalBoard = plateau.getBoard();
        Plateau copyPlateau = new Plateau(n, plateau.copyBoard());
        char[][] copyBoard = copyPlateau.getBoard();
        assertEquals(n, copyPlateau.getSize());
        assertEquals(n, copyBoard.length);
        assertEquals(n, copyBoard[0].length);
        assertNotEquals(originalBoard, copyBoard);
    }

    @Test
    public void testSolveNQueensSize1() {
        Plateau plateau = new Plateau(1);
        List<Plateau> solutions = plateau.solveNQueens();
        assertEquals(1, solutions.size());
        assertEquals('D', solutions.get(0).getBoard()[0][0]);
    }

    @Test
    public void testSolveNQueensSize2() {
        Plateau plateau = new Plateau(2);
        List<Plateau> solutions = plateau.solveNQueens();
        assertEquals(0, solutions.size()); // Impossible de placer 2 reines sur un plateau 2x2
    }

    @Test
    public void testSolveNQueensSize3() {
        Plateau plateau = new Plateau(3);
        List<Plateau> solutions = plateau.solveNQueens();
        assertEquals(0, solutions.size()); // Impossible de placer 3 reines sur un plateau 3x3
    }

    @Test
    public void testSolveNQueensSize4() {
        Plateau plateau = new Plateau(4);
        List<Plateau> solutions = plateau.solveNQueens();
        assertEquals(2, solutions.size()); // Il y a exactement 2 solutions pour n=4

        for (Plateau solution : solutions) {
            int queens = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (solution.getBoard()[i][j] == 'D') {
                        queens++;
                    }
                }
            }
            assertEquals(4, queens);
        }
    }

}
