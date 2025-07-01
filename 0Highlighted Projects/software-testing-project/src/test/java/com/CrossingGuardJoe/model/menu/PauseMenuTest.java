package com.CrossingGuardJoe.model.menu;

import com.CrossingGuardJoe.model.game.Road;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

public class PauseMenuTest {
    private PauseMenu pauseMenu;
    private Road road;

    @BeforeEach
    public void setUp() {
        road = new Road();
        pauseMenu = new PauseMenu(road);
    }

    @Test
    public void testNavigateUp() throws NoSuchFieldException, IllegalAccessException {
        Field optionSelectedField = PauseMenu.class.getDeclaredField("optionSelected");
        optionSelectedField.setAccessible(true);
        optionSelectedField.set(pauseMenu, 2);

        pauseMenu.navigateUp();

        assertEquals(1, optionSelectedField.get(pauseMenu));
    }

    @Test
    public void testNavigateDown() throws NoSuchFieldException, IllegalAccessException {
        Field optionSelectedField = PauseMenu.class.getDeclaredField("optionSelected");
        optionSelectedField.setAccessible(true);
        optionSelectedField.set(pauseMenu, 2);

        pauseMenu.navigateDown();

        assertEquals(0, optionSelectedField.get(pauseMenu));
    }

    @Test
    public void testGetCurrentGame() {
        assertNotNull(pauseMenu.getCurrentGame());
    }

    @Test
    public void testGetOption() {
        assertNotNull(pauseMenu.getOption(0));
    }

    @Test
    public void testGetNumberOptions() {
        assertEquals(3, pauseMenu.getNumberOptions());
    }

    @Test
    public void testIsSelectedResume() throws NoSuchFieldException, IllegalAccessException {
        Field optionSelectedField = PauseMenu.class.getDeclaredField("optionSelected");
        optionSelectedField.setAccessible(true);
        optionSelectedField.set(pauseMenu, 0);

        assertTrue(pauseMenu.isSelectedResume());
    }

    @Test
    public void testIsNotSelectedResume() throws NoSuchFieldException, IllegalAccessException {
        Field optionSelectedField = PauseMenu.class.getDeclaredField("optionSelected");
        optionSelectedField.setAccessible(true);
        optionSelectedField.set(pauseMenu, 1);

        assertFalse(pauseMenu.isSelectedResume());
    }

    @Test
    public void testIsSelectedStats() throws NoSuchFieldException, IllegalAccessException {
        Field optionSelectedField = PauseMenu.class.getDeclaredField("optionSelected");
        optionSelectedField.setAccessible(true);
        optionSelectedField.set(pauseMenu, 1);

        assertTrue(pauseMenu.isSelectedStats());
    }

    @Test
    public void testIsNotSelectedStats() throws NoSuchFieldException, IllegalAccessException {
        Field optionSelectedField = PauseMenu.class.getDeclaredField("optionSelected");
        optionSelectedField.setAccessible(true);
        optionSelectedField.set(pauseMenu, 0);

        assertFalse(pauseMenu.isSelectedStats());
    }

    @Test
    public void testIsSelectedExit() throws NoSuchFieldException, IllegalAccessException {
        Field optionSelectedField = PauseMenu.class.getDeclaredField("optionSelected");
        optionSelectedField.setAccessible(true);
        optionSelectedField.set(pauseMenu, 2);

        assertTrue(pauseMenu.isSelectedExit());
    }

    @Test
    public void testIsNotSelectedExit() throws NoSuchFieldException, IllegalAccessException {
        Field optionSelectedField = PauseMenu.class.getDeclaredField("optionSelected");
        optionSelectedField.setAccessible(true);
        optionSelectedField.set(pauseMenu, 0);

        assertFalse(pauseMenu.isSelectedExit());
    }


}
