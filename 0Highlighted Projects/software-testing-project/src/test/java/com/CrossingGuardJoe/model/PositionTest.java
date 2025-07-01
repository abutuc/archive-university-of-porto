package com.CrossingGuardJoe.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PositionTest {
    Position position1;

    @BeforeEach
    public void setUp() {
        position1 = new Position(2, 2);
    }

    @Test
    public void testPositionNotEqualsOnY() {
        assertNotEquals(position1, new Position(2, 4));
    }

    @Test
    public void testPositionNotEqualsOnX() {
        assertNotEquals(position1, new Position(3, 2));
    }

    @Test
    public void testPositionEqualsSelf() {
        assertEquals(position1, position1);
    }

    @Test
    public void testPositionEqualOtherPosition() {
        assertEquals(position1, new Position(2, 2));
    }

    @Test
    public void testPositionNotEqualsAnotherObject() {
        assertNotEquals(position1, "String");
    }

    @Test
    public void testHashCode() {
        assertNotEquals(0, position1.hashCode());
    }
}
