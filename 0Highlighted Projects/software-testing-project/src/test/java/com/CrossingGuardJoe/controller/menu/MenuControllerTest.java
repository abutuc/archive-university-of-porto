package com.CrossingGuardJoe.controller.menu;

import com.CrossingGuardJoe.Game;
import com.CrossingGuardJoe.controller.Sounds;
import com.CrossingGuardJoe.controller.SoundsController;
import com.CrossingGuardJoe.gui.GUI;
import com.CrossingGuardJoe.model.menu.Menu;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class MenuControllerTest {
    private MenuController menuController;
    private Menu menuMock;
    private SoundsController soundsControllerMock;
    private MockedStatic<SoundsController> soundsControllerMockStatic;
    private Game gameMock;

    @BeforeEach
    public void setUp() {
        menuMock = mock(Menu.class);
        gameMock = mock(Game.class);

        soundsControllerMock = mock(SoundsController.class);
        soundsControllerMockStatic = mockStatic(SoundsController.class);

        soundsControllerMockStatic.when(SoundsController::getInstance).thenReturn(soundsControllerMock);

        menuController = new MenuController(menuMock);
    }

    @AfterEach
    public void tearDown() {
        soundsControllerMockStatic.close();
    }

    @Test
    public void testNextActionWhenValidAction() {
        when(menuMock.isSelectedStartGame()).thenReturn(true);
        when(menuMock.isSelectedInstructions()).thenReturn(true);
        when(menuMock.isSelectedCustomize()).thenReturn(true);
        when(menuMock.isSelectedExit()).thenReturn(false);

        invokeNextAction(menuController, gameMock, GUI.ACTION.UP, System.currentTimeMillis());
        invokeNextAction(menuController, gameMock, GUI.ACTION.DOWN, System.currentTimeMillis());
        invokeNextAction(menuController, gameMock, GUI.ACTION.SELECT, System.currentTimeMillis());

        verify(soundsControllerMock, times(1)).play(Sounds.SFX.MENUBGM);
        verify(soundsControllerMock, times(1)).stop(Sounds.SFX.MENUBGM);
        verify(soundsControllerMock, times(2)).play(Sounds.SFX.SELECT);
        verify(soundsControllerMock, times(1)).play(Sounds.SFX.ENTER);

        verify(menuMock, times(1)).navigateUp();
        verify(menuMock, times(1)).navigateDown();

        verify(gameMock, times(3)).setState(any());

    }

    @Test
    public void testNextActionWhenInvalidAction() {

       invokeNextAction(menuController, gameMock, GUI.ACTION.QUIT, System.currentTimeMillis());

        verify(soundsControllerMock, times(1)).play(Sounds.SFX.MENUBGM);
        verify(soundsControllerMock, times(0)).stop(Sounds.SFX.MENUBGM);
        verify(soundsControllerMock, times(0)).play(Sounds.SFX.SELECT);
        verify(soundsControllerMock, times(0)).play(Sounds.SFX.ENTER);

        verify(menuMock, times(0)).navigateUp();
        verify(menuMock, times(0)).navigateDown();

        verify(gameMock, times(0)).setState(any());
    }

    @Test
    public void testNextActionWhenSelectButNoneSelected() {
        when(menuMock.isSelectedStartGame()).thenReturn(false);
        when(menuMock.isSelectedInstructions()).thenReturn(false);
        when(menuMock.isSelectedCustomize()).thenReturn(false);
        when(menuMock.isSelectedExit()).thenReturn(false);

        invokeNextAction(menuController, gameMock, GUI.ACTION.SELECT, System.currentTimeMillis());

        verify(soundsControllerMock, times(1)).play(Sounds.SFX.MENUBGM);
        verify(soundsControllerMock, times(1)).stop(Sounds.SFX.MENUBGM);
        verify(soundsControllerMock, times(1)).play(Sounds.SFX.ENTER);

        verify(gameMock, times(0)).setState(any());

    }

    private void invokeNextAction(MenuController controller, Game game, GUI.ACTION action, long currentTimeMillis) {
        try {
            controller.nextAction(game, action, currentTimeMillis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
