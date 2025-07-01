package com.CrossingGuardJoe.viewer.menu;

import com.CrossingGuardJoe.gui.GUI;
import com.CrossingGuardJoe.gui.LanternaGUI;
import com.CrossingGuardJoe.model.Position;
import com.CrossingGuardJoe.model.game.Road;
import com.CrossingGuardJoe.model.game.elements.Joe;
import com.CrossingGuardJoe.model.menu.GameOverMenu;
import com.CrossingGuardJoe.model.menu.Option;
import com.CrossingGuardJoe.viewer.images.defined.ToolImages;
import com.CrossingGuardJoe.viewer.images.generator.Shape;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GameOverViewerTest {
    private GameOverViewer gameOverViewer;
    private GameOverMenu gameOverMenuMock;
    private GUI guiMock;

    @BeforeEach
    public void setUp() {
        gameOverMenuMock = mock(GameOverMenu.class);
        guiMock = mock(LanternaGUI.class);

        gameOverViewer = new GameOverViewer(gameOverMenuMock);
    }

    @Test
    public void testDrawElementsWhenWin() {
        Road roadMock = mock(Road.class);
        Joe joeMock = mock(Joe.class);


        when(gameOverMenuMock.isWin()).thenReturn(true);
        when(gameOverMenuMock.getCurrentGame()).thenReturn(roadMock);
        when(gameOverMenuMock.getNumberOptions()).thenReturn(2);
        when(gameOverMenuMock.getOption(0)).thenReturn(new Option("test", new Position(2, 4), new String[]{"Hey"}));
        when(gameOverMenuMock.getOption(1)).thenReturn(new Option("test1", new Position(2, 5), new String[]{"Hey2"}));
        when(gameOverMenuMock.getOption(2)).thenReturn(new Option("test3", new Position(2, 5), new String[]{"Hey2"}));
        when(gameOverMenuMock.isSelectedOption(0)).thenReturn(true);

        when(roadMock.getJoe()).thenReturn(joeMock);
        when(roadMock.getCurrentLevel()).thenReturn(10);

        when(joeMock.getScore()).thenReturn(10);

        gameOverViewer.drawElements(guiMock);

        verify(guiMock, times(1)).drawText(new Position(187, 80), "Congratulations", "#FFFFFF");

        verify(guiMock, times(1)).drawImage(new Position(170, 154), Shape.RectangleFilledGenerator(305, 70, 'K', 2, '$'));
        verify(guiMock, times(1)).drawText(new Position(210, 165), "score", "#FFFFFF");
        verify(guiMock, times(1)).drawText(new Position(210, 195), "level", "#FFFFFF");
        verify(guiMock, times(1)).drawText(new Position(275, 165), 10, "#FFFFFF");

        verify(guiMock, times(1)).drawText(new Position(275, 195), 9, "#D30000");

        verify(guiMock, times(1)).drawText(new Position(2, 4), "test", "#FFFFFF");
        verify(guiMock, times(1)).drawImage(new Position(-13, 4), ToolImages.getArrowRightImage());

        verify(guiMock, times(1)).drawText(new Position(2, 5), "test1", "#FFFFFF");

        verify(guiMock, times(0)).drawText(new Position(2, 5), "test3", "#FFFFFF");

    }

    @Test
    public void testDrawElementsWhenNotWin() {
        Road roadMock = mock(Road.class);
        Joe joeMock = mock(Joe.class);


        when(gameOverMenuMock.isWin()).thenReturn(false);
        when(gameOverMenuMock.getCurrentGame()).thenReturn(roadMock);
        when(gameOverMenuMock.getNumberOptions()).thenReturn(2);
        when(gameOverMenuMock.getOption(0)).thenReturn(new Option("test", new Position(2, 4), new String[]{"Hey"}));
        when(gameOverMenuMock.getOption(1)).thenReturn(new Option("test1", new Position(2, 5), new String[]{"Hey2"}));
        when(gameOverMenuMock.getOption(2)).thenReturn(new Option("test3", new Position(2, 5), new String[]{"Hey2"}));
        when(gameOverMenuMock.isSelectedOption(0)).thenReturn(true);

        when(roadMock.getJoe()).thenReturn(joeMock);
        when(roadMock.getCurrentLevel()).thenReturn(9);

        when(joeMock.getScore()).thenReturn(10);

        gameOverViewer.drawElements(guiMock);

        verify(guiMock, times(1)).drawText(new Position(213, 80), "game over", "#FFFFFF");

        verify(guiMock, times(1)).drawImage(new Position(170, 154), Shape.RectangleFilledGenerator(305, 70, 'K', 2, '$'));
        verify(guiMock, times(1)).drawText(new Position(210, 165), "score", "#FFFFFF");
        verify(guiMock, times(1)).drawText(new Position(210, 195), "level", "#FFFFFF");
        verify(guiMock, times(1)).drawText(new Position(275, 165), 10, "#FFFFFF");

        verify(guiMock, times(1)).drawText(new Position(275, 195), 9, "#FFFFFF");

        verify(guiMock, times(1)).drawText(new Position(2, 4), "test", "#FFFFFF");
        verify(guiMock, times(1)).drawImage(new Position(-13, 4), ToolImages.getArrowRightImage());

        verify(guiMock, times(1)).drawText(new Position(2, 5), "test1", "#FFFFFF");

        verify(guiMock, times(0)).drawText(new Position(2, 5), "test3", "#FFFFFF");

    }
}
