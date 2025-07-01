package com.CrossingGuardJoe.states.menu;

import com.CrossingGuardJoe.model.menu.CustomizeMenu;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CustomizeMenuStateTest {
    private CustomizeMenuState customizeMenuState;

    @BeforeEach
    public void setUp() {
        customizeMenuState = new CustomizeMenuState(new CustomizeMenu());
    }

    @Test
    public void testGetController() {
        assertNotNull(customizeMenuState.getController());
    }

    @Test
    public void testGetViewer() {
        assertNotNull(customizeMenuState.getViewer());
    }
}
