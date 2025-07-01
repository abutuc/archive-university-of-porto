package com.CrossingGuardJoe.controller.game.elements;

import com.CrossingGuardJoe.Game;
import com.CrossingGuardJoe.controller.Sounds;
import com.CrossingGuardJoe.controller.SoundsController;
import com.CrossingGuardJoe.controller.game.AuxCheckRange;
import com.CrossingGuardJoe.gui.GUI;
import com.CrossingGuardJoe.model.Position;
import com.CrossingGuardJoe.model.game.Road;
import com.CrossingGuardJoe.model.game.elements.Car;
import com.CrossingGuardJoe.model.game.elements.Joe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

class JoeControllerTest {
    private JoeController joeController;

    @BeforeEach
    public void setUp() {
        Road roadMock = mock(Road.class);
        Joe joeMock = mock(Joe.class);
        when(roadMock.getJoe()).thenReturn(joeMock);
        joeController = new JoeController(roadMock);
    }


    @Test
    public void testMoveJoeLeftScenarios() {
        // Scenario 1: Joe moves left normally
        Joe joeMock = joeController.getModel().getJoe();
        Position initialPosition = new Position(100, 200);
        Position expectedPosition = new Position(94, 200); // 100 - JOE_STEP (6)
        when(joeMock.getPosition()).thenReturn(initialPosition);

        joeController.moveJoeLeft();

        verify(joeMock, times(1)).setPosition(expectedPosition);
        verify(joeMock, times(1)).startWalkingToLeft();

        // Reset mock for next scenario
        reset(joeMock);

        // Scenario 2: Joe can't go through min distance
        setJoeLastAction(GUI.ACTION.LEFT);
        Position minPosition = new Position(50, 200);
        when(joeMock.getPosition()).thenReturn(minPosition);

        joeController.moveJoeLeft();

        verify(joeMock, times(1)).stopWalking();
        assertEquals(getJoeLastAction(), GUI.ACTION.NONE);
    }


    @Test
    public void testMoveJoeRightScenarios() {
        Joe joeMock = joeController.getModel().getJoe();
        Position initialPosition = new Position(100, 200);
        Position expectedPosition = new Position(106, 200); // 100 + JOE_STEP (6)

        when(joeMock.getPosition()).thenReturn(initialPosition);

        joeController.moveJoeRight();

        verify(joeMock, times(1)).setPosition(expectedPosition);
        verify(joeMock, times(1)).startWalkingToRight();

        reset(joeMock);

        initialPosition = new Position(414, 200);

        when(joeMock.getPosition()).thenReturn(initialPosition);

        joeController.moveJoeRight();

        verify(joeMock, times(1)).stopWalking();
    }

    @Test
    public void testMoveJoeLeftHit() {
        SoundsController soundsControllerMock = mock(SoundsController.class);
        MockedStatic<SoundsController> soundsControllerMockStatic = mockStatic(SoundsController.class);

        soundsControllerMockStatic.when(SoundsController::getInstance).thenReturn(soundsControllerMock);
        Joe joeMock = joeController.getModel().getJoe();
        Position initialPosition = new Position(100, 200);
        Position expectedPosition = new Position(90, 200); // 100 - JOE_AFTER_HIT (10)

        setJoeLastAction(GUI.ACTION.LEFT);

        when(joeMock.getPosition()).thenReturn(initialPosition);

        joeController.moveJoeLeftHit();

        verify(joeMock).setPosition(expectedPosition);
        verify(joeMock).countHitPoints();
        verify(soundsControllerMock).play(Sounds.SFX.JOEHIT);
        assertEquals(getJoeLastAction(), GUI.ACTION.NONE);
        soundsControllerMockStatic.close();
    }

    @Test
    public void testMoveJoeRightHit() {
        SoundsController soundsControllerMock = mock(SoundsController.class);
        MockedStatic<SoundsController> soundsControllerMockStatic = mockStatic(SoundsController.class);

        soundsControllerMockStatic.when(SoundsController::getInstance).thenReturn(soundsControllerMock);
        Joe joeMock = joeController.getModel().getJoe();
        Position initialPosition = new Position(100, 200);
        Position expectedPosition = new Position(110, 200); // 100 + JOE_AFTER_HIT (10)

        setJoeLastAction(GUI.ACTION.LEFT);

        when(joeMock.getPosition()).thenReturn(initialPosition);

        joeController.moveJoeRightHit();

        verify(joeMock).setPosition(expectedPosition);
        verify(joeMock).countHitPoints();
        verify(soundsControllerMock).play(Sounds.SFX.JOEHIT);
        assertEquals(getJoeLastAction(), GUI.ACTION.NONE);
        soundsControllerMockStatic.close();
    }

