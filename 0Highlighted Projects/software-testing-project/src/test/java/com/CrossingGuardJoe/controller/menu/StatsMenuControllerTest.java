package com.CrossingGuardJoe.controller.menu;

import com.CrossingGuardJoe.Game;
import com.CrossingGuardJoe.gui.GUI;
import com.CrossingGuardJoe.model.menu.StatsMenu;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.stream.Stream;

import static org.mockito.Mockito.*;

public class StatsMenuControllerTest {


    @ParameterizedTest
    @MethodSource("provideActionsAndInvocations")
    public void testNextActionWhenEsc(GUI.ACTION action, int wantedNumberOfInvocations) {
        Game gameMock = mock(Game.class);
        invokeNextAction(action, gameMock);
        verify(gameMock, times(wantedNumberOfInvocations)).popState();
   }

   private void invokeNextAction(GUI.ACTION action, Game gameMock) {
       StatsMenu statsMenuMock = mock(StatsMenu.class);
       StatsMenuController statsMenuController = new StatsMenuController(statsMenuMock);
       try {
           statsMenuController.nextAction(gameMock, action, System.currentTimeMillis());

       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }

    private static Stream<Arguments> provideActionsAndInvocations() {
        return Stream.of(
                Arguments.of(GUI.ACTION.ESC, 1),
                Arguments.of(GUI.ACTION.DOWN, 0)
        );
    }
}
