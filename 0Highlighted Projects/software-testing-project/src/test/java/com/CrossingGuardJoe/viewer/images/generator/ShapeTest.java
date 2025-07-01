package com.CrossingGuardJoe.viewer.images.generator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {

    @Test
    public void testRectangleFilledGenerator() {
        String[] result = Shape.RectangleFilledGenerator(10, 5, 'A', 2, 'X');

        assertNotNull(result);

        assertEquals("XXXXXXXXXXXXXX" + "XXAAAAAAAAAAXX" + "XXAAAAAAAAAAXX" + "XXAAAAAAAAAAXX" + "XXXXXXXXXXXXXX", result[0] + result[1] + result[2] + result[3] + result[4]);
    }
}
