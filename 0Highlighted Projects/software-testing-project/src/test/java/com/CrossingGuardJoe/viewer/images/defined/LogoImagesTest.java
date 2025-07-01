package com.CrossingGuardJoe.viewer.images.defined;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LogoImagesTest {

    @Test
    public void testGetLogoImages() {
        assertNotNull(LogoImages.getLogoGameImage());
    }
}
