package com.CrossingGuardJoe.model.game;

import com.CrossingGuardJoe.model.game.elements.Car;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.lang.reflect.Method;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RoadBuilderTest {
    private RoadBuilder roadBuilder;
    private ThreadGroup threadGroup;

    @BeforeEach
    public void setUp() {
        roadBuilder = new RoadBuilder();
        threadGroup = new ThreadGroup("TestThreads");
    }

    @AfterEach
    public void tearDown() {
        interruptAllThreadsInGroup(threadGroup);
    }

    @Test
    @Timeout(2)
    public void testCreateRoadNotEmptyKidsOrCars() {
        Road road = roadBuilder.createRoad();
        assertFalse(road.getKids().isEmpty());
        assertFalse(road.getCars().isEmpty());
    }

    @Test
    @Timeout(2)
    public void testCreateRoadNotNullJoeAndThreeKids() {
        Road road = roadBuilder.createRoad();
        assertNotNull(road.getJoe());
        assertEquals(road.getKids().size(),3);
    }

    @Test
    @Timeout(2)
    public void testCreateRoadKids() {
        Road road = roadBuilder.createRoad();
        assertEquals(road.getKids().getFirst().getMovesInQueueLeft(), 20);
        assertEquals(road.getKids().get(1).getPosition().getX(), 499);
    }

    @Test
    public void testCreateKidsNextLevel() {
        assertFalse(roadBuilder.createKidsNextLevel(2).isEmpty());
    }

    @Test
    @Timeout(2)
    public void testCreateCars() throws InterruptedException {
        // Override thread creation to use the test-specific thread group
        Thread thread = new Thread(threadGroup, () -> {
            try {
                Method createCars = RoadBuilder.class.getDeclaredMethod("createCars");
                createCars.setAccessible(true);

                List<Car> cars = (List<Car>) createCars.invoke(roadBuilder);

                // Wait for some time to let the thread do its work
                Thread.sleep(500);

                synchronized (cars) {
                    for (Car car : cars) {
                        // Assert that cars have updated positions
                        assertTrue(car.getPosition().getY() <= 500);
                    }
                }
            } catch (Exception e) {
                fail("Exception during test execution: " + e.getMessage());
            }
        });

        thread.start();
        thread.join(1000); // Ensure thread completes execution or stops after a timeout
        interruptAllThreadsInGroup(threadGroup); // Stop the thread after the test
    }

    @Test
    @Timeout(2)
    public void testCreateCarsRandomY() throws InterruptedException {
        Thread thread = new Thread(threadGroup, () -> {
            try {
                Method createCars = RoadBuilder.class.getDeclaredMethod("createCars");
                createCars.setAccessible(true);

                List<Car> cars = (List<Car>) createCars.invoke(roadBuilder);

                for (Car car : cars) {
                    assertTrue(car.getPosition().getY() < 0);
                }
            } catch (Exception e) {
                fail("Exception during test execution: " + e.getMessage());
            }
        });

        thread.start();
        thread.join(1000);
    }


    @Test
    @Timeout(2)
    public void testCreateCarsAddAMaxDistanceCar() throws InterruptedException {
        Thread thread = new Thread(threadGroup, () -> {
            try {
                Method createCars = RoadBuilder.class.getDeclaredMethod("createCars");
                createCars.setAccessible(true);

                List<Car> cars = (List<Car>) createCars.invoke(roadBuilder);

                Car car1 = new Car(1, 600);
                synchronized (cars) {
                    cars.add(car1);
                }

                Thread.sleep(200);

                synchronized (cars) {
                    for (Car car : cars) {
                        assertTrue(car.getPosition().getY() < 500);
                    }
                }
            } catch (Exception e) {
                fail("Exception during test execution: " + e.getMessage());
            }
        });

        thread.start();
        thread.join(1000);
    }


    @Test
    @Timeout(2)
    public void testCreateCarsAddABoundaryMaxDistance() throws InterruptedException {
        Thread thread = new Thread(threadGroup, () -> {
            try {
                Method createCars = RoadBuilder.class.getDeclaredMethod("createCars");
                createCars.setAccessible(true);

                List<Car> cars = (List<Car>) createCars.invoke(roadBuilder);

                Car car = new Car(1, 500);

                synchronized (cars) {
                    cars.add(car);
                }

                Thread.sleep(200);

                assertEquals(car.getPosition().getY(), 500);
            } catch (Exception e) {
                fail("Exception during test execution: " + e.getMessage());
            }
        });

        thread.start();
        thread.join(1000);
    }


    private void interruptAllThreadsInGroup(ThreadGroup group) {
        int activeCount = group.activeCount();
        Thread[] threads = new Thread[activeCount];
        group.enumerate(threads); // Get all threads in the group

        for (Thread t : threads) {
            if (t != null && t.isAlive()) {
                t.interrupt(); // Interrupt the thread
            }
        }
    }
}
