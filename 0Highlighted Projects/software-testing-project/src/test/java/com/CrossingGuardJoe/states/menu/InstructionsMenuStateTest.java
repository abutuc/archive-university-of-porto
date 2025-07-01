package com.CrossingGuardJoe.states.menu;

import com.CrossingGuardJoe.model.menu.InstructionsMenu;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class InstructionsMenuStateTest {
    private InstructionsMenuState instructionsMenuState;

    @BeforeEach
    public void setUp() {
         instructionsMenuState = new InstructionsMenuState(new InstructionsMenu());
    }

    @Test
    public void testGetController() {
        assertNotNull(instructionsMenuState.getController());
    }

    @Test
    public void testGetViewer() {
        assertNotNull(instructionsMenuState.getViewer());
    }
}
