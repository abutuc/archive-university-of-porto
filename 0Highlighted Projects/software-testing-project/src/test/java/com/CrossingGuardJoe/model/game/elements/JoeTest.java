package com.CrossingGuardJoe.model.game.elements;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

public class JoeTest {
    private Joe joe;

    @BeforeEach
    public void setUp() {
        joe  = new Joe(10, 10);
    }

    @Test
    public void testGetScore() {
        joe.addScore(1);
        assertEquals(joe.getScore(), 1);
    }

    @Test
    public void testAddScore() {
        joe.addScore(5);
        assertEquals(joe.getScore(), 5);
    }

    @Test
    public void testGetHearts() {
        assertEquals(joe.getHearts(), 10);
    }

    @Test
    public void testRemoveHeartNormalCase() {
        joe.removeHeart();
        assertEquals(joe.getHearts(), 9);
    }

    @Test
    public void testRemoveHeart0Hearts() {
        setJoeHearts(0);
        joe.removeHeart();
        assertEquals(joe.getHearts(), 0);
    }

    @Test
    public void testGetIsHitDefault() {
        assertFalse(joe.getIsHit());
    }

    @Test
    public void testGetIsHitWhenItIsHit() {
        joe.isHitLeft();
        assertTrue(joe.getIsHit());
    }

    @Test
    public void testGetIsHitLeftButItWasHitRight() {
        joe.isHitRight();
        assertFalse(joe.getHitLeft());
    }

    @Test
    public void testGetIsHitLeftItIsHit() {
        joe.isHitLeft();
        assertTrue(joe.getHitLeft());
    }

    @Test
    public void testGetIsWalkingState() {
        assertFalse(joe.getIsWalkingState());
    }

    @Test
    public void testGetIsWalkingStateTrue() {
        joe.startWalkingToLeft();
        assertTrue(joe.getIsWalkingState());
    }

    @Test
    public void testGetIsWalkingToTheLeft() {
        joe.startWalkingToRight();
        assertFalse(joe.getIsWalkingToLeft());
    }

    @Test
    public void testGetIsWalkingToTheLeftTrue() {
        setIsWalkingToTheLeft(true);

        joe.startWalkingToLeft();
        assertTrue(joe.getIsWalkingToLeft());
    }

    @Test
    public void testGetIsRaisingStopSign() {
        joe.startRaisingStopSign();
        assertTrue(joe.getIsRaisingStopSign());
    }

    @Test
    public void testGetIsRaisingStopSignFalse() {
        joe.startRaisingPassSign();
        assertFalse(joe.getIsRaisingStopSign());
    }

    @Test
    public void testGetIsPassSign() {
        joe.startRaisingPassSign();
        assertTrue(joe.getIsPassSign());
    }

    @Test
    public void testGetIsPassSignFalse() {
        joe.startRaisingStopSign();
        assertFalse(joe.getIsPassSign());
    }

    @Test
    public void testIsFirstHalfOfMovement() {
        joe.setFirstHalfOfMovement(false);
        assertFalse(joe.isFirstHalfOfMovement());
    }

    @Test
    public void testIsFirstHalfOfMovementTrue() {
        joe.setFirstHalfOfMovement(true);
        assertTrue(joe.isFirstHalfOfMovement());
    }

    @Test
    public void testCountHitPointsWhenScoreNegative() {
        setScoreField(-1);

        joe.countHitPoints();

        assertEquals(joe.getScore(), -1);
    }

    @Test
    public void testCountHitPointsWhenScoreZero() {
        joe.countHitPoints();

        assertEquals(joe.getScore(), 0);
    }

    @Test
    public void testCountHitPointsWhenScoreIsBiggerThanZero() {
        joe.addScore(10);

        joe.countHitPoints();

        assertEquals(joe.getScore(), 8);
    }

    private void setJoeHearts(int numberOfHearts) {
        try {
            Field hearts = Joe.class.getDeclaredField("Hearts");
            hearts.setAccessible(true);
            hearts.set(joe, numberOfHearts);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private void setScoreField(int score) {
        try {
            Field scoreField = Joe.class.getDeclaredField("Score");
            scoreField.setAccessible(true);
            scoreField.set(joe, score);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private void setIsWalkingToTheLeft(boolean isWalkingToTheLeftValue) {
        try {
            Field isWalkingToTheLeft = Joe.class.getDeclaredField("isWalkingToLeft");
            isWalkingToTheLeft.setAccessible(true);
            isWalkingToTheLeft.set(joe, isWalkingToTheLeftValue);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

}
