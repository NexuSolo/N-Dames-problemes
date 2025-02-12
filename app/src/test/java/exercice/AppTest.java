package exercice;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    public void getNDamesTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            App.getNDames(0);
        });
    }
}
