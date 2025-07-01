package com.CrossingGuardJoe.gui;

import com.CrossingGuardJoe.model.Position;
import com.CrossingGuardJoe.viewer.ColorCustomize;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.swing.AWTTerminalFontConfiguration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.awt.*;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URISyntaxException;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;


public class LanternaGUITest {
    private LanternaGUI lanternaGUI;
    private ColorCustomize colorCustomizeMock;
    private MockedStatic<ColorCustomize> colorCustomizeMockedStatic;

    @BeforeEach
    public void setUp() {
        colorCustomizeMock = mock(ColorCustomize.class);
        colorCustomizeMockedStatic = mockStatic(ColorCustomize.class);

        colorCustomizeMockedStatic.when(ColorCustomize::getInstance).thenReturn(colorCustomizeMock);

        lanternaGUI = new LanternaGUI(10, 10);
    }

    @AfterEach
    public void tearDown() {
        colorCustomizeMockedStatic.close();
    }


    @Test
    public void testCreateTerminal(){
        invokeCreateTerminalMethod(lanternaGUI);

        TerminalScreen screen = getTerminalScreen();

        assertNull(screen.getCursorPosition());
        assertTrue(getIsStartedField(screen));
    }

    @Test
    public void testCreateTerminalGraphicsFieldAndRedrawField() {
        invokeCreateTerminalMethod(lanternaGUI);

        TerminalScreen screen = getTerminalScreen();

        assertEquals(getTextGraphics().getBackgroundColor(), TextColor.Factory.fromString("#7F7976"));

        assertFalse(getFullRedraw(screen));
    }

    @Test
    public void testLoadSquareFontDoesNotReturnNull() {
        assertNotNull(invokeLoadSquareFont(lanternaGUI));
    }

    @Test
    public void testClearScreen() {
        TextGraphics textGraphicsMock = mock(TextGraphics.class);

        lanternaGUI.setGraphics(textGraphicsMock);

        lanternaGUI.clearScreen();

        verify(textGraphicsMock, times(1)).setBackgroundColor(TextColor.Factory.fromString("#7F7976"));
        verify(textGraphicsMock, times(1)).fillRectangle(new TerminalPosition(0, 0),
                new TerminalSize(10, 10),
                ' ');
    }

    @Test
    public void testRefreshScreen() {
        Screen screenMock = mock(Screen.class);

        lanternaGUI.setScreen(screenMock);

        invokeRefreshScreen();

        verifyScreenMock(screenMock);
    }

    @Test
    public void testCloseScreen() {
        Screen screenMock = mock(Screen.class);

        lanternaGUI.setScreen(screenMock);

        invokeCloseScreen();

        verifyScreenClose(screenMock);
    }

    @Test
    public void testSetBackgroundColor() {
        TextGraphics textGraphicsMock = mock(TextGraphics.class);

        lanternaGUI.setGraphics(textGraphicsMock);

        lanternaGUI.setBackgroundColor("#7F7976");

        verify(textGraphicsMock, times(1)).setBackgroundColor(TextColor.Factory.fromString("#7F7976"));
        verify(textGraphicsMock, times(1)).fillRectangle(new TerminalPosition(0, 0),
                new TerminalSize(10, 10),
                ' ');
    }

    @Test
    public void testDrawImage() {
        TextGraphics textGraphicsMock = mock(TextGraphics.class);

        lanternaGUI.setGraphics(textGraphicsMock);

        when(colorCustomizeMock.getMappedCharacter('a')).thenReturn('B');
        when(colorCustomizeMock.getMappedCharacter('c')).thenReturn('!');
        Position position = new Position(10, 10);
        String[] image = new String[2];
        image[0] = "ac";
        image[1] = "c";

        lanternaGUI.drawImage(position, image);

        verify(colorCustomizeMock, times(1)).getMappedCharacter('a');
        verify(colorCustomizeMock, times(2)).getMappedCharacter('c');

        verify(textGraphicsMock, times(1)).setBackgroundColor(TextColor.Factory.fromString("#193364"));
        verify(textGraphicsMock, times(2)).setBackgroundColor(TextColor.Factory.fromString("#4D9CFD"));

        verify(textGraphicsMock, times(1)).fillRectangle(new TerminalPosition(20, 10),
                new TerminalSize(1, 1),
                ' ');

        verify(textGraphicsMock, times(1)).fillRectangle(new TerminalPosition(21, 10),
                new TerminalSize(1, 1),
                ' ');

        verify(textGraphicsMock, times(1)).fillRectangle(new TerminalPosition(20, 11),
                new TerminalSize(1, 1),
                ' ');

    }

