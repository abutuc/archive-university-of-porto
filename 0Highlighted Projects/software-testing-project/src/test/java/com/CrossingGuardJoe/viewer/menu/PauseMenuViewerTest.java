package com.CrossingGuardJoe.viewer.menu;

import com.CrossingGuardJoe.gui.GUI;
import com.CrossingGuardJoe.gui.LanternaGUI;
import com.CrossingGuardJoe.model.Position;
import com.CrossingGuardJoe.model.menu.Option;
import com.CrossingGuardJoe.model.menu.PauseMenu;
import com.CrossingGuardJoe.viewer.images.defined.ToolImages;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class PauseMenuViewerTest {
    private PauseMenuViewer pauseMenuViewer;
    private PauseMenu pauseMenuMock;
    private GUI guiMock;

    @BeforeEach
    public void setUp() {
        pauseMenuMock = mock(PauseMenu.class);
        guiMock = mock(LanternaGUI.class);

        pauseMenuViewer = new PauseMenuViewer(pauseMenuMock);
    }

    @Test
    public void testDrawElements() {
        when(pauseMenuMock.getNumberOptions()).thenReturn(2);
        when(pauseMenuMock.getOption(0)).thenReturn(new Option("test", new Position(5, 5), new String[]{"Hello"}));
        when(pauseMenuMock.getOption(1)).thenReturn(new Option("test1", new Position(2,4), new String[]{"Hello1"}));
        when(pauseMenuMock.getOption(2)).thenReturn(new Option("test2", new Position(1,2), new String[]{"Hello2"}));
        when(pauseMenuMock.isSelectedOption(0)).thenReturn(true);
        when(pauseMenuMock.isSelectedOption(1)).thenReturn(false);
        when(pauseMenuMock.isSelectedOption(2)).thenReturn(false);

        pauseMenuViewer.drawElements(guiMock);

        verify(guiMock, times(1)).drawText(new Position(207, 100), "Game paused", "#FFFFFF");

        verify(guiMock, times(1)).drawText(new Position(5,5), "test", "#FFFFFF");
        verify(guiMock, times(1)).drawText(new Position(2,4), "test1", "#FFFFFF");
        verify(guiMock, times(0)).drawText(new Position(1,2), "test2", "#FFFFFF");

        verify(guiMock, times(1)).drawImage(new Position(-10, 5), ToolImages.getArrowRightImage());
    }

    @Test
    public void testDraw() throws IOException {
        pauseMenuViewer.draw(guiMock);

        verify(guiMock, times(1)).clearScreen();
        verify(guiMock, times(1)).refreshScreen();
        verify(guiMock, times(1)).drawText(new Position(207, 100), "Game paused", "#FFFFFF");
    }

}
