package com.CrossingGuardJoe.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class SoundsControllerTest {
    private SoundsController soundsController;

    @BeforeEach
    public void setUp() {
        soundsController = SoundsController.getInstance();
    }

    @Test
    @Timeout(2)
    public void testPlay() {

        soundsController.play(Sounds.SFX.MENUBGM);
        soundsController.stop(Sounds.SFX.MENUBGM);

        soundsController.play(Sounds.SFX.GAMEBGM);
        soundsController.stop(Sounds.SFX.GAMEBGM);

        soundsController.play(Sounds.SFX.CUSTOMIZEBGM);
        soundsController.stop(Sounds.SFX.CUSTOMIZEBGM);

        soundsController.play(Sounds.SFX.INSTRUCTIONSBGM);
        soundsController.stop(Sounds.SFX.INSTRUCTIONSBGM);

        soundsController.play(Sounds.SFX.SELECT);
        soundsController.play(Sounds.SFX.ENTER);
        soundsController.play(Sounds.SFX.FLIPPAGE);
        soundsController.play(Sounds.SFX.LEVELUP);
        soundsController.play(Sounds.SFX.JOEPASS1);
        soundsController.play(Sounds.SFX.JOEPASS2);
        soundsController.play(Sounds.SFX.JOESTOP);
        soundsController.play(Sounds.SFX.JOEHIT);
        soundsController.play(Sounds.SFX.KIDWALK1);
        soundsController.play(Sounds.SFX.KIDSTOP1);
        soundsController.play(Sounds.SFX.KIDSTOP2);
        soundsController.play(Sounds.SFX.KIDHIT);
        soundsController.play(Sounds.SFX.KIDSCORE);
        soundsController.play(Sounds.SFX.CARBREAK);
        soundsController.play(Sounds.SFX.GAMEOVER);

        soundsController.play(Sounds.SFX.VICTORYBGM);
        soundsController.stop(Sounds.SFX.VICTORYBGM);

    }

    @Test
    @Timeout(2)
    public void testPause() {
        soundsController.pause(Sounds.SFX.GAMEBGM);
        soundsController.pause(Sounds.SFX.VICTORYBGM);
        soundsController.pause(Sounds.SFX.SELECT);
    }

    @Test
    @Timeout(2)
    public void testStop() {
        soundsController.stop(Sounds.SFX.CARBREAK);
        soundsController.stop(Sounds.SFX.SELECT);
    }

    @RepeatedTest(5)
    @Timeout(2)
    public void testPlayRandom() {
        SoundsController.playRandom(Sounds.SFX.SELECT, Sounds.SFX.LEVELUP);
    }

}
