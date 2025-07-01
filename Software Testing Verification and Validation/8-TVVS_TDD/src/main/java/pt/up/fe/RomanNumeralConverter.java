package pt.up.fe;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralConverter {

    // Unique Roman numeral and their corresponding decimal numbers
    private static Map<Character, Integer> table =
            new HashMap<Character, Integer>() {{
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }};

    public int convert(final String numberInRoman) {
        int finalNumber = 0; // Variable that aggregates the value of each Roman numeral
        int lastNeighbor = 0; // Keeps the last digit visited

        // Loops through the characters, but now from right to left
        for (int i = numberInRoman.length() - 1; i >= 0; i--) {
            // Gets the decimal value of the current Roman digit
            int current = table.get(numberInRoman.charAt(i));

            // If the previous digit was higher than the current one, multiplies the
            // current digit by -1 to make it negative
            if (current < lastNeighbor) {
                current = current * -1;
            }

            // Adds the current digit to the finalNumber variable. The current digit is
            // positive or negative depending on whether we should add or subtract it,
            // respectively.
            finalNumber += current;

            // Updates lastNeighbor to be the current digit
            lastNeighbor = current;
        }

        return finalNumber;
    }
}
