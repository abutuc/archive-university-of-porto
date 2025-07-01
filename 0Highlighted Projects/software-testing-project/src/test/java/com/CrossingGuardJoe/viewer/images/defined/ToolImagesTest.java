package com.CrossingGuardJoe.viewer.images.defined;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ToolImagesTest {

    @Test
    public void testGetArrowDownImage() {
        assertNotNull(ToolImages.getArrowDownImage());
    }

    @Test
    public void testGetArrowRightImage() {
        assertNotNull(ToolImages.getArrowRightImage());
    }

    @Test
    public void testGetKeyUpImage() {
        assertNotNull(ToolImages.getKeyUpImage());
    }

    @Test
    public void testGetKeyDownImage() {
        assertNotNull(ToolImages.getKeyDownImage());
    }

    @Test
    public void testGetKeyRightImage() {
        assertNotNull(ToolImages.getKeyRightImage());
    }

    @Test
    public void testGetKeyLeftImage() {
        assertNotNull(ToolImages.getKeyLeftImage());
    }

    @Test
    public void testGetKeyEscImage() {
        assertNotNull(ToolImages.getKeyEscImage());
    }
}
