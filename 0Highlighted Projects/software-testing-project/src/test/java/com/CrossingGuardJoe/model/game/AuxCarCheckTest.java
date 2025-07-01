package com.CrossingGuardJoe.model.game;

import com.CrossingGuardJoe.model.game.elements.Car;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AuxCarCheckTest {

    @Test
    public void testIsAnyCarOverlapping() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(10, 10));
        assertTrue(AuxCarCheck.isAnyCarOverlapping(20, cars, 30));
        assertFalse(AuxCarCheck.isAnyCarOverlapping(20, cars, 10));
    }
}
