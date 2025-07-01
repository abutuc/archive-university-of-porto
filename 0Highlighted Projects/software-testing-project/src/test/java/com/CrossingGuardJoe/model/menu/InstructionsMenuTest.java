package com.CrossingGuardJoe.model.menu;

import com.CrossingGuardJoe.controller.Sounds;
import com.CrossingGuardJoe.controller.SoundsController;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.lang.reflect.Field;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class InstructionsMenuTest {
    private InstructionsMenu instructionsMenu;
    private SoundsController soundsControllerMock;
    private MockedStatic<SoundsController> soundsControllerMockStatic;

    @BeforeEach
    public void setUp() {
        soundsControllerMock = mock(SoundsController.class);
        soundsControllerMockStatic = mockStatic(SoundsController.class);

        soundsControllerMockStatic.when(SoundsController::getInstance).thenReturn(soundsControllerMock);

        instructionsMenu = new InstructionsMenu();
    }

    @AfterEach
    public void tearDown() {
        soundsControllerMockStatic.close();
    }

    @Test
    public void testNavigateRightNotLastPage() {
        instructionsMenu.navigateRight();
        verify(soundsControllerMock, times(1)).play(Sounds.SFX.FLIPPAGE);
        assertEquals(2, instructionsMenu.getCurrentPage());
    }

    @Test
    public void testNavigateRightLastPage() throws NoSuchFieldException, IllegalAccessException {
        Field currentPageField = InstructionsMenu.class.getDeclaredField("currentPage");
        currentPageField.setAccessible(true);
        currentPageField.set(instructionsMenu, 5);

        instructionsMenu.navigateRight();
        verify(soundsControllerMock, times(0)).play(Sounds.SFX.FLIPPAGE);
        assertEquals(5, instructionsMenu.getCurrentPage());
    }

    @Test
    public void testNavigateLeftPageOne() {
        instructionsMenu.navigateLeft();
        verify(soundsControllerMock, times(0)).play(Sounds.SFX.FLIPPAGE);
        assertEquals(1, instructionsMenu.getCurrentPage());
    }

    @Test
    public void testNavigateLeftPageTwo() throws NoSuchFieldException, IllegalAccessException {
        Field currentPageField = InstructionsMenu.class.getDeclaredField("currentPage");
        currentPageField.setAccessible(true);
        currentPageField.set(instructionsMenu, 2);

        instructionsMenu.navigateLeft();
        verify(soundsControllerMock, times(1)).play(Sounds.SFX.FLIPPAGE);
        assertEquals(1, instructionsMenu.getCurrentPage());

    }

    @Test
    public void testGetTotalPages() {
        assertEquals(5, instructionsMenu.getTotalPages());
    }


}
