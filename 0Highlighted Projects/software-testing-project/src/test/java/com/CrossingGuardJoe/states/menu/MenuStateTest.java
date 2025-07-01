package com.CrossingGuardJoe.states.menu;

import com.CrossingGuardJoe.model.menu.Menu;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class MenuStateTest {
    private MenuState menuState;

    @BeforeEach
    public void setUp() {
         menuState = new MenuState(new Menu());
    }

    @Test
    public void testGetController() {
        assertNotNull(menuState.getController());
    }

    @Test
    public void testGetViewer() {
        assertNotNull(menuState.getViewer());
    }
}
