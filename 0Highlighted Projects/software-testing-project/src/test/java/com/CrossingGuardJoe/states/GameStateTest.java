package com.CrossingGuardJoe.states;

import com.CrossingGuardJoe.Game;
import com.CrossingGuardJoe.controller.Controller;
import com.CrossingGuardJoe.controller.game.RoadController;
import com.CrossingGuardJoe.gui.GUI;
import com.CrossingGuardJoe.gui.LanternaGUI;
import com.CrossingGuardJoe.model.game.Road;
import com.CrossingGuardJoe.viewer.Viewer;
import com.CrossingGuardJoe.viewer.game.GameViewer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

public class GameStateTest {
    private GameState gameState;
    private Controller<Road> controller;
    private Viewer<Road> viewer;
    private Game game;
    private GUI gui;

    @BeforeEach
    public void setUp() throws NoSuchFieldException, IllegalAccessException {
        controller = mock(RoadController.class);
        viewer = mock(GameViewer.class);
        game = mock(Game.class);
        gui = mock(LanternaGUI.class);
        gameState = new GameState(new Road());

        Field controllerField = State.class.getDeclaredField("controller");
        controllerField.setAccessible(true);
        controllerField.set(gameState, controller);

        Field viewerField = State.class.getDeclaredField("viewer");
        viewerField.setAccessible(true);
        viewerField.set(gameState, viewer);
    }

    @Test
    public void testGetController() {
        assertNotNull(gameState.getController());
    }

    @Test
    public void testGetViewer() {
        assertNotNull(gameState.getViewer());
    }

    @Test
    public void testStep() throws IOException {
        long time = System.currentTimeMillis();

        when(gui.getNextAction()).thenReturn(GUI.ACTION.DOWN);

        gameState.step(game, gui, time);
        verify(controller, times(1)).nextAction(game, GUI.ACTION.DOWN, time);
        verify(viewer, times(1)).draw(gui);
    }
}
