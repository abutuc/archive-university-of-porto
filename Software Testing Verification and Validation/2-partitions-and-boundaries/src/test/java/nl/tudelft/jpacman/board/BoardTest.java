package nl.tudelft.jpacman.board;

import nl.tudelft.jpacman.Launcher;
import nl.tudelft.jpacman.game.Game;
import nl.tudelft.jpacman.level.Player;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    @ParameterizedTest // test #2, test #3, test #4, test #5, test #6, test #7, test #8, test #9, test #10, test #11, test #12, test #13, test #14, test #17, test #18, test #19, test #20, test #21, test #22, and test #25
    @CsvSource({
            "11,-7",
            "11,134",
            "-14,15",
            "123,15",
            "-14,-7",
            "-14,134",
            "123,-7",
            "123,134",
            "-1,-1",
            "-1,0",
            "-1,20",
            "-1,21",
            "0,-1",
            "0,21",
            "23,-1",
            "23,0",
            "23,20",
            "23,21",
            "22,-1",
            "22,21",
    })
    public void testOufOfBorders(int x, int y) {
        Launcher launcher = new Launcher();
        Game game = launcher.makeGame();
        Board board = game.getLevel().getBoard();
        assertThrows(AssertionError.class, () -> board.squareAt(x, y));
    }

    @Test // test #1
    public void testPlayerPosition() {
        Launcher launcher = new Launcher();
        Game game = launcher.makeGame();
        Board board = game.getLevel().getBoard();
        Square square = board.squareAt(11, 15);
        List<Unit> occupants = square.getOccupants();
        assertFalse(occupants.isEmpty());
        assertEquals(occupants.getFirst().getClass(), Player.class);
    }

    @ParameterizedTest // test #15, test #16, test #23, test #24
    @CsvSource({
            "0,0",
            "0,20",
            "22,0",
            "22,20",
    })
    public void testWallPosition(int x, int y) throws Exception {
        Launcher launcher = new Launcher();
        Game game = launcher.makeGame();
        Board board = game.getLevel().getBoard();
        Square square = board.squareAt(x, y);
        List<Unit> occupants = square.getOccupants();
        assertTrue(occupants.isEmpty());
        Class<?> clazz = Class.forName(BoardFactory.class.getCanonicalName() + "$Wall"); // required given Wall is private
        assertEquals(square.getClass(), clazz);
    }
}