    @Test
    public void testJoePassSign() {
        Joe joeMock = joeController.getModel().getJoe();
        joeController.joePassSign();

        verify(joeMock).startRaisingPassSign();
    }

    @Test
    public void testJoeStopSign() {
        Joe joeMock = joeController.getModel().getJoe();
        joeController.joeStopSign();

        verify(joeMock).startRaisingStopSign();
    }

    @Test
    public void testJoeNotWalking() {
        Joe joeMock = joeController.getModel().getJoe();
        joeController.joeNotWalking();

        verify(joeMock).stopWalking();
    }

    @Test
    public void testNextActionWithActionLeftAndLastActionRight() {
        Game gameMock = mock(Game.class);
        setJoeLastAction(GUI.ACTION.RIGHT);

        joeController.nextAction(gameMock, GUI.ACTION.LEFT, System.currentTimeMillis());

        assertEquals(getJoeLastAction(), GUI.ACTION.NONE);
    }

    @Test
    public void testNextActionWithActionRightAndLastActionLeft() {
        Game gameMock = mock(Game.class);
        setJoeLastAction(GUI.ACTION.LEFT);

        joeController.nextAction(gameMock, GUI.ACTION.RIGHT, System.currentTimeMillis());

        assertEquals(getJoeLastAction(), GUI.ACTION.NONE);
    }

    @Test
    public void testNextActionWithActionDown() {
        SoundsController soundsControllerMock = mock(SoundsController.class);
        MockedStatic<SoundsController> soundsControllerMockStatic = mockStatic(SoundsController.class);

        soundsControllerMockStatic.when(SoundsController::getInstance).thenReturn(soundsControllerMock);
        Game gameMock = mock(Game.class);
        Joe joeMock = joeController.getModel().getJoe();

        joeController.nextAction(gameMock, GUI.ACTION.DOWN, System.currentTimeMillis());

        soundsControllerMockStatic.verify(() -> SoundsController.playRandom(Sounds.SFX.JOEPASS1, Sounds.SFX.JOEPASS2));
        verify(joeMock).startRaisingPassSign();
        soundsControllerMockStatic.close();
    }

    @Test
    public void testNextActionWithActionUp() {
        SoundsController soundsControllerMock = mock(SoundsController.class);
        MockedStatic<SoundsController> soundsControllerMockStatic = mockStatic(SoundsController.class);

        soundsControllerMockStatic.when(SoundsController::getInstance).thenReturn(soundsControllerMock);
        Game gameMock = mock(Game.class);
        Joe joeMock = joeController.getModel().getJoe();

        joeController.nextAction(gameMock, GUI.ACTION.UP, System.currentTimeMillis());

        verify(soundsControllerMock).play(Sounds.SFX.JOESTOP);
        verify(joeMock).startRaisingStopSign();
        soundsControllerMockStatic.close();
    }

    @Test
    public void testNextActionWithActionLeft() {
        Game gameMock = mock(Game.class);
        Joe joeMock = joeController.getModel().getJoe();
        Position initialPosition = new Position(100, 200);
        when(joeMock.getPosition()).thenReturn(initialPosition);

        joeController.nextAction(gameMock, GUI.ACTION.LEFT, System.currentTimeMillis());

        verify(joeMock).startWalkingToLeft();
    }

    @Test
    public void testNextActionWithActionRight() {
        Game gameMock = mock(Game.class);
        Joe joeMock = joeController.getModel().getJoe();
        Position initialPosition = new Position(100, 200);
        when(joeMock.getPosition()).thenReturn(initialPosition);

        joeController.nextAction(gameMock, GUI.ACTION.RIGHT, System.currentTimeMillis());

        verify(joeMock).startWalkingToRight();
    }

    @Test
    public void testNextActionWithActionNone() {
        Game gameMock = mock(Game.class);
        Joe joeMock = joeController.getModel().getJoe();
        Road roadMock = joeController.getModel();
        List<Car> cars = List.of(mock(Car.class));

        Position initialPosition = new Position(100, 200);
        when(joeMock.getPosition()).thenReturn(initialPosition);

        when(roadMock.getCars()).thenReturn(cars);

        MockedStatic<AuxCheckRange> auxCheckRangeMockedStatic = mockStatic(AuxCheckRange.class);

        joeController.nextAction(gameMock, GUI.ACTION.NONE, System.currentTimeMillis());

        verify(joeMock).stopWalking();

        auxCheckRangeMockedStatic.verify(() -> AuxCheckRange.isInRangeLeftCarJoe(any(), any()));

        auxCheckRangeMockedStatic.close();

    }

