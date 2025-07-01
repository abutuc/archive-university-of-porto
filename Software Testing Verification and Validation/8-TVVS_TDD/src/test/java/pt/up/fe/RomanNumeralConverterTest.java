package pt.up.fe;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralConverterTest {

    @ParameterizedTest
    @CsvSource({
            // Scenario 1: single character numbers
            "I,1", "V, 5", "X,10", "L,50", "C,100", "D,500", "M,1000",
            // Scenario 2: multiple characters numbers
            "II,2", "III,3", "V,5", "VI, 6", "XVIII, 18", "XXIII, 23", "DCCLXVI, 766",
            // Scenario 3: multiple characters numbers with subtractive notation
            "IV,4", "XIV,14", "XL, 40", "XLI,41", "CCXCIV, 294"
    })
    public void convertRomanNumerals(String romanNumber, int expectedValue) {
        RomanNumeralConverter romanNumeralConverter = new RomanNumeralConverter();
        int numerical = romanNumeralConverter.convert(romanNumber);
        assertEquals(expectedValue, numerical);
    }

    // TODO: Develop, using TDD, non-happy tests, i.e., tests for invalid inputs
}
