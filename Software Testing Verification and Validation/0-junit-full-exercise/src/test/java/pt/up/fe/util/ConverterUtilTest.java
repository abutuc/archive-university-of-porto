package pt.up.fe.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.CsvSource;

public class ConverterUtilTest {

    public static double[][]  fahrenheitToCelsiusData() {
        return new double[][] { {32.0, 0.0}, {-31.0, -35.0}, {122.0, 50.0}};
    }

    @ParameterizedTest
    @MethodSource(value = "fahrenheitToCelsiusData")
    public void shouldConvertFahrenheitToCelsiusCorrectly(double[] input) {
        double fahrenheit = input[0];
        double expectedCelsius = input[1];

        assertEquals(expectedCelsius, ConverterUtil.convertFahrenheitToCelsius(fahrenheit));

    }

    @ParameterizedTest
    @CsvSource({"0.0,32.0", "-35.0,-31.0", "50.0,122.0"})
    public void shouldConvertFahrenheitToCelsiusCorrectly(double celsius, double expectedFahrenheit) {
        assertEquals(expectedFahrenheit, ConverterUtil.convertCelsiusToFahrenheit(celsius));
    }
}
