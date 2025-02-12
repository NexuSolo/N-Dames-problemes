package exercice;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    public void getNDamesTestNInferieurA0() {
        assertThrows(IllegalArgumentException.class, () -> {
            App.getNDames(0);
        });
    }

    @Test
    public void getNDamesTestTaille1() {
        List<Plateau> plateaux = App.getNDames(1);
        Plateau plateau = plateaux.get(0);
        char[][] board = plateau.getBoard();
        assertEquals(1, plateau.getSize());
        assertEquals(1, board.length);
        assertEquals(1, board[0].length);
        assertEquals('D', board[0][0]);
    }

    @Test
    public void getNDamesTestTaille2() {
        List<Plateau> plateaux = App.getNDames(2);
        assertEquals(0, plateaux.size());
    }

    @Test
    public void isSafeTestPlateauDiagonales() {
        char[][] board = {
                { 'O', 'O', 'O' },
                { 'O', 'D', 'O' },
                { 'O', 'O', 'O' }
        };
        assertEquals(false, App.isSafe(board, 0, 0));
        assertEquals(false, App.isSafe(board, 0, 1));
        assertEquals(false, App.isSafe(board, 0, 2));
        assertEquals(false, App.isSafe(board, 1, 0));
        assertEquals(false, App.isSafe(board, 1, 1));
        assertEquals(false, App.isSafe(board, 1, 2));
        assertEquals(false, App.isSafe(board, 2, 0));
        assertEquals(false, App.isSafe(board, 2, 1));
        assertEquals(false, App.isSafe(board, 2, 2));
    }

    @Test
    public void isSafeTestPlateau() {
        char[][] board = { { 'D', 'O', 'O' }, { 'O', 'O', 'O' }, { 'O', 'O', 'O' } };

        assertEquals(true, App.isSafe(board, 1, 2));
        assertEquals(true, App.isSafe(board, 2, 1));
    }
}
