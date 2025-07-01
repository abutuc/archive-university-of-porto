package com.CrossingGuardJoe.viewer.menu;

import com.CrossingGuardJoe.gui.GUI;
import com.CrossingGuardJoe.gui.LanternaGUI;
import com.CrossingGuardJoe.model.Position;
import com.CrossingGuardJoe.model.menu.InstructionsMenu;
import com.CrossingGuardJoe.viewer.images.defined.*;
import com.CrossingGuardJoe.viewer.images.generator.Shape;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class InstructionsMenuViewerTest {
    private InstructionsMenuViewer instructionsMenuViewer;
    private InstructionsMenu instructionsMenuMock;
    private GUI guiMock;

    @BeforeEach
    public void setUp() {
        instructionsMenuMock = mock(InstructionsMenu.class);
        guiMock = mock(LanternaGUI.class);

        instructionsMenuViewer = new InstructionsMenuViewer(instructionsMenuMock);
    }

    @Test
    public void testDrawElementsPageTwo() {
        int PAGES_INI_X = 400;
        int PAGES_Y = 474;

        when(instructionsMenuMock.getTotalPages()).thenReturn(2);
        when(instructionsMenuMock.getCurrentPage()).thenReturn(2);

        instructionsMenuViewer.drawElements(guiMock);

        verify(guiMock, times(1)).drawText(new Position(202, 17), "Instructions", "#FFFFFF");

        verify(guiMock, times(2)).drawImage(new Position(4, 4), ToolImages.getKeyEscImage());

        verify(guiMock, times(1)).drawText(new Position(PAGES_INI_X, PAGES_Y), "Page", "#FFFFFF");
        verify(guiMock, times(1)).drawText(new Position(PAGES_INI_X + 54, PAGES_Y), "of", "#FFFFFF");
        verify(guiMock, times(1)).drawText(new Position(PAGES_INI_X + 74, PAGES_Y), 2, "#FFFFFF");
        verify(guiMock, times(1)).drawText(new Position(PAGES_INI_X + 40, PAGES_Y), 2, "#D30000");


        verify(guiMock, times(1)).drawImage(new Position(20, 50), Shape.RectangleFilledGenerator(920, 410, 'K', 2, '$'));

        verify(guiMock, times(1)).drawText(new Position(50, 100), "you will help", "#FFFFFF");
        verify(guiMock, times(1)).drawText(new Position(70, 120), "the kids to cross the road", "#FFFFFF");
        verify(guiMock, times(1)).drawText(new Position(50, 400), "click once to order", "#FFFFFF");

        int JOE_Y = 200;
        verify(guiMock, times(1)).drawImage(new Position(170, JOE_Y - 20), JoeImages.getJoeStopImage());
        verify(guiMock, times(1)).drawImage(new Position(290, JOE_Y - 20), JoeImages.getJoePassImage());

        verify(guiMock, times(1)).drawImage(new Position(200, JOE_Y + 20), KidImages.getKidStandImage());
        verify(guiMock, times(1)).drawImage(new Position(280, JOE_Y + 20), KidImages.getKidWalkImage());

        int KEY_Y = 310;
        verify(guiMock, times(1)).drawImage(new Position(180, KEY_Y), ToolImages.getKeyUpImage());
        verify(guiMock, times(1)).drawImage(new Position(295, KEY_Y), ToolImages.getKeyDownImage());
    }

    @Test
    public void testDrawElementsPageOne() {
        int PAGES_INI_X = 400;
        int PAGES_Y = 474;

        when(instructionsMenuMock.getTotalPages()).thenReturn(2);
        when(instructionsMenuMock.getCurrentPage()).thenReturn(1);

        instructionsMenuViewer.drawElements(guiMock);

        verify(guiMock, times(1)).drawText(new Position(PAGES_INI_X + 40, PAGES_Y), 1, "#FFFFFF");

        verify(guiMock, times(1)).drawText(new Position(50, 100), "you are Joe", "#FFFFFF");
        verify(guiMock, times(1)).drawText(new Position(70, 120), "a crossing guard", "#FFFFFF");
        verify(guiMock, times(1)).drawText(new Position(50, 400), "click once to move", "#FFFFFF");

        int JOE_Y = 190;
        verify(guiMock, times(1)).drawImage(new Position(150, JOE_Y), JoeImages.getJoeStandImage());
        verify(guiMock, times(1)).drawImage(new Position(230, JOE_Y), JoeImages.getJoeWalkleftImage());
        verify(guiMock, times(1)).drawImage(new Position(310, JOE_Y), JoeImages.getJoeWalkrightImage());

        int KEY_Y = 310;
        verify(guiMock, times(1)).drawImage(new Position(235, KEY_Y), ToolImages.getKeyLeftImage());
        verify(guiMock, times(1)).drawImage(new Position(315, KEY_Y), ToolImages.getKeyRightImage());
    }

    @Test
    public void testDrawElementsPageThree() {
        when(instructionsMenuMock.getCurrentPage()).thenReturn(3);

        instructionsMenuViewer.drawElements(guiMock);

        verify(guiMock, times(1)).drawText(new Position(50, 100), "be careful", "#FFFFFF");
        verify(guiMock, times(1)).drawText(new Position(70, 120), "with rude drivers", "#FFFFFF");

        int JOE_Y = 215;
        verify(guiMock, times(1)).drawImage(new Position(150, JOE_Y - 20), CarImage.getCarImage());
        verify(guiMock, times(1)).drawImage(new Position(280, JOE_Y - 20), CarImage.getCarImage());

        verify(guiMock, times(1)).drawImage(new Position(190, JOE_Y + 30), KidImages.getKidHitImage());

        verify(guiMock, times(1)).drawImage(new Position(320, JOE_Y), JoeImages.getJoeHitrightImage());
    }

    @Test
    public void testDrawElementsPageFour() {
        when(instructionsMenuMock.getCurrentPage()).thenReturn(4);

        instructionsMenuViewer.drawElements(guiMock);

        verify(guiMock, times(1)).drawText(new Position(50, 100), "if you lose a kid", "#FFFFFF");
        verify(guiMock, times(1)).drawText(new Position(70, 120), "you lose hp", "#FFFFFF");

        int HP_BAR_Y = 230;
        verify(guiMock, times(1)).drawImage(new Position(199, HP_BAR_Y - 1), Shape.RectangleFilledGenerator(202, 39, ' ', 2, '$'));
        verify(guiMock, times(1)).drawImage(new Position(200, HP_BAR_Y), HUDImages.getHpBarSliceImage());

        int HP_iniX = 208;
        for (int i = 0; i < 3; i++) {
            verify(guiMock, times(1)).drawImage(new Position(HP_iniX, HP_BAR_Y + 4), HUDImages.getHPImage());
            HP_iniX += 25;
        }
        verify(guiMock, times(0)).drawImage(new Position(HP_iniX, HP_BAR_Y + 4), HUDImages.getHPImage());
    }

    @Test
    public void testDrawElementsPageFive() {
        when(instructionsMenuMock.getCurrentPage()).thenReturn(5);

        instructionsMenuViewer.drawElements(guiMock);

        verify(guiMock, times(1)).drawText(new Position(50, 100), "try to get", "#FFFFFF");
        verify(guiMock, times(1)).drawText(new Position(70, 120), "maximum score", "#FFFFFF");

        int SCORE_BAR_X = 185;
        int SCORE_BAR_Y = 230;

        verify(guiMock, times(1)).drawImage(new Position(SCORE_BAR_X - 1, SCORE_BAR_Y - 1), Shape.RectangleFilledGenerator(266, 39, ' ', 2, '$'));

        verify(guiMock, times(1)).drawImage(new Position(SCORE_BAR_X, SCORE_BAR_Y), HUDImages.getScoreBarSliceImage());
        verify(guiMock, times(1)).drawText(new Position(SCORE_BAR_X + 90, SCORE_BAR_Y + 10), 2590, "#FFFFFF");
    }

    @Test
    public void testDrawElementsNonSupportedPage() {
        when(instructionsMenuMock.getCurrentPage()).thenReturn(6);

        instructionsMenuViewer.drawElements(guiMock);

        verify(guiMock, times(0)).drawText(new Position(50, 100), "you will help", "#FFFFFF");
        verify(guiMock, times(0)).drawText(new Position(70, 120), "a crossing guard", "#FFFFFF");
        verify(guiMock, times(0)).drawImage(new Position(280, 215 - 20), CarImage.getCarImage());
        verify(guiMock, times(0)).drawImage(new Position(200, 230), HUDImages.getHpBarSliceImage());
        verify(guiMock, times(0)).drawImage(new Position(185 - 1,  230 - 1), Shape.RectangleFilledGenerator(266, 39, ' ', 2, '$'));

    }
}