    @Test
    public void testDrawWithEmptyImage() {
        TextGraphics textGraphicsMock = mock(TextGraphics.class);

        lanternaGUI.setGraphics(textGraphicsMock);

        when(colorCustomizeMock.getMappedCharacter('a')).thenReturn('B');
        when(colorCustomizeMock.getMappedCharacter('c')).thenReturn('!');
        Position position = new Position(10, 10);
        String[] image = new String[0];

        lanternaGUI.drawImage(position, image);

        verify(colorCustomizeMock, times(0)).getMappedCharacter('a');
        verify(colorCustomizeMock, times(0)).getMappedCharacter('c');

        verify(textGraphicsMock, times(0)).setBackgroundColor(TextColor.Factory.fromString("#193364"));
        verify(textGraphicsMock, times(0)).setBackgroundColor(TextColor.Factory.fromString("#4D9CFD"));
    }

    @Test
    public void testDrawText() {
        TextGraphics textGraphicsMock = mock(TextGraphics.class);

        lanternaGUI.setGraphics(textGraphicsMock);

        Position position = new Position(10, 10);
        String text = "a";
        String colorHexCode = "#000000";

        lanternaGUI.drawText(position, text, colorHexCode);

        verify(textGraphicsMock, times(234)).setBackgroundColor(TextColor.Factory.fromString("#000000"));

        verify(textGraphicsMock, times(2)).fillRectangle(new TerminalPosition(25, 11),
                new TerminalSize(1, 1),
                ' ');

        verify(textGraphicsMock, times(1)).fillRectangle(new TerminalPosition(26, 11),
                new TerminalSize(1, 1),
                ' ');

        verify(textGraphicsMock, times(2)).fillRectangle(new TerminalPosition(27, 11),
                new TerminalSize(1, 1),
                ' ');

        verify(textGraphicsMock, times(2)).fillRectangle(new TerminalPosition(28, 11),
                new TerminalSize(1, 1),
                ' ');

        verify(textGraphicsMock, times(2)).fillRectangle(new TerminalPosition(29, 12),
                new TerminalSize(1, 1),
                ' ');

        verify(textGraphicsMock, times(1)).fillRectangle(new TerminalPosition(34, 16),
                new TerminalSize(1, 1),
                ' ');
    }

    @Test
    public void testDrawEmptyText() {
        TextGraphics textGraphicsMock = mock(TextGraphics.class);

        lanternaGUI.setGraphics(textGraphicsMock);

        Position position = new Position(10, 10);
        String text = "";
        String colorHexCode = "#000000";

        lanternaGUI.drawText(position, text, colorHexCode);

        verify(textGraphicsMock, times(0)).setBackgroundColor(TextColor.Factory.fromString("#000000"));
    }

    @Test
    public void testAddColorMapping() {
        lanternaGUI.addColorMapping('a', 'b');
        verify(colorCustomizeMock, times(1)).addMapping('a', 'b');
    }

    @Test
    public void testGetNextActionLeft() {
        KeyStroke keyStrokeMock = mock(KeyStroke.class);
        Screen screenMock = mock(Screen.class);

        lanternaGUI.setScreen(screenMock);

        mockPollInput(screenMock, keyStrokeMock);

        when(keyStrokeMock.getKeyType()).thenReturn(KeyType.ArrowLeft);

        assertEquals(invokeGetNextAction(lanternaGUI), GUI.ACTION.LEFT);
    }

