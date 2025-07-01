package com.CrossingGuardJoe.viewer.game.elements;

import com.CrossingGuardJoe.gui.GUI;
import com.CrossingGuardJoe.gui.LanternaGUI;
import com.CrossingGuardJoe.model.Position;
import com.CrossingGuardJoe.model.game.elements.Joe;
import com.CrossingGuardJoe.viewer.images.defined.JoeImages;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class JoeViewTest {
    private JoeView joeView;
    private Joe joeMock;
    private GUI guiMock;

    @BeforeEach
    public void setUp() {
        joeMock = mock(Joe.class);
        guiMock = mock(LanternaGUI.class);

        joeView = new JoeView();
    }

    @Test
    public void testDrawJoeIsHitLeft() {
        when(joeMock.getIsHit()).thenReturn(true);
        when(joeMock.getHitLeft()).thenReturn(true);
        when(joeMock.getPosition()).thenReturn(new Position(10, 10));

        joeView.draw(joeMock, guiMock);

        verify(guiMock, times(1)).drawImage(joeMock.getPosition(), JoeImages.getJoeHitleftImage());
        verify(joeMock, times(1)).isNotHit();
    }

    @Test
    public void testDrawJoeIsHitRight() {
        when(joeMock.getIsHit()).thenReturn(true);
        when(joeMock.getHitLeft()).thenReturn(false);
        when(joeMock.getPosition()).thenReturn(new Position(10, 10));

        joeView.draw(joeMock, guiMock);

        verify(guiMock, times(1)).drawImage(joeMock.getPosition(), JoeImages.getJoeHitrightImage());
        verify(joeMock, times(1)).isNotHit();
    }

    @Test
    public void testDrawJoeIsWalkingFirstHalfWalkingToLeft() {
        when(joeMock.getIsHit()).thenReturn(false);
        when(joeMock.getIsWalkingState()).thenReturn(true);
        when(joeMock.isFirstHalfOfMovement()).thenReturn(true);
        when(joeMock.getIsWalkingToLeft()).thenReturn(true);
        when(joeMock.getPosition()).thenReturn(new Position(10, 10));

        joeView.draw(joeMock, guiMock);

        verify(guiMock, times(1)).drawImage(joeMock.getPosition(), JoeImages.getJoeWalkleftImage());
        verify(joeMock, times(1)).setFirstHalfOfMovement(false);
    }

    @Test
    public void testDrawJoeIsWalkingFirstHalfWalkingToRight() {
        when(joeMock.getIsHit()).thenReturn(false);
        when(joeMock.getIsWalkingState()).thenReturn(true);
        when(joeMock.isFirstHalfOfMovement()).thenReturn(true);
        when(joeMock.getIsWalkingToLeft()).thenReturn(false);
        when(joeMock.getPosition()).thenReturn(new Position(10, 10));

        joeView.draw(joeMock, guiMock);

        verify(guiMock, times(1)).drawImage(joeMock.getPosition(), JoeImages.getJoeWalkrightImage());
        verify(joeMock, times(1)).setFirstHalfOfMovement(false);
    }

    @Test
    public void testDrawJoeIsWalkingSecondHalf() {
        when(joeMock.getIsHit()).thenReturn(false);
        when(joeMock.getIsWalkingState()).thenReturn(true);
        when(joeMock.isFirstHalfOfMovement()).thenReturn(false);
        when(joeMock.getPosition()).thenReturn(new Position(10, 10));

        joeView.draw(joeMock, guiMock);

        verify(guiMock, times(1)).drawImage(joeMock.getPosition(), JoeImages.getJoeWalksecondhalfImage());
        verify(joeMock, times(1)).setFirstHalfOfMovement(true);
    }

    @Test
    public void testDrawJoeIsRaisingStopSign() {
        when(joeMock.getIsHit()).thenReturn(false);
        when(joeMock.getIsWalkingState()).thenReturn(false);
        when(joeMock.getIsRaisingStopSign()).thenReturn(true);
        when(joeMock.getPosition()).thenReturn(new Position(10, 10));

        joeView.draw(joeMock, guiMock);

        verify(guiMock, times(1)).drawImage(joeMock.getPosition(), JoeImages.getJoeStopImage());
    }

    @Test
    public void testDrawJoeIsRaisingPassSign() {
        when(joeMock.getIsHit()).thenReturn(false);
        when(joeMock.getIsWalkingState()).thenReturn(false);
        when(joeMock.getIsRaisingStopSign()).thenReturn(false);
        when(joeMock.getIsPassSign()).thenReturn(true);
        when(joeMock.getPosition()).thenReturn(new Position(10, 10));

        joeView.draw(joeMock, guiMock);

        verify(guiMock, times(1)).drawImage(joeMock.getPosition(), JoeImages.getJoePassImage());
    }

    @Test
    public void testDrawJoeIsStanding() {
        when(joeMock.getIsHit()).thenReturn(false);
        when(joeMock.getIsWalkingState()).thenReturn(false);
        when(joeMock.getIsRaisingStopSign()).thenReturn(false);
        when(joeMock.getIsPassSign()).thenReturn(false);
        when(joeMock.getPosition()).thenReturn(new Position(10, 10));

        joeView.draw(joeMock, guiMock);

        verify(guiMock, times(1)).drawImage(joeMock.getPosition(), JoeImages.getJoeStandImage());
    }


}
