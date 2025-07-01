package com.CrossingGuardJoe.viewer.images.defined;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoadItemsImagesTest {

    @Test
    public void testGetRoadItemsImages() {
        assertNotNull(RoadItemsImages.getSignalImage());
    }
}
