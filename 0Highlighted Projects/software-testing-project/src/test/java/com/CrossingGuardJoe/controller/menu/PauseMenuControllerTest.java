package com.CrossingGuardJoe.controller.menu;

import com.CrossingGuardJoe.Game;
import com.CrossingGuardJoe.controller.Sounds;
import com.CrossingGuardJoe.controller.SoundsController;
import com.CrossingGuardJoe.gui.GUI;
import com.CrossingGuardJoe.model.game.Road;
import com.CrossingGuardJoe.model.game.elements.Joe;
import com.CrossingGuardJoe.model.menu.PauseMenu;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.io.IOException;

import static org.mockito.Mockito.*;


public class PauseMenuControllerTest {
    private PauseMenuController pauseMenuController;
    private PauseMenu pauseMenuMock;
    private SoundsController soundsControllerMock;
    private MockedStatic<SoundsController> soundsControllerMockStatic;
    private Game gameMock;

    @BeforeEach
    public void setUp() {
        pauseMenuMock = mock(PauseMenu.class);
        gameMock = mock(Game.class);

        soundsControllerMock = mock(SoundsController.class);
        soundsControllerMockStatic = mockStatic(SoundsController.class);

        soundsControllerMockStatic.when(SoundsController::getInstance).thenReturn(soundsControllerMock);

        pauseMenuController = new PauseMenuController(pauseMenuMock);
    }


    @AfterEach
    public void tearDown() {
        soundsControllerMockStatic.close();
    }

    @Test
    public void testNextActionWhenActionValid() {
        Road roadMock = mock(Road.class);
        Joe joeMock = mock(Joe.class);

        when(pauseMenuMock.isSelectedResume()).thenReturn(true);
        when(pauseMenuMock.isSelectedStats()).thenReturn(true);
        when(pauseMenuMock.isSelectedExit()).thenReturn(true);

        when(pauseMenuMock.getCurrentGame()).thenReturn(roadMock);
        when(roadMock.getJoe()).thenReturn(joeMock);
        when(joeMock.getScore()).thenReturn(1);
        when(roadMock.getCurrentLevel()).thenReturn(1);
        when(gameMock.getHighestScore()).thenReturn(1);
        when(gameMock.getHighestLevel()).thenReturn(1);

        invokeNextAction(pauseMenuController, gameMock, GUI.ACTION.UP, System.currentTimeMillis());
        invokeNextAction(pauseMenuController, gameMock, GUI.ACTION.DOWN, System.currentTimeMillis());
        invokeNextAction(pauseMenuController, gameMock, GUI.ACTION.SELECT, System.currentTimeMillis());

        verify(soundsControllerMock, times(2)).play(Sounds.SFX.SELECT);
        verify(soundsControllerMock, times(1)).play(Sounds.SFX.ENTER);
        verify(soundsControllerMock, times(1)).play(Sounds.SFX.GAMEBGM);
        verify(soundsControllerMock, times(1)).stop(Sounds.SFX.GAMEBGM);
        verify(soundsControllerMock, times(1)).play(Sounds.SFX.MENUBGM);

        verify(pauseMenuMock, times(1)).navigateUp();
        verify(pauseMenuMock, times(1)).navigateDown();

        verify(gameMock, times(3)).popState();
        verify(gameMock, times(1)).setState(any());

    }

    @Test
    public void testNextActionWhenActionSelectButNothingIsSelected() {
        when(pauseMenuMock.isSelectedResume()).thenReturn(false);
        when(pauseMenuMock.isSelectedStats()).thenReturn(false);
        when(pauseMenuMock.isSelectedExit()).thenReturn(false);

        invokeNextAction(pauseMenuController, gameMock, GUI.ACTION.SELECT, System.currentTimeMillis());

        verify(soundsControllerMock, times(1)).play(Sounds.SFX.ENTER);
        verify(soundsControllerMock, times(0)).play(Sounds.SFX.GAMEBGM);
        verify(soundsControllerMock, times(0)).stop(Sounds.SFX.GAMEBGM);
        verify(soundsControllerMock, times(0)).play(Sounds.SFX.MENUBGM);


        verify(gameMock, times(0)).popState();
        verify(gameMock, times(0)).setState(any());

    }

    @Test
    public void testNextActionWhenActionInvalid() {
        invokeNextAction(pauseMenuController, gameMock, GUI.ACTION.QUIT, System.currentTimeMillis());

        verify(soundsControllerMock, times(0)).play(Sounds.SFX.SELECT);
        verify(soundsControllerMock, times(0)).play(Sounds.SFX.ENTER);
        verify(soundsControllerMock, times(0)).play(Sounds.SFX.GAMEBGM);
        verify(soundsControllerMock, times(0)).stop(Sounds.SFX.GAMEBGM);
        verify(soundsControllerMock, times(0)).play(Sounds.SFX.MENUBGM);

    }

    private void invokeNextAction(PauseMenuController controller, Game game, GUI.ACTION action, long currentTimeMillis) {
        try {
            controller.nextAction(game, action, currentTimeMillis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
