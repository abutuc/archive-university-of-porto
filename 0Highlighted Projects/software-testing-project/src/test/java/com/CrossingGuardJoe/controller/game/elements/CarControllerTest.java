package com.CrossingGuardJoe.controller.game.elements;

import com.CrossingGuardJoe.gui.GUI;
import com.CrossingGuardJoe.model.Position;
import com.CrossingGuardJoe.model.game.Road;
import com.CrossingGuardJoe.model.game.elements.Car;
import com.CrossingGuardJoe.Game;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.List;


import static org.mockito.Mockito.*;

class CarControllerTest {
    private CarController carController;

    @BeforeEach
    public void setUp() {
        Road roadMock = mock(Road.class);
        carController = new CarController(roadMock);
    }

    @Test
    public void testMoveCar() {
        Car carMock = mock(Car.class);
        Position initialPosition = new Position(10, 20);
        Position expectedPosition = new Position(10, 35);

        carController.moveCar(carMock, initialPosition);
        verify(carMock, times(1)).setPosition(expectedPosition);
    }

    @Test
    public void testNextActionWithMultipleScenarios() {
        long initialLastUpdateTime = getLastUpdateTimeFromController(carController);

        Car car1 = mock(Car.class);
        Car car2 = mock(Car.class);
        List<Car> cars = List.of(car1, car2);
        mockCars(cars);

        // Scenario 1: Time passed enough to move cars
        carController.nextAction(mock(Game.class), GUI.ACTION.NONE, initialLastUpdateTime + 2);
        verify(car1, times(1)).setPosition(new Position(5, 25));
        verify(car2, times(1)).setPosition(new Position(15, 35));

        // Scenario 2: Time not passed enough to move cars
        reset(car1, car2);
        carController.nextAction(mock(Game.class), GUI.ACTION.NONE, initialLastUpdateTime);
        verify(car1, never()).setPosition(any());
        verify(car2, never()).setPosition(any());
    }

    private void mockCars(List<Car> cars) {
        when(carController.getModel().getCars()).thenReturn(cars);
        when(cars.get(0).getPosition()).thenReturn(new Position(5, 10));
        when(cars.get(1).getPosition()).thenReturn(new Position(15, 20));
    }

    private long getLastUpdateTimeFromController(CarController carController) {
        try {
            Field lastUpdateTimeField = CarController.class.getDeclaredField("lastUpdateTime");
            lastUpdateTimeField.setAccessible(true);
            return lastUpdateTimeField.getLong(carController);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException("Failed to access lastUpdateTime field in CarController", e);
        }
    }

}



