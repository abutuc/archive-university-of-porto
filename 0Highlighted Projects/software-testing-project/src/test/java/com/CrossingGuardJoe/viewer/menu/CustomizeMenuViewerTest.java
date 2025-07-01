package com.CrossingGuardJoe.viewer.menu;

import com.CrossingGuardJoe.gui.GUI;
import com.CrossingGuardJoe.gui.LanternaGUI;
import com.CrossingGuardJoe.model.Position;
import com.CrossingGuardJoe.model.menu.ColorPaletteMenu;
import com.CrossingGuardJoe.model.menu.CustomizeMenu;
import com.CrossingGuardJoe.model.menu.Option;
import com.CrossingGuardJoe.viewer.Color;
import com.CrossingGuardJoe.viewer.images.defined.ToolImages;
import com.CrossingGuardJoe.viewer.images.generator.Shape;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class CustomizeMenuViewerTest {
    private CustomizeMenuViewer customizeMenuViewer;
    private CustomizeMenu customizeMenuMock;
    private GUI guiMock;

    @BeforeEach
    public void setUp() {
        guiMock = mock(LanternaGUI.class);
        customizeMenuMock = mock(CustomizeMenu.class);
        customizeMenuViewer = new CustomizeMenuViewer(customizeMenuMock);
    }

    @Test
    public void testDrawElementsSelectedJoe() {
        int SELECTION_BOX_WIDTH = 235;
        int SELECTION_BOX_HEIGHT = 300;

        List<Option> menuLevelOne = new ArrayList<>();
        menuLevelOne.add(new Option("test", new Position(10, 10), new String[]{"1"}));
        menuLevelOne.add(new Option("test2", new Position(11, 11), new String[]{"1"}));


        List<List<Option>> menuLevels = new ArrayList<>();
        menuLevels.add(menuLevelOne);

        when(customizeMenuMock.getMenuLevels()).thenReturn(menuLevels);
        when(customizeMenuMock.isSelectedJoeCustomize()).thenReturn(true);

        List<Option> definedColors = new ArrayList<>();
        definedColors.add(new Option("test", new Position(10, 10), new String[]{"2"}));
        definedColors.add(new Option("test2", new Position(11, 11), new String[]{"3"}));

        when(customizeMenuMock.getDefinedColors()).thenReturn(definedColors);

        ColorPaletteMenu colorPaletteMenuMock = mock(ColorPaletteMenu.class);

        when(customizeMenuMock.getColorPaletteMenu()).thenReturn(colorPaletteMenuMock);

        List<Color> colors = new ArrayList<>();
        colors.add(Color.ORANGE);
        colors.add(Color.BLUE);

        when(colorPaletteMenuMock.getColorPalette()).thenReturn(colors);

        when(customizeMenuMock.isColorPaletteSelected()).thenReturn(true);

        when(colorPaletteMenuMock.isColorSelected(0)).thenReturn(true);
        when(colorPaletteMenuMock.isColorSelected(1)).thenReturn(true);
        when(colorPaletteMenuMock.isColorSelected(2)).thenReturn(true);


        when(customizeMenuMock.getOldColor()).thenReturn('a');
        when(customizeMenuMock.getNewColor()).thenReturn('b');

        assertDoesNotThrow(() -> customizeMenuViewer.drawElements(guiMock));

        verify(guiMock, times(1)).drawText(new Position(180, 28), "CUSTOMIZE YOUR GAME", "#FFFFFF");
        verify(guiMock, times(1)).drawImage(new Position(4, 4), ToolImages.getKeyEscImage());
        verify(guiMock, times(1)).drawImage(new Position(40, 70), Shape.RectangleFilledGenerator(SELECTION_BOX_WIDTH, SELECTION_BOX_HEIGHT, 'K', 2, '$'));
        verify(guiMock, times(1)).drawImage(new Position(195, 70), Shape.RectangleFilledGenerator(SELECTION_BOX_WIDTH, SELECTION_BOX_HEIGHT, 'K', 2, '$'));
        verify(guiMock, times(1)).drawImage(new Position(350, 70), Shape.RectangleFilledGenerator(SELECTION_BOX_WIDTH, SELECTION_BOX_HEIGHT, 'K', 2, '$'));
        verify(guiMock, times(2)).drawImage(new Position(40, 70), Shape.RectangleFilledGenerator(SELECTION_BOX_WIDTH, SELECTION_BOX_HEIGHT, ' ', 2, 'G'));

        verify(guiMock, times(1)).drawImage(new Position(10, 10), new String[]{"1"});
        verify(guiMock, times(1)).drawText(new Position(10, 10),
                "test2", "#FFFFFF");
        verify(guiMock, times(0)).drawText(new Position(9, 9),
                "test", "#FFFFFF");

        verify(guiMock, times(1)).drawImage( new Position(10, 10), new String[]{"2"});
        verify(guiMock, times(1)).drawImage( new Position(11, 11), new String[]{"3"});

        verify(guiMock, times(1)).setColorHexaCode(Color.BLUE.getColorHexCode());
        verify(guiMock, times(1)).setColorHexaCode(Color.ORANGE.getColorHexCode());

        verify(guiMock, times(1)).fillRectangle(new Position(105, 426), 25, 30);
        verify(guiMock, times(1)).fillRectangle(new Position(135, 426), 25, 30);

        verify(guiMock, times(1)).drawImage(new Position(52, 426), Shape.RectangleFilledGenerator(25, 30, ' ', 1, '$'));
        verify(guiMock, times(1)).drawImage(new Position(67, 426), Shape.RectangleFilledGenerator(25, 30, ' ', 1, '$'));


        verify(guiMock, times(1)).drawImage(new Position( 55, 405), ToolImages.getArrowDownImage());
        verify(guiMock, times(1)).drawImage(new Position( 70, 405), ToolImages.getArrowDownImage());
        verify(guiMock, times(0)).drawImage(new Position( 85, 405), ToolImages.getArrowDownImage());

        verify(guiMock, times(1)).addColorMapping('a', 'b');

    }

    @Test
    public void drawElementsIsSelectedKidsCustomize() {
        int SELECTION_BOX_WIDTH = 235;
        int SELECTION_BOX_HEIGHT = 300;

        List<Option> menuLevelOne = new ArrayList<>();
        menuLevelOne.add(new Option("test", new Position(10, 10), new String[]{"1"}));
        menuLevelOne.add(new Option("test2", new Position(11, 11), new String[]{"1"}));


        List<List<Option>> menuLevels = new ArrayList<>();
        menuLevels.add(menuLevelOne);

        when(customizeMenuMock.getMenuLevels()).thenReturn(menuLevels);
        when(customizeMenuMock.isSelectedJoeCustomize()).thenReturn(false);
        when(customizeMenuMock.isSelectedKidsCustomize()).thenReturn(true);

        List<Option> definedColors = new ArrayList<>();
        definedColors.add(new Option("test", new Position(10, 10), new String[]{"2"}));
        definedColors.add(new Option("test2", new Position(11, 11), new String[]{"3"}));

        when(customizeMenuMock.getDefinedColors()).thenReturn(definedColors);

        ColorPaletteMenu colorPaletteMenuMock = mock(ColorPaletteMenu.class);

        when(customizeMenuMock.getColorPaletteMenu()).thenReturn(colorPaletteMenuMock);

        List<Color> colors = new ArrayList<>();
        colors.add(Color.ORANGE);
        colors.add(Color.BLUE);

        when(colorPaletteMenuMock.getColorPalette()).thenReturn(colors);

        when(customizeMenuMock.isColorPaletteSelected()).thenReturn(true);

        when(colorPaletteMenuMock.isColorSelected(0)).thenReturn(true);
        when(colorPaletteMenuMock.isColorSelected(1)).thenReturn(false);
        when(colorPaletteMenuMock.isColorSelected(2)).thenReturn(true);


        when(customizeMenuMock.getOldColor()).thenReturn('a');
        when(customizeMenuMock.getNewColor()).thenReturn('b');

        when(customizeMenuMock.isSelectedOption(0, 0)).thenReturn(true);

        assertDoesNotThrow(() -> customizeMenuViewer.drawElements(guiMock));

        verify(guiMock, times(2)).drawImage(new Position(195, 70), Shape.RectangleFilledGenerator(SELECTION_BOX_WIDTH, SELECTION_BOX_HEIGHT, ' ', 2, 'G'));
        verify(guiMock, times(1)).drawImage(new Position(-20, 10), ToolImages.getArrowRightImage());

    }

    @Test
    public void drawElementsIsSelectedCarsCustomize() {
        int SELECTION_BOX_WIDTH = 235;
        int SELECTION_BOX_HEIGHT = 300;

        List<Option> menuLevelOne = new ArrayList<>();
        menuLevelOne.add(new Option("test", new Position(10, 10), new String[]{"1"}));
        menuLevelOne.add(new Option("test2", new Position(11, 11), new String[]{"1"}));


        List<List<Option>> menuLevels = new ArrayList<>();
        menuLevels.add(menuLevelOne);

        when(customizeMenuMock.getMenuLevels()).thenReturn(menuLevels);
        when(customizeMenuMock.isSelectedJoeCustomize()).thenReturn(false);
        when(customizeMenuMock.isSelectedKidsCustomize()).thenReturn(false);
        when(customizeMenuMock.isSelectedCarsCustomize()).thenReturn(true);


        List<Option> definedColors = new ArrayList<>();
        definedColors.add(new Option("test", new Position(10, 10), new String[]{"2"}));
        definedColors.add(new Option("test2", new Position(11, 11), new String[]{"3"}));

        when(customizeMenuMock.getDefinedColors()).thenReturn(definedColors);

        ColorPaletteMenu colorPaletteMenuMock = mock(ColorPaletteMenu.class);

        when(customizeMenuMock.getColorPaletteMenu()).thenReturn(colorPaletteMenuMock);

        List<Color> colors = new ArrayList<>();
        colors.add(Color.ORANGE);
        colors.add(Color.BLUE);

        when(colorPaletteMenuMock.getColorPalette()).thenReturn(colors);

        when(customizeMenuMock.isColorPaletteSelected()).thenReturn(false);

        when(colorPaletteMenuMock.isColorSelected(0)).thenReturn(true);
        when(colorPaletteMenuMock.isColorSelected(1)).thenReturn(true);
        when(colorPaletteMenuMock.isColorSelected(2)).thenReturn(true);


        when(customizeMenuMock.getOldColor()).thenReturn('\uFFFF');
        when(customizeMenuMock.getNewColor()).thenReturn('b');

        when(customizeMenuMock.isSelectedOption(0, 0)).thenReturn(true);

        assertDoesNotThrow(() -> customizeMenuViewer.drawElements(guiMock));

        verify(guiMock, times(2)).drawImage(new Position(350, 70), Shape.RectangleFilledGenerator(SELECTION_BOX_WIDTH, SELECTION_BOX_HEIGHT, ' ', 2, 'G'));
        verify(guiMock, times(1)).drawImage(new Position(-20, 10), ToolImages.getArrowRightImage());

    }

    @Test
    public void drawElementsNothingIsSelected() {
        List<Option> menuLevelOne = new ArrayList<>();
        menuLevelOne.add(new Option("test", new Position(10, 10), new String[]{"1"}));
        menuLevelOne.add(new Option("test2", new Position(11, 11), new String[]{"1"}));


        List<List<Option>> menuLevels = new ArrayList<>();
        menuLevels.add(menuLevelOne);

        when(customizeMenuMock.getMenuLevels()).thenReturn(menuLevels);
        when(customizeMenuMock.isSelectedJoeCustomize()).thenReturn(false);
        when(customizeMenuMock.isSelectedKidsCustomize()).thenReturn(false);
        when(customizeMenuMock.isSelectedCarsCustomize()).thenReturn(false);


        List<Option> definedColors = new ArrayList<>();
        definedColors.add(new Option("test", new Position(10, 10), new String[]{"2"}));
        definedColors.add(new Option("test2", new Position(11, 11), new String[]{"3"}));

        when(customizeMenuMock.getDefinedColors()).thenReturn(definedColors);

        ColorPaletteMenu colorPaletteMenuMock = mock(ColorPaletteMenu.class);

        when(customizeMenuMock.getColorPaletteMenu()).thenReturn(colorPaletteMenuMock);

        List<Color> colors = new ArrayList<>();
        colors.add(Color.ORANGE);
        colors.add(Color.BLUE);

        when(colorPaletteMenuMock.getColorPalette()).thenReturn(colors);

        when(customizeMenuMock.isColorPaletteSelected()).thenReturn(false);

        when(colorPaletteMenuMock.isColorSelected(0)).thenReturn(true);
        when(colorPaletteMenuMock.isColorSelected(1)).thenReturn(true);
        when(colorPaletteMenuMock.isColorSelected(2)).thenReturn(true);


        when(customizeMenuMock.getOldColor()).thenReturn('\uFFFF');
        when(customizeMenuMock.getNewColor()).thenReturn('b');

        when(customizeMenuMock.isSelectedOption(0, 0)).thenReturn(true);

        assertDoesNotThrow(() -> customizeMenuViewer.drawElements(guiMock));

        verify(guiMock, times(1)).drawText(new Position(180, 28), "CUSTOMIZE YOUR GAME", "#FFFFFF");
    }
}
