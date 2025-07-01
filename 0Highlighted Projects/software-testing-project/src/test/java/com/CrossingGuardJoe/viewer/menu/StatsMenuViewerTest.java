package com.CrossingGuardJoe.viewer.menu;

import com.CrossingGuardJoe.gui.GUI;
import com.CrossingGuardJoe.gui.LanternaGUI;
import com.CrossingGuardJoe.model.Position;
import com.CrossingGuardJoe.model.menu.StatsMenu;
import com.CrossingGuardJoe.viewer.images.defined.ToolImages;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class StatsMenuViewerTest {
    private StatsMenuViewer statsMenuViewer;
    private StatsMenu statsMenuMock;
    private GUI guiMock;

    @BeforeEach
    public void setUp() {
        statsMenuMock = mock(StatsMenu.class);
        guiMock = mock(LanternaGUI.class);

        statsMenuViewer = new StatsMenuViewer(statsMenuMock);
    }

    @Test
    public void testDrawElementsHighestScore() {
        when(statsMenuMock.getCurrentScore()).thenReturn(1);
        when(statsMenuMock.getCurrentLevel()).thenReturn(10);
        when(statsMenuMock.getHighestScore()).thenReturn(3);
        when(statsMenuMock.getHighestLevel()).thenReturn(10);

        statsMenuViewer.drawElements(guiMock);

        verify(guiMock, times(1)).drawText(new Position(207, 100), "Game stats", "#FFFFFF");

        verify(guiMock, times(1)).drawText(new Position(210, 210), "score", "#FFFFFF");
        verify(guiMock, times(1)).drawText(new Position(210, 250), "level", "#FFFFFF");
        verify(guiMock, times(1)).drawText(new Position(150, 300), "highest score", "#FFFFFF");
        verify(guiMock, times(1)).drawText(new Position(150, 340), "highest level", "#FFFFFF");

        verify(guiMock, times(1)).drawText(new Position(275, 210), 1, "#FFFFFF");

        verify(guiMock, times(1)).drawText(new Position(275, 250), 9, "#FFFFFF");

        verify(guiMock, times(1)).drawText(new Position(275, 300), 3, "#FFFFFF");

        verify(guiMock, times(1)).drawText(new Position(275, 340), 9, "#FFFFFF");

        verify(guiMock, times(1)).drawImage(new Position(4, 4), ToolImages.getKeyEscImage());
    }

    @Test
    public void testDrawElementsNotHighest() {
        when(statsMenuMock.getCurrentScore()).thenReturn(1);
        when(statsMenuMock.getCurrentLevel()).thenReturn(7);
        when(statsMenuMock.getHighestScore()).thenReturn(3);
        when(statsMenuMock.getHighestLevel()).thenReturn(7);

        statsMenuViewer.drawElements(guiMock);

        verify(guiMock, times(1)).drawText(new Position(275, 250), 7, "#FFFFFF");
        verify(guiMock, times(1)).drawText(new Position(275, 340), 7, "#FFFFFF");
    }
}
