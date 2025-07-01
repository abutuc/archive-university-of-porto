package com.CrossingGuardJoe.viewer.menu;

import com.CrossingGuardJoe.gui.GUI;
import com.CrossingGuardJoe.gui.LanternaGUI;
import com.CrossingGuardJoe.model.Position;
import com.CrossingGuardJoe.model.menu.Menu;
import com.CrossingGuardJoe.model.menu.Option;
import com.CrossingGuardJoe.viewer.images.defined.LogoImages;
import com.CrossingGuardJoe.viewer.images.defined.ToolImages;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MenuViewerTest {
    private MenuViewer menuViewer;
    private Menu menuMock;
    private GUI guiMock;

    @BeforeEach
    public void setUp() {
        menuMock = mock(Menu.class);
        guiMock = mock(LanternaGUI.class);

        menuViewer = new MenuViewer(menuMock);
    }

    @Test
    public void testDrawElements() {
        when(menuMock.getNumberOptions()).thenReturn(2);
        when(menuMock.getOption(0)).thenReturn(new Option("test", new Position(5, 5), new String[]{"Hello"}));
        when(menuMock.getOption(1)).thenReturn(new Option("test1", new Position(2,4), new String[]{"Hello1"}));
        when(menuMock.getOption(2)).thenReturn(new Option("test2", new Position(1,2), new String[]{"Hello2"}));
        when(menuMock.isSelectedOption(0)).thenReturn(true);
        when(menuMock.isSelectedOption(1)).thenReturn(false);
        when(menuMock.isSelectedOption(2)).thenReturn(false);

        menuViewer.drawElements(guiMock);

        verify(guiMock, times(1)).drawImage(new Position(130, 50), LogoImages.getLogoGameImage());

        verify(guiMock, times(1)).drawText(new Position(5,5), "test", "#FFFFFF");
        verify(guiMock, times(1)).drawText(new Position(2,4), "test1", "#FFFFFF");
        verify(guiMock, times(0)).drawText(new Position(1,2), "test2", "#FFFFFF");

        verify(guiMock, times(1)).drawImage(new Position(-10, 5), ToolImages.getArrowRightImage());
    }

}
