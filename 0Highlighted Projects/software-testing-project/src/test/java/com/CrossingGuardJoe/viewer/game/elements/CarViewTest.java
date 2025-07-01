package com.CrossingGuardJoe.viewer.game.elements;

import com.CrossingGuardJoe.gui.GUI;
import com.CrossingGuardJoe.gui.LanternaGUI;
import com.CrossingGuardJoe.model.game.elements.Car;
import com.CrossingGuardJoe.viewer.images.defined.CarImage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class CarViewTest {
    private CarView carView;
    private GUI lanternaGUIMock;

    @BeforeEach
    public void setUp() {
        lanternaGUIMock = mock(LanternaGUI.class);
        carView = new CarView();
    }

    @Test
    public void testDraw() {
        Car car = new Car(10, 10);
        carView.draw(car, lanternaGUIMock);
        verify(lanternaGUIMock, times(1)).drawImage(car.getPosition(), CarImage.getCarImage());
    }
}
