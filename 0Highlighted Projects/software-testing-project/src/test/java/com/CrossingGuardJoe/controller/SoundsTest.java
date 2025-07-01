package com.CrossingGuardJoe.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


public class SoundsTest {
    private Sounds sounds;

    @BeforeEach
    public void setUp() {
        sounds = new Sounds("sounds/game/GAMEOVER.wav");
    }

    @AfterEach
    public void tearDown() {
        sounds = null;
    }

    @Test
    @Timeout(2)
    public void testPlayWithSoundNotRunning() {
        Clip clip = getClip();

        sounds.play(0.0f);
        sounds.stop();
        sounds.pause();

        assertEquals(clip.getFramePosition(), 0);
        clip.close();

    }

    @Test
    @Timeout(2)
    public void testSetValueWithNoSupportedControl() {
        Clip clip = mock(Clip.class);
        when(clip.isControlSupported(FloatControl.Type.MASTER_GAIN)).thenReturn(false);

        Sounds.setVolume(clip, 0f);

        verify(clip, times(0)).getControl(FloatControl.Type.MASTER_GAIN);
        clip.close();
    }

    private Clip getClip() {
        try {
            Field sound = Sounds.class.getDeclaredField("sound");
            sound.setAccessible(true);
            return (Clip) sound.get(sounds);
        } catch (NoSuchFieldException | IllegalAccessException e ) {
            throw new RuntimeException(e);
        }
    }
}
