package com.CrossingGuardJoe.controller.menu;

import com.CrossingGuardJoe.Game;
import com.CrossingGuardJoe.controller.Sounds;
import com.CrossingGuardJoe.controller.SoundsController;
import com.CrossingGuardJoe.gui.GUI;
import com.CrossingGuardJoe.model.game.Road;
import com.CrossingGuardJoe.model.game.elements.Joe;
import com.CrossingGuardJoe.model.menu.GameOverMenu;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class GameOverMenuControllerTest {
    private GameOverMenuController gameOverMenuController;
    private GameOverMenu gameOverMenuMock;
    private SoundsController soundsControllerMock;
    private MockedStatic<SoundsController> soundsControllerMockStatic;
    private Game gameMock;

    @BeforeEach
    public void setUp() {
        gameOverMenuMock = mock(GameOverMenu.class);
        gameMock = mock(Game.class);

        soundsControllerMock = mock(SoundsController.class);
        soundsControllerMockStatic = mockStatic(SoundsController.class);

        soundsControllerMockStatic.when(SoundsController::getInstance).thenReturn(soundsControllerMock);

        gameOverMenuController = new GameOverMenuController(gameOverMenuMock);
    }

    @AfterEach
    public void tearDown() {
        soundsControllerMockStatic.close();
    }

    @Test
    public void testNextActionWhenValidAction() {
        Road roadMock = mock(Road.class);
        Joe joeMock = mock(Joe.class);

        when(gameOverMenuMock.isSelectedStats()).thenReturn(true);
        when(gameOverMenuMock.getCurrentGame()).thenReturn(roadMock);

        when(roadMock.getJoe()).thenReturn(joeMock);
        when(joeMock.getScore()).thenReturn(2);
        when(roadMock.getCurrentLevel()).thenReturn(2);

        when(gameMock.getHighestScore()).thenReturn(10);
        when(gameMock.getHighestLevel()).thenReturn(5);

        when(gameOverMenuMock.isSelectedExit()).thenReturn(true);

        invokeNextAction(gameOverMenuController, gameMock, GUI.ACTION.UP);
        invokeNextAction(gameOverMenuController, gameMock, GUI.ACTION.DOWN);
        invokeNextAction(gameOverMenuController, gameMock, GUI.ACTION.SELECT);

        verify(soundsControllerMock, times(2)).play(Sounds.SFX.SELECT);
        verify(soundsControllerMock, times(1)).play(Sounds.SFX.ENTER);
        verify(soundsControllerMock, times(1)).stop(Sounds.SFX.VICTORYBGM);
        verify(soundsControllerMock, times(1)).play(Sounds.SFX.MENUBGM);

        verify(gameOverMenuMock, times(1)).navigateUp();
        verify(gameOverMenuMock, times(1)).navigateDown();

        verify(gameMock, times(1)).setState(any());
        verify(gameMock, times(1)).popState();

    }

    @Test
    public void testNextActionWhenInvalidAction() {
        invokeNextAction(gameOverMenuController, gameMock, GUI.ACTION.ESC);

        verify(soundsControllerMock, times(0)).play(Sounds.SFX.SELECT);
        verify(soundsControllerMock, times(0)).play(Sounds.SFX.ENTER);
        verify(soundsControllerMock, times(0)).stop(Sounds.SFX.VICTORYBGM);
        verify(soundsControllerMock, times(0)).play(Sounds.SFX.MENUBGM);
    }

    @Test
    public void testNextActionWhenSelectButNoSelectedStatsNorSelectedExit() {
        when(gameOverMenuMock.isSelectedStats()).thenReturn(false);
        when(gameOverMenuMock.isSelectedExit()).thenReturn(false);

        invokeNextAction(gameOverMenuController, gameMock, GUI.ACTION.SELECT);

        verify(gameMock, times(0)).setState(any());
        verify(soundsControllerMock, times(1)).play(Sounds.SFX.ENTER);
        verify(soundsControllerMock, times(0)).stop(Sounds.SFX.VICTORYBGM);

    }

    private void invokeNextAction(GameOverMenuController controller, Game game, GUI.ACTION action) {
        try {
            controller.nextAction(game, action, System.currentTimeMillis());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
