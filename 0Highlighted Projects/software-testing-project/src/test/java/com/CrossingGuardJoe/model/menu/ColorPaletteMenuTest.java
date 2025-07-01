package com.CrossingGuardJoe.model.menu;

import com.CrossingGuardJoe.controller.Sounds;
import com.CrossingGuardJoe.controller.SoundsController;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;


public class ColorPaletteMenuTest {
    private ColorPaletteMenu colorPaletteMenu;
    private SoundsController soundsControllerMock;
    private MockedStatic<SoundsController> soundsControllerMockStatic;

    @BeforeEach
    public void setUp() {
        soundsControllerMock = mock(SoundsController.class);
        soundsControllerMockStatic = mockStatic(SoundsController.class);

        soundsControllerMockStatic.when(SoundsController::getInstance).thenReturn(soundsControllerMock);

        colorPaletteMenu = new ColorPaletteMenu();
    }

    @AfterEach
    public void tearDown() {
        soundsControllerMockStatic.close();
    }

    @Test
    public void testGetColorPalette() {
        assertFalse(colorPaletteMenu.getColorPalette().isEmpty());
    }

    @Test
    public void testNavigateLeft() {
        colorPaletteMenu.navigateLeft();

        verify(soundsControllerMock, times(1)).play(Sounds.SFX.SELECT);

        assertTrue(colorPaletteMenu.isColorSelected(26));
    }

    @Test
    public void testNavigateRight() {
        colorPaletteMenu.navigateRight();

        verify(soundsControllerMock, times(1)).play(Sounds.SFX.SELECT);

        assertTrue(colorPaletteMenu.isColorSelected(1));
    }

    @Test
    public void testIsColorSelected() {
        assertFalse(colorPaletteMenu.isColorSelected(1));
    }

    @Test
    public void testGetSelectedColorIndex() {
        colorPaletteMenu.navigateRight();
        assertEquals(1, colorPaletteMenu.getSelectedColorIndex());
    }


}
