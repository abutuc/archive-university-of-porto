package com.CrossingGuardJoe.model.game.elements;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KidTest {
    private Kid kid;

    @BeforeEach
    public void setUp() {
        kid = new Kid(10,10);
    }

    @Test
    public void testIsFirstHalfOfMovement() {
        kid.setFirstHalfOfMovement(true);
        assertTrue(kid.isFirstHalfOfMovement());
    }

    @Test
    public void testIsNotFirstHalfOfMovement() {
        kid.setFirstHalfOfMovement(false);
        assertFalse(kid.isFirstHalfOfMovement());
    }

}
