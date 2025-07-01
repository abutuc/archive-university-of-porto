package com.CrossingGuardJoe.viewer.images.defined;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KidImagesTest {

    @Test
    public void testGetKidStandImage() {
        assertNotNull(KidImages.getKidStandImage());
    }

    @Test
    public void testGetKidHitImage() {
        assertNotNull(KidImages.getKidHitImage());
    }

    @Test
    public void testGetKidWalkImage() {
        assertNotNull(KidImages.getKidWalkImage());
    }
}
