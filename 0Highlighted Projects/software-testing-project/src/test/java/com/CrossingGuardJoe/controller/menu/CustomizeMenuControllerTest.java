package com.CrossingGuardJoe.controller.menu;

import com.CrossingGuardJoe.Game;
import com.CrossingGuardJoe.controller.Sounds;
import com.CrossingGuardJoe.controller.SoundsController;
import com.CrossingGuardJoe.gui.GUI;
import com.CrossingGuardJoe.model.menu.ColorPaletteMenu;
import com.CrossingGuardJoe.model.menu.CustomizeMenu;
import com.CrossingGuardJoe.viewer.Color;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class CustomizeMenuControllerTest {
    private CustomizeMenuController customizeMenuController;
    private CustomizeMenu customizeMenuMock;
    private SoundsController soundsControllerMock;
    private MockedStatic<SoundsController> soundsControllerMockStatic;
    private Game gameMock;

    @BeforeEach
    public void setUp() {
        customizeMenuMock = mock(CustomizeMenu.class);
        gameMock = mock(Game.class);

        soundsControllerMock = mock(SoundsController.class);
        soundsControllerMockStatic = mockStatic(SoundsController.class);

        soundsControllerMockStatic.when(SoundsController::getInstance).thenReturn(soundsControllerMock);

        customizeMenuController = new CustomizeMenuController(customizeMenuMock);
    }

    @AfterEach
    public void tearDown() {
        soundsControllerMockStatic.close();
    }

    @Test
    public void testNextActionWhenColorPaletteIsNotSelected() {
        when(customizeMenuMock.isColorPaletteSelected()).thenReturn(false);
        when(customizeMenuMock.getSelectedColorChar()).thenReturn('a');

        invokeNextAction(customizeMenuController, gameMock, GUI.ACTION.LEFT);
        invokeNextAction(customizeMenuController, gameMock, GUI.ACTION.RIGHT);
        invokeNextAction(customizeMenuController, gameMock, GUI.ACTION.UP);
        invokeNextAction(customizeMenuController, gameMock, GUI.ACTION.DOWN);
        invokeNextAction(customizeMenuController, gameMock, GUI.ACTION.ESC);
        invokeNextAction(customizeMenuController, gameMock, GUI.ACTION.SELECT);

        verify(soundsControllerMock, times(4)).play(Sounds.SFX.SELECT);
        verify(soundsControllerMock, times(1)).play(Sounds.SFX.CUSTOMIZEBGM);
        verify(soundsControllerMock, times(1)).stop(Sounds.SFX.CUSTOMIZEBGM);
        verify(soundsControllerMock, times(1)).play(Sounds.SFX.MENUBGM);
        verify(soundsControllerMock, times(1)).play(Sounds.SFX.ENTER);


        verify(customizeMenuMock, times(1)).navigateLeft();
        verify(customizeMenuMock, times(1)).navigateRight();
        verify(customizeMenuMock, times(1)).navigateUp();
        verify(customizeMenuMock, times(1)).navigateDown();

        verify(gameMock, times(1)).popState();

        assertEquals(getOldColor(), 'a');

        verify(customizeMenuMock, times(1)).setColorPaletteSelected(true);

    }

    @Test
    public void testNextActionWhenColorPaletteIsNotSelectedWithInvalidAction() {
        when(customizeMenuMock.isColorPaletteSelected()).thenReturn(false);

        invokeNextAction(customizeMenuController, gameMock, GUI.ACTION.QUIT);

        verify(soundsControllerMock, times(0)).play(Sounds.SFX.SELECT);
        verify(soundsControllerMock, times(1)).play(Sounds.SFX.CUSTOMIZEBGM);
        verify(soundsControllerMock, times(0)).stop(Sounds.SFX.CUSTOMIZEBGM);
        verify(soundsControllerMock, times(0)).play(Sounds.SFX.MENUBGM);
        verify(soundsControllerMock, times(0)).play(Sounds.SFX.ENTER);

    }

    @Test
    public void testNextActionWhenColorPaletteIsSelected() {
        ColorPaletteMenu colorPaletteMenuMock = mock(ColorPaletteMenu.class);
        List<Color> colors = new ArrayList<>();
        colors.add(Color.ORANGE);
        when(customizeMenuMock.isColorPaletteSelected()).thenReturn(true);
        when(customizeMenuMock.getColorPaletteMenu()).thenReturn(colorPaletteMenuMock);
        when(colorPaletteMenuMock.getColorPalette()).thenReturn(colors);
        when(colorPaletteMenuMock.getSelectedColorIndex()).thenReturn(0);

        setOldColor('a');

        invokeNextAction(customizeMenuController, gameMock, GUI.ACTION.LEFT);
        invokeNextAction(customizeMenuController, gameMock, GUI.ACTION.RIGHT);
        invokeNextAction(customizeMenuController, gameMock, GUI.ACTION.ESC);
        invokeNextAction(customizeMenuController, gameMock, GUI.ACTION.SELECT);



        verify(soundsControllerMock, times(2)).play(Sounds.SFX.SELECT);
        verify(soundsControllerMock, times(1)).play(Sounds.SFX.ENTER);


        verify(colorPaletteMenuMock, times(1)).navigateLeft();
        verify(colorPaletteMenuMock, times(1)).navigateRight();
        verify(customizeMenuMock, times(2)).setColorPaletteSelected(false);

        verify(customizeMenuMock, times(1)).setColorChange('a', '+');

    }

    @Test
    public void testNextActionWhenColorPaletteIsSelectedWithInvalidAction() {
        when(customizeMenuMock.isColorPaletteSelected()).thenReturn(true);

        invokeNextAction(customizeMenuController, gameMock, GUI.ACTION.QUIT);

        verify(soundsControllerMock, times(0)).play(Sounds.SFX.SELECT);
        verify(soundsControllerMock, times(0)).play(Sounds.SFX.ENTER);


        verify(customizeMenuMock, times(0)).setColorPaletteSelected(false);

        verify(customizeMenuMock, times(0)).setColorChange('a', '+');

    }

    private char getOldColor() {
        try {
            Field color = CustomizeMenuController.class.getDeclaredField("oldColor");
            color.setAccessible(true);
            return color.getChar(customizeMenuController);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private void setOldColor(char oldColor) {
        try {
            Field color = CustomizeMenuController.class.getDeclaredField("oldColor");
            color.setAccessible(true);
            color.setChar(customizeMenuController, oldColor);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private void invokeNextAction(CustomizeMenuController controller, Game game, GUI.ACTION action) {
        try {
            controller.nextAction(game, action, System.currentTimeMillis());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
