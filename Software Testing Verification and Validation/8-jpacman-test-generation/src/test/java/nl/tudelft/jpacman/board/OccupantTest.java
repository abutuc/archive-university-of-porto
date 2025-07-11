package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test suite to confirm that {@link Unit}s correctly (de)occupy squares.
 *
 * @author Jeroen Roosen 
 *
 */
public class OccupantTest {

    /**
     * The unit under test.
     */
    private Unit unit;

    /**
     * Resets the unit under test.
     */
    @BeforeEach
    public void setUp() {
        unit = new BasicUnit();
    }

    /**
     * Asserts that a unit has no square to start with.
     */
    @Test
    public void noStartSquare() {
        assertThat(unit.hasSquare()).isFalse();
    }

    /**
     * Tests that the unit indeed has the target square as its base after
     * occupation.
     */
    @Test
    public void testOccupy() {
        Square target = new BasicSquare();
        unit.occupy(target);
        assertThat(unit.getSquare()).isEqualTo(target);
        assertThat(target.getOccupants()).contains(unit);
    }

    /**
     * Test that the unit indeed has the target square as its base after
     * double occupation.
     */
    @Test
    public void testReoccupy() {
        Square target = new BasicSquare();
        unit.occupy(target);
        unit.occupy(target);
        assertThat(unit.getSquare()).isEqualTo(target);
        assertThat(target.getOccupants()).contains(unit);
    }
}
