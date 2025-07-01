package com.CrossingGuardJoe.controller.game;

import com.CrossingGuardJoe.model.game.elements.Car;
import com.CrossingGuardJoe.model.game.elements.Joe;
import com.CrossingGuardJoe.model.game.elements.Kid;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class AuxCheckRangeTest {

    @ParameterizedTest
    @MethodSource("provideIsInRangeJoeKid")
    public void testIsInRangeJoeKid(Joe joe, Kid kid, boolean result) {
        assertEquals(result, AuxCheckRange.isInRangeJoeKid(joe, kid));
    }

    @ParameterizedTest
    @MethodSource("provideIsInRangeCarKid")
    public void testIsInRangeCarKid(Car car, Kid kid, boolean result) {
        assertEquals(result, AuxCheckRange.isInRangeCarKid(car, kid));
    }

    @ParameterizedTest
    @MethodSource("provideIsInRangeLeftCarJoe")
    public void testIsInRangeLeftCarJoe(Car car, Joe joe, boolean result) {
        assertEquals(result, AuxCheckRange.isInRangeLeftCarJoe(car, joe));
    }

    @ParameterizedTest
    @MethodSource("provideIsInRangeRightCarJoe")
    public void testIsInRangeRightCarJoe(Car car, Joe joe, boolean result) {
        assertEquals(result, AuxCheckRange.isInRangeRightCarJoe(car, joe));
    }

    private static Stream<Arguments> provideIsInRangeJoeKid() {
        return Stream.of(
                Arguments.of(new Joe(20, 10), new Kid(10, 10), false),
                Arguments.of(new Joe(-12, 10), new Kid(10, 10), false),
                Arguments.of(new Joe(19, 10), new Kid(10, 10), true),
                Arguments.of(new Joe(-11, 10), new Kid(10, 10), true)
        );
    }

    private static Stream<Arguments> provideIsInRangeCarKid() {
        return Stream.of(
                Arguments.of(new Car(47, 136), new Kid(100, 200), false),
                Arguments.of(new Car(48, 136), new Kid(100, 200), true),
                Arguments.of(new Car(109, 136), new Kid(100, 200), true),
                Arguments.of(new Car(110, 136), new Kid(100, 200), true),
                Arguments.of(new Car(110, 134), new Kid(100, 200), false),
                Arguments.of(new Car(110, 135), new Kid(100, 200), true),
                Arguments.of(new Car(110, 215), new Kid(100, 200), true),
                Arguments.of(new Car(110, 216), new Kid(100, 200), false),
                Arguments.of(new Car(111, 216), new Kid(100, 200), false)
        );
    }

    private static Stream<Arguments> provideIsInRangeLeftCarJoe() {
        return Stream.of(
                Arguments.of(new Car(-100, -85), new Joe(-100, -100), true),
                Arguments.of(new Car(-49, -31), new Joe(-31, -31), true),
                Arguments.of(new Car(-45, -66), new Joe(-66, -66), true),
                Arguments.of(new Car(26, 44), new Joe(44, 44), true),
                Arguments.of(new Car(-52, -37), new Joe(-52, -52), true),
                Arguments.of(new Car(49, -16), new Joe(49, 49), true),
                Arguments.of(new Car(-103, -85), new Joe(-85, -85), true),
                Arguments.of(new Car(-48, -69), new Joe(-69, -69), true),
                Arguments.of(new Car(9, 24), new Joe(9, 9), true),
                Arguments.of(new Car(46, 61), new Joe(46, 46), true),
                Arguments.of(new Car(-200, -85), new Joe(-222, -100), false),
                Arguments.of(new Car(-200, -85), new Joe(-100, -100), false),
                Arguments.of(new Car(-200, 20), new Joe(-221, -100), false),
                Arguments.of(new Car(-200, -85), new Joe(-221, 0), false)
        );
    }

    private static Stream<Arguments> provideIsInRangeRightCarJoe() {
        return Stream.of(
                Arguments.of(new Car(47, 136), new Joe(100, 200), false),
                Arguments.of(new Car(48, 136), new Joe(100, 200), true),
                Arguments.of(new Car(49, 136), new Joe(100, 200), true),
                Arguments.of(new Car(120, 136), new Joe(100, 200), true),
                Arguments.of(new Car(121, 136), new Joe(100, 200), false),
                Arguments.of(new Car(49, 134), new Joe(100, 200), false),
                Arguments.of(new Car(49, 135), new Joe(100, 200), true),
                Arguments.of(new Car(49, 136), new Joe(100, 200), true),
                Arguments.of(new Car(49, 214), new Joe(100, 200), true),
                Arguments.of(new Car(49, 215), new Joe(100, 200), true),
                Arguments.of(new Car(49, 216), new Joe(100, 200), false)
        );
    }
}
