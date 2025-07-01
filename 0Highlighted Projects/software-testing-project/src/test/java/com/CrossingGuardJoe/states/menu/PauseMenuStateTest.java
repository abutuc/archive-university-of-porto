package com.CrossingGuardJoe.states.menu;

import com.CrossingGuardJoe.model.game.Road;
import com.CrossingGuardJoe.model.menu.PauseMenu;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class PauseMenuStateTest {
    private PauseMenuState pauseMenuState;

    @BeforeEach
    public void setUp() {
         pauseMenuState = new PauseMenuState(new PauseMenu(new Road()));
    }

    @Test
    public void testGetController() {
        assertNotNull(pauseMenuState.getController());
    }

    @Test
    public void testGetViewer() {
        assertNotNull(pauseMenuState.getViewer());
    }
}
