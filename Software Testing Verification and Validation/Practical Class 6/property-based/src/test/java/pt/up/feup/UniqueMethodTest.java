package pt.up.feup;

import net.jqwik.api.*;
import static org.apache.commons.math3.util.MathArrays.unique;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class UniqueMethodTest {

    // Test for null array
    @Property
    public void testNullArray() {
        double[] data = null;
        assertArrayEquals(null, unique(data));
    }

    // Test for empty array
    @Property
    public void testEmptyArray() {
        double[] data = new double[0];
        assertArrayEquals(new double[0], unique(data));
    }

    // Test for non-empty array with no repeated values
    @Property
    public void testArrayWithoutRepeats(@ForAll("arrayWithoutRepeats") double[] data) {
        assertArrayEquals(data, unique(data));
    }

    // Test for non-empty array with all values repeated
    @Property
    public void testArrayWithAllRepeats(@ForAll("arrayWithAllRepeats") double[] data) {
        double[] expected = {data[0]};
        assertArrayEquals(expected, unique(data));
    }

    // Test for non-empty array with some values repeated
    @Property
    public void testArrayWithSomeRepeats(@ForAll("arrayWithSomeRepeats") double[] data) {
        double[] result = unique(data);
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = i + 1; j < result.length; j++) {
                // Assert that the result has no repeated values
                assert result[i] != result[j];
            }
        }
    }

    // Generators for specific test cases
    @Provide
    Arbitrary<double[]> arrayWithoutRepeats() {
        return Arbitraries.doubles().array(double[].class).uniqueElements();
    }

    @Provide
    Arbitrary<double[]> arrayWithAllRepeats() {
        return Arbitraries.doubles()
                .map(value -> new double[]{value, value, value, value}); // All elements are the same
    }

    @Provide
    Arbitrary<double[]> arrayWithSomeRepeats() {
        return Arbitraries.doubles()
                .list()
                .ofMinSize(2)
                .ofMaxSize(10)
                .map(list -> {
                    list.addAll(list.subList(0, list.size() / 2)); // Repeat some elements
                    return list.stream().mapToDouble(Double::doubleValue).toArray();
                });
    }
}
