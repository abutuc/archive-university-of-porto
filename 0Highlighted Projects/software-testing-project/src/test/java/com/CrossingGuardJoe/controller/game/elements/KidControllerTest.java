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
import com.CrossingGuardJoe.model.game.elements.Kid;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.MockedStatic;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class KidControllerTest {
    private KidController kidController;
    private Road roadMock;
    private Kid kid;
    private Joe joeMock;
    private Game gameMock;
    private SoundsController soundsControllerMock;
    private MockedStatic<SoundsController> soundsControllerMockStatic;

    @BeforeEach
    public void setUp() {
        roadMock = mock(Road.class);
        kid = new Kid(100, 50);
        joeMock = mock(Joe.class);
        gameMock = mock(Game.class);
        soundsControllerMock = mock(SoundsController.class);
        soundsControllerMockStatic = mockStatic(SoundsController.class);

        soundsControllerMockStatic.when(SoundsController::getInstance).thenReturn(soundsControllerMock);
        when(roadMock.getJoe()).thenReturn(joeMock);
        kidController = new KidController(roadMock);
    }

    @AfterEach
    public void tearDown() {
        soundsControllerMockStatic.close();
    }

    @Test
    public void testNextAction() throws NoSuchFieldException, IllegalAccessException {
        List<Kid> kids = new ArrayList<>();
        kids.add(kid);

        when(roadMock.getKids()).thenReturn(kids);

        MockedStatic<AuxCheckRange> auxCheckRangeMockedStatic = mockStatic(AuxCheckRange.class);

        auxCheckRangeMockedStatic.when(() -> AuxCheckRange.isInRangeJoeKid(joeMock, kids.getFirst())).thenReturn(true);

        when(joeMock.getIsRaisingStopSign()).thenReturn(false);

        kidController.nextAction(gameMock, GUI.ACTION.DOWN, System.currentTimeMillis() + 2);

        assertTrue(kid.getWalkingState());
        verify(soundsControllerMock).play(Sounds.SFX.KIDWALK1);

        Field sentKids = kidController.getClass().getDeclaredField("sentKids");
        sentKids.setAccessible(true);
        assertEquals(sentKids.get(kidController), kids);

        assertEquals(kid.getPosition(), new Position(97, 50));

        auxCheckRangeMockedStatic.close();
    }

    @Test
    public void testNextActionWhenNotInRangeAndNotBeingSelectedKid() {
        List<Kid> kids = new ArrayList<>();
        kids.add(kid);
        kid.setSelected();
        when(roadMock.getKids()).thenReturn(kids);

        MockedStatic<AuxCheckRange> auxCheckRangeMockedStatic = mockStatic(AuxCheckRange.class);

        auxCheckRangeMockedStatic.when(() -> AuxCheckRange.isInRangeJoeKid(joeMock, kids.getFirst())).thenReturn(false);

        when(joeMock.getIsRaisingStopSign()).thenReturn(false);

        kidController.nextAction(gameMock, GUI.ACTION.DOWN, System.currentTimeMillis() - 100);

        assertFalse(kid.getWalkingState());
        assertFalse(kid.isSelected());
        assertEquals(kid.getPosition(), new Position(100, 50));
        verify(roadMock, times(1)).getCars();
        verify(roadMock, times(5)).getKids();

        verify(soundsControllerMock, times(1)).play(Sounds.SFX.GAMEBGM);

        auxCheckRangeMockedStatic.close();
    }

    @Test
    public void testNextActionWhenNotPassedPointAndNotBeingSelectedKid() {
        kid = new Kid(90, 50);
        List<Kid> kids = new ArrayList<>();
        kids.add(kid);

        when(roadMock.getKids()).thenReturn(kids);

        MockedStatic<AuxCheckRange> auxCheckRangeMockedStatic = mockStatic(AuxCheckRange.class);

        auxCheckRangeMockedStatic.when(() -> AuxCheckRange.isInRangeJoeKid(joeMock, kids.getFirst())).thenReturn(true);

        when(joeMock.getIsRaisingStopSign()).thenReturn(false);

        kidController.nextAction(gameMock, GUI.ACTION.DOWN, System.currentTimeMillis() - 100);

        assertFalse(kid.getWalkingState());

        assertEquals(kid.getPosition(), new Position(90, 50));

        auxCheckRangeMockedStatic.close();
    }

    @Test
    public void testNextActionWhenActionUp() {
        kid.setWalking();
        List<Kid> kids = new ArrayList<>();
        kids.add(kid);

        when(roadMock.getKids()).thenReturn(kids);

        MockedStatic<AuxCheckRange> auxCheckRangeMockedStatic = mockStatic(AuxCheckRange.class);

        auxCheckRangeMockedStatic.when(() -> AuxCheckRange.isInRangeJoeKid(joeMock, kids.getFirst())).thenReturn(true);

        kidController.nextAction(gameMock, GUI.ACTION.UP, System.currentTimeMillis() - 100);

        assertFalse(kid.getWalkingState());
        soundsControllerMockStatic.verify(() -> SoundsController.playRandom(Sounds.SFX.KIDSTOP1, Sounds.SFX.KIDSTOP2));

        auxCheckRangeMockedStatic.close();
    }

    @Test
    public void testNextActionWhenActionUpAndNotInRange() {
        kid.setWalking();
        List<Kid> kids = new ArrayList<>();
        kids.add(kid);

        when(roadMock.getKids()).thenReturn(kids);

        MockedStatic<AuxCheckRange> auxCheckRangeMockedStatic = mockStatic(AuxCheckRange.class);

        auxCheckRangeMockedStatic.when(() -> AuxCheckRange.isInRangeJoeKid(joeMock, kids.getFirst())).thenReturn(false);

        kidController.nextAction(gameMock, GUI.ACTION.UP, System.currentTimeMillis() - 100);

        assertTrue(kid.getWalkingState());
        soundsControllerMockStatic.verify(() -> SoundsController.playRandom(Sounds.SFX.KIDSTOP1, Sounds.SFX.KIDSTOP2), never());

        auxCheckRangeMockedStatic.close();
    }

    @Test
    public void testNextActionWhenActionUpInRangeButNotInWalkingState() {
        List<Kid> kids = new ArrayList<>();
        kids.add(kid);

        when(roadMock.getKids()).thenReturn(kids);

        MockedStatic<AuxCheckRange> auxCheckRangeMockedStatic = mockStatic(AuxCheckRange.class);

        auxCheckRangeMockedStatic.when(() -> AuxCheckRange.isInRangeJoeKid(joeMock, kids.getFirst())).thenReturn(true);

        kidController.nextAction(gameMock, GUI.ACTION.UP, System.currentTimeMillis() - 100);

        assertFalse(kid.getWalkingState());
        soundsControllerMockStatic.verify(() -> SoundsController.playRandom(Sounds.SFX.KIDSTOP1, Sounds.SFX.KIDSTOP2), never());

        auxCheckRangeMockedStatic.close();
    }

    @Test
    public void testNextActionWhenNoKids() {
        List<Kid> kids = new ArrayList<>();

        when(roadMock.getKids()).thenReturn(kids);

        MockedStatic<AuxCheckRange> auxCheckRangeMockedStatic = mockStatic(AuxCheckRange.class);

        kidController.nextAction(gameMock, GUI.ACTION.UP, System.currentTimeMillis() + 2);

        auxCheckRangeMockedStatic.verify(() -> AuxCheckRange.isInRangeJoeKid(any(), any()), never());

        auxCheckRangeMockedStatic.close();
    }

    @Test
    public void testNextActionDownWhenInRangeButSelectedKidIsHit() throws NoSuchFieldException, IllegalAccessException {
        List<Kid> kids = new ArrayList<>();
        kids.add(kid);
        kid.isHit();
        when(roadMock.getKids()).thenReturn(kids);

        MockedStatic<AuxCheckRange> auxCheckRangeMockedStatic = mockStatic(AuxCheckRange.class);

        auxCheckRangeMockedStatic.when(() -> AuxCheckRange.isInRangeJoeKid(joeMock, kids.getFirst())).thenReturn(true);

        when(joeMock.getIsRaisingStopSign()).thenReturn(false);

        kidController.nextAction(gameMock, GUI.ACTION.DOWN, System.currentTimeMillis() + 2);

        assertFalse(kid.getWalkingState());
        verify(soundsControllerMock, never()).play(Sounds.SFX.KIDWALK1);

        Field sentKids = kidController.getClass().getDeclaredField("sentKids");
        sentKids.setAccessible(true);
        assertEquals(sentKids.get(kidController), new ArrayList<>());

        assertEquals(kid.getPosition(), new Position(100, 50));

        auxCheckRangeMockedStatic.close();
    }

    @Test
    public void testNextActionDownWhenInRangeIsNotHitButCannotContinueWalk() throws NoSuchFieldException, IllegalAccessException {
        List<Kid> kids = new ArrayList<>();
        kids.add(kid);
        kids.add(new Kid(110,10));

        when(roadMock.getKids()).thenReturn(kids);

        MockedStatic<AuxCheckRange> auxCheckRangeMockedStatic = mockStatic(AuxCheckRange.class);

        auxCheckRangeMockedStatic.when(() -> AuxCheckRange.isInRangeJoeKid(joeMock, kids.getFirst())).thenReturn(false);
        auxCheckRangeMockedStatic.when(() -> AuxCheckRange.isInRangeJoeKid(joeMock, kids.get(1))).thenReturn(true);


        when(joeMock.getIsRaisingStopSign()).thenReturn(false);

        kidController.nextAction(gameMock, GUI.ACTION.DOWN, System.currentTimeMillis() - 100);

        assertTrue(kids.get(1).isSelected());
        assertFalse(kids.get(1).getWalkingState());
        verify(soundsControllerMock, never()).play(Sounds.SFX.KIDWALK1);

        auxCheckRangeMockedStatic.close();
    }

    @Test
    public void testNextActionWithAlreadySentKid() throws NoSuchFieldException, IllegalAccessException {
        List<Kid> kids = new ArrayList<>();
        kids.add(kid);
        kids.add(new Kid(111,10));
        kids.get(1).setWalking();
        kids.get(1).addMovesInQueueLeft(3);

        Field sentKids = kidController.getClass().getDeclaredField("sentKids");
        sentKids.setAccessible(true);

        if (sentKids.get(kidController) instanceof List) {
            ((List) sentKids.get(kidController)).add(kids.get(0));
            ((List) sentKids.get(kidController)).add(kids.get(1));
        }

        when(roadMock.getKids()).thenReturn(kids);

        MockedStatic<AuxCheckRange> auxCheckRangeMockedStatic = mockStatic(AuxCheckRange.class);

        auxCheckRangeMockedStatic.when(() -> AuxCheckRange.isInRangeJoeKid(joeMock, kids.getFirst())).thenReturn(true);
        auxCheckRangeMockedStatic.when(() -> AuxCheckRange.isInRangeJoeKid(joeMock, kids.get(1))).thenReturn(false);


        when(joeMock.getIsRaisingStopSign()).thenReturn(false);

        kidController.nextAction(gameMock, GUI.ACTION.DOWN, System.currentTimeMillis() + 2);

        assertFalse(kids.get(1).getWalkingState());
        verify(soundsControllerMock, times(1)).play(Sounds.SFX.KIDWALK1);

        assertEquals(sentKids.get(kidController), kids);

        assertEquals(kid.getPosition(), new Position(100, 50));

        auxCheckRangeMockedStatic.close();
    }

    @Test
    public void testNextActionWithNextKidMoveInQueue() throws NoSuchFieldException, IllegalAccessException {
        List<Kid> kids = new ArrayList<>();
        kids.add(kid);
        kids.add(new Kid(111,10));
        kids.get(1).setWalking();

        when(roadMock.getKids()).thenReturn(kids);

        MockedStatic<AuxCheckRange> auxCheckRangeMockedStatic = mockStatic(AuxCheckRange.class);

        auxCheckRangeMockedStatic.when(() -> AuxCheckRange.isInRangeJoeKid(joeMock, kids.getFirst())).thenReturn(true);
        auxCheckRangeMockedStatic.when(() -> AuxCheckRange.isInRangeJoeKid(joeMock, kids.get(1))).thenReturn(false);


        when(joeMock.getIsRaisingStopSign()).thenReturn(false);

        kidController.nextAction(gameMock, GUI.ACTION.DOWN, System.currentTimeMillis() - 100);

        assertFalse(kids.get(1).getWalkingState());
        assertEquals(kids.get(1).getMovesInQueueLeft(), 3);
        verify(soundsControllerMock, times(1)).play(Sounds.SFX.KIDWALK1);

        assertEquals(kid.getPosition(), new Position(100, 50));

        auxCheckRangeMockedStatic.close();
    }

    @Test
    public void testNextActionToStopSentKids() throws NoSuchFieldException, IllegalAccessException {
        List<Kid> kids = new ArrayList<>();
        kids.add(kid);
        kids.add(new Kid(111,10));
        kids.get(1).setWalking();
        kids.get(1).addMovesInQueueLeft(3);

        Field sentKids = kidController.getClass().getDeclaredField("sentKids");
        sentKids.setAccessible(true);

        if (sentKids.get(kidController) instanceof List) {
            ((List) sentKids.get(kidController)).add(kids.get(0));
            ((List) sentKids.get(kidController)).add(kids.get(1));
        }

        when(roadMock.getKids()).thenReturn(kids);

        MockedStatic<AuxCheckRange> auxCheckRangeMockedStatic = mockStatic(AuxCheckRange.class);

        auxCheckRangeMockedStatic.when(() -> AuxCheckRange.isInRangeJoeKid(joeMock, kids.getFirst())).thenReturn(true);
        auxCheckRangeMockedStatic.when(() -> AuxCheckRange.isInRangeJoeKid(joeMock, kids.get(1))).thenReturn(true);


        when(joeMock.getIsRaisingStopSign()).thenReturn(true);

        kidController.nextAction(gameMock, GUI.ACTION.LEFT, System.currentTimeMillis() + 2);

        assertFalse(kids.get(1).getWalkingState());
        auxCheckRangeMockedStatic.close();
    }

    @Test
    public void testNextActionToStopSentKidsButKidHasNotReachedPassPoint() throws NoSuchFieldException, IllegalAccessException {
        List<Kid> kids = new ArrayList<>();
        kids.add(kid);
        kid.setPosition(new Position(96, 10));
        kid.setWalking();
        kids.add(new Kid(111,10));
        kids.get(1).setWalking();
        kids.get(1).addMovesInQueueLeft(3);
        kid.addMovesInQueueLeft(3);

        Field sentKids = kidController.getClass().getDeclaredField("sentKids");
        sentKids.setAccessible(true);

        if (sentKids.get(kidController) instanceof List) {
            ((List) sentKids.get(kidController)).add(kids.get(0));
            ((List) sentKids.get(kidController)).add(kids.get(1));
        }

        when(roadMock.getKids()).thenReturn(kids);

        MockedStatic<AuxCheckRange> auxCheckRangeMockedStatic = mockStatic(AuxCheckRange.class);

        auxCheckRangeMockedStatic.when(() -> AuxCheckRange.isInRangeJoeKid(joeMock, kids.getFirst())).thenReturn(true);
        auxCheckRangeMockedStatic.when(() -> AuxCheckRange.isInRangeJoeKid(joeMock, kids.get(1))).thenReturn(true);


        when(joeMock.getIsRaisingStopSign()).thenReturn(true);

        kidController.nextAction(gameMock, GUI.ACTION.LEFT, System.currentTimeMillis() + 2);

        assertTrue(kid.getWalkingState());
        assertFalse(kids.get(1).getWalkingState());
        auxCheckRangeMockedStatic.close();
    }

    @Test
    public void testMoveKidAfterHit() {
        Kid kidMock = mock(Kid.class);
        Car carMock = mock(Car.class);
        when(carMock.getPosition()).thenReturn(new Position(10, 10));

        kidController.moveKidAfterHit(carMock, kidMock, 10);

        verify(kidMock, times(1)).setPosition(new Position(10, 65));
    }

    @Test
    public void testKidActionWhenInvalidChar() {
        Kid kidMock = mock(Kid.class);
        kidController.KidAction(kidMock, new Position(1, 1), 'x');
        verifyNoInteractions(kidMock);
    }

    @Test
    public void testInMinDistanceWhenIsFirstKid() {
        List<Kid> kids = new ArrayList<>();
        kids.add(kid);

        when(roadMock.getKids()).thenReturn(kids);

        assertFalse(kidController.inMinDistance(kid));
    }

    @Test
    public void testInMinDistanceWhenIsNotFirstKidAndKidInFrontIsHit() {
        List<Kid> kids = new ArrayList<>();
        kids.add(kid);
        kid.isHit();
        kids.add(new Kid(10, 10));
        when(roadMock.getKids()).thenReturn(kids);

        assertFalse(kidController.inMinDistance(kids.get(1)));
    }

    @Test
    public void testRepositionQueueWhenKidCannotContinueToWalk() throws NoSuchFieldException, IllegalAccessException {
        List<Kid> kids = new ArrayList<>();
        kids.add(new Kid(95, 10));
        kids.add(kid);
        kid.addMovesInQueueLeft(2);


        when(roadMock.getKids()).thenReturn(kids);

        kidController.repositionQueue();

        Field kidMovedInQueue = KidController.class.getDeclaredField("kidMovedInQueue");
        kidMovedInQueue.setAccessible(true);
        assertFalse((Boolean) kidMovedInQueue.get(kidController));
    }

    @Test
    public void testRepositionQueueWhenKidMovesIsDeducted() throws NoSuchFieldException, IllegalAccessException {
        List<Kid> kids = new ArrayList<>();
        kids.add(new Kid(95, 10));
        kids.get(0).addMovesInQueueLeft(2);
        kids.add(kid);
        kid.addMovesInQueueLeft(2);


        when(roadMock.getKids()).thenReturn(kids);

        kidController.repositionQueue();

        Field kidMovedInQueue = KidController.class.getDeclaredField("kidMovedInQueue");
        kidMovedInQueue.setAccessible(true);
        assertFalse((Boolean) kidMovedInQueue.get(kidController));
        assertEquals(kids.get(0).getMovesInQueueLeft(), 1);
    }

    @Test
    public void testRepositionQueueWhenKidHasNoMovesLeft() throws NoSuchFieldException, IllegalAccessException {
        List<Kid> kids = new ArrayList<>();
        kids.add(new Kid(95, 10));
        kids.add(kid);


        when(roadMock.getKids()).thenReturn(kids);

        kidController.repositionQueue();

        Field nextKidToMoveInQueueIndex = KidController.class.getDeclaredField("nextKidToMoveInQueueIndex");
        nextKidToMoveInQueueIndex.setAccessible(true);
        assertEquals(nextKidToMoveInQueueIndex.get(kidController), 2);
    }

    @Test
    public void checkCollisionsWithCars() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<Kid> kids = new ArrayList<>();
        kids.add(kid);
        kid.setWalking();

        List<Car> cars = new ArrayList<>();
        cars.add(mock(Car.class));
        cars.add(mock(Car.class));

        when(cars.getFirst().getPosition()).thenReturn(new Position(50, 10));

        when(roadMock.getKids()).thenReturn(kids);
        when(roadMock.getCars()).thenReturn(cars);

        MockedStatic<AuxCheckRange> auxCheckRangeMockedStatic = mockStatic(AuxCheckRange.class);

        auxCheckRangeMockedStatic.when(() -> AuxCheckRange.isInRangeCarKid(cars.getFirst(), kid)).thenReturn(true);
        auxCheckRangeMockedStatic.when(() -> AuxCheckRange.isInRangeCarKid(cars.get(1), kid)).thenReturn(false);

        Method checkCollisionsMethod = KidController.class.getDeclaredMethod("checkCollisions");
        checkCollisionsMethod.setAccessible(true);
        checkCollisionsMethod.invoke(kidController);

        assertTrue(kid.getIsHit());
        assertFalse(kid.getWalkingState());
        assertTrue(kid.getDeathCounted());
        verify(soundsControllerMock, times(1)).play(Sounds.SFX.CARBREAK);
        verify(soundsControllerMock, times(1)).play(Sounds.SFX.KIDHIT);
        verify(joeMock, times(1)).removeHeart();
        assertEquals(kid.getPosition(), new Position(100, 65));
        auxCheckRangeMockedStatic.close();
    }

    @Test
    public void testCheckDeathCountWithAlreadyDeadKid() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Kid deadKid = mock(Kid.class);
        when(deadKid.getDeathCounted()).thenReturn(true);

        Method checkCollisionsMethod = KidController.class.getDeclaredMethod("checkDeathCount", Kid.class);
        checkCollisionsMethod.setAccessible(true);
        checkCollisionsMethod.invoke(kidController, deadKid);

        verify(deadKid, never()).setDead();
    }

    @Test
    public void testCheckPointsWhenKidPassesButOnBorder() {
        List<Kid> kids = new ArrayList<>();
        kids.add(kid);

        when(roadMock.getKids()).thenReturn(kids);

        kid.setPosition(new Position(0, 10));

        kidController.checkPoints();

        assertFalse(kid.getPass());
        verify(joeMock, never()).addScore(100);
        verify(soundsControllerMock, never()).play(Sounds.SFX.KIDSCORE);

    }

    @Test
    public void testCheckPointsWhenKidPasses() {
        List<Kid> kids = new ArrayList<>();
        kids.add(kid);

        when(roadMock.getKids()).thenReturn(kids);

        kid.setPosition(new Position(-1, 10));

        kidController.checkPoints();

        assertTrue(kid.getPass());
        verify(joeMock, times(1)).addScore(100);
        verify(soundsControllerMock, times(1)).play(Sounds.SFX.KIDSCORE);

    }

    @Test
    public void testCheckPointsWhenKidHasAlreadyPassed() {
        List<Kid> kids = new ArrayList<>();
        kids.add(kid);
        kid.setPass();

        when(roadMock.getKids()).thenReturn(kids);

        kid.setPosition(new Position(-1, 10));

        kidController.checkPoints();

        verify(joeMock, never()).addScore(100);
        verify(soundsControllerMock, never()).play(Sounds.SFX.KIDSCORE);
    }

    @Test
    public void testCheckCountToNextLevelWhenKidIsNotCounted() {
        List<Kid> kids = new ArrayList<>();
        kids.add(mock(Kid.class));

        when(kids.getFirst().getCounted()).thenReturn(true);

        when(roadMock.getKids()).thenReturn(kids);

        kidController.checkCountToNextLevel();

        verify(kids.getFirst(), never()).getPass();

    }

    @Test
    public void testCheckCountToNextLevelWhenKidIsToBeCountedWhenPass() throws NoSuchFieldException, IllegalAccessException {
        List<Kid> kids = new ArrayList<>();
        kids.add(kid);
        kid.setPass();

        when(roadMock.getKids()).thenReturn(kids);

        kidController.checkCountToNextLevel();

        Field countKidsToNextLevel = KidController.class.getDeclaredField("countKidsToNextLevel");
        countKidsToNextLevel.setAccessible(true);
        assertEquals(countKidsToNextLevel.get(kidController), 1);
        assertTrue(kid.getCounted());

    }

    @Test
    public void testCheckCountToNextLevelWhenKidIsToBeCountedWhenNoPassButIsDeadCounted() throws NoSuchFieldException, IllegalAccessException {
        List<Kid> kids = new ArrayList<>();
        kids.add(kid);
        kid.setDead();

        when(roadMock.getKids()).thenReturn(kids);

        kidController.checkCountToNextLevel();

        Field countKidsToNextLevel = KidController.class.getDeclaredField("countKidsToNextLevel");
        countKidsToNextLevel.setAccessible(true);
        assertEquals(countKidsToNextLevel.get(kidController), 0);
        assertFalse(kid.getCounted());

    }

    @Test
    public void testCheckCountToNextLevelWhenKidIsToBeCountedWhenNoPassIsNotDeadCountedButYIsMaxDistance() throws NoSuchFieldException, IllegalAccessException {
        List<Kid> kids = new ArrayList<>();
        kids.add(kid);
        kid.setDead();
        kid.setPosition(new Position(10, 500));

        when(roadMock.getKids()).thenReturn(kids);

        kidController.checkCountToNextLevel();

        Field countKidsToNextLevel = KidController.class.getDeclaredField("countKidsToNextLevel");
        countKidsToNextLevel.setAccessible(true);
        assertEquals(countKidsToNextLevel.get(kidController), 1);
        assertTrue(kid.getCounted());

    }

    @ParameterizedTest
    @CsvSource({
            "2, 4",
            "3, 5",
            "4, 6",
            "5, 7",
            "6, 8",
            "7, 9",
            "8, 10",
            "9, 11",
            "10, 12",
            "0, 12"
    })
    public void testNextLevelNumberKids(int currentLevel, int expectedResult) {
        int result = kidController.nextLevelNumberKids(currentLevel);
        assertEquals(expectedResult, result);
    }


    @Test
    public void testKidActionWhenKidShouldPass() {
        kidController.KidAction(kid, new Position(10, 10), 'p');
        assertTrue(kid.getWalkingState());
        assertEquals(kid.getPosition(), new Position(10, 10));
    }

    @Test
    public void testInMinDistance() {
        Kid kid1 = new Kid(30, 10);
        ArrayList<Kid> kids = new ArrayList<>();
        kids.add(new Kid(10, 10));
        kids.add(kid1);

        when(roadMock.getKids()).thenReturn(kids);

        assertFalse(kidController.inMinDistance(kid1));
    }

    @Test
    public void testCheckLevelUp() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        List<Kid> kids = new ArrayList<>();
        kids.add(kid);
        kid.setPass();

        when(roadMock.getKids()).thenReturn(kids);

        Method checkLevelUp = KidController.class.getDeclaredMethod("checkLevelUp");
        checkLevelUp.setAccessible(true);

        Field sentKids = KidController.class.getDeclaredField("sentKids");
        sentKids.setAccessible(true);

        ((List<Kid>) sentKids.get(kidController)).add(kid);

        kidController.checkCountToNextLevel();
        checkLevelUp.invoke(kidController);

        Field countKidsToNextLevel = KidController.class.getDeclaredField("countKidsToNextLevel");
        countKidsToNextLevel.setAccessible(true);

        assertEquals(countKidsToNextLevel.get(kidController), 0);


        assertTrue(((List<?>) sentKids.get(kidController)).isEmpty());
        verify(soundsControllerMock, times(1)).play(Sounds.SFX.LEVELUP);
        verify(roadMock, times(1)).levelUp();
        verify(roadMock, times(1)).setKidsNextLevel(12);

    }




}
