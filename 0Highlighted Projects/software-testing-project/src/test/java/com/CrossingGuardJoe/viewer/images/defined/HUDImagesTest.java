package com.CrossingGuardJoe.viewer.images.defined;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HUDImagesTest {

    @Test
    public void testGetHPImage() {
        assertNotNull(HUDImages.getHPImage());
    }

    @Test
    public void testGetGameHudImage() {
        assertNotNull(HUDImages.getGameHudImage());
    }

    @Test
    public void testGetHpBarSlicemage() {
        assertNotNull(HUDImages.getHpBarSliceImage());
    }

    @Test
    public void testGetScoreBarSliceImage() {
        assertNotNull(HUDImages.getScoreBarSliceImage());
    }

}
