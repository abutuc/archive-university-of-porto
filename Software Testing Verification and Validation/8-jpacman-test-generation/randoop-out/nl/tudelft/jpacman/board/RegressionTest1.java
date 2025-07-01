package nl.tudelft.jpacman.board;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        boolean boolean9 = board2.invariant();
        int int10 = board2.getWidth();
        int int11 = board2.getWidth();
        int int12 = board2.getWidth();
        int int13 = board2.getHeight();
        boolean boolean16 = board2.withinBorders((int) (byte) 0, 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean4 = board3.invariant();
        int int5 = board3.getWidth();
        int int6 = board3.getHeight();
        boolean boolean9 = board3.withinBorders(0, (int) (short) 1);
        int int10 = board3.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        boolean boolean11 = board2.withinBorders((int) (byte) 100, (int) (short) -1);
        int int12 = board2.getWidth();
        int int13 = board2.getHeight();
        boolean boolean14 = board2.invariant();
        java.lang.Class<?> wildcardClass15 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        int int7 = board6.getHeight();
        int int8 = board6.getWidth();
        java.lang.Class<?> wildcardClass9 = board6.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertArrayEquals(squareArray4, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) (byte) 1, 5);
        boolean boolean8 = board4.invariant();
        int int9 = board4.getWidth();
        int int10 = board4.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders((int) (short) 100, 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        boolean boolean9 = board2.invariant();
        int int10 = board2.getHeight();
        boolean boolean11 = board2.invariant();
        boolean boolean14 = board2.withinBorders(10, 0);
        int int15 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        int int8 = board7.getHeight();
        boolean boolean9 = board7.invariant();
        boolean boolean12 = board7.withinBorders((int) (short) 100, (int) ' ');
        int int13 = board7.getWidth();
        int int14 = board7.getHeight();
        boolean boolean17 = board7.withinBorders(1, (int) (short) -1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertArrayEquals(squareArray4, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        boolean boolean14 = board2.withinBorders((-1), (int) ' ');
        boolean boolean17 = board2.withinBorders((int) (byte) 100, (int) (short) 0);
        int int18 = board2.getWidth();
        boolean boolean19 = board2.invariant();
        java.lang.Class<?> wildcardClass20 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders(0, (-1));
        boolean boolean15 = board2.withinBorders((int) 'a', (int) (short) 10);
        int int16 = board2.getHeight();
        boolean boolean19 = board2.withinBorders(0, 2);
        boolean boolean22 = board2.withinBorders(10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int5 = board4.getWidth();
        int int6 = board4.getWidth();
        int int7 = board4.getHeight();
        int int8 = board4.getWidth();
        int int9 = board4.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int7 = board6.getHeight();
        boolean boolean10 = board6.withinBorders((int) ' ', (int) (byte) -1);
        boolean boolean11 = board6.invariant();
        boolean boolean14 = board6.withinBorders(100, (int) (short) 100);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        int int8 = board7.getHeight();
        boolean boolean9 = board7.invariant();
        boolean boolean12 = board7.withinBorders((int) (short) 100, (int) ' ');
        int int13 = board7.getHeight();
        java.lang.Class<?> wildcardClass14 = board7.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertArrayEquals(squareArray4, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) -1, (int) '4');
        boolean boolean7 = board2.invariant();
        boolean boolean8 = board2.invariant();
        int int9 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        boolean boolean10 = board7.withinBorders((int) (short) 0, 0);
        int int11 = board7.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertArrayEquals(squareArray4, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        boolean boolean10 = board7.withinBorders((int) (short) 0, 0);
        boolean boolean11 = board7.invariant();
        boolean boolean14 = board7.withinBorders(0, (int) (short) 0);
        boolean boolean17 = board7.withinBorders(1, (int) (short) 0);
        int int18 = board7.getWidth();
        int int19 = board7.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertArrayEquals(squareArray4, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray2);
        java.lang.Class<?> wildcardClass9 = board8.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int8 = board7.getHeight();
        int int9 = board7.getHeight();
        int int10 = board7.getWidth();
        boolean boolean13 = board7.withinBorders((int) (short) 1, 5);
        int int14 = board7.getHeight();
        boolean boolean17 = board7.withinBorders((int) (byte) 10, 4);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int8 = board7.getHeight();
        boolean boolean9 = board7.invariant();
        java.lang.Class<?> wildcardClass10 = board7.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        boolean boolean14 = board2.withinBorders((-1), (int) ' ');
        boolean boolean17 = board2.withinBorders((int) (byte) 100, (int) (short) 0);
        int int18 = board2.getWidth();
        boolean boolean19 = board2.invariant();
        int int20 = board2.getWidth();
        int int21 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getWidth();
        int int6 = board3.getWidth();
        int int7 = board3.getWidth();
        boolean boolean8 = board3.invariant();
        boolean boolean11 = board3.withinBorders(2, 0);
        int int12 = board3.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        boolean boolean9 = board2.invariant();
        boolean boolean12 = board2.withinBorders(2, (int) (short) -1);
        int int13 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        boolean boolean11 = board2.withinBorders((-1), 0);
        boolean boolean14 = board2.withinBorders((int) (short) 0, (int) '#');
        boolean boolean15 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int7 = board6.getHeight();
        boolean boolean10 = board6.withinBorders((int) ' ', (int) (byte) -1);
        boolean boolean11 = board6.invariant();
        int int12 = board6.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders(0, (-1));
        boolean boolean15 = board2.withinBorders((int) 'a', (int) (short) 10);
        int int16 = board2.getHeight();
        int int17 = board2.getHeight();
        int int18 = board2.getWidth();
        int int19 = board2.getHeight();
        boolean boolean20 = board2.invariant();
        int int21 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        java.lang.Class<?> wildcardClass9 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getHeight();
        int int6 = board3.getHeight();
        int int7 = board3.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        int int8 = board3.getWidth();
        int int9 = board3.getHeight();
        boolean boolean12 = board3.withinBorders((int) (byte) 10, (-1));
        int int13 = board3.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders((int) (short) 100, (int) (short) 10);
        int int13 = board2.getWidth();
        boolean boolean14 = board2.invariant();
        boolean boolean15 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        boolean boolean14 = board2.withinBorders((-1), (int) ' ');
        boolean boolean17 = board2.withinBorders((int) (byte) 100, (int) (short) 0);
        int int18 = board2.getWidth();
        int int19 = board2.getHeight();
        int int20 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        boolean boolean9 = board2.invariant();
        int int10 = board2.getHeight();
        boolean boolean13 = board2.withinBorders((int) (byte) -1, 10);
        java.lang.Class<?> wildcardClass14 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        boolean boolean7 = board3.withinBorders((int) (short) 1, 0);
        boolean boolean10 = board3.withinBorders((int) (short) 1, (int) '4');
        boolean boolean13 = board3.withinBorders(0, (int) (byte) 10);
        boolean boolean16 = board3.withinBorders(2, 0);
        int int17 = board3.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        int int10 = board2.getHeight();
        int int11 = board2.getHeight();
        int int12 = board2.getWidth();
        boolean boolean15 = board2.withinBorders(1, 0);
        int int16 = board2.getHeight();
        java.lang.Class<?> wildcardClass17 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        boolean boolean7 = board3.withinBorders(2, (int) ' ');
        int int8 = board3.getHeight();
        java.lang.Class<?> wildcardClass9 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) (byte) 1, 5);
        boolean boolean10 = board4.withinBorders(10, (-1));
        java.lang.Class<?> wildcardClass11 = board4.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders(1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int5 = board4.getWidth();
        int int6 = board4.getWidth();
        int int7 = board4.getHeight();
        boolean boolean8 = board4.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board9 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board10 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board11 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board12 = new nl.tudelft.jpacman.board.Board(squareArray3);
        int int13 = board12.getWidth();
        int int14 = board12.getHeight();
        int int15 = board12.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int8 = board7.getWidth();
        int int9 = board7.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getWidth();
        boolean boolean8 = board3.withinBorders((int) (byte) 100, 1);
        int int9 = board3.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int4 = board3.getHeight();
        boolean boolean5 = board3.invariant();
        int int6 = board3.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        int int7 = board5.getWidth();
        boolean boolean8 = board5.invariant();
        boolean boolean11 = board5.withinBorders((int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean4 = board3.invariant();
        boolean boolean5 = board3.invariant();
        boolean boolean6 = board3.invariant();
        int int7 = board3.getWidth();
        java.lang.Class<?> wildcardClass8 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        boolean boolean9 = board2.withinBorders((int) 'a', 2);
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        java.lang.Class<?> wildcardClass12 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((int) (byte) 10, (int) (short) -1);
        boolean boolean9 = board2.invariant();
        boolean boolean10 = board2.invariant();
        int int11 = board2.getWidth();
        int int12 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        boolean boolean9 = board2.withinBorders(100, (int) (byte) -1);
        int int10 = board2.getWidth();
        boolean boolean13 = board2.withinBorders((int) (short) 100, (int) (short) 10);
        boolean boolean16 = board2.withinBorders((int) ' ', (int) (byte) 0);
        int int17 = board2.getWidth();
        boolean boolean18 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray3);
        boolean boolean9 = board6.withinBorders((int) (byte) -1, 1);
        java.lang.Class<?> wildcardClass10 = board6.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        int int9 = board2.getWidth();
        java.lang.Class<?> wildcardClass10 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        boolean boolean7 = board5.invariant();
        int int8 = board5.getHeight();
        boolean boolean11 = board5.withinBorders(2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = board5.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getWidth();
        boolean boolean10 = board2.withinBorders((int) '#', 10);
        boolean boolean11 = board2.invariant();
        int int12 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray3);
        boolean boolean9 = board8.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders((int) (short) 10, 1);
        int int11 = board2.getHeight();
        int int12 = board2.getWidth();
        boolean boolean13 = board2.invariant();
        java.lang.Class<?> wildcardClass14 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        boolean boolean11 = board2.withinBorders(0, 4);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders((int) ' ', 100);
        boolean boolean13 = board2.invariant();
        java.lang.Class<?> wildcardClass14 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        boolean boolean5 = board4.invariant();
        boolean boolean8 = board4.withinBorders(5, (int) '#');
        java.lang.Class<?> wildcardClass9 = board4.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        boolean boolean7 = board3.withinBorders(100, (int) (byte) -1);
        int int8 = board3.getHeight();
        boolean boolean11 = board3.withinBorders(10, 0);
        boolean boolean14 = board3.withinBorders((int) (byte) -1, 0);
        boolean boolean17 = board3.withinBorders(1, 3);
        boolean boolean18 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean10 = board7.withinBorders((int) (short) -1, 5);
        java.lang.Class<?> wildcardClass11 = board7.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        int int8 = board7.getHeight();
        boolean boolean9 = board7.invariant();
        boolean boolean12 = board7.withinBorders((int) (short) 100, (int) ' ');
        int int13 = board7.getHeight();
        int int14 = board7.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertArrayEquals(squareArray4, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        boolean boolean11 = board2.withinBorders((int) (byte) 100, 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        boolean boolean10 = board7.withinBorders((int) (short) 0, 0);
        boolean boolean11 = board7.invariant();
        boolean boolean14 = board7.withinBorders(0, (int) (short) 0);
        int int15 = board7.getHeight();
        java.lang.Class<?> wildcardClass16 = board7.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertArrayEquals(squareArray4, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        int int5 = board3.getWidth();
        int int6 = board3.getWidth();
        int int7 = board3.getWidth();
        int int8 = board3.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) (byte) 1, 5);
        boolean boolean8 = board4.invariant();
        int int9 = board4.getHeight();
        int int10 = board4.getHeight();
        int int11 = board4.getHeight();
        boolean boolean12 = board4.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        java.lang.Class<?> wildcardClass7 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int8 = board7.getHeight();
        int int9 = board7.getHeight();
        int int10 = board7.getWidth();
        boolean boolean13 = board7.withinBorders((int) (short) 1, 5);
        boolean boolean16 = board7.withinBorders(0, (int) ' ');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        boolean boolean8 = board2.invariant();
        boolean boolean11 = board2.withinBorders((int) (short) -1, 0);
        boolean boolean14 = board2.withinBorders(0, 0);
        int int15 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int8 = board7.getHeight();
        int int9 = board7.getHeight();
        boolean boolean12 = board7.withinBorders((int) ' ', (int) ' ');
        int int13 = board7.getWidth();
        boolean boolean14 = board7.invariant();
        boolean boolean15 = board7.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        boolean boolean9 = board2.invariant();
        boolean boolean12 = board2.withinBorders((-1), 0);
        boolean boolean15 = board2.withinBorders(2, (int) (short) 0);
        boolean boolean18 = board2.withinBorders(5, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        int int10 = board2.getHeight();
        int int11 = board2.getHeight();
        boolean boolean14 = board2.withinBorders((int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        java.lang.Class<?> wildcardClass5 = squareArray2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders((int) (short) 100, (int) (short) 10);
        int int13 = board2.getWidth();
        boolean boolean14 = board2.invariant();
        int int15 = board2.getWidth();
        boolean boolean18 = board2.withinBorders(10, (int) (short) -1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders(0, (int) (byte) -1);
        int int11 = board2.getWidth();
        int int12 = board2.getHeight();
        int int13 = board2.getHeight();
        int int14 = board2.getHeight();
        int int15 = board2.getWidth();
        boolean boolean18 = board2.withinBorders(5, 2);
        int int19 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        int int5 = board4.getHeight();
        int int6 = board4.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        int int7 = board5.getWidth();
        int int8 = board5.getHeight();
        int int9 = board5.getHeight();
        boolean boolean12 = board5.withinBorders(4, (int) ' ');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        int int8 = board2.getWidth();
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        boolean boolean13 = board2.withinBorders(3, 100);
        int int14 = board2.getHeight();
        boolean boolean15 = board2.invariant();
        java.lang.Class<?> wildcardClass16 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board9 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board10 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board11 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board12 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board13 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean16 = board13.withinBorders((int) 'a', (int) '#');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((int) (byte) 0, (int) (short) 1);
        int int9 = board2.getHeight();
        int int10 = board2.getHeight();
        int int11 = board2.getWidth();
        int int12 = board2.getHeight();
        int int13 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean11 = board8.withinBorders((int) (byte) 1, (-1));
        boolean boolean12 = board8.invariant();
        int int13 = board8.getHeight();
        java.lang.Class<?> wildcardClass14 = board8.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders((int) ' ', 100);
        boolean boolean13 = board2.invariant();
        boolean boolean14 = board2.invariant();
        boolean boolean17 = board2.withinBorders((int) (short) 1, 3);
        java.lang.Class<?> wildcardClass18 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board9 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board10 = new nl.tudelft.jpacman.board.Board(squareArray3);
        boolean boolean11 = board10.invariant();
        boolean boolean12 = board10.invariant();
        boolean boolean15 = board10.withinBorders(1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        boolean boolean14 = board2.withinBorders((-1), (int) ' ');
        int int15 = board2.getWidth();
        java.lang.Class<?> wildcardClass16 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders((int) (short) 10, 1);
        int int11 = board2.getWidth();
        boolean boolean12 = board2.invariant();
        int int13 = board2.getWidth();
        boolean boolean14 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int8 = board7.getWidth();
        boolean boolean9 = board7.invariant();
        boolean boolean10 = board7.invariant();
        boolean boolean11 = board7.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        int int7 = board2.getWidth();
        boolean boolean10 = board2.withinBorders((int) (byte) 1, 1);
        boolean boolean13 = board2.withinBorders((int) '4', (int) (byte) 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders((int) ' ', 100);
        boolean boolean13 = board2.invariant();
        boolean boolean14 = board2.invariant();
        int int15 = board2.getHeight();
        boolean boolean16 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        int int8 = board2.getHeight();
        boolean boolean11 = board2.withinBorders(1, (int) ' ');
        boolean boolean12 = board2.invariant();
        java.lang.Class<?> wildcardClass13 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((int) (byte) 10, (int) (short) -1);
        boolean boolean11 = board2.withinBorders((int) (short) 100, (int) (short) 10);
        int int12 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders(10, 10);
        boolean boolean13 = board3.withinBorders((int) (byte) -1, 100);
        boolean boolean16 = board3.withinBorders(0, (int) ' ');
        int int17 = board3.getHeight();
        int int18 = board3.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        boolean boolean7 = board3.withinBorders(100, (int) (byte) -1);
        int int8 = board3.getWidth();
        boolean boolean11 = board3.withinBorders((int) (byte) 10, 5);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        boolean boolean9 = board2.invariant();
        boolean boolean12 = board2.withinBorders((int) (byte) -1, 2);
        java.lang.Class<?> wildcardClass13 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getHeight();
        int int6 = board2.getHeight();
        boolean boolean7 = board2.invariant();
        int int8 = board2.getHeight();
        boolean boolean11 = board2.withinBorders((int) '#', 0);
        int int12 = board2.getWidth();
        boolean boolean15 = board2.withinBorders((int) '#', 100);
        int int16 = board2.getHeight();
        boolean boolean17 = board2.invariant();
        java.lang.Class<?> wildcardClass18 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        int int8 = board3.getHeight();
        int int9 = board3.getWidth();
        boolean boolean10 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        boolean boolean9 = board2.invariant();
        int int10 = board2.getWidth();
        int int11 = board2.getWidth();
        int int12 = board2.getWidth();
        java.lang.Class<?> wildcardClass13 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        int int7 = board5.getWidth();
        int int8 = board5.getHeight();
        boolean boolean9 = board5.invariant();
        boolean boolean12 = board5.withinBorders(1, (int) '#');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int8 = board7.getHeight();
        int int9 = board7.getHeight();
        int int10 = board7.getWidth();
        boolean boolean11 = board7.invariant();
        java.lang.Class<?> wildcardClass12 = board7.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        int int5 = board3.getWidth();
        boolean boolean6 = board3.invariant();
        boolean boolean9 = board3.withinBorders((int) (byte) -1, (int) 'a');
        int int10 = board3.getHeight();
        boolean boolean13 = board3.withinBorders((int) (byte) 100, 5);
        int int14 = board3.getWidth();
        java.lang.Class<?> wildcardClass15 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) '4', (int) (byte) -1);
        boolean boolean10 = board4.withinBorders((int) (byte) 1, (int) '#');
        boolean boolean11 = board4.invariant();
        int int12 = board4.getWidth();
        int int13 = board4.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getWidth();
        int int6 = board3.getWidth();
        boolean boolean9 = board3.withinBorders((int) (short) 0, (int) ' ');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        boolean boolean14 = board2.withinBorders(10, (int) (byte) -1);
        int int15 = board2.getWidth();
        boolean boolean18 = board2.withinBorders((int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders(0, (-1));
        boolean boolean15 = board2.withinBorders((int) 'a', (int) (short) 10);
        int int16 = board2.getHeight();
        int int17 = board2.getHeight();
        int int18 = board2.getWidth();
        int int19 = board2.getHeight();
        int int20 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean7 = board4.withinBorders((int) (short) 1, (int) ' ');
        int int8 = board4.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean5 = board4.invariant();
        boolean boolean8 = board4.withinBorders((int) (short) 10, (int) (byte) 1);
        boolean boolean11 = board4.withinBorders((int) (short) 0, 0);
        int int12 = board4.getHeight();
        boolean boolean15 = board4.withinBorders((int) (short) -1, 5);
        int int16 = board4.getHeight();
        int int17 = board4.getWidth();
        int int18 = board4.getWidth();
        boolean boolean21 = board4.withinBorders((int) (byte) 100, (int) (byte) 0);
        boolean boolean22 = board4.invariant();
        java.lang.Class<?> wildcardClass23 = board4.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        boolean boolean8 = board2.invariant();
        int int9 = board2.getWidth();
        boolean boolean12 = board2.withinBorders((int) (byte) 100, (int) (short) 1);
        int int13 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) '4', (int) (byte) -1);
        int int8 = board4.getWidth();
        int int9 = board4.getHeight();
        boolean boolean12 = board4.withinBorders((int) (byte) 1, 2);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        boolean boolean9 = board2.invariant();
        int int10 = board2.getWidth();
        int int11 = board2.getHeight();
        int int12 = board2.getWidth();
        boolean boolean13 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        boolean boolean7 = board5.invariant();
        int int8 = board5.getHeight();
        boolean boolean11 = board5.withinBorders(2, (int) (byte) 100);
        boolean boolean14 = board5.withinBorders(100, 2);
        boolean boolean15 = board5.invariant();
        int int16 = board5.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) (byte) 1, 5);
        int int8 = board4.getHeight();
        int int9 = board4.getHeight();
        int int10 = board4.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders((int) ' ', 100);
        boolean boolean13 = board2.invariant();
        boolean boolean16 = board2.withinBorders((int) 'a', 100);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        boolean boolean13 = board2.withinBorders((int) (short) 0, (int) ' ');
        int int14 = board2.getHeight();
        int int15 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getWidth();
        boolean boolean10 = board2.invariant();
        int int11 = board2.getWidth();
        boolean boolean12 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        boolean boolean11 = board2.withinBorders((int) (byte) 100, (int) (short) -1);
        boolean boolean14 = board2.withinBorders((int) (byte) 100, (int) (byte) 10);
        boolean boolean15 = board2.invariant();
        boolean boolean16 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        boolean boolean7 = board5.invariant();
        int int8 = board5.getHeight();
        boolean boolean9 = board5.invariant();
        int int10 = board5.getWidth();
        int int11 = board5.getWidth();
        java.lang.Class<?> wildcardClass12 = board5.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        boolean boolean11 = board2.withinBorders((int) (byte) 100, (int) (short) -1);
        int int12 = board2.getWidth();
        boolean boolean15 = board2.withinBorders(1, (int) (short) 0);
        boolean boolean16 = board2.invariant();
        boolean boolean19 = board2.withinBorders(100, (int) (short) 100);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders(0, (int) (byte) -1);
        int int11 = board2.getHeight();
        boolean boolean12 = board2.invariant();
        int int13 = board2.getHeight();
        java.lang.Class<?> wildcardClass14 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        boolean boolean7 = board3.withinBorders(100, (int) (byte) -1);
        int int8 = board3.getHeight();
        boolean boolean9 = board3.invariant();
        boolean boolean12 = board3.withinBorders((int) ' ', (int) (byte) -1);
        boolean boolean13 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        boolean boolean11 = board2.withinBorders(0, (int) 'a');
        int int12 = board2.getHeight();
        boolean boolean15 = board2.withinBorders(0, 10);
        int int16 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getHeight();
        int int6 = board2.getHeight();
        boolean boolean7 = board2.invariant();
        int int8 = board2.getHeight();
        boolean boolean11 = board2.withinBorders((int) '#', 0);
        int int12 = board2.getWidth();
        boolean boolean15 = board2.withinBorders((int) '#', 100);
        boolean boolean18 = board2.withinBorders(0, (int) (short) -1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders(0, (-1));
        boolean boolean15 = board2.withinBorders((int) 'a', (int) (short) 10);
        int int16 = board2.getHeight();
        int int17 = board2.getHeight();
        int int18 = board2.getWidth();
        int int19 = board2.getHeight();
        boolean boolean20 = board2.invariant();
        java.lang.Class<?> wildcardClass21 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        boolean boolean8 = board7.invariant();
        int int9 = board7.getHeight();
        boolean boolean12 = board7.withinBorders(10, (int) (short) 10);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertArrayEquals(squareArray4, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders((int) (short) 10, 1);
        int int11 = board2.getHeight();
        boolean boolean14 = board2.withinBorders(0, (int) (short) 100);
        int int15 = board2.getWidth();
        int int16 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) -1, (int) '4');
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        boolean boolean11 = board2.withinBorders((int) '#', 1);
        int int12 = board2.getWidth();
        boolean boolean13 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        boolean boolean9 = board2.invariant();
        java.lang.Class<?> wildcardClass10 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders(0, (-1));
        boolean boolean15 = board2.withinBorders((int) 'a', (int) (short) 10);
        int int16 = board2.getHeight();
        int int17 = board2.getHeight();
        int int18 = board2.getWidth();
        boolean boolean21 = board2.withinBorders((int) (byte) 0, (int) (byte) 1);
        int int22 = board2.getHeight();
        java.lang.Class<?> wildcardClass23 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int4 = board3.getWidth();
        boolean boolean7 = board3.withinBorders(0, (int) (short) 1);
        boolean boolean8 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        boolean boolean14 = board2.withinBorders(10, (int) ' ');
        int int15 = board2.getHeight();
        int int16 = board2.getHeight();
        boolean boolean17 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int8 = board7.getHeight();
        int int9 = board7.getHeight();
        boolean boolean12 = board7.withinBorders((int) ' ', (int) ' ');
        boolean boolean13 = board7.invariant();
        int int14 = board7.getWidth();
        int int15 = board7.getWidth();
        boolean boolean16 = board7.invariant();
        boolean boolean19 = board7.withinBorders((int) '4', (int) (byte) -1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        int int8 = board3.getHeight();
        boolean boolean9 = board3.invariant();
        int int10 = board3.getWidth();
        boolean boolean13 = board3.withinBorders((int) (byte) 10, 10);
        java.lang.Class<?> wildcardClass14 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        int int8 = board3.getWidth();
        java.lang.Class<?> wildcardClass9 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        boolean boolean7 = board3.withinBorders(100, (int) (byte) -1);
        int int8 = board3.getHeight();
        boolean boolean11 = board3.withinBorders(10, 0);
        boolean boolean14 = board3.withinBorders((int) (byte) -1, 0);
        boolean boolean17 = board3.withinBorders((int) (byte) 0, 5);
        int int18 = board3.getWidth();
        boolean boolean21 = board3.withinBorders((int) '#', 100);
        int int22 = board3.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) -1, (int) '4');
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        boolean boolean11 = board2.withinBorders(100, (int) (short) 10);
        int int12 = board2.getWidth();
        int int13 = board2.getHeight();
        int int14 = board2.getWidth();
        java.lang.Class<?> wildcardClass15 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        boolean boolean14 = board2.withinBorders((-1), (int) ' ');
        boolean boolean17 = board2.withinBorders((int) (byte) 100, (int) (short) 0);
        int int18 = board2.getHeight();
        int int19 = board2.getHeight();
        boolean boolean20 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) '4', (int) (byte) -1);
        boolean boolean10 = board4.withinBorders((int) (byte) 1, (int) '#');
        boolean boolean11 = board4.invariant();
        int int12 = board4.getWidth();
        int int13 = board4.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders(10, 10);
        boolean boolean13 = board3.withinBorders((int) (byte) -1, 100);
        boolean boolean16 = board3.withinBorders(0, (int) ' ');
        int int17 = board3.getHeight();
        java.lang.Class<?> wildcardClass18 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        java.lang.Class<?> wildcardClass7 = board6.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders(0, (-1));
        boolean boolean15 = board2.withinBorders((int) 'a', (int) (short) 10);
        int int16 = board2.getHeight();
        int int17 = board2.getHeight();
        boolean boolean20 = board2.withinBorders(1, (-1));
        int int21 = board2.getWidth();
        java.lang.Class<?> wildcardClass22 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders(0, (-1));
        boolean boolean15 = board2.withinBorders((int) 'a', (int) (short) 10);
        int int16 = board2.getHeight();
        int int17 = board2.getHeight();
        int int18 = board2.getWidth();
        boolean boolean21 = board2.withinBorders((int) (byte) 0, (int) (byte) 1);
        boolean boolean24 = board2.withinBorders((int) (byte) 1, (int) (short) 0);
        int int25 = board2.getWidth();
        java.lang.Class<?> wildcardClass26 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int7 = board6.getHeight();
        boolean boolean10 = board6.withinBorders(100, (int) (byte) 10);
        boolean boolean13 = board6.withinBorders((int) (short) -1, (int) '4');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        boolean boolean9 = board2.withinBorders(100, (int) (byte) -1);
        int int10 = board2.getWidth();
        boolean boolean13 = board2.withinBorders((int) (short) 100, (int) (short) 10);
        boolean boolean16 = board2.withinBorders((int) ' ', (int) (byte) 0);
        int int17 = board2.getWidth();
        boolean boolean20 = board2.withinBorders((int) 'a', (int) '#');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray4 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3 };
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray4);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray4);
        boolean boolean9 = board6.withinBorders((int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        boolean boolean9 = board2.invariant();
        int int10 = board2.getHeight();
        int int11 = board2.getWidth();
        int int12 = board2.getHeight();
        boolean boolean15 = board2.withinBorders(1, (int) (byte) 100);
        boolean boolean18 = board2.withinBorders((int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getHeight();
        int int6 = board2.getHeight();
        boolean boolean7 = board2.invariant();
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        int int10 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int7 = board6.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        boolean boolean9 = board2.invariant();
        int int10 = board2.getHeight();
        int int11 = board2.getHeight();
        boolean boolean14 = board2.withinBorders(0, (int) (short) 100);
        int int15 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int8 = board7.getHeight();
        int int9 = board7.getWidth();
        int int10 = board7.getHeight();
        int int11 = board7.getWidth();
        int int12 = board7.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders(0, (int) (byte) 10);
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders(100, 1);
        boolean boolean13 = board3.withinBorders((int) (short) -1, 10);
        boolean boolean16 = board3.withinBorders((int) (short) 10, (int) (short) 0);
        boolean boolean19 = board3.withinBorders((int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean6 = board2.invariant();
        boolean boolean7 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) '4', (int) (byte) -1);
        int int8 = board4.getWidth();
        int int9 = board4.getHeight();
        java.lang.Class<?> wildcardClass10 = board4.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 1, (int) (byte) 10);
        boolean boolean10 = board2.withinBorders(0, (int) (byte) -1);
        boolean boolean13 = board2.withinBorders((int) (short) -1, 2);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        int int7 = board6.getHeight();
        int int8 = board6.getWidth();
        int int9 = board6.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertArrayEquals(squareArray4, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders((int) (short) 10, 1);
        int int11 = board2.getHeight();
        boolean boolean12 = board2.invariant();
        int int13 = board2.getWidth();
        boolean boolean14 = board2.invariant();
        int int15 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders((int) (short) 10, 1);
        int int11 = board2.getHeight();
        boolean boolean14 = board2.withinBorders(0, (int) (short) 100);
        int int15 = board2.getHeight();
        boolean boolean18 = board2.withinBorders((int) 'a', 0);
        java.lang.Class<?> wildcardClass19 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders(10, 10);
        boolean boolean13 = board3.withinBorders((int) (short) 0, (int) 'a');
        boolean boolean14 = board3.invariant();
        int int15 = board3.getHeight();
        int int16 = board3.getWidth();
        int int17 = board3.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        boolean boolean14 = board2.withinBorders(10, (int) (byte) -1);
        int int15 = board2.getWidth();
        boolean boolean18 = board2.withinBorders((int) (byte) 1, 5);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        boolean boolean11 = board2.withinBorders((int) (byte) 100, (int) (short) -1);
        int int12 = board2.getWidth();
        int int13 = board2.getHeight();
        boolean boolean14 = board2.invariant();
        boolean boolean17 = board2.withinBorders((int) (byte) 1, (int) (short) 100);
        boolean boolean18 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        boolean boolean8 = board2.invariant();
        int int9 = board2.getWidth();
        int int10 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        boolean boolean14 = board2.withinBorders((int) ' ', 10);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) (short) 0, (int) ' ');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int8 = board7.getHeight();
        int int9 = board7.getWidth();
        int int10 = board7.getHeight();
        int int11 = board7.getWidth();
        int int12 = board7.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int9 = board8.getWidth();
        java.lang.Class<?> wildcardClass10 = board8.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getHeight();
        int int6 = board2.getHeight();
        boolean boolean7 = board2.invariant();
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        int int10 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        int int9 = board2.getWidth();
        boolean boolean12 = board2.withinBorders((int) (byte) 100, (int) '#');
        boolean boolean15 = board2.withinBorders((int) (byte) -1, 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean7 = board4.withinBorders((int) (short) 1, (int) ' ');
        boolean boolean8 = board4.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int7 = board6.getHeight();
        boolean boolean8 = board6.invariant();
        int int9 = board6.getHeight();
        int int10 = board6.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders(10, 10);
        boolean boolean13 = board3.withinBorders((int) (short) 0, (int) 'a');
        boolean boolean14 = board3.invariant();
        int int15 = board3.getHeight();
        boolean boolean18 = board3.withinBorders((int) (short) 10, (int) (short) 100);
        int int19 = board3.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int5 = board4.getWidth();
        int int6 = board4.getWidth();
        boolean boolean9 = board4.withinBorders(10, (int) '#');
        int int10 = board4.getWidth();
        boolean boolean13 = board4.withinBorders(2, (int) ' ');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean8 = board7.invariant();
        boolean boolean11 = board7.withinBorders(0, (int) (short) 1);
        java.lang.Class<?> wildcardClass12 = board7.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders(0, (int) (byte) -1);
        int int11 = board2.getWidth();
        int int12 = board2.getWidth();
        int int13 = board2.getWidth();
        boolean boolean16 = board2.withinBorders((int) '4', 3);
        java.lang.Class<?> wildcardClass17 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        int int7 = board2.getWidth();
        boolean boolean8 = board2.invariant();
        int int9 = board2.getWidth();
        boolean boolean10 = board2.invariant();
        boolean boolean13 = board2.withinBorders((-1), 4);
        java.lang.Class<?> wildcardClass14 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) '4', (int) (byte) -1);
        boolean boolean8 = board4.invariant();
        boolean boolean11 = board4.withinBorders((int) (short) 10, (int) (short) 0);
        int int12 = board4.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders((int) (short) 100, (int) (short) 10);
        int int13 = board2.getWidth();
        boolean boolean14 = board2.invariant();
        java.lang.Class<?> wildcardClass15 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board9 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board10 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int11 = board10.getWidth();
        int int12 = board10.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) '4', (int) (byte) -1);
        boolean boolean8 = board4.invariant();
        boolean boolean11 = board4.withinBorders(0, (int) (short) 1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        int int9 = board2.getWidth();
        int int10 = board2.getHeight();
        int int11 = board2.getWidth();
        java.lang.Class<?> wildcardClass12 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        int int8 = board3.getHeight();
        boolean boolean9 = board3.invariant();
        int int10 = board3.getWidth();
        boolean boolean13 = board3.withinBorders((int) (byte) 10, 10);
        int int14 = board3.getHeight();
        boolean boolean15 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders((int) (short) 10, 1);
        int int11 = board2.getWidth();
        int int12 = board2.getWidth();
        int int13 = board2.getWidth();
        boolean boolean14 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        boolean boolean7 = board2.invariant();
        boolean boolean8 = board2.invariant();
        int int9 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((int) (short) 0, 5);
        java.lang.Class<?> wildcardClass9 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        boolean boolean10 = board2.withinBorders((int) '#', (int) 'a');
        boolean boolean13 = board2.withinBorders((int) (byte) 10, 2);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        boolean boolean9 = board2.invariant();
        int int10 = board2.getHeight();
        int int11 = board2.getHeight();
        int int12 = board2.getWidth();
        boolean boolean13 = board2.invariant();
        int int14 = board2.getWidth();
        int int15 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders(0, (-1));
        boolean boolean15 = board2.withinBorders((int) 'a', (int) (short) 10);
        int int16 = board2.getHeight();
        int int17 = board2.getHeight();
        boolean boolean20 = board2.withinBorders(1, (-1));
        boolean boolean23 = board2.withinBorders((int) (byte) -1, (int) (short) 0);
        int int24 = board2.getWidth();
        boolean boolean25 = board2.invariant();
        int int26 = board2.getWidth();
        int int27 = board2.getHeight();
        int int28 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        int int8 = board2.getWidth();
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        boolean boolean13 = board2.withinBorders(3, 100);
        boolean boolean16 = board2.withinBorders((-1), (int) (byte) 0);
        boolean boolean19 = board2.withinBorders((int) (byte) 0, (int) '4');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray3);
        boolean boolean8 = board7.invariant();
        int int9 = board7.getHeight();
        int int10 = board7.getHeight();
        boolean boolean13 = board7.withinBorders((int) (byte) 100, 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((int) (byte) 10, (int) (short) -1);
        boolean boolean9 = board2.invariant();
        boolean boolean12 = board2.withinBorders(1, (int) '#');
        boolean boolean15 = board2.withinBorders((int) (byte) -1, 0);
        boolean boolean16 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        boolean boolean11 = board2.withinBorders((int) (byte) 1, (-1));
        boolean boolean14 = board2.withinBorders((int) 'a', (int) (byte) 100);
        boolean boolean17 = board2.withinBorders((int) (byte) 0, 5);
        boolean boolean20 = board2.withinBorders(2, 100);
        int int21 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        int int7 = board2.getHeight();
        int int8 = board2.getWidth();
        int int9 = board2.getWidth();
        boolean boolean10 = board2.invariant();
        int int11 = board2.getHeight();
        boolean boolean12 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray4 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3 };
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray4);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray4);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray4);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray4);
        nl.tudelft.jpacman.board.Board board9 = new nl.tudelft.jpacman.board.Board(squareArray4);
        nl.tudelft.jpacman.board.Board board10 = new nl.tudelft.jpacman.board.Board(squareArray4);
        nl.tudelft.jpacman.board.Board board11 = new nl.tudelft.jpacman.board.Board(squareArray4);
        nl.tudelft.jpacman.board.Board board12 = new nl.tudelft.jpacman.board.Board(squareArray4);
        int int13 = board12.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        boolean boolean11 = board2.withinBorders((int) (byte) 100, (int) (short) -1);
        int int12 = board2.getWidth();
        boolean boolean15 = board2.withinBorders(1, (int) (short) 0);
        int int16 = board2.getWidth();
        int int17 = board2.getWidth();
        int int18 = board2.getHeight();
        java.lang.Class<?> wildcardClass19 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        boolean boolean11 = board2.withinBorders(0, (int) ' ');
        boolean boolean14 = board2.withinBorders((int) (short) 10, (int) '4');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        int int5 = board3.getWidth();
        boolean boolean6 = board3.invariant();
        int int7 = board3.getHeight();
        int int8 = board3.getWidth();
        boolean boolean11 = board3.withinBorders((int) '#', (int) '4');
        boolean boolean12 = board3.invariant();
        boolean boolean15 = board3.withinBorders((int) '4', (int) (byte) 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        int int5 = board3.getWidth();
        boolean boolean6 = board3.invariant();
        int int7 = board3.getHeight();
        int int8 = board3.getWidth();
        int int9 = board3.getHeight();
        int int10 = board3.getHeight();
        int int11 = board3.getHeight();
        int int12 = board3.getHeight();
        int int13 = board3.getHeight();
        boolean boolean16 = board3.withinBorders((int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        int int7 = board2.getHeight();
        int int8 = board2.getWidth();
        int int9 = board2.getWidth();
        boolean boolean12 = board2.withinBorders((int) 'a', 0);
        int int13 = board2.getHeight();
        java.lang.Class<?> wildcardClass14 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray4 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3 };
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray4);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray4);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray4);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray4);
        nl.tudelft.jpacman.board.Board board9 = new nl.tudelft.jpacman.board.Board(squareArray4);
        nl.tudelft.jpacman.board.Board board10 = new nl.tudelft.jpacman.board.Board(squareArray4);
        nl.tudelft.jpacman.board.Board board11 = new nl.tudelft.jpacman.board.Board(squareArray4);
        nl.tudelft.jpacman.board.Board board12 = new nl.tudelft.jpacman.board.Board(squareArray4);
        java.lang.Class<?> wildcardClass13 = squareArray4.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        int int7 = board2.getHeight();
        int int8 = board2.getWidth();
        boolean boolean11 = board2.withinBorders(0, 3);
        int int12 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        boolean boolean9 = board2.withinBorders((int) (short) 100, (int) '#');
        boolean boolean10 = board2.invariant();
        int int11 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        boolean boolean9 = board2.invariant();
        int int10 = board2.getHeight();
        int int11 = board2.getWidth();
        int int12 = board2.getWidth();
        int int13 = board2.getWidth();
        boolean boolean14 = board2.invariant();
        boolean boolean15 = board2.invariant();
        int int16 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray2);
        java.lang.Class<?> wildcardClass8 = squareArray2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        boolean boolean11 = board2.withinBorders((-1), 0);
        boolean boolean14 = board2.withinBorders((int) (short) 0, (int) '#');
        boolean boolean17 = board2.withinBorders(2, 100);
        boolean boolean20 = board2.withinBorders((int) (short) 1, 0);
        boolean boolean23 = board2.withinBorders((int) 'a', (int) '#');
        int int24 = board2.getHeight();
        int int25 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int9 = board8.getWidth();
        int int10 = board8.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        nl.tudelft.jpacman.board.Square[][] squareArray0 = new nl.tudelft.jpacman.board.Square[][] {};
        nl.tudelft.jpacman.board.Board board1 = new nl.tudelft.jpacman.board.Board(squareArray0);
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = board2.getHeight();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[][] {});
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        boolean boolean9 = board2.invariant();
        int int10 = board2.getHeight();
        int int11 = board2.getHeight();
        int int12 = board2.getWidth();
        boolean boolean13 = board2.invariant();
        int int14 = board2.getWidth();
        java.lang.Class<?> wildcardClass15 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        boolean boolean7 = board4.withinBorders((int) (short) 10, (int) (byte) 100);
        int int8 = board4.getWidth();
        int int9 = board4.getWidth();
        int int10 = board4.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders((int) (short) 10, 1);
        int int11 = board2.getWidth();
        boolean boolean12 = board2.invariant();
        boolean boolean13 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getWidth();
        boolean boolean6 = board3.invariant();
        int int7 = board3.getWidth();
        int int8 = board3.getHeight();
        boolean boolean9 = board3.invariant();
        boolean boolean10 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board9 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board10 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board11 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board12 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board13 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board14 = new nl.tudelft.jpacman.board.Board(squareArray2);
        java.lang.Class<?> wildcardClass15 = squareArray2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getWidth();
        boolean boolean8 = board2.invariant();
        int int9 = board2.getHeight();
        int int10 = board2.getWidth();
        int int11 = board2.getWidth();
        java.lang.Class<?> wildcardClass12 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getWidth();
        int int6 = board3.getWidth();
        boolean boolean9 = board3.withinBorders((int) (short) 0, 10);
        java.lang.Class<?> wildcardClass10 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        int int8 = board7.getHeight();
        boolean boolean11 = board7.withinBorders(10, (int) (byte) -1);
        boolean boolean14 = board7.withinBorders((int) (short) 0, (int) '#');
        int int15 = board7.getWidth();
        boolean boolean16 = board7.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertArrayEquals(squareArray4, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        boolean boolean11 = board2.withinBorders((int) (byte) 100, (int) (short) -1);
        int int12 = board2.getWidth();
        boolean boolean15 = board2.withinBorders(1, (int) (short) 0);
        int int16 = board2.getWidth();
        int int17 = board2.getWidth();
        boolean boolean18 = board2.invariant();
        int int19 = board2.getWidth();
        int int20 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        boolean boolean9 = board2.invariant();
        boolean boolean12 = board2.withinBorders((-1), 0);
        int int13 = board2.getWidth();
        java.lang.Class<?> wildcardClass14 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders(10, 10);
        boolean boolean13 = board3.withinBorders((int) (short) 10, (int) (short) -1);
        boolean boolean16 = board3.withinBorders((int) (byte) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        int int8 = board7.getHeight();
        boolean boolean9 = board7.invariant();
        boolean boolean12 = board7.withinBorders((int) (short) 100, (int) ' ');
        int int13 = board7.getWidth();
        boolean boolean14 = board7.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertArrayEquals(squareArray4, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getHeight();
        boolean boolean10 = board3.withinBorders((int) ' ', (int) (byte) -1);
        int int11 = board3.getWidth();
        int int12 = board3.getWidth();
        boolean boolean13 = board3.invariant();
        java.lang.Class<?> wildcardClass14 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        boolean boolean9 = board2.invariant();
        boolean boolean12 = board2.withinBorders((int) '4', (int) (short) -1);
        boolean boolean13 = board2.invariant();
        int int14 = board2.getHeight();
        int int15 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean8 = board2.invariant();
        int int9 = board2.getWidth();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        int int8 = board7.getWidth();
        int int9 = board7.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertArrayEquals(squareArray4, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        boolean boolean7 = board3.withinBorders(100, (int) (byte) -1);
        int int8 = board3.getHeight();
        boolean boolean11 = board3.withinBorders(10, 0);
        boolean boolean12 = board3.invariant();
        boolean boolean15 = board3.withinBorders(0, (int) ' ');
        java.lang.Class<?> wildcardClass16 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        java.lang.Class<?> wildcardClass4 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders((int) ' ', 100);
        boolean boolean13 = board2.invariant();
        int int14 = board2.getWidth();
        int int15 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        int int10 = board2.getHeight();
        int int11 = board2.getHeight();
        boolean boolean14 = board2.withinBorders(0, 5);
        int int15 = board2.getHeight();
        int int16 = board2.getHeight();
        boolean boolean17 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getWidth();
        boolean boolean6 = board3.invariant();
        int int7 = board3.getWidth();
        int int8 = board3.getWidth();
        boolean boolean9 = board3.invariant();
        java.lang.Class<?> wildcardClass10 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean8 = board7.invariant();
        int int9 = board7.getWidth();
        int int10 = board7.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders(5, (int) (short) -1);
        boolean boolean15 = board2.withinBorders((int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        boolean boolean7 = board6.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertArrayEquals(squareArray4, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int4 = board3.getHeight();
        int int5 = board3.getWidth();
        java.lang.Class<?> wildcardClass6 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getWidth();
        boolean boolean8 = board2.invariant();
        int int9 = board2.getHeight();
        int int10 = board2.getWidth();
        boolean boolean13 = board2.withinBorders((-1), (int) (short) 100);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders(0, (int) (byte) 10);
        int int7 = board3.getWidth();
        boolean boolean8 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        int int9 = board2.getHeight();
        int int10 = board2.getWidth();
        boolean boolean13 = board2.withinBorders(0, 0);
        int int14 = board2.getWidth();
        java.lang.Class<?> wildcardClass15 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((int) (byte) 0, (int) (short) 1);
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders((int) (short) 10, (int) '#');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getWidth();
        boolean boolean6 = board3.invariant();
        int int7 = board3.getWidth();
        int int8 = board3.getWidth();
        java.lang.Class<?> wildcardClass9 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        boolean boolean9 = board2.withinBorders((int) '#', (int) '#');
        java.lang.Class<?> wildcardClass10 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders(0, (int) (byte) -1);
        boolean boolean13 = board2.withinBorders(100, 1);
        boolean boolean14 = board2.invariant();
        int int15 = board2.getWidth();
        java.lang.Class<?> wildcardClass16 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean4 = board3.invariant();
        int int5 = board3.getWidth();
        int int6 = board3.getHeight();
        int int7 = board3.getWidth();
        int int8 = board3.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getWidth();
        int int6 = board3.getHeight();
        boolean boolean7 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        boolean boolean8 = board2.invariant();
        int int9 = board2.getWidth();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        int int8 = board3.getHeight();
        boolean boolean9 = board3.invariant();
        int int10 = board3.getWidth();
        boolean boolean13 = board3.withinBorders((int) (byte) 10, 10);
        boolean boolean16 = board3.withinBorders((int) 'a', 100);
        boolean boolean19 = board3.withinBorders(4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass20 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) '4', (int) (byte) -1);
        boolean boolean8 = board4.invariant();
        boolean boolean11 = board4.withinBorders((int) 'a', (int) (short) 10);
        int int12 = board4.getHeight();
        java.lang.Class<?> wildcardClass13 = board4.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int4 = board3.getHeight();
        boolean boolean7 = board3.withinBorders((int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board9 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board10 = new nl.tudelft.jpacman.board.Board(squareArray5);
        boolean boolean13 = board10.withinBorders(0, (int) (short) 100);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertArrayEquals(squareArray4, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) -1, (int) '4');
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders((int) (short) -1, 0);
        int int13 = board2.getWidth();
        boolean boolean14 = board2.invariant();
        int int15 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        boolean boolean8 = board3.invariant();
        boolean boolean9 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean4 = board3.invariant();
        boolean boolean5 = board3.invariant();
        boolean boolean6 = board3.invariant();
        boolean boolean9 = board3.withinBorders(10, (int) (short) 1);
        int int10 = board3.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int7 = board6.getHeight();
        boolean boolean10 = board6.withinBorders((int) ' ', (int) (byte) -1);
        int int11 = board6.getWidth();
        boolean boolean12 = board6.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        int int8 = board7.getWidth();
        boolean boolean9 = board7.invariant();
        int int10 = board7.getWidth();
        boolean boolean11 = board7.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertArrayEquals(squareArray4, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        int int5 = board3.getWidth();
        boolean boolean6 = board3.invariant();
        int int7 = board3.getHeight();
        int int8 = board3.getWidth();
        int int9 = board3.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        boolean boolean11 = board2.withinBorders((int) (byte) 100, (int) (short) -1);
        int int12 = board2.getWidth();
        boolean boolean15 = board2.withinBorders(1, (int) (short) 0);
        int int16 = board2.getWidth();
        int int17 = board2.getWidth();
        int int18 = board2.getWidth();
        boolean boolean19 = board2.invariant();
        int int20 = board2.getWidth();
        java.lang.Class<?> wildcardClass21 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders(0, (int) (byte) -1);
        int int11 = board2.getWidth();
        int int12 = board2.getWidth();
        int int13 = board2.getWidth();
        int int14 = board2.getWidth();
        java.lang.Class<?> wildcardClass15 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean5 = board4.invariant();
        boolean boolean8 = board4.withinBorders((int) (short) 10, (int) (byte) 1);
        boolean boolean9 = board4.invariant();
        java.lang.Class<?> wildcardClass10 = board4.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean6 = board2.invariant();
        boolean boolean9 = board2.withinBorders(0, (int) '#');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean5 = board4.invariant();
        boolean boolean8 = board4.withinBorders((int) (short) 10, (int) (byte) 1);
        boolean boolean11 = board4.withinBorders(0, 1);
        java.lang.Class<?> wildcardClass12 = board4.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean10 = board7.withinBorders((int) (short) 0, (int) (byte) -1);
        int int11 = board7.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        int int7 = board2.getHeight();
        int int8 = board2.getWidth();
        int int9 = board2.getWidth();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board9 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board10 = new nl.tudelft.jpacman.board.Board(squareArray3);
        boolean boolean11 = board10.invariant();
        boolean boolean14 = board10.withinBorders(0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        boolean boolean7 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) -1, (int) '4');
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        int int10 = board2.getHeight();
        int int11 = board2.getHeight();
        int int12 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        boolean boolean11 = board2.withinBorders((int) (byte) 100, (int) (short) -1);
        int int12 = board2.getWidth();
        boolean boolean15 = board2.withinBorders(1, (int) (short) 0);
        boolean boolean18 = board2.withinBorders((int) (short) 1, 0);
        int int19 = board2.getWidth();
        boolean boolean20 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        boolean boolean7 = board5.invariant();
        boolean boolean8 = board5.invariant();
        int int9 = board5.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        boolean boolean14 = board2.withinBorders(10, (int) ' ');
        int int15 = board2.getHeight();
        boolean boolean18 = board2.withinBorders((int) 'a', 5);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((int) '4', (int) (short) 10);
        boolean boolean11 = board2.withinBorders((int) (short) -1, 10);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        boolean boolean7 = board3.withinBorders(100, (int) (byte) -1);
        int int8 = board3.getHeight();
        boolean boolean11 = board3.withinBorders(10, 0);
        int int12 = board3.getHeight();
        boolean boolean15 = board3.withinBorders((int) '#', (int) (short) -1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        int int8 = board3.getHeight();
        boolean boolean9 = board3.invariant();
        boolean boolean10 = board3.invariant();
        boolean boolean13 = board3.withinBorders(0, 10);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        int int8 = board7.getHeight();
        boolean boolean11 = board7.withinBorders(10, (int) (byte) -1);
        boolean boolean12 = board7.invariant();
        boolean boolean15 = board7.withinBorders((int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertArrayEquals(squareArray4, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        boolean boolean10 = board2.withinBorders((int) '#', (int) 'a');
        int int11 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        boolean boolean9 = board2.invariant();
        int int10 = board2.getHeight();
        int int11 = board2.getWidth();
        int int12 = board2.getWidth();
        int int13 = board2.getWidth();
        boolean boolean14 = board2.invariant();
        boolean boolean15 = board2.invariant();
        boolean boolean16 = board2.invariant();
        int int17 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        boolean boolean11 = board2.withinBorders((int) (byte) 100, (int) (short) -1);
        int int12 = board2.getWidth();
        boolean boolean15 = board2.withinBorders(1, (int) (short) 0);
        boolean boolean16 = board2.invariant();
        java.lang.Class<?> wildcardClass17 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int9 = board8.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        int int10 = board2.getHeight();
        int int11 = board2.getHeight();
        int int12 = board2.getWidth();
        boolean boolean15 = board2.withinBorders(1, 0);
        int int16 = board2.getHeight();
        int int17 = board2.getWidth();
        boolean boolean18 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        boolean boolean14 = board2.withinBorders(10, (int) ' ');
        int int15 = board2.getHeight();
        int int16 = board2.getWidth();
        int int17 = board2.getWidth();
        boolean boolean20 = board2.withinBorders((int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        boolean boolean9 = board2.withinBorders((int) (short) 100, (int) '#');
        boolean boolean10 = board2.invariant();
        int int11 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders(10, 10);
        boolean boolean13 = board3.withinBorders((int) (short) 0, (int) 'a');
        boolean boolean14 = board3.invariant();
        int int15 = board3.getHeight();
        java.lang.Class<?> wildcardClass16 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int8 = board7.getHeight();
        int int9 = board7.getHeight();
        int int10 = board7.getWidth();
        boolean boolean13 = board7.withinBorders(4, (int) (byte) 100);
        boolean boolean16 = board7.withinBorders((int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        nl.tudelft.jpacman.board.Square[][] squareArray0 = new nl.tudelft.jpacman.board.Square[][] {};
        nl.tudelft.jpacman.board.Board board1 = new nl.tudelft.jpacman.board.Board(squareArray0);
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray0);
        int int3 = board2.getWidth();
        int int4 = board2.getWidth();
        int int5 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[][] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        int int10 = board2.getHeight();
        int int11 = board2.getHeight();
        int int12 = board2.getHeight();
        int int13 = board2.getWidth();
        int int14 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int4 = board3.getWidth();
        int int5 = board3.getHeight();
        int int6 = board3.getWidth();
        int int7 = board3.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        boolean boolean14 = board2.withinBorders((-1), (int) ' ');
        boolean boolean17 = board2.withinBorders((int) (byte) 100, (int) (short) 0);
        int int18 = board2.getHeight();
        int int19 = board2.getHeight();
        int int20 = board2.getWidth();
        boolean boolean23 = board2.withinBorders(100, 10);
        int int24 = board2.getWidth();
        java.lang.Class<?> wildcardClass25 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        boolean boolean11 = board2.withinBorders((int) (byte) 10, (int) '4');
        boolean boolean14 = board2.withinBorders(0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        boolean boolean9 = board2.invariant();
        int int10 = board2.getWidth();
        int int11 = board2.getHeight();
        int int12 = board2.getWidth();
        java.lang.Class<?> wildcardClass13 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        boolean boolean7 = board2.invariant();
        boolean boolean8 = board2.invariant();
        int int9 = board2.getHeight();
        int int10 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((int) (byte) 10, (int) (short) -1);
        boolean boolean9 = board2.invariant();
        boolean boolean12 = board2.withinBorders(0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getWidth();
        boolean boolean8 = board2.invariant();
        int int9 = board2.getHeight();
        int int10 = board2.getWidth();
        int int11 = board2.getWidth();
        int int12 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        int int9 = board2.getWidth();
        int int10 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean11 = board8.withinBorders((int) (byte) 1, (-1));
        boolean boolean12 = board8.invariant();
        java.lang.Class<?> wildcardClass13 = board8.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        int int4 = board2.getHeight();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((int) '4', (int) (short) 10);
        java.lang.Class<?> wildcardClass9 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) '4', (int) (byte) -1);
        boolean boolean8 = board4.invariant();
        boolean boolean11 = board4.withinBorders((int) 'a', (int) (short) 10);
        int int12 = board4.getHeight();
        int int13 = board4.getHeight();
        int int14 = board4.getHeight();
        int int15 = board4.getHeight();
        int int16 = board4.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean7 = board4.withinBorders(0, (int) 'a');
        int int8 = board4.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) '4', (int) (byte) -1);
        boolean boolean8 = board4.invariant();
        int int9 = board4.getHeight();
        boolean boolean10 = board4.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        boolean boolean10 = board7.withinBorders((int) (short) 0, 0);
        boolean boolean11 = board7.invariant();
        boolean boolean14 = board7.withinBorders(0, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = board7.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertArrayEquals(squareArray4, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        boolean boolean7 = board3.withinBorders(2, (int) ' ');
        int int8 = board3.getHeight();
        int int9 = board3.getHeight();
        java.lang.Class<?> wildcardClass10 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        boolean boolean9 = board2.invariant();
        int int10 = board2.getWidth();
        int int11 = board2.getWidth();
        int int12 = board2.getWidth();
        boolean boolean15 = board2.withinBorders(1, 10);
        boolean boolean16 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int4 = board3.getWidth();
        boolean boolean7 = board3.withinBorders((int) (byte) -1, 10);
        boolean boolean8 = board3.invariant();
        java.lang.Class<?> wildcardClass9 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        boolean boolean11 = board2.withinBorders((int) (byte) 1, (-1));
        boolean boolean14 = board2.withinBorders((int) 'a', (int) (byte) 100);
        boolean boolean17 = board2.withinBorders((int) (byte) 0, 5);
        boolean boolean18 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) -1, (int) '4');
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        int int9 = board2.getHeight();
        int int10 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders(0, (int) (byte) -1);
        int int11 = board2.getWidth();
        int int12 = board2.getHeight();
        int int13 = board2.getHeight();
        int int14 = board2.getHeight();
        int int15 = board2.getWidth();
        int int16 = board2.getHeight();
        int int17 = board2.getWidth();
        boolean boolean18 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getHeight();
        boolean boolean6 = board3.invariant();
        int int7 = board3.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        boolean boolean7 = board5.invariant();
        boolean boolean8 = board5.invariant();
        boolean boolean9 = board5.invariant();
        boolean boolean12 = board5.withinBorders(1, (int) ' ');
        int int13 = board5.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders((int) 'a', (int) (byte) 0);
        int int13 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean5 = board4.invariant();
        boolean boolean8 = board4.withinBorders((int) (short) 10, (int) (byte) 1);
        boolean boolean11 = board4.withinBorders((int) (short) 0, 0);
        int int12 = board4.getHeight();
        boolean boolean15 = board4.withinBorders(1, (int) '4');
        int int16 = board4.getWidth();
        java.lang.Class<?> wildcardClass17 = board4.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        int int7 = board2.getWidth();
        boolean boolean8 = board2.invariant();
        int int9 = board2.getWidth();
        boolean boolean10 = board2.invariant();
        boolean boolean13 = board2.withinBorders((-1), 4);
        int int14 = board2.getWidth();
        java.lang.Class<?> wildcardClass15 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        int int7 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getHeight();
        int int6 = board2.getHeight();
        boolean boolean7 = board2.invariant();
        int int8 = board2.getHeight();
        int int9 = board2.getWidth();
        boolean boolean10 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        boolean boolean9 = board2.invariant();
        boolean boolean10 = board2.invariant();
        boolean boolean13 = board2.withinBorders((int) (byte) 1, (-1));
        int int14 = board2.getWidth();
        boolean boolean15 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders((int) (short) 10, 1);
        int int11 = board2.getHeight();
        boolean boolean12 = board2.invariant();
        boolean boolean13 = board2.invariant();
        boolean boolean16 = board2.withinBorders((int) (byte) 1, (int) '#');
        int int17 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        boolean boolean10 = board7.withinBorders((int) (short) 0, 0);
        boolean boolean11 = board7.invariant();
        boolean boolean14 = board7.withinBorders(0, (int) (short) 0);
        boolean boolean17 = board7.withinBorders((int) (short) 100, (int) (byte) 0);
        boolean boolean18 = board7.invariant();
        int int19 = board7.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertArrayEquals(squareArray4, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        boolean boolean14 = board2.withinBorders((-1), (int) ' ');
        boolean boolean17 = board2.withinBorders((int) (byte) 100, (int) (short) 0);
        int int18 = board2.getHeight();
        boolean boolean19 = board2.invariant();
        int int20 = board2.getWidth();
        boolean boolean23 = board2.withinBorders((int) 'a', (int) '#');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        boolean boolean11 = board2.withinBorders((-1), 0);
        boolean boolean14 = board2.withinBorders((int) (short) 0, (int) '#');
        boolean boolean17 = board2.withinBorders(2, 100);
        boolean boolean20 = board2.withinBorders((int) (short) 1, 0);
        boolean boolean23 = board2.withinBorders((int) 'a', (int) '#');
        int int24 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        int int7 = board5.getWidth();
        int int8 = board5.getHeight();
        boolean boolean9 = board5.invariant();
        boolean boolean10 = board5.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getWidth();
        int int6 = board3.getWidth();
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders((int) '4', (int) (byte) 100);
        int int11 = board3.getWidth();
        int int12 = board3.getWidth();
        int int13 = board3.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getHeight();
        int int6 = board2.getHeight();
        int int7 = board2.getWidth();
        boolean boolean8 = board2.invariant();
        int int9 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray3);
        boolean boolean6 = board5.invariant();
        int int7 = board5.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        boolean boolean7 = board2.invariant();
        boolean boolean10 = board2.withinBorders(10, (int) (short) 10);
        int int11 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        int int12 = board2.getWidth();
        int int13 = board2.getWidth();
        boolean boolean14 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        boolean boolean12 = board2.invariant();
        int int13 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean9 = board8.invariant();
        boolean boolean10 = board8.invariant();
        boolean boolean11 = board8.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        int int9 = board2.getHeight();
        int int10 = board2.getHeight();
        boolean boolean11 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        boolean boolean11 = board2.withinBorders((-1), 0);
        boolean boolean14 = board2.withinBorders((int) (short) 0, (int) '#');
        int int15 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        int int8 = board7.getHeight();
        int int9 = board7.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertArrayEquals(squareArray4, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        int int7 = board2.getHeight();
        int int8 = board2.getWidth();
        boolean boolean9 = board2.invariant();
        int int10 = board2.getHeight();
        int int11 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) (byte) 1, 5);
        boolean boolean10 = board4.withinBorders(10, (-1));
        int int11 = board4.getWidth();
        java.lang.Class<?> wildcardClass12 = board4.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        boolean boolean7 = board5.invariant();
        boolean boolean8 = board5.invariant();
        boolean boolean11 = board5.withinBorders((int) (short) 0, (int) (byte) 100);
        boolean boolean14 = board5.withinBorders(100, 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board9 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board10 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board11 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board12 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean15 = board12.withinBorders(2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        boolean boolean7 = board3.withinBorders((int) (short) 1, 0);
        boolean boolean10 = board3.withinBorders((int) (short) 1, (int) '4');
        boolean boolean13 = board3.withinBorders(0, (int) (byte) 10);
        int int14 = board3.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board9 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board10 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board11 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board12 = new nl.tudelft.jpacman.board.Board(squareArray1);
        java.lang.Class<?> wildcardClass13 = squareArray1.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) (byte) 1, 5);
        int int8 = board4.getHeight();
        boolean boolean11 = board4.withinBorders((int) '4', (int) ' ');
        int int12 = board4.getHeight();
        int int13 = board4.getWidth();
        java.lang.Class<?> wildcardClass14 = board4.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        int int8 = board7.getHeight();
        boolean boolean9 = board7.invariant();
        boolean boolean12 = board7.withinBorders((int) (short) 100, (int) ' ');
        int int13 = board7.getWidth();
        int int14 = board7.getHeight();
        int int15 = board7.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertArrayEquals(squareArray4, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        boolean boolean7 = board3.withinBorders((int) (short) 1, 0);
        int int8 = board3.getWidth();
        int int9 = board3.getWidth();
        int int10 = board3.getHeight();
        int int11 = board3.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        boolean boolean11 = board2.withinBorders((-1), 0);
        boolean boolean14 = board2.withinBorders((int) (short) 0, (int) '#');
        java.lang.Class<?> wildcardClass15 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        int int8 = board7.getHeight();
        boolean boolean9 = board7.invariant();
        boolean boolean12 = board7.withinBorders((int) (short) 100, (int) ' ');
        boolean boolean15 = board7.withinBorders((int) (byte) 1, 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertArrayEquals(squareArray4, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        boolean boolean7 = board3.withinBorders((int) (short) 1, 0);
        boolean boolean10 = board3.withinBorders((int) (short) 1, (int) '4');
        boolean boolean13 = board3.withinBorders(0, (int) (byte) 10);
        boolean boolean14 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        boolean boolean9 = board2.withinBorders((int) 'a', 2);
        boolean boolean10 = board2.invariant();
        int int11 = board2.getWidth();
        boolean boolean14 = board2.withinBorders((int) (byte) 10, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders(0, (-1));
        boolean boolean15 = board2.withinBorders((int) 'a', (int) (short) 10);
        int int16 = board2.getHeight();
        int int17 = board2.getHeight();
        boolean boolean20 = board2.withinBorders(1, (-1));
        boolean boolean21 = board2.invariant();
        int int22 = board2.getHeight();
        java.lang.Class<?> wildcardClass23 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int8 = board7.getHeight();
        int int9 = board7.getHeight();
        boolean boolean12 = board7.withinBorders((int) ' ', (int) ' ');
        boolean boolean13 = board7.invariant();
        int int14 = board7.getWidth();
        int int15 = board7.getWidth();
        boolean boolean16 = board7.invariant();
        boolean boolean19 = board7.withinBorders((int) 'a', 10);
        boolean boolean22 = board7.withinBorders(2, (int) 'a');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) '4', (int) (byte) -1);
        boolean boolean8 = board4.invariant();
        boolean boolean11 = board4.withinBorders((int) 'a', (int) (short) 10);
        int int12 = board4.getHeight();
        int int13 = board4.getHeight();
        int int14 = board4.getHeight();
        int int15 = board4.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((int) (byte) 10, (int) (short) -1);
        boolean boolean9 = board2.invariant();
        boolean boolean10 = board2.invariant();
        int int11 = board2.getHeight();
        boolean boolean12 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        boolean boolean9 = board2.invariant();
        boolean boolean10 = board2.invariant();
        boolean boolean13 = board2.withinBorders(2, (int) (byte) 1);
        boolean boolean16 = board2.withinBorders((int) 'a', (int) (short) 1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        int int7 = board6.getWidth();
        boolean boolean8 = board6.invariant();
        java.lang.Class<?> wildcardClass9 = board6.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertArrayEquals(squareArray4, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        boolean boolean7 = board3.withinBorders((int) (short) 1, 3);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean11 = board8.withinBorders((int) '4', 0);
        int int12 = board8.getHeight();
        int int13 = board8.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int8 = board7.getHeight();
        boolean boolean11 = board7.withinBorders((int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        boolean boolean7 = board3.withinBorders(100, (int) (byte) -1);
        int int8 = board3.getHeight();
        boolean boolean11 = board3.withinBorders(10, 0);
        boolean boolean14 = board3.withinBorders((int) (byte) -1, 0);
        boolean boolean17 = board3.withinBorders((int) (byte) 0, 5);
        int int18 = board3.getWidth();
        boolean boolean21 = board3.withinBorders((int) '#', 100);
        boolean boolean22 = board3.invariant();
        boolean boolean23 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders((int) ' ', 100);
        boolean boolean13 = board2.invariant();
        boolean boolean14 = board2.invariant();
        boolean boolean15 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        int int8 = board7.getHeight();
        boolean boolean11 = board7.withinBorders(10, (int) (byte) -1);
        int int12 = board7.getWidth();
        int int13 = board7.getHeight();
        int int14 = board7.getWidth();
        boolean boolean15 = board7.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertArrayEquals(squareArray4, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        int int7 = board2.getHeight();
        int int8 = board2.getWidth();
        boolean boolean9 = board2.invariant();
        int int10 = board2.getHeight();
        boolean boolean11 = board2.invariant();
        boolean boolean12 = board2.invariant();
        int int13 = board2.getHeight();
        java.lang.Class<?> wildcardClass14 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        int int5 = board3.getWidth();
        int int6 = board3.getWidth();
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders((int) (short) -1, 1);
        int int11 = board3.getWidth();
        int int12 = board3.getHeight();
        boolean boolean13 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board9 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board10 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean11 = board10.invariant();
        java.lang.Class<?> wildcardClass12 = board10.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        int int5 = board3.getWidth();
        int int6 = board3.getWidth();
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders((int) (short) -1, 1);
        boolean boolean11 = board3.invariant();
        java.lang.Class<?> wildcardClass12 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        boolean boolean7 = board5.invariant();
        boolean boolean8 = board5.invariant();
        boolean boolean9 = board5.invariant();
        int int10 = board5.getWidth();
        boolean boolean13 = board5.withinBorders((-1), (int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = board5.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        int int8 = board7.getHeight();
        boolean boolean9 = board7.invariant();
        boolean boolean10 = board7.invariant();
        boolean boolean11 = board7.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertArrayEquals(squareArray4, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((int) (short) 0, 5);
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders(0, 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        boolean boolean9 = board2.invariant();
        boolean boolean12 = board2.withinBorders((-1), 0);
        java.lang.Class<?> wildcardClass13 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        int int7 = board2.getHeight();
        int int8 = board2.getWidth();
        boolean boolean9 = board2.invariant();
        int int10 = board2.getHeight();
        boolean boolean11 = board2.invariant();
        boolean boolean12 = board2.invariant();
        int int13 = board2.getHeight();
        boolean boolean14 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        boolean boolean13 = board2.withinBorders((int) (short) 100, (int) (byte) 1);
        boolean boolean14 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        boolean boolean11 = board2.withinBorders(0, (int) ' ');
        int int12 = board2.getWidth();
        int int13 = board2.getWidth();
        boolean boolean14 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        boolean boolean7 = board5.invariant();
        int int8 = board5.getHeight();
        boolean boolean11 = board5.withinBorders(2, (int) (byte) 100);
        boolean boolean14 = board5.withinBorders(100, 2);
        boolean boolean15 = board5.invariant();
        boolean boolean16 = board5.invariant();
        int int17 = board5.getWidth();
        boolean boolean20 = board5.withinBorders((-1), (int) (short) 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        int int9 = board2.getHeight();
        java.lang.Class<?> wildcardClass10 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders(0, (int) (byte) -1);
        int int11 = board2.getWidth();
        int int12 = board2.getHeight();
        int int13 = board2.getHeight();
        int int14 = board2.getHeight();
        boolean boolean15 = board2.invariant();
        java.lang.Class<?> wildcardClass16 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        boolean boolean9 = board2.invariant();
        boolean boolean12 = board2.withinBorders((-1), 0);
        boolean boolean15 = board2.withinBorders(2, (int) (short) 0);
        boolean boolean18 = board2.withinBorders(5, (int) (byte) 10);
        boolean boolean19 = board2.invariant();
        int int20 = board2.getWidth();
        int int21 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        boolean boolean14 = board2.withinBorders((-1), (int) ' ');
        boolean boolean17 = board2.withinBorders((int) (byte) 100, (int) (short) 0);
        int int18 = board2.getHeight();
        int int19 = board2.getHeight();
        java.lang.Class<?> wildcardClass20 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getHeight();
        int int6 = board2.getHeight();
        boolean boolean7 = board2.invariant();
        boolean boolean10 = board2.withinBorders(3, (int) '4');
        int int11 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        int int9 = board2.getHeight();
        int int10 = board2.getWidth();
        boolean boolean13 = board2.withinBorders(0, 0);
        java.lang.Class<?> wildcardClass14 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        boolean boolean9 = board2.invariant();
        int int10 = board2.getWidth();
        int int11 = board2.getWidth();
        int int12 = board2.getWidth();
        int int13 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders(0, (int) (byte) -1);
        int int11 = board2.getWidth();
        int int12 = board2.getHeight();
        int int13 = board2.getHeight();
        int int14 = board2.getHeight();
        int int15 = board2.getHeight();
        boolean boolean18 = board2.withinBorders(1, (int) (short) 100);
        int int19 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board9 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board10 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board11 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean12 = board11.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        boolean boolean9 = board2.invariant();
        int int10 = board2.getWidth();
        int int11 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray3);
        java.lang.Class<?> wildcardClass8 = squareArray3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        boolean boolean7 = board2.invariant();
        int int8 = board2.getWidth();
        boolean boolean11 = board2.withinBorders((int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders((int) (short) 10, 1);
        int int11 = board2.getHeight();
        boolean boolean14 = board2.withinBorders(0, (int) (short) 100);
        int int15 = board2.getHeight();
        int int16 = board2.getHeight();
        int int17 = board2.getHeight();
        int int18 = board2.getHeight();
        java.lang.Class<?> wildcardClass19 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray4 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3 };
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray4);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray4);
        boolean boolean7 = board6.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        boolean boolean9 = board2.invariant();
        int int10 = board2.getHeight();
        int int11 = board2.getWidth();
        int int12 = board2.getHeight();
        boolean boolean15 = board2.withinBorders(1, (int) (byte) 100);
        int int16 = board2.getHeight();
        int int17 = board2.getWidth();
        boolean boolean20 = board2.withinBorders(5, 0);
        java.lang.Class<?> wildcardClass21 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getHeight();
        int int6 = board2.getHeight();
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean5 = board4.invariant();
        boolean boolean8 = board4.withinBorders((int) (short) 10, (int) (byte) 1);
        boolean boolean11 = board4.withinBorders((int) (short) 0, 0);
        boolean boolean14 = board4.withinBorders(0, (int) 'a');
        int int15 = board4.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        int int4 = board2.getHeight();
        boolean boolean5 = board2.invariant();
        boolean boolean6 = board2.invariant();
        boolean boolean7 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        int int10 = board2.getHeight();
        int int11 = board2.getHeight();
        boolean boolean14 = board2.withinBorders(0, 5);
        int int15 = board2.getHeight();
        boolean boolean18 = board2.withinBorders((int) ' ', (int) (short) -1);
        boolean boolean19 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray3);
        boolean boolean8 = board7.invariant();
        int int9 = board7.getHeight();
        int int10 = board7.getHeight();
        boolean boolean11 = board7.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        boolean boolean8 = board7.invariant();
        int int9 = board7.getWidth();
        int int10 = board7.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertArrayEquals(squareArray4, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getWidth();
        boolean boolean8 = board2.invariant();
        int int9 = board2.getHeight();
        int int10 = board2.getWidth();
        boolean boolean13 = board2.withinBorders(0, (int) ' ');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        int int7 = board2.getWidth();
        boolean boolean8 = board2.invariant();
        boolean boolean11 = board2.withinBorders((int) (short) 10, (int) (byte) 100);
        int int12 = board2.getWidth();
        java.lang.Class<?> wildcardClass13 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) '4', (int) (byte) -1);
        boolean boolean8 = board4.invariant();
        boolean boolean11 = board4.withinBorders((int) 'a', (int) (short) 10);
        int int12 = board4.getHeight();
        boolean boolean15 = board4.withinBorders((int) (byte) 10, 10);
        boolean boolean16 = board4.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board9 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean12 = board9.withinBorders(3, (int) (short) -1);
        int int13 = board9.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders((int) ' ', 100);
        boolean boolean13 = board2.invariant();
        boolean boolean14 = board2.invariant();
        boolean boolean17 = board2.withinBorders((int) (byte) 10, 10);
        java.lang.Class<?> wildcardClass18 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board9 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board10 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board11 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean14 = board11.withinBorders((int) '#', (int) (short) 1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        boolean boolean7 = board3.withinBorders(100, (int) (byte) -1);
        boolean boolean8 = board3.invariant();
        int int9 = board3.getHeight();
        int int10 = board3.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders((int) (short) 10, 1);
        int int11 = board2.getWidth();
        int int12 = board2.getWidth();
        int int13 = board2.getHeight();
        boolean boolean14 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        int int8 = board7.getHeight();
        boolean boolean11 = board7.withinBorders(1, (int) (byte) 10);
        int int12 = board7.getWidth();
        int int13 = board7.getHeight();
        int int14 = board7.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertArrayEquals(squareArray4, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray3);
        boolean boolean10 = board7.withinBorders((int) (short) -1, 0);
        boolean boolean13 = board7.withinBorders((int) (byte) -1, (int) (short) -1);
        java.lang.Class<?> wildcardClass14 = board7.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        boolean boolean14 = board2.withinBorders((-1), (int) ' ');
        boolean boolean17 = board2.withinBorders((int) (byte) 100, (int) (short) 0);
        int int18 = board2.getHeight();
        int int19 = board2.getHeight();
        int int20 = board2.getWidth();
        int int21 = board2.getHeight();
        int int22 = board2.getWidth();
        boolean boolean25 = board2.withinBorders(0, (int) ' ');
        boolean boolean28 = board2.withinBorders((int) (byte) 0, (int) '4');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int4 = board3.getWidth();
        boolean boolean7 = board3.withinBorders((int) ' ', 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((int) (short) 0, 5);
        int int9 = board2.getHeight();
        int int10 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        int int8 = board3.getHeight();
        boolean boolean9 = board3.invariant();
        boolean boolean12 = board3.withinBorders((int) (short) 10, (-1));
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        boolean boolean9 = board2.invariant();
        int int10 = board2.getHeight();
        int int11 = board2.getWidth();
        int int12 = board2.getHeight();
        boolean boolean15 = board2.withinBorders(1, (int) (byte) 100);
        int int16 = board2.getHeight();
        int int17 = board2.getWidth();
        boolean boolean18 = board2.invariant();
        boolean boolean19 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        int int8 = board7.getHeight();
        boolean boolean11 = board7.withinBorders(10, (int) (byte) -1);
        boolean boolean14 = board7.withinBorders((int) (short) 0, (int) '#');
        int int15 = board7.getWidth();
        int int16 = board7.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertArrayEquals(squareArray4, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        boolean boolean7 = board2.invariant();
        int int8 = board2.getWidth();
        boolean boolean11 = board2.withinBorders(0, (int) '4');
        boolean boolean14 = board2.withinBorders((int) (byte) 10, (int) '4');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        boolean boolean7 = board3.withinBorders((int) (short) 1, 0);
        int int8 = board3.getWidth();
        int int9 = board3.getWidth();
        int int10 = board3.getWidth();
        int int11 = board3.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((int) (byte) 10, (int) (short) -1);
        boolean boolean9 = board2.invariant();
        boolean boolean12 = board2.withinBorders(1, (int) '#');
        boolean boolean15 = board2.withinBorders(2, 1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders(0, (int) (byte) -1);
        int int11 = board2.getWidth();
        int int12 = board2.getHeight();
        int int13 = board2.getHeight();
        int int14 = board2.getHeight();
        boolean boolean17 = board2.withinBorders((int) (byte) -1, 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders(0, (int) (byte) 10);
        int int7 = board3.getWidth();
        int int8 = board3.getWidth();
        boolean boolean9 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders((int) (short) 10, 1);
        int int11 = board2.getWidth();
        java.lang.Class<?> wildcardClass12 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        int int5 = board3.getWidth();
        boolean boolean6 = board3.invariant();
        boolean boolean9 = board3.withinBorders((int) (byte) -1, (int) 'a');
        int int10 = board3.getHeight();
        boolean boolean11 = board3.invariant();
        boolean boolean12 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        int int8 = board2.getWidth();
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        int int11 = board2.getWidth();
        boolean boolean14 = board2.withinBorders((int) (short) -1, 5);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((int) (byte) 10, (int) (short) -1);
        boolean boolean11 = board2.withinBorders((int) (short) 100, (int) (short) 10);
        boolean boolean12 = board2.invariant();
        boolean boolean13 = board2.invariant();
        int int14 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders((int) (short) 10, 1);
        int int11 = board2.getHeight();
        boolean boolean14 = board2.withinBorders(0, (int) (short) 100);
        int int15 = board2.getHeight();
        int int16 = board2.getHeight();
        int int17 = board2.getHeight();
        int int18 = board2.getHeight();
        int int19 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        boolean boolean11 = board2.withinBorders((int) (byte) 1, (-1));
        boolean boolean14 = board2.withinBorders(2, (int) (byte) -1);
        boolean boolean17 = board2.withinBorders((int) (short) -1, (int) (byte) 10);
        boolean boolean20 = board2.withinBorders((-1), 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders((int) ' ', 100);
        boolean boolean13 = board2.invariant();
        boolean boolean14 = board2.invariant();
        boolean boolean17 = board2.withinBorders((int) (short) 1, 3);
        boolean boolean18 = board2.invariant();
        int int19 = board2.getWidth();
        int int20 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        int int9 = board2.getWidth();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        int int12 = board2.getWidth();
        java.lang.Class<?> wildcardClass13 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders(0, (-1));
        boolean boolean15 = board2.withinBorders((int) 'a', (int) (short) 10);
        int int16 = board2.getWidth();
        boolean boolean19 = board2.withinBorders(3, (int) '4');
        boolean boolean22 = board2.withinBorders((int) (short) 0, 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        boolean boolean9 = board2.invariant();
        boolean boolean10 = board2.invariant();
        boolean boolean13 = board2.withinBorders(2, (int) (byte) 1);
        int int14 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders((int) (short) 10, 1);
        int int11 = board2.getHeight();
        boolean boolean14 = board2.withinBorders(0, (int) (short) 100);
        int int15 = board2.getHeight();
        boolean boolean18 = board2.withinBorders((int) 'a', 0);
        int int19 = board2.getWidth();
        boolean boolean22 = board2.withinBorders(4, (int) (short) 10);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        boolean boolean14 = board2.withinBorders((-1), (int) ' ');
        boolean boolean17 = board2.withinBorders((int) (byte) 100, (int) (short) 0);
        int int18 = board2.getHeight();
        int int19 = board2.getHeight();
        int int20 = board2.getWidth();
        int int21 = board2.getWidth();
        int int22 = board2.getHeight();
        int int23 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getHeight();
        boolean boolean10 = board3.withinBorders(0, (int) (short) 1);
        java.lang.Class<?> wildcardClass11 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getWidth();
        int int6 = board3.getWidth();
        int int7 = board3.getHeight();
        boolean boolean8 = board3.invariant();
        boolean boolean11 = board3.withinBorders((int) (short) 10, 10);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        boolean boolean11 = board2.withinBorders(0, (int) 'a');
        boolean boolean12 = board2.invariant();
        int int13 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders(0, (-1));
        boolean boolean15 = board2.withinBorders((int) 'a', (int) (short) 10);
        int int16 = board2.getHeight();
        boolean boolean19 = board2.withinBorders(0, (int) 'a');
        int int20 = board2.getWidth();
        int int21 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) '4', (int) (byte) -1);
        boolean boolean8 = board4.invariant();
        int int9 = board4.getWidth();
        int int10 = board4.getHeight();
        int int11 = board4.getWidth();
        int int12 = board4.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        boolean boolean11 = board2.withinBorders((int) (byte) 100, (int) (short) -1);
        boolean boolean14 = board2.withinBorders((int) (byte) 100, (int) (byte) 10);
        int int15 = board2.getWidth();
        int int16 = board2.getWidth();
        boolean boolean17 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        boolean boolean8 = board7.invariant();
        boolean boolean11 = board7.withinBorders(0, (int) '#');
        java.lang.Class<?> wildcardClass12 = board7.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertArrayEquals(squareArray4, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders(0, (-1));
        boolean boolean13 = board2.invariant();
        int int14 = board2.getWidth();
        int int15 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int5 = board4.getWidth();
        int int6 = board4.getWidth();
        int int7 = board4.getHeight();
        int int8 = board4.getWidth();
        int int9 = board4.getWidth();
        java.lang.Class<?> wildcardClass10 = board4.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        nl.tudelft.jpacman.board.Square[][] squareArray0 = new nl.tudelft.jpacman.board.Square[][] {};
        nl.tudelft.jpacman.board.Board board1 = new nl.tudelft.jpacman.board.Board(squareArray0);
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray0);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray0);
        boolean boolean6 = board3.withinBorders((int) 'a', 3);
        boolean boolean9 = board3.withinBorders((int) (short) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = board3.getHeight();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[][] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders(0, (int) (byte) -1);
        int int11 = board2.getHeight();
        int int12 = board2.getWidth();
        boolean boolean13 = board2.invariant();
        boolean boolean14 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean5 = board4.invariant();
        boolean boolean8 = board4.withinBorders((int) (short) 10, (int) (byte) 1);
        boolean boolean11 = board4.withinBorders((int) (short) 0, 0);
        int int12 = board4.getHeight();
        boolean boolean15 = board4.withinBorders((int) (short) -1, 5);
        int int16 = board4.getHeight();
        int int17 = board4.getWidth();
        int int18 = board4.getWidth();
        boolean boolean21 = board4.withinBorders((int) (byte) 100, (int) (byte) 0);
        boolean boolean22 = board4.invariant();
        int int23 = board4.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board9 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board10 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board11 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board12 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int13 = board12.getWidth();
        int int14 = board12.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board9 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board10 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board11 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board12 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board13 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board14 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board15 = new nl.tudelft.jpacman.board.Board(squareArray5);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertArrayEquals(squareArray4, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray5);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) '4', (int) (byte) -1);
        boolean boolean10 = board4.withinBorders((int) (byte) 1, (int) '#');
        boolean boolean11 = board4.invariant();
        int int12 = board4.getWidth();
        boolean boolean13 = board4.invariant();
        int int14 = board4.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        int int4 = board2.getHeight();
        int int5 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        boolean boolean8 = board2.invariant();
        int int9 = board2.getWidth();
        boolean boolean12 = board2.withinBorders((int) (byte) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        boolean boolean9 = board5.withinBorders((int) (byte) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = board5.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        boolean boolean9 = board2.invariant();
        int int10 = board2.getHeight();
        boolean boolean11 = board2.invariant();
        int int12 = board2.getHeight();
        boolean boolean13 = board2.invariant();
        boolean boolean14 = board2.invariant();
        boolean boolean17 = board2.withinBorders((-1), (int) (byte) 100);
        java.lang.Class<?> wildcardClass18 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int8 = board7.getWidth();
        boolean boolean9 = board7.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 100);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getHeight();
        int int6 = board2.getHeight();
        boolean boolean7 = board2.invariant();
        int int8 = board2.getHeight();
        boolean boolean11 = board2.withinBorders((int) '#', 0);
        int int12 = board2.getWidth();
        int int13 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean11 = board8.withinBorders((int) '4', 0);
        boolean boolean12 = board8.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean4 = board3.invariant();
        boolean boolean5 = board3.invariant();
        boolean boolean6 = board3.invariant();
        boolean boolean9 = board3.withinBorders((int) (byte) -1, (int) (byte) 100);
        int int10 = board3.getHeight();
        boolean boolean11 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray3);
        boolean boolean6 = board5.invariant();
        boolean boolean9 = board5.withinBorders((int) (byte) -1, 3);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int8 = board7.getHeight();
        int int9 = board7.getWidth();
        int int10 = board7.getHeight();
        boolean boolean11 = board7.invariant();
        int int12 = board7.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        boolean boolean8 = board2.invariant();
        int int9 = board2.getWidth();
        java.lang.Class<?> wildcardClass10 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders(0, (int) (byte) 10);
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders(100, 1);
        boolean boolean13 = board3.withinBorders((int) (short) -1, 10);
        boolean boolean16 = board3.withinBorders((int) (short) 10, (int) (short) 0);
        boolean boolean19 = board3.withinBorders(4, 100);
        int int20 = board3.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        int int9 = board2.getWidth();
        int int10 = board2.getHeight();
        boolean boolean13 = board2.withinBorders((int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        boolean boolean10 = board2.withinBorders((int) '#', (int) 'a');
        int int11 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        boolean boolean9 = board2.withinBorders(100, (int) (byte) -1);
        int int10 = board2.getWidth();
        boolean boolean13 = board2.withinBorders((int) (short) 100, (int) (short) 10);
        boolean boolean16 = board2.withinBorders((int) ' ', (int) (byte) 0);
        boolean boolean19 = board2.withinBorders((int) (byte) -1, (int) '#');
        int int20 = board2.getWidth();
        boolean boolean21 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        boolean boolean11 = board2.withinBorders((int) (byte) 100, (int) (short) -1);
        int int12 = board2.getWidth();
        boolean boolean15 = board2.withinBorders(1, (int) (short) 0);
        int int16 = board2.getWidth();
        int int17 = board2.getWidth();
        int int18 = board2.getHeight();
        int int19 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray4 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3 };
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray4);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray4);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray4);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray4);
        int int9 = board8.getHeight();
        boolean boolean10 = board8.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        boolean boolean7 = board3.withinBorders(2, (int) ' ');
        int int8 = board3.getWidth();
        boolean boolean11 = board3.withinBorders((int) '4', (int) (short) 1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int8 = board7.getHeight();
        int int9 = board7.getHeight();
        int int10 = board7.getWidth();
        boolean boolean13 = board7.withinBorders(4, (int) (byte) 100);
        boolean boolean14 = board7.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board9 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board10 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board11 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board12 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int13 = board12.getWidth();
        int int14 = board12.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        boolean boolean9 = board2.invariant();
        boolean boolean10 = board2.invariant();
        boolean boolean13 = board2.withinBorders(2, (int) (byte) 1);
        int int14 = board2.getWidth();
        boolean boolean15 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders(0, (int) (byte) 10);
        boolean boolean7 = board3.invariant();
        int int8 = board3.getHeight();
        int int9 = board3.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        boolean boolean11 = board2.withinBorders((int) (byte) 0, 100);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders(0, (-1));
        boolean boolean15 = board2.withinBorders((int) 'a', (int) (short) 10);
        int int16 = board2.getHeight();
        int int17 = board2.getHeight();
        boolean boolean20 = board2.withinBorders(1, (-1));
        boolean boolean23 = board2.withinBorders((int) (byte) -1, (int) (short) 0);
        java.lang.Class<?> wildcardClass24 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean11 = board8.withinBorders((int) (byte) 1, (-1));
        boolean boolean12 = board8.invariant();
        int int13 = board8.getHeight();
        int int14 = board8.getHeight();
        int int15 = board8.getHeight();
        boolean boolean18 = board8.withinBorders((int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        int int9 = board2.getWidth();
        boolean boolean10 = board2.invariant();
        int int11 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders(0, (int) (byte) -1);
        int int11 = board2.getWidth();
        int int12 = board2.getWidth();
        int int13 = board2.getWidth();
        int int14 = board2.getWidth();
        int int15 = board2.getHeight();
        int int16 = board2.getWidth();
        int int17 = board2.getHeight();
        boolean boolean18 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        int int4 = board2.getWidth();
        int int5 = board2.getHeight();
        int int6 = board2.getWidth();
        boolean boolean9 = board2.withinBorders((int) (byte) 1, 3);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int5 = board4.getWidth();
        int int6 = board4.getWidth();
        boolean boolean9 = board4.withinBorders(10, (int) '#');
        java.lang.Class<?> wildcardClass10 = board4.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        boolean boolean14 = board2.withinBorders((-1), (int) ' ');
        boolean boolean17 = board2.withinBorders((int) (byte) 100, (int) (short) 0);
        int int18 = board2.getHeight();
        int int19 = board2.getHeight();
        int int20 = board2.getWidth();
        int int21 = board2.getHeight();
        int int22 = board2.getWidth();
        boolean boolean25 = board2.withinBorders((int) (byte) 0, 1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        int int5 = board3.getWidth();
        boolean boolean6 = board3.invariant();
        boolean boolean9 = board3.withinBorders((int) (byte) -1, (int) 'a');
        int int10 = board3.getHeight();
        int int11 = board3.getHeight();
        boolean boolean14 = board3.withinBorders((int) (short) 10, (int) '#');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        int int8 = board2.getHeight();
        boolean boolean11 = board2.withinBorders(1, (int) ' ');
        boolean boolean12 = board2.invariant();
        int int13 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        boolean boolean14 = board2.withinBorders((-1), (int) ' ');
        boolean boolean17 = board2.withinBorders((int) (byte) 100, (int) (short) 0);
        boolean boolean20 = board2.withinBorders(5, (int) (byte) 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean8 = board2.invariant();
        boolean boolean11 = board2.withinBorders(4, 0);
        boolean boolean14 = board2.withinBorders(0, (int) 'a');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders((int) (short) 10, 1);
        int int11 = board2.getHeight();
        boolean boolean14 = board2.withinBorders(0, (int) (short) 100);
        int int15 = board2.getHeight();
        int int16 = board2.getHeight();
        int int17 = board2.getWidth();
        boolean boolean20 = board2.withinBorders((int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        boolean boolean14 = board2.withinBorders(10, (int) (byte) -1);
        boolean boolean17 = board2.withinBorders((int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        int int7 = board5.getWidth();
        boolean boolean8 = board5.invariant();
        boolean boolean9 = board5.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        boolean boolean14 = board2.withinBorders(10, (int) (byte) -1);
        int int15 = board2.getWidth();
        java.lang.Class<?> wildcardClass16 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((int) (short) 0, 5);
        int int9 = board2.getHeight();
        java.lang.Class<?> wildcardClass10 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) -1, (int) '4');
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        boolean boolean11 = board2.withinBorders((int) '#', 1);
        boolean boolean14 = board2.withinBorders(5, (int) (short) 1);
        boolean boolean17 = board2.withinBorders((int) (short) -1, 3);
        boolean boolean18 = board2.invariant();
        int int19 = board2.getHeight();
        boolean boolean20 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray3);
        boolean boolean10 = board7.withinBorders((int) (short) -1, 0);
        boolean boolean13 = board7.withinBorders((int) (byte) -1, (int) (short) -1);
        int int14 = board7.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders(10, 10);
        boolean boolean13 = board3.withinBorders((int) (short) 0, (int) 'a');
        boolean boolean14 = board3.invariant();
        int int15 = board3.getHeight();
        int int16 = board3.getWidth();
        boolean boolean17 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) 'a', (int) (byte) 10);
        boolean boolean8 = board2.invariant();
        boolean boolean9 = board2.invariant();
        boolean boolean12 = board2.withinBorders(10, 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        boolean boolean9 = board2.invariant();
        int int10 = board2.getWidth();
        int int11 = board2.getWidth();
        boolean boolean14 = board2.withinBorders((int) (short) 100, 0);
        int int15 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        int int10 = board2.getHeight();
        boolean boolean11 = board2.invariant();
        int int12 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        int int8 = board3.getHeight();
        boolean boolean9 = board3.invariant();
        int int10 = board3.getWidth();
        boolean boolean13 = board3.withinBorders((int) (byte) 10, 10);
        boolean boolean16 = board3.withinBorders((int) 'a', 100);
        int int17 = board3.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((int) (byte) 0, (int) (short) 1);
        int int9 = board2.getHeight();
        int int10 = board2.getHeight();
        int int11 = board2.getWidth();
        boolean boolean12 = board2.invariant();
        boolean boolean13 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        boolean boolean9 = board2.invariant();
        int int10 = board2.getHeight();
        boolean boolean11 = board2.invariant();
        int int12 = board2.getWidth();
        int int13 = board2.getWidth();
        java.lang.Class<?> wildcardClass14 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        int int8 = board3.getHeight();
        boolean boolean9 = board3.invariant();
        int int10 = board3.getWidth();
        boolean boolean13 = board3.withinBorders((int) (byte) 10, 10);
        boolean boolean14 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board9 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board10 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board11 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board12 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board13 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board14 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board15 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board16 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board17 = new nl.tudelft.jpacman.board.Board(squareArray2);
        java.lang.Class<?> wildcardClass18 = squareArray2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getWidth();
        int int6 = board3.getWidth();
        int int7 = board3.getHeight();
        boolean boolean8 = board3.invariant();
        int int9 = board3.getWidth();
        java.lang.Class<?> wildcardClass10 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board9 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board10 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board11 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board12 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board13 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board14 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean15 = board14.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders(10, 10);
        int int11 = board3.getWidth();
        boolean boolean14 = board3.withinBorders((int) (short) 100, (-1));
        int int15 = board3.getWidth();
        boolean boolean16 = board3.invariant();
        int int17 = board3.getWidth();
        int int18 = board3.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int9 = board8.getWidth();
        int int10 = board8.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders((int) (short) 10, 1);
        int int11 = board2.getHeight();
        boolean boolean12 = board2.invariant();
        boolean boolean13 = board2.invariant();
        boolean boolean16 = board2.withinBorders((int) (byte) 1, (int) '#');
        int int17 = board2.getWidth();
        boolean boolean18 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean4 = board3.invariant();
        boolean boolean5 = board3.invariant();
        int int6 = board3.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int8 = board7.getHeight();
        int int9 = board7.getHeight();
        int int10 = board7.getWidth();
        boolean boolean13 = board7.withinBorders(4, (int) (byte) 100);
        int int14 = board7.getWidth();
        boolean boolean15 = board7.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) (byte) 1, 5);
        int int8 = board4.getHeight();
        int int9 = board4.getHeight();
        int int10 = board4.getHeight();
        int int11 = board4.getHeight();
        boolean boolean14 = board4.withinBorders((-1), 0);
        boolean boolean17 = board4.withinBorders((int) (byte) 100, 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        boolean boolean14 = board2.withinBorders(10, (int) ' ');
        int int15 = board2.getHeight();
        int int16 = board2.getWidth();
        java.lang.Class<?> wildcardClass17 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int4 = board3.getWidth();
        boolean boolean7 = board3.withinBorders(0, (int) (short) 1);
        int int8 = board3.getHeight();
        boolean boolean11 = board3.withinBorders((int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        int int10 = board2.getHeight();
        boolean boolean11 = board2.invariant();
        int int12 = board2.getWidth();
        java.lang.Class<?> wildcardClass13 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        boolean boolean11 = board2.withinBorders((int) (byte) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass12 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders(10, 10);
        boolean boolean13 = board3.withinBorders((int) (short) 10, (int) (short) -1);
        boolean boolean14 = board3.invariant();
        boolean boolean15 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((int) (byte) 0, (int) (short) 1);
        int int9 = board2.getHeight();
        int int10 = board2.getHeight();
        boolean boolean11 = board2.invariant();
        int int12 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        nl.tudelft.jpacman.board.Square[][] squareArray0 = new nl.tudelft.jpacman.board.Square[][] {};
        nl.tudelft.jpacman.board.Board board1 = new nl.tudelft.jpacman.board.Board(squareArray0);
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray0);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray0);
        boolean boolean6 = board3.withinBorders((int) 'a', 3);
        java.lang.Class<?> wildcardClass7 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[][] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean11 = board8.withinBorders((int) '4', 0);
        int int12 = board8.getHeight();
        boolean boolean13 = board8.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((int) (byte) 0, (int) (short) 1);
        int int9 = board2.getHeight();
        int int10 = board2.getHeight();
        int int11 = board2.getWidth();
        boolean boolean12 = board2.invariant();
        boolean boolean15 = board2.withinBorders((int) (short) 1, 3);
        boolean boolean16 = board2.invariant();
        int int17 = board2.getHeight();
        int int18 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders(10, 10);
        boolean boolean13 = board3.withinBorders((int) (short) 0, (int) 'a');
        boolean boolean16 = board3.withinBorders(10, (int) (byte) 1);
        int int17 = board3.getWidth();
        java.lang.Class<?> wildcardClass18 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        boolean boolean11 = board2.withinBorders((int) (byte) 100, (int) (short) -1);
        int int12 = board2.getWidth();
        boolean boolean15 = board2.withinBorders(1, (int) (short) 0);
        int int16 = board2.getWidth();
        boolean boolean17 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        boolean boolean8 = board3.invariant();
        java.lang.Class<?> wildcardClass9 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders((int) ' ', 100);
        int int13 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean5 = board4.invariant();
        boolean boolean8 = board4.withinBorders((int) (short) 10, (int) (byte) 1);
        boolean boolean11 = board4.withinBorders((int) (short) 0, 0);
        int int12 = board4.getHeight();
        boolean boolean15 = board4.withinBorders(1, (int) '4');
        int int16 = board4.getWidth();
        int int17 = board4.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean5 = board4.invariant();
        boolean boolean8 = board4.withinBorders((int) (short) 10, (int) (byte) 1);
        boolean boolean11 = board4.withinBorders((int) (short) 0, 0);
        int int12 = board4.getHeight();
        boolean boolean15 = board4.withinBorders((int) (short) -1, 5);
        int int16 = board4.getHeight();
        int int17 = board4.getWidth();
        int int18 = board4.getWidth();
        boolean boolean21 = board4.withinBorders((int) (byte) 100, (int) (byte) 0);
        boolean boolean22 = board4.invariant();
        int int23 = board4.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean11 = board8.withinBorders((int) '4', 0);
        boolean boolean14 = board8.withinBorders((int) '#', (int) (byte) 1);
        boolean boolean15 = board8.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        int int9 = board2.getWidth();
        boolean boolean10 = board2.invariant();
        int int11 = board2.getWidth();
        int int12 = board2.getHeight();
        int int13 = board2.getWidth();
        boolean boolean14 = board2.invariant();
        boolean boolean15 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }
}

