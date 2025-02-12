package exercice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlateauTest {

    @Test
    public void testCreationPlateau() {
        int n = 1;
        Plateau plateau = new Plateau(n);
        char[][] board = plateau.getBoard();
        assertEquals(n, plateau.getSize());
        assertEquals(n, board.length);
        assertEquals(n, board[0].length);
        assertEquals('O', board[0][0]);
    }
}