    private GUI.ACTION invokeGetNextAction(LanternaGUI lanternaGUI) {
        try {
            return lanternaGUI.getNextAction();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void mockPollInput(Screen screenMock, KeyStroke keyStrokeMock) {
        try {
            when(screenMock.pollInput()).thenReturn(keyStrokeMock);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testGetNextActionRight() {
        KeyStroke keyStrokeMock = mock(KeyStroke.class);
        Screen screenMock = mock(Screen.class);

        lanternaGUI.setScreen(screenMock);

        mockPollInput(screenMock, keyStrokeMock);

        when(keyStrokeMock.getKeyType()).thenReturn(KeyType.ArrowRight);

        assertEquals(invokeGetNextAction(lanternaGUI), GUI.ACTION.RIGHT);
    }

    @Test
    public void testGetNextActionUp() {
        KeyStroke keyStrokeMock = mock(KeyStroke.class);
        Screen screenMock = mock(Screen.class);

        lanternaGUI.setScreen(screenMock);

        mockPollInput(screenMock, keyStrokeMock);

        when(keyStrokeMock.getKeyType()).thenReturn(KeyType.ArrowUp);

        assertEquals(invokeGetNextAction(lanternaGUI), GUI.ACTION.UP);
    }

    @Test
    public void testGetNextActionDown() {
        KeyStroke keyStrokeMock = mock(KeyStroke.class);
        Screen screenMock = mock(Screen.class);

        lanternaGUI.setScreen(screenMock);

        mockPollInput(screenMock, keyStrokeMock);

        when(keyStrokeMock.getKeyType()).thenReturn(KeyType.ArrowDown);

        assertEquals(invokeGetNextAction(lanternaGUI), GUI.ACTION.DOWN);
    }

    @Test
    public void testGetNextActionSelect() {
        KeyStroke keyStrokeMock = mock(KeyStroke.class);
        Screen screenMock = mock(Screen.class);

        lanternaGUI.setScreen(screenMock);

        mockPollInput(screenMock, keyStrokeMock);

        when(keyStrokeMock.getKeyType()).thenReturn(KeyType.Enter);

        assertEquals(invokeGetNextAction(lanternaGUI), GUI.ACTION.SELECT);
    }

    @Test
    public void testGetNextActionEsc() {
        KeyStroke keyStrokeMock = mock(KeyStroke.class);
        Screen screenMock = mock(Screen.class);

        lanternaGUI.setScreen(screenMock);

        mockPollInput(screenMock, keyStrokeMock);

        when(keyStrokeMock.getKeyType()).thenReturn(KeyType.Escape);

        assertEquals(invokeGetNextAction(lanternaGUI), GUI.ACTION.ESC);
    }

    @Test
    public void testGetNextActionQuit() {
        KeyStroke keyStrokeMock = mock(KeyStroke.class);
        Screen screenMock = mock(Screen.class);

        lanternaGUI.setScreen(screenMock);

        mockPollInput(screenMock, keyStrokeMock);

        when(keyStrokeMock.getKeyType()).thenReturn(KeyType.EOF);

        assertEquals(invokeGetNextAction(lanternaGUI), GUI.ACTION.QUIT);
    }

    @Test
    public void testGetNextActionUnknown() {
        KeyStroke keyStrokeMock = mock(KeyStroke.class);
        Screen screenMock = mock(Screen.class);

        lanternaGUI.setScreen(screenMock);

        mockPollInput(screenMock, keyStrokeMock);

        when(keyStrokeMock.getKeyType()).thenReturn(KeyType.Unknown);

        assertEquals(invokeGetNextAction(lanternaGUI), GUI.ACTION.NONE);
    }

    @Test
    public void testGetNextActionNullKeyStroke() {
        Screen screenMock = mock(Screen.class);

        lanternaGUI.setScreen(screenMock);

        mockPollInput(screenMock, null);

        assertEquals(invokeGetNextAction(lanternaGUI), GUI.ACTION.NONE);
    }

    @Test
    public void testSetColorNull() {
        TextGraphics textGraphicsMock = mock(TextGraphics.class);

        lanternaGUI.setGraphics(textGraphicsMock);

        lanternaGUI.setColor('l');

        verify(textGraphicsMock, never()).setBackgroundColor(any());
    }

    @Test
    public void testDrawLineWithBlankChar() {
        TextGraphics textGraphicsMock = mock(TextGraphics.class);

        lanternaGUI.setGraphics(textGraphicsMock);

        lanternaGUI.drawLine(10, 10, " ");

        verifyNoInteractions(textGraphicsMock);
    }

    private void invokeCreateTerminalMethod(LanternaGUI lanternaGUI) {
        try {
            lanternaGUI.createTerminal();
        } catch (IOException | URISyntaxException | FontFormatException e) {
            throw new RuntimeException(e);
        }
    }

    private TerminalScreen getTerminalScreen() {
        try {
            Field screenField = LanternaGUI.class.getDeclaredField("screen");
            screenField.setAccessible(true);
            return (TerminalScreen) screenField.get(lanternaGUI);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private Boolean getIsStartedField(TerminalScreen screen) {
        try {
            Field isStartedField = TerminalScreen.class.getDeclaredField("isStarted");
            isStartedField.setAccessible(true);
            return (Boolean) isStartedField.get(screen);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private TextGraphics getTextGraphics() {
        try {
            Field graphicsField = LanternaGUI.class.getDeclaredField("graphics");
            graphicsField.setAccessible(true);
            return (TextGraphics) graphicsField.get(lanternaGUI);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private Boolean getFullRedraw(TerminalScreen screen) {
        try {
            Field fullRedrawField = TerminalScreen.class.getDeclaredField("fullRedrawHint");
            fullRedrawField.setAccessible(true);
            return (Boolean) fullRedrawField.get(screen);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private AWTTerminalFontConfiguration invokeLoadSquareFont(LanternaGUI lanternaGUI) {
        try {
            Method loadSquareFont = LanternaGUI.class.getDeclaredMethod("loadSquareFont");
            loadSquareFont.setAccessible(true);
            return (AWTTerminalFontConfiguration) loadSquareFont.invoke(lanternaGUI);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private void invokeRefreshScreen() {
        try {
            lanternaGUI.refreshScreen();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void verifyScreenMock(Screen screenMock) {
        try {
            verify(screenMock, times(1)).refresh();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void invokeCloseScreen() {
        try {
            lanternaGUI.closeScreen();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void verifyScreenClose(Screen screenMock) {
        try {
            verify(screenMock, times(1)).close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
