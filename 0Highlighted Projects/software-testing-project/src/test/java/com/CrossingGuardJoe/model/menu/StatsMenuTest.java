package com.CrossingGuardJoe.model.menu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsMenuTest {
    StatsMenu statsMenu;

    @BeforeEach
    public void setUp() {
        statsMenu = new StatsMenu(1, 1, 1, 1);
    }

    @Test
    public void testStatsGetCurrentLevel() {
        assertEquals(1, statsMenu.getCurrentLevel());
    }

    @Test
    public void testStatsGetCurrentScore() {
        assertEquals(1, statsMenu.getCurrentScore());
    }

    @Test
    public void testStatsGetHighestLevel() {
        assertEquals(1, statsMenu.getHighestLevel());
    }

    @Test
    public void testStatsGetHighestScore() {
        assertEquals(1, statsMenu.getHighestScore());
    }
}
