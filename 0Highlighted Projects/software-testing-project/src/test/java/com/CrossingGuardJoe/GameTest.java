package com.CrossingGuardJoe;

import com.CrossingGuardJoe.states.menu.MenuState;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.awt.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;


public class GameTest {
    private Game game;

    @BeforeEach
    public void setUp() throws IOException, URISyntaxException, FontFormatException {
        game = new Game();
    }

    @Test
    public void testPopState() {
        assertEquals(MenuState.class, game.getCurrentState().getClass());
        game.popState();
        assertNull(game.getCurrentState());
    }

    @Test
    public void testPopStateTwice() {
        assertEquals(MenuState.class, game.getCurrentState().getClass());
        game.popState();
        game.popState();
        assertNull(game.getCurrentState());
    }

    @Test
    @Timeout(2)
    public void testRun() throws NoSuchMethodException, InterruptedException {
        Method method = Game.class.getDeclaredMethod("run");
        method.setAccessible(true);

        Thread runThread = new Thread(() -> {
            try {
                method.invoke(game); // Invoke the `run` method
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        });

        runThread.start();
        Thread.sleep(200);
        game.popState();
        runThread.join();

    }
}
