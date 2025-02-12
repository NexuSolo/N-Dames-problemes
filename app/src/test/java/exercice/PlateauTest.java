package exercice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlateauTest {

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

}
