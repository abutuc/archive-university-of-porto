package com.CrossingGuardJoe.states.menu;

import com.CrossingGuardJoe.model.game.Road;
import com.CrossingGuardJoe.model.menu.GameOverMenu;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class GameOverStateTest {
    private GameOverState gameOverState;

    @BeforeEach
    public void setUp() {
        gameOverState = new GameOverState(new GameOverMenu(true, new Road()));
    }

    @Test
    public void testGetController() {
        assertNotNull(gameOverState.getController());
    }

    @Test
    public void testGetViewer() {
        assertNotNull(gameOverState.getViewer());
    }
}
