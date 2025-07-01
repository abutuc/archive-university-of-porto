package com.CrossingGuardJoe.viewer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ColorCustomizeTest {

    @Test
    public void testGetInstance() {
        assertNotNull(ColorCustomize.getInstance());
    }

    @Test
    public void testGetMappedCharacter() {
        assertTrue(Character.isLetter(ColorCustomize.getInstance().getMappedCharacter('a')));
    }

}
