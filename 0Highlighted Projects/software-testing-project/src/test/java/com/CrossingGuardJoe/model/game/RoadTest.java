package com.CrossingGuardJoe.model.game;

import com.CrossingGuardJoe.model.game.elements.Car;
import com.CrossingGuardJoe.model.game.elements.Joe;
import com.CrossingGuardJoe.model.game.elements.Kid;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RoadTest {
    private Road road;
    private Joe joe;

    @BeforeEach
    public void setUp() {
        joe = new Joe(10,10);
        road = new Road();
    }

    @Test
    public void testIsGameEnded() {
        assertFalse(road.isGameEnded());
    }

    @Test
    public void testIsGameEndedTrue(){
        setGameEnded(true);
        assertTrue(road.isGameEnded());
    }

    @Test
    public void testGetCurrentLevel() {
        assertEquals(road.getCurrentLevel(), 1);
    }

    @Test
    public void testLevelUpNormalCase() {
        road.levelUp();
        assertEquals(road.getCurrentLevel(), 2);
    }

    @Test
    public void testLevelUp() {
        setCurrentLevel(10);

        road.levelUp();

        assertEquals(road.getCurrentLevel(), 10);
        assertTrue(road.isGameEnded());
    }

    @Test
    public void testGetJoeNull() {
        assertNull(road.getJoe());
    }

    @Test
    public void testGetJoeNotNull() {
        road.setJoe(joe);
        assertEquals(road.getJoe(), joe);
    }

    @Test
    public void testGetKidsNull() {
        assertNull(road.getKids());
    }

    @Test
    public void testGetKidsNotNull() {
        List<Kid> kids = new ArrayList<>();
        kids.add(new Kid(10,10));
        road.setKids(kids);

        assertEquals(road.getKids(), kids);
    }

    @Test
    public void testGetCarsNull() {
        assertNull(road.getCars());
    }

    @Test
    public void testGetCarsNotNull() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(2,2));
        road.setCars(cars);

        assertEquals(road.getCars(), cars);
    }

    private void setCurrentLevel(int level) {
        try {
            Field currentLevel = Road.class.getDeclaredField("currentLevel");
            currentLevel.setAccessible(true);
            currentLevel.set(road, level);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private void setGameEnded(boolean gameEndedValue) {
        try {
            Field gameEnded = Road.class.getDeclaredField("gameEnded");
            gameEnded.setAccessible(true);
            gameEnded.set(road, gameEndedValue);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

}
