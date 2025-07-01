package com.CrossingGuardJoe.viewer.images.Font;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class FontImageFactoryTest {
    private FontImageFactory fontImageFactory;

    @BeforeEach
    public void setUp() {
        fontImageFactory = new FontImageFactory();
    }

    @Test
    public void testGetImageRepresentationIntegerInput() {
        Integer i = 2;
        String[] result = fontImageFactory.getImageRepresentation(i);

        assertNotNull(result);

        assertEquals("  $$$$$$$$$     " + " $$$$$$$$$$$    " + "$$$$     $$$$   ", result[0] + result[1] + result[2]);
    }

    @Test
    public void testGetImageRepresentationLongInput() {
        Long l = 2L;
        assertThrows(ClassCastException.class, () -> fontImageFactory.getImageRepresentation(l));
    }

    @Test
    public void testGetImageRepresentationShortInput() {
        Short sh = 2;
        assertThrows(ClassCastException.class, () -> fontImageFactory.getImageRepresentation(sh));
    }

    @Test
    public void testGetImageRepresentationOfUnsupportedType() {
        assertThrows(IllegalArgumentException.class, () -> fontImageFactory.getImageRepresentation(new ArrayList<>()));
    }

    @Test
    public void testGetAlphabetIndex() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method getAlphabetIndexMethod = FontImageFactory.class.getDeclaredMethod("getAlphabetIndex", char.class);
        getAlphabetIndexMethod.setAccessible(true);

        int result = (int) getAlphabetIndexMethod.invoke(fontImageFactory, '2');

        assertEquals(-15, result);
    }

    @Test
    public void testGetTextImage() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method getTextImageMethod = FontImageFactory.class.getDeclaredMethod("getTextImage", String.class);
        getTextImageMethod.setAccessible(true);
        String[] result = (String[]) getTextImageMethod.invoke(fontImageFactory, " ");

        assertEquals(16, result.length);
    }
}