    @Test
    public void testNextActionWithActionNoneAndDifferentLastAction() {
        Game gameMock = mock(Game.class);
        Joe joeMock = joeController.getModel().getJoe();
        setJoeLastAction(GUI.ACTION.UP);

        joeController.nextAction(gameMock, GUI.ACTION.NONE, System.currentTimeMillis());

        verify(joeMock).startRaisingStopSign();
    }

    @Test
    public void testJoeActionWithNonSupportedChar() {
        Joe joeMock = joeController.getModel().getJoe();
        joeController.JoeAction(new Position(100, 200), 'x');
        verifyNoInteractions(joeMock);
    }

    @Test
    public void testCheckCollisionsWhenIsInRangeLeftCarJoe() {
        Joe joeMock = joeController.getModel().getJoe();
        Road roadMock = joeController.getModel();
        List<Car> cars = List.of(mock(Car.class));

        Position initialPosition = new Position(100, 200);
        when(joeMock.getPosition()).thenReturn(initialPosition);

        when(roadMock.getCars()).thenReturn(cars);

        MockedStatic<AuxCheckRange> auxCheckRangeMockedStatic = mockStatic(AuxCheckRange.class);

        auxCheckRangeMockedStatic.when(() -> AuxCheckRange.isInRangeLeftCarJoe(cars.getFirst(), joeMock)).thenReturn(true);

        joeController.checkCollisions();

        verify(joeMock).isHitLeft();
        verify(joeMock).countHitPoints();
        auxCheckRangeMockedStatic.close();
    }

    @Test
    public void testCheckCollisionsWhenIsInRangeRightCarJoe() {
        Joe joeMock = joeController.getModel().getJoe();
        Road roadMock = joeController.getModel();
        List<Car> cars = List.of(mock(Car.class));

        Position initialPosition = new Position(100, 200);
        when(joeMock.getPosition()).thenReturn(initialPosition);

        when(roadMock.getCars()).thenReturn(cars);

        MockedStatic<AuxCheckRange> auxCheckRangeMockedStatic = mockStatic(AuxCheckRange.class);

        auxCheckRangeMockedStatic.when(() -> AuxCheckRange.isInRangeLeftCarJoe(cars.getFirst(), joeMock)).thenReturn(false);
        auxCheckRangeMockedStatic.when(() -> AuxCheckRange.isInRangeRightCarJoe(cars.getFirst(), joeMock)).thenReturn(true);

        joeController.checkCollisions();

        verify(joeMock).isHitRight();
        verify(joeMock).countHitPoints();
        auxCheckRangeMockedStatic.close();
    }

    @Test
    public void testCheckCollisionsWhenJoeNotInRange() {
        Joe joeMock = joeController.getModel().getJoe();
        Road roadMock = joeController.getModel();
        List<Car> cars = List.of(mock(Car.class));

        Position initialPosition = new Position(100, 200);
        when(joeMock.getPosition()).thenReturn(initialPosition);

        when(roadMock.getCars()).thenReturn(cars);

        MockedStatic<AuxCheckRange> auxCheckRangeMockedStatic = mockStatic(AuxCheckRange.class);

        auxCheckRangeMockedStatic.when(() -> AuxCheckRange.isInRangeLeftCarJoe(cars.getFirst(), joeMock)).thenReturn(false);
        auxCheckRangeMockedStatic.when(() -> AuxCheckRange.isInRangeRightCarJoe(cars.getFirst(), joeMock)).thenReturn(false);

        joeController.checkCollisions();

        verify(joeMock, never()).isHitRight();
        verify(joeMock, never()).isHitLeft();
        auxCheckRangeMockedStatic.close();
    }

    @Test
    public void testCanGoThrough(){
        assertTrue(invokeCanGoThroughMethod(joeController, new Position(50, 10)));
        assertTrue(invokeCanGoThroughMethod(joeController, new Position(414, 10)));
    }

    private Boolean invokeCanGoThroughMethod(JoeController joeController, Position position) {
        try {
            Method method = JoeController.class.getDeclaredMethod("canGoThrough", Position.class);
            method.setAccessible(true);
            return (Boolean) method.invoke(joeController, position);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private void setJoeLastAction(GUI.ACTION action) {
        try {
            Field lastAction = joeController.getClass().getDeclaredField("lastAction");
            lastAction.setAccessible(true);
            lastAction.set(joeController, action);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private GUI.ACTION getJoeLastAction() {
        try {
            Field lastAction = joeController.getClass().getDeclaredField("lastAction");
            lastAction.setAccessible(true);
            return (GUI.ACTION) lastAction.get(joeController);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
