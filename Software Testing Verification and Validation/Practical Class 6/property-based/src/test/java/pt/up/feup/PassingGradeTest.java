package pt.up.feup;

import net.jqwik.api.*;
import net.jqwik.api.constraints.FloatRange;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class PassingGradeTest {

    final PassingGrade passingGrade = new PassingGrade();


    @ParameterizedTest
    @CsvSource({
            "9.5",
            "15",
            "20"
    })
    void fixedTestPassed(float grade) {
        assertTrue(passingGrade.passed(grade));
    }

    @ParameterizedTest
    @CsvSource({
            "9.4",
            "5",
            "0"
    })
    void fixedTestFailed() {
        assertFalse(passingGrade.passed(7.0F));
    }

    @ParameterizedTest
    @CsvSource({
            "-0.1",
            "20.1",
    })
    void fixedTestInvalid() {
        assertThrows(AssertionError.class, () -> passingGrade.passed(-1.0F));
    }

    @RepeatedTest(100)
    void randomTestFailed() {
        float grade = new Random().nextFloat(0.0F, 9.5F);
        assertFalse(passingGrade.passed(grade));
    }

    @Property
    public void propertyTestFail(
            @ForAll
            @FloatRange(min = 0f, max = 9.5f, maxIncluded = false)
            float grade) {
        assertFalse(passingGrade.passed(grade));
    }

    @Property
    public void propertyTestPass(
            @ForAll
            @FloatRange(min = 9.5f, max = 20f, maxIncluded = true)
            float grade) {
        assertTrue(passingGrade.passed(grade));
    }

    @Property
    public void propertyTestInvalid(
            @ForAll("propertyInvalidGrades")
            float grade) {
        assertThrows(AssertionError.class, () -> passingGrade.passed(grade));
    }

    @Provide
    private Arbitrary<Float> propertyInvalidGrades() {
        return Arbitraries.oneOf(
                Arbitraries.floats().lessThan(0f),
                Arbitraries.floats().greaterThan(20f)
        );
    }
}