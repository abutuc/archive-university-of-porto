package com.CrossingGuardJoe.viewer.game;

import com.CrossingGuardJoe.gui.GUI;
import com.CrossingGuardJoe.gui.LanternaGUI;
import com.CrossingGuardJoe.model.Position;
import com.CrossingGuardJoe.model.game.Road;
import com.CrossingGuardJoe.model.game.elements.Car;
import com.CrossingGuardJoe.model.game.elements.Joe;
import com.CrossingGuardJoe.model.game.elements.Kid;
import com.CrossingGuardJoe.viewer.images.defined.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class GameViewerTest {
    private GameViewer gameViewer;
    private GUI guiMock;
    private Road roadMock;

    @BeforeEach
    public void setUp() {
        guiMock = mock(LanternaGUI.class);
        roadMock = mock(Road.class);

        List<Car> cars = new ArrayList<>();
        cars.add(new Car(10, 10));
        cars.add(new Car(2, 1));

        when(roadMock.getCars()).thenReturn(cars);

        Joe joe  = new Joe(10, 10);
        when(roadMock.getJoe()).thenReturn(joe);

        List<Kid> kids = new ArrayList<>();
        kids.add(new Kid(10, 10));
        kids.add(new Kid(3, 5));

        when(roadMock.getKids()).thenReturn(kids);

        gameViewer = new GameViewer(roadMock);

    }

    @Test
    public void testDrawElementsDrawRoad() {
        int ROAD_START_Y = 38;

        gameViewer.drawElements(guiMock);

        verify(guiMock, times(1)).setColorHexaCode("#C0BBB1");
        verify(guiMock, times(1)).fillRectangle(new Position(0, ROAD_START_Y),150, 500 - ROAD_START_Y);
        verify(guiMock, times(1)).fillRectangle(new Position(850, ROAD_START_Y), 150, 500 - ROAD_START_Y);

        int iniX = 167;
        for (int i = 0; i < 834 - iniX - 15; i += 24) {
            verify(guiMock, times(1)).fillRectangle(new Position(iniX + i, 368), 16, 50);
        }
        verify(guiMock, times(0)).fillRectangle(new Position(iniX + 672, 368), 16, 50);


        verify(guiMock, times(1)).fillRectangle(new Position(326, ROAD_START_Y), 4, 302);
        verify(guiMock, times(1)).fillRectangle(new Position(500, ROAD_START_Y), 4, 302);
        verify(guiMock, times(1)).fillRectangle(new Position(674, ROAD_START_Y), 4, 302);

        verify(guiMock, times(1)).setColorHexaCode("#3D3638");
        verify(guiMock, times(1)).fillRectangle(new Position(150, ROAD_START_Y), 2, 500 - ROAD_START_Y);
        verify(guiMock, times(1)).fillRectangle(new Position(154, ROAD_START_Y), 2, 500 - ROAD_START_Y);
        verify(guiMock, times(1)).fillRectangle(new Position(848, ROAD_START_Y), 2, 500 - ROAD_START_Y);
        verify(guiMock, times(1)).fillRectangle(new Position(844, ROAD_START_Y), 2, 500 - ROAD_START_Y);

        verify(guiMock, times(1)).drawImage(new Position(426, 258), RoadItemsImages.getSignalImage());
        verify(guiMock, times(1)).drawImage(new Position(55, 258), RoadItemsImages.getSignalImage());
    }

    @Test
    public void testDrawElements() {

        gameViewer.drawElements(guiMock);

        for (Car car : roadMock.getCars()) {
            verify(guiMock, times(1)).drawImage(car.getPosition(), CarImage.getCarImage());
        }

        verify(guiMock, times(1)).drawImage(roadMock.getJoe().getPosition(), JoeImages.getJoeStandImage());

        for (Kid kid : roadMock.getKids()) {
            verify(guiMock, times(1)).drawImage(kid.getPosition(), KidImages.getKidStandImage());
        }

        verify(guiMock, times(1)).drawImage(new Position(0, 0), HUDImages.getGameHudImage());
        verify(guiMock, times(1)).drawText(new Position(164, 10), roadMock.getJoe().getScore(), "#FFFFFF");

        int heartIniX = 246;
        for (int i = 0; i < roadMock.getJoe().getHearts(); i++) {
            verify(guiMock, times(1)).drawImage(new Position(heartIniX, 4), HUDImages.getHPImage());
            heartIniX += 25;
        }
        verify(guiMock, times(0)).drawImage(new Position(496, 4), HUDImages.getHPImage());

        verify(guiMock, times(1)).drawText(new Position(45, 10), roadMock.getCurrentLevel(), "#FFFFFF");

    }


}
