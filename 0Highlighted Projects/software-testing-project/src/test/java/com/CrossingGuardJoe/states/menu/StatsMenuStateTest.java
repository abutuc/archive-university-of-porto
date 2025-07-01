package com.CrossingGuardJoe.states.menu;

import com.CrossingGuardJoe.model.menu.StatsMenu;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class StatsMenuStateTest {
    private StatsMenuState statsMenuState;

    @BeforeEach
    public void setUp() {
         statsMenuState = new StatsMenuState(new StatsMenu(1,1,1,1));
    }

    @Test
    public void testGetController() {
        assertNotNull(statsMenuState.getController());
    }

    @Test
    public void testGetViewer() {
        assertNotNull(statsMenuState.getViewer());
    }
}
