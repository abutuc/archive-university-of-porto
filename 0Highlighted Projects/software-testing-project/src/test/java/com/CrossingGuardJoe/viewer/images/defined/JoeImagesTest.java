package com.CrossingGuardJoe.viewer.images.defined;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JoeImagesTest {

    @Test
    public void testGetJoeStandImage() {
        assertNotNull(JoeImages.getJoeStandImage());
    }

    @Test
    public void testGetJoeWalkLeftImage() {
        assertNotNull(JoeImages.getJoeWalkleftImage());
    }

    @Test
    public void testGetJoeWalkRightImage() {
        assertNotNull(JoeImages.getJoeWalkrightImage());
    }

    @Test
    public void testGetJoeWalkSecondHalfImage() {
        assertNotNull(JoeImages.getJoeWalksecondhalfImage());
    }

    @Test
    public void testGetJoePassImage() {
        assertNotNull(JoeImages.getJoePassImage());
    }

    @Test
    public void testGetJoeStopImage() {
        assertNotNull(JoeImages.getJoeStopImage());
    }

    @Test
    public void testGetJoeHitRightImage() {
        assertNotNull(JoeImages.getJoeHitrightImage());
    }

    @Test
    public void testGetJoeHitLeftImage() {
        assertNotNull(JoeImages.getJoeHitleftImage());
    }

}
