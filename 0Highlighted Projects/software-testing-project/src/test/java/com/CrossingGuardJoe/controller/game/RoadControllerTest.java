package com.CrossingGuardJoe.controller.game;

import com.CrossingGuardJoe.Game;
import com.CrossingGuardJoe.controller.Sounds;
import com.CrossingGuardJoe.controller.SoundsController;
import com.CrossingGuardJoe.gui.GUI;
import com.CrossingGuardJoe.model.game.Road;
import com.CrossingGuardJoe.model.game.elements.Joe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class RoadControllerTest {
    private RoadController roadController;
    private Road roadMock;
    private Game gameMock;
    private Joe joeMock;

    @BeforeEach
    public void setUp() {
        roadMock = mock(Road.class);
        gameMock = mock(Game.class);
        joeMock = mock(Joe.class);

        when(roadMock.getJoe()).thenReturn(joeMock);

        roadController = new RoadController(roadMock);
    }


    @Test
    public void testNextActionJoeHighestScorerAndHighestLevel() {
        SoundsController soundsControllerMock = mock(SoundsController.class);
        MockedStatic<SoundsController> soundsControllerMockStatic = mockStatic(SoundsController.class);

        soundsControllerMockStatic.when(SoundsController::getInstance).thenReturn(soundsControllerMock);

        when(joeMock.getScore()).thenReturn(2);
        when(gameMock.getHighestScore()).thenReturn(1);

        when(roadMock.getCurrentLevel()).thenReturn(3);
        when(gameMock.getHighestLevel()).thenReturn(2);

        when(joeMock.getHearts()).thenReturn(0);

        when(roadMock.isGameEnded()).thenReturn(true);

        invokeRoadControllerNextAction(roadController, gameMock, GUI.ACTION.ESC);

        verify(gameMock, times(1)).setHighestScore(2);
        verify(gameMock, times(1)).setHighestLevel(3);
        verify(soundsControllerMock).pause(Sounds.SFX.GAMEBGM);
        verify(joeMock, times(1)).stopWalking();
        verify(gameMock, times(3)).setState(any());

        verify(soundsControllerMock, times(2)).stop(Sounds.SFX.GAMEBGM);
        verify(soundsControllerMock, times(1)).stop(Sounds.SFX.CARBREAK);

        verify(gameMock, times(2)).popState();
        verify(soundsControllerMock, times(1)).play(Sounds.SFX.GAMEOVER);

        verify(soundsControllerMock, times(1)).play(Sounds.SFX.VICTORYBGM);

        verify(roadMock, times(3)).getCars();

        soundsControllerMockStatic.close();

    }

    @Test
    public void testNextActionJoeNotHighestScorerNorHighestLevel() {
        SoundsController soundsControllerMock = mock(SoundsController.class);
        MockedStatic<SoundsController> soundsControllerMockStatic = mockStatic(SoundsController.class);

        soundsControllerMockStatic.when(SoundsController::getInstance).thenReturn(soundsControllerMock);

        when(joeMock.getScore()).thenReturn(1);
        when(gameMock.getHighestScore()).thenReturn(1);

        when(roadMock.getCurrentLevel()).thenReturn(2);
        when(gameMock.getHighestLevel()).thenReturn(2);

        when(joeMock.getHearts()).thenReturn(1);

        when(roadMock.isGameEnded()).thenReturn(false);

        invokeRoadControllerNextAction(roadController, gameMock, GUI.ACTION.NONE);

        verify(gameMock, never()).setHighestScore(1);
        verify(gameMock, never()).setHighestLevel(2);
        verify(soundsControllerMock, never()).pause(Sounds.SFX.GAMEBGM);
        verify(gameMock, never()).setState(any());

        verify(soundsControllerMock, never()).stop(Sounds.SFX.GAMEBGM);
        verify(soundsControllerMock, never()).stop(Sounds.SFX.CARBREAK);

        verify(gameMock, never()).popState();
        verify(soundsControllerMock, never()).play(Sounds.SFX.GAMEOVER);

        verify(soundsControllerMock, never()).play(Sounds.SFX.VICTORYBGM);

        soundsControllerMockStatic.close();

    }

    private void invokeRoadControllerNextAction(RoadController roadController, Game game, GUI.ACTION action) {
        try {
            roadController.nextAction(game, action, System.currentTimeMillis());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
