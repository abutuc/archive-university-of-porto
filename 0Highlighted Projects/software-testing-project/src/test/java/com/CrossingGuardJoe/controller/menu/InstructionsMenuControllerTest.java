package com.CrossingGuardJoe.controller.menu;

import com.CrossingGuardJoe.Game;
import com.CrossingGuardJoe.controller.Sounds;
import com.CrossingGuardJoe.controller.SoundsController;
import com.CrossingGuardJoe.gui.GUI;
import com.CrossingGuardJoe.model.menu.InstructionsMenu;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class InstructionsMenuControllerTest {
    private InstructionsMenuController instructionsMenuController;
    private InstructionsMenu instructionsMenuMock;
    private SoundsController soundsControllerMock;
    private MockedStatic<SoundsController> soundsControllerMockStatic;
    private Game gameMock;

    @BeforeEach
    public void setUp() {
        instructionsMenuMock = mock(InstructionsMenu.class);
        gameMock = mock(Game.class);

        soundsControllerMock = mock(SoundsController.class);
        soundsControllerMockStatic = mockStatic(SoundsController.class);

        soundsControllerMockStatic.when(SoundsController::getInstance).thenReturn(soundsControllerMock);

        instructionsMenuController = new InstructionsMenuController(instructionsMenuMock);
    }

    @AfterEach
    public void tearDown() {
        soundsControllerMockStatic.close();
    }

    @Test
    public void testNextActionWhenActionValid() {

        invokeNextAction(instructionsMenuController, gameMock, GUI.ACTION.RIGHT);
        invokeNextAction(instructionsMenuController, gameMock, GUI.ACTION.LEFT);
        invokeNextAction(instructionsMenuController, gameMock, GUI.ACTION.ESC);

        verify(instructionsMenuMock, times(1)).navigateRight();
        verify(instructionsMenuMock, times(1)).navigateLeft();

        verify(soundsControllerMock, times(1)).play(Sounds.SFX.INSTRUCTIONSBGM);
        verify(soundsControllerMock, times(1)).stop(Sounds.SFX.INSTRUCTIONSBGM);
        verify(soundsControllerMock, times(1)).play(Sounds.SFX.MENUBGM);

        verify(gameMock, times(1)).popState();
    }

    @Test
    public void testNextActionWhenActionInvalid() {
        invokeNextAction(instructionsMenuController, gameMock, GUI.ACTION.QUIT);
        verify(instructionsMenuMock, times(0)).navigateRight();
        verify(instructionsMenuMock, times(0)).navigateLeft();

        verify(soundsControllerMock, times(0)).stop(Sounds.SFX.INSTRUCTIONSBGM);
        verify(soundsControllerMock, times(0)).play(Sounds.SFX.MENUBGM);

        verify(gameMock, times(0)).popState();
    }

    private void invokeNextAction(InstructionsMenuController controller, Game game, GUI.ACTION action) {
        try {
            controller.nextAction(game, action, System.currentTimeMillis());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
