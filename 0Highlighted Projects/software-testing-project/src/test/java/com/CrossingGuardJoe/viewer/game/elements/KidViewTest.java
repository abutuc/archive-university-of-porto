package com.CrossingGuardJoe.viewer.game.elements;

import com.CrossingGuardJoe.gui.GUI;
import com.CrossingGuardJoe.gui.LanternaGUI;
import com.CrossingGuardJoe.model.Position;
import com.CrossingGuardJoe.model.game.elements.Kid;
import com.CrossingGuardJoe.viewer.images.defined.KidImages;
import com.CrossingGuardJoe.viewer.images.defined.ToolImages;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class KidViewTest {
    private KidView kidView;
    private Kid kidMock;
    private GUI guiMock;

    @BeforeEach
    public void setUp() {
        kidMock = mock(Kid.class);
        guiMock = mock(LanternaGUI.class);
        kidView = new KidView();
    }

    @Test
    public void testDrawKidIsHitIsSelected() {
        when(kidMock.getIsHit()).thenReturn(true);
        when(kidMock.getPosition()).thenReturn(new Position(10,10));

        kidView.draw(kidMock, guiMock);

        verify(guiMock, times(1)).drawImage(kidMock.getPosition(), KidImages.getKidHitImage());
    }

    @Test
    public void testDrawKidIsNotHitIsSelectedAndIsWalkingStateFirstHalf() {
        when(kidMock.getIsHit()).thenReturn(false);
        when(kidMock.isSelected()).thenReturn(true);
        when(kidMock.getWalkingState()).thenReturn(true);
        when(kidMock.isFirstHalfOfMovement()).thenReturn(true);
        when(kidMock.getPosition()).thenReturn(new Position(10,10));

        kidView.draw(kidMock, guiMock);

        verify(guiMock, times(1)).drawImage(new Position(kidMock.getPosition().getX() + 7, kidMock.getPosition().getY() - 20), ToolImages.getArrowDownImage());
        verify(guiMock, times(1)).drawImage(kidMock.getPosition(), KidImages.getKidWalkImage());
        verify(kidMock, times(1)).setFirstHalfOfMovement(false);
    }

    @Test
    public void testDrawKidIsNotHitIsSelectedAndIsWalkingStateSecondHalf() {
        when(kidMock.getIsHit()).thenReturn(false);
        when(kidMock.isSelected()).thenReturn(true);
        when(kidMock.getWalkingState()).thenReturn(true);
        when(kidMock.isFirstHalfOfMovement()).thenReturn(false);
        when(kidMock.getPosition()).thenReturn(new Position(10,10));

        kidView.draw(kidMock, guiMock);

        verify(guiMock, times(1)).drawImage(new Position(kidMock.getPosition().getX() + 7, kidMock.getPosition().getY() - 20), ToolImages.getArrowDownImage());
        verify(guiMock, times(1)).drawImage(kidMock.getPosition(), KidImages.getKidStandImage());
        verify(kidMock, times(1)).setFirstHalfOfMovement(true);
    }

    @Test
    public void testDrawKidIsNotHitNotSelectedAndNotWalkingState() {
        when(kidMock.getIsHit()).thenReturn(false);
        when(kidMock.isSelected()).thenReturn(false);
        when(kidMock.getWalkingState()).thenReturn(false);
        when(kidMock.getPosition()).thenReturn(new Position(10,10));

        kidView.draw(kidMock, guiMock);

        verify(guiMock, times(1)).drawImage(kidMock.getPosition(), KidImages.getKidStandImage());
    }
}
