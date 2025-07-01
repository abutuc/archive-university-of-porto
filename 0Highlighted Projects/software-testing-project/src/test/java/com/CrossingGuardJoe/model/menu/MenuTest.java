package com.CrossingGuardJoe.model.menu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

public class MenuTest {
    private Menu menu;

    @BeforeEach
    public void setUp() {
        menu = new Menu();
    }

    @Test
    public void testNavigateUp() throws NoSuchFieldException, IllegalAccessException {
        Field optionSelectedField = Menu.class.getDeclaredField("optionSelected");
        optionSelectedField.setAccessible(true);
        optionSelectedField.set(menu, 2);

        menu.navigateUp();

        assertEquals(1, optionSelectedField.get(menu));
    }

    @Test
    public void testNavigateDown() throws NoSuchFieldException, IllegalAccessException {
        Field optionSelectedField = Menu.class.getDeclaredField("optionSelected");
        optionSelectedField.setAccessible(true);
        optionSelectedField.set(menu, 2);

        menu.navigateDown();

        assertEquals(3, optionSelectedField.get(menu));
    }

    @Test
    public void testGetOption() {
        assertNotNull(menu.getOption(0));
    }

    @Test
    public void testGetNumberOptions() {
        assertEquals(4, menu.getNumberOptions());
    }

    @Test
    public void testIsSelectedStartGame() throws NoSuchFieldException, IllegalAccessException {
        Field optionSelectedField = Menu.class.getDeclaredField("optionSelected");
        optionSelectedField.setAccessible(true);
        optionSelectedField.set(menu, 0);

        assertTrue(menu.isSelectedStartGame());
    }

    @Test
    public void testIsNotSelectedStartGame() throws NoSuchFieldException, IllegalAccessException {
        Field optionSelectedField = Menu.class.getDeclaredField("optionSelected");
        optionSelectedField.setAccessible(true);
        optionSelectedField.set(menu, 1);

        assertFalse(menu.isSelectedStartGame());
    }

    @Test
    public void testIsSelectedInstructions() throws NoSuchFieldException, IllegalAccessException {
        Field optionSelectedField = Menu.class.getDeclaredField("optionSelected");
        optionSelectedField.setAccessible(true);
        optionSelectedField.set(menu, 1);

        assertTrue(menu.isSelectedInstructions());
    }

    @Test
    public void testIsNotSelectedInstructions() throws NoSuchFieldException, IllegalAccessException {
        Field optionSelectedField = Menu.class.getDeclaredField("optionSelected");
        optionSelectedField.setAccessible(true);
        optionSelectedField.set(menu, 0);

        assertFalse(menu.isSelectedInstructions());
    }

    @Test
    public void testIsSelectedCustomize() throws NoSuchFieldException, IllegalAccessException {
        Field optionSelectedField = Menu.class.getDeclaredField("optionSelected");
        optionSelectedField.setAccessible(true);
        optionSelectedField.set(menu, 2);

        assertTrue(menu.isSelectedCustomize());
    }

    @Test
    public void testIsNotSelectedCustomize() throws NoSuchFieldException, IllegalAccessException {
        Field optionSelectedField = Menu.class.getDeclaredField("optionSelected");
        optionSelectedField.setAccessible(true);
        optionSelectedField.set(menu, 1);

        assertFalse(menu.isSelectedCustomize());
    }

    @Test
    public void testIsSelectedExit() throws NoSuchFieldException, IllegalAccessException {
        Field optionSelectedField = Menu.class.getDeclaredField("optionSelected");
        optionSelectedField.setAccessible(true);
        optionSelectedField.set(menu, 3);

        assertTrue(menu.isSelectedExit());
    }

    @Test
    public void testIsNotSelectedExit() throws NoSuchFieldException, IllegalAccessException {
        Field optionSelectedField = Menu.class.getDeclaredField("optionSelected");
        optionSelectedField.setAccessible(true);
        optionSelectedField.set(menu, 2);

        assertFalse(menu.isSelectedExit());
    }
}
