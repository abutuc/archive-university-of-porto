package com.CrossingGuardJoe.model.menu;

import com.CrossingGuardJoe.model.game.Road;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GameOverMenuTest {

    private GameOverMenu gameOverMenu;
    private Road road;

    @BeforeEach
    public void setUp() {
        road = new Road();
        gameOverMenu = new GameOverMenu(true, road);
    }

    @Test
    public void testNavigateUpMinusSelection() throws NoSuchFieldException, IllegalAccessException {
        Field optionSelectedField = GameOverMenu.class.getDeclaredField("optionSelected");
        optionSelectedField.setAccessible(true);
        optionSelectedField.set(gameOverMenu, 2);

        Field optionsField = GameOverMenu.class.getDeclaredField("options");
        optionsField.setAccessible(true);

        List<Option> options = new ArrayList<>();
        options.add(new Option(null, null, null));
        options.add(new Option(null, null, null));
        options.add(new Option(null, null, null));


        optionsField.set(gameOverMenu, options);


        gameOverMenu.navigateUp();

        assertEquals(1, optionSelectedField.get(gameOverMenu));
    }

    @Test
    public void testNavigateDown() throws NoSuchFieldException, IllegalAccessException {
        Field optionSelectedField = GameOverMenu.class.getDeclaredField("optionSelected");
        optionSelectedField.setAccessible(true);
        optionSelectedField.set(gameOverMenu, 2);

        Field optionsField = GameOverMenu.class.getDeclaredField("options");
        optionsField.setAccessible(true);

        List<Option> options = new ArrayList<>();
        options.add(new Option(null, null, null));
        options.add(new Option(null, null, null));
        options.add(new Option(null, null, null));


        optionsField.set(gameOverMenu, options);


        gameOverMenu.navigateDown();

        assertEquals(0, optionSelectedField.get(gameOverMenu));
    }

    @Test
    public void testGetOption() {
        assertNotNull(gameOverMenu.getOption(0));
    }

    @Test
    public void testGetNumberOptions() {
        assertEquals(2, gameOverMenu.getNumberOptions());
    }

    @Test
    public void testIsSelectedStats() throws NoSuchFieldException, IllegalAccessException {
        Field optionSelectedField = GameOverMenu.class.getDeclaredField("optionSelected");
        optionSelectedField.setAccessible(true);
        optionSelectedField.set(gameOverMenu, 0);

        assertTrue(gameOverMenu.isSelectedStats());
    }

    @Test
    public void testIsNotSelectedStats() throws NoSuchFieldException, IllegalAccessException {
        Field optionSelectedField = GameOverMenu.class.getDeclaredField("optionSelected");
        optionSelectedField.setAccessible(true);
        optionSelectedField.set(gameOverMenu, 1);

        assertFalse(gameOverMenu.isSelectedStats());
    }

    @Test
    public void testIsSelectedExit() throws NoSuchFieldException, IllegalAccessException {
        Field optionSelectedField = GameOverMenu.class.getDeclaredField("optionSelected");
        optionSelectedField.setAccessible(true);
        optionSelectedField.set(gameOverMenu, 1);

        assertTrue(gameOverMenu.isSelectedExit());
    }

    @Test
    public void testIsNotSelectedExit() throws NoSuchFieldException, IllegalAccessException {
        Field optionSelectedField = GameOverMenu.class.getDeclaredField("optionSelected");
        optionSelectedField.setAccessible(true);
        optionSelectedField.set(gameOverMenu, 0);

        assertFalse(gameOverMenu.isSelectedExit());
    }

    @Test
    public void testIsWin() {
        assertTrue(gameOverMenu.isWin());
    }

    @Test
    public void testIsNotWin() throws NoSuchFieldException, IllegalAccessException {
        Field isWin = GameOverMenu.class.getDeclaredField("isWin");
        isWin.setAccessible(true);
        isWin.set(gameOverMenu, false);

        assertFalse(gameOverMenu.isWin());
    }

    @Test
    public void testGetCurrentGame() {
        assertNotNull(gameOverMenu.getCurrentGame());
    }

    @Test
    public void testGetOptionSelected() throws IllegalAccessException, NoSuchFieldException {
        Field optionSelectedField = GameOverMenu.class.getDeclaredField("optionSelected");
        optionSelectedField.setAccessible(true);
        optionSelectedField.set(gameOverMenu, 1);

        assertEquals(1, gameOverMenu.getOptionSelected());
    }
}
