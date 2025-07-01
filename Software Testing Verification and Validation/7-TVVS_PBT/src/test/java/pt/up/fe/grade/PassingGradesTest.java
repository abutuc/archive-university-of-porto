package pt.up.fe.grade;

import net.jqwik.api.*;
import net.jqwik.api.constraints.FloatRange;

import static org.junit.jupiter.api.Assertions.*;

public class PassingGradesTest {

    private final PassingGrade pg = new PassingGrade();

    @Property
    public void fail(
            @ForAll
            @FloatRange(min = 0f, max = 9.5f, maxIncluded = false)
            float grade) {
        assertFalse(pg.passed(grade));
    }

    @Property
    public void pass(
            @ForAll
            @FloatRange(min = 9.5f, max = 20f, maxIncluded = true)
            float grade) {
        assertTrue(pg.passed(grade));
    }

    @Property
    public void invalid(
            @ForAll("invalidGrades")
            float grade) {
        assertThrows(IllegalArgumentException.class, () -> pg.passed(grade));
    }

    @Provide
    private Arbitrary<Float> invalidGrades() {
        return Arbitraries.oneOf(
                Arbitraries.floats().lessThan(0f),
                Arbitraries.floats().greaterThan(20f)
        );
    }
}
