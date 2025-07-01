package nl.tudelft.jpacman.board;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) -1, (int) '4');
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        int int10 = board2.getWidth();
        int int11 = board2.getWidth();
        int int12 = board2.getHeight();
        java.lang.Class<?> wildcardClass13 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getWidth();
        boolean boolean10 = board2.withinBorders((int) (short) 0, (int) '4');
        int int11 = board2.getWidth();
        boolean boolean14 = board2.withinBorders(3, (int) '4');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
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
        boolean boolean13 = board12.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        boolean boolean17 = board2.withinBorders(0, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        boolean boolean16 = board2.invariant();
        int int17 = board2.getHeight();
        int int18 = board2.getWidth();
        boolean boolean21 = board2.withinBorders((int) (byte) 0, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean4 = board3.invariant();
        boolean boolean5 = board3.invariant();
        boolean boolean6 = board3.invariant();
        boolean boolean9 = board3.withinBorders((int) (byte) -1, (int) (byte) 100);
        boolean boolean12 = board3.withinBorders((int) 'a', (int) '#');
        boolean boolean15 = board3.withinBorders((int) '4', 4);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        int int14 = board13.getHeight();
        java.lang.Class<?> wildcardClass15 = board13.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
        int int26 = board2.getHeight();
        int int27 = board2.getHeight();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        int int14 = board3.getHeight();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        boolean boolean9 = board2.withinBorders((int) (short) 100, (int) '#');
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        boolean boolean12 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        boolean boolean7 = board3.withinBorders(100, (int) (byte) -1);
        int int8 = board3.getHeight();
        boolean boolean11 = board3.withinBorders(10, 0);
        int int12 = board3.getHeight();
        boolean boolean13 = board3.invariant();
        boolean boolean16 = board3.withinBorders((int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        int int7 = board2.getWidth();
        boolean boolean10 = board2.withinBorders((int) (short) 100, 10);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        boolean boolean14 = board13.invariant();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
        int int10 = board7.getHeight();
        int int11 = board7.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        boolean boolean9 = board2.withinBorders((int) '4', (int) (short) 1);
        int int10 = board2.getHeight();
        boolean boolean13 = board2.withinBorders(0, (-1));
        boolean boolean16 = board2.withinBorders(10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int7 = board6.getHeight();
        boolean boolean10 = board6.withinBorders((int) ' ', (int) (byte) -1);
        boolean boolean13 = board6.withinBorders((int) '4', (int) (short) 10);
        boolean boolean16 = board6.withinBorders(2, 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        int int4 = board2.getWidth();
        int int5 = board2.getHeight();
        int int6 = board2.getWidth();
        boolean boolean7 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders(0, (int) (byte) -1);
        int int11 = board2.getHeight();
        int int12 = board2.getWidth();
        int int13 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
        int int10 = board8.getHeight();
        boolean boolean11 = board8.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((int) (byte) 10, (int) (short) -1);
        boolean boolean9 = board2.invariant();
        boolean boolean12 = board2.withinBorders(1, (int) '#');
        int int13 = board2.getWidth();
        boolean boolean16 = board2.withinBorders((-1), 1);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        boolean boolean19 = board2.invariant();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getWidth();
        int int6 = board3.getWidth();
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders((int) '4', (int) (byte) 100);
        boolean boolean13 = board3.withinBorders(4, (int) (short) 10);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getHeight();
        boolean boolean10 = board3.withinBorders(0, (int) (short) 1);
        int int11 = board3.getHeight();
        boolean boolean14 = board3.withinBorders((int) 'a', (int) (byte) -1);
        int int15 = board3.getHeight();
        int int16 = board3.getHeight();
        boolean boolean17 = board3.invariant();
        int int18 = board3.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
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
        boolean boolean15 = board8.invariant();
        int int16 = board8.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        int int17 = board2.getWidth();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        boolean boolean20 = board2.invariant();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        int int23 = board2.getHeight();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        int int12 = board3.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        nl.tudelft.jpacman.board.Square[][] squareArray0 = new nl.tudelft.jpacman.board.Square[][] {};
        nl.tudelft.jpacman.board.Board board1 = new nl.tudelft.jpacman.board.Board(squareArray0);
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray0);
        int int3 = board2.getWidth();
        int int4 = board2.getWidth();
        boolean boolean7 = board2.withinBorders((int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[][] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean7 = board4.withinBorders((int) (short) 1, (int) ' ');
        boolean boolean10 = board4.withinBorders(3, 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean8 = board7.invariant();
        boolean boolean11 = board7.withinBorders((-1), (-1));
        java.lang.Class<?> wildcardClass12 = board7.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders((int) (short) 10, 1);
        int int11 = board2.getWidth();
        boolean boolean12 = board2.invariant();
        boolean boolean15 = board2.withinBorders((int) (byte) 0, (int) (byte) 100);
        int int16 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        int int9 = board2.getWidth();
        boolean boolean10 = board2.invariant();
        boolean boolean13 = board2.withinBorders(10, 0);
        int int14 = board2.getWidth();
        boolean boolean15 = board2.invariant();
        int int16 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int9 = board8.getWidth();
        int int10 = board8.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        boolean boolean8 = board7.invariant();
        boolean boolean11 = board7.withinBorders((int) (byte) 100, (int) (byte) 10);
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
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getWidth();
        boolean boolean10 = board2.withinBorders((int) '#', 10);
        boolean boolean11 = board2.invariant();
        boolean boolean14 = board2.withinBorders(0, 2);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        boolean boolean17 = board8.withinBorders((int) '#', 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        nl.tudelft.jpacman.board.Board board13 = new nl.tudelft.jpacman.board.Board(squareArray4);
        nl.tudelft.jpacman.board.Board board14 = new nl.tudelft.jpacman.board.Board(squareArray4);
        nl.tudelft.jpacman.board.Board board15 = new nl.tudelft.jpacman.board.Board(squareArray4);
        nl.tudelft.jpacman.board.Board board16 = new nl.tudelft.jpacman.board.Board(squareArray4);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        boolean boolean12 = board3.invariant();
        boolean boolean13 = board3.invariant();
        boolean boolean14 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        boolean boolean16 = board2.invariant();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getWidth();
        boolean boolean6 = board3.invariant();
        int int7 = board3.getWidth();
        int int8 = board3.getHeight();
        int int9 = board3.getWidth();
        boolean boolean12 = board3.withinBorders(100, (-1));
        boolean boolean15 = board3.withinBorders(1, (int) (short) 0);
        boolean boolean18 = board3.withinBorders(0, (int) '4');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        int int10 = board5.getHeight();
        boolean boolean11 = board5.invariant();
        boolean boolean14 = board5.withinBorders((int) (byte) 10, 10);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        int int7 = board5.getWidth();
        int int8 = board5.getHeight();
        int int9 = board5.getWidth();
        boolean boolean10 = board5.invariant();
        int int11 = board5.getHeight();
        int int12 = board5.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        int int14 = board2.getHeight();
        boolean boolean17 = board2.withinBorders((-1), 10);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean7 = board4.withinBorders((int) (byte) 100, (int) (short) 0);
        int int8 = board4.getHeight();
        int int9 = board4.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
        int int14 = board2.getHeight();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        int int12 = board8.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        int int9 = board2.getHeight();
        int int10 = board2.getWidth();
        java.lang.Class<?> wildcardClass11 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        boolean boolean17 = board2.withinBorders(100, (int) (byte) -1);
        boolean boolean18 = board2.invariant();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        boolean boolean22 = board2.withinBorders((int) (byte) 100, (int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        boolean boolean9 = board2.withinBorders(100, (int) (byte) -1);
        boolean boolean10 = board2.invariant();
        boolean boolean13 = board2.withinBorders((int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders((int) ' ', 100);
        int int13 = board2.getHeight();
        boolean boolean14 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        int int15 = board2.getWidth();
        int int16 = board2.getWidth();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        java.lang.Class<?> wildcardClass16 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        int int8 = board2.getWidth();
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        int int12 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean5 = board4.invariant();
        boolean boolean8 = board4.withinBorders((int) (short) 10, (int) (byte) 1);
        boolean boolean11 = board4.withinBorders(0, 1);
        boolean boolean14 = board4.withinBorders(0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        boolean boolean9 = board2.withinBorders((int) '4', (int) (short) 1);
        int int10 = board2.getHeight();
        boolean boolean13 = board2.withinBorders(0, (-1));
        java.lang.Class<?> wildcardClass14 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        boolean boolean7 = board3.withinBorders(2, (int) ' ');
        int int8 = board3.getHeight();
        int int9 = board3.getHeight();
        int int10 = board3.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getHeight();
        int int6 = board2.getHeight();
        boolean boolean7 = board2.invariant();
        boolean boolean10 = board2.withinBorders(0, 10);
        int int11 = board2.getWidth();
        int int12 = board2.getHeight();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        int int16 = board4.getHeight();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getHeight();
        boolean boolean10 = board3.withinBorders(0, (int) (short) 1);
        int int11 = board3.getHeight();
        int int12 = board3.getWidth();
        java.lang.Class<?> wildcardClass13 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        int int15 = board14.getHeight();
        int int16 = board14.getHeight();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int8 = board7.getWidth();
        java.lang.Class<?> wildcardClass9 = board7.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        boolean boolean9 = board2.withinBorders((int) 'a', 2);
        int int10 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
        boolean boolean27 = board2.withinBorders(0, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean4 = board3.invariant();
        boolean boolean5 = board3.invariant();
        boolean boolean6 = board3.invariant();
        boolean boolean9 = board3.withinBorders((int) (byte) -1, (int) (byte) 100);
        boolean boolean12 = board3.withinBorders((int) 'a', (int) '#');
        boolean boolean15 = board3.withinBorders(0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        boolean boolean24 = board2.invariant();
        java.lang.Class<?> wildcardClass25 = board2.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
        int int18 = board2.getHeight();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders(10, 10);
        int int11 = board3.getWidth();
        java.lang.Class<?> wildcardClass12 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders(0, (int) (short) 1);
        int int7 = board2.getHeight();
        int int8 = board2.getHeight();
        java.lang.Class<?> wildcardClass9 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        int int18 = board3.getHeight();
        int int19 = board3.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        boolean boolean9 = board2.invariant();
        boolean boolean12 = board2.withinBorders((int) (byte) -1, 2);
        int int13 = board2.getWidth();
        boolean boolean14 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getWidth();
        boolean boolean6 = board3.invariant();
        boolean boolean7 = board3.invariant();
        boolean boolean10 = board3.withinBorders((int) (short) 1, (int) (byte) 1);
        boolean boolean13 = board3.withinBorders((int) (short) 10, (int) '#');
        int int14 = board3.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        nl.tudelft.jpacman.board.Square[][] squareArray0 = new nl.tudelft.jpacman.board.Square[][] {};
        nl.tudelft.jpacman.board.Board board1 = new nl.tudelft.jpacman.board.Board(squareArray0);
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray0);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray0);
        boolean boolean6 = board3.withinBorders((int) 'a', 3);
        boolean boolean9 = board3.withinBorders((int) (short) 0, (int) (byte) -1);
        boolean boolean12 = board3.withinBorders(10, (int) '#');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[][] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) (byte) 1, 5);
        boolean boolean8 = board4.invariant();
        int int9 = board4.getHeight();
        int int10 = board4.getHeight();
        boolean boolean13 = board4.withinBorders(5, (-1));
        boolean boolean16 = board4.withinBorders((int) (short) 0, (-1));
        java.lang.Class<?> wildcardClass17 = board4.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray4 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3 };
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray4);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray4);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray4);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray4);
        boolean boolean9 = board8.invariant();
        int int10 = board8.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) '4', (int) (byte) -1);
        boolean boolean8 = board4.invariant();
        boolean boolean11 = board4.withinBorders((int) 'a', (int) (short) 10);
        int int12 = board4.getHeight();
        boolean boolean13 = board4.invariant();
        int int14 = board4.getHeight();
        boolean boolean17 = board4.withinBorders((int) (byte) 100, 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        boolean boolean20 = board2.withinBorders((int) (byte) -1, (int) '#');
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
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        java.lang.Class<?> wildcardClass15 = board7.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        boolean boolean17 = board2.withinBorders(4, (int) 'a');
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
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean4 = board3.invariant();
        boolean boolean5 = board3.invariant();
        int int6 = board3.getHeight();
        boolean boolean7 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
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
        int int17 = board2.getWidth();
        int int18 = board2.getHeight();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        boolean boolean9 = board2.invariant();
        int int10 = board2.getHeight();
        java.lang.Class<?> wildcardClass11 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        int int9 = board2.getWidth();
        boolean boolean10 = board2.invariant();
        int int11 = board2.getWidth();
        boolean boolean12 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        boolean boolean16 = board2.invariant();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders(0, (int) (byte) 10);
        int int7 = board3.getHeight();
        int int8 = board3.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders((int) (short) 10, 1);
        int int11 = board2.getHeight();
        boolean boolean14 = board2.withinBorders(0, (int) (short) 100);
        boolean boolean17 = board2.withinBorders((int) (byte) 1, 0);
        boolean boolean18 = board2.invariant();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        int int14 = board2.getWidth();
        int int15 = board2.getWidth();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        boolean boolean9 = board2.withinBorders(100, (int) (byte) -1);
        int int10 = board2.getWidth();
        boolean boolean13 = board2.withinBorders((int) (short) 100, (int) (short) 10);
        int int14 = board2.getWidth();
        boolean boolean15 = board2.invariant();
        int int16 = board2.getHeight();
        int int17 = board2.getHeight();
        int int18 = board2.getWidth();
        java.lang.Class<?> wildcardClass19 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
        boolean boolean17 = board2.withinBorders((int) (short) -1, (int) (byte) 100);
        int int18 = board2.getHeight();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        int int9 = board2.getWidth();
        int int10 = board2.getWidth();
        boolean boolean11 = board2.invariant();
        boolean boolean14 = board2.withinBorders(1, (int) '#');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        int int13 = board2.getWidth();
        int int14 = board2.getHeight();
        int int15 = board2.getWidth();
        boolean boolean16 = board2.invariant();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        int int8 = board3.getWidth();
        int int9 = board3.getHeight();
        int int10 = board3.getHeight();
        int int11 = board3.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getWidth();
        boolean boolean6 = board3.invariant();
        boolean boolean7 = board3.invariant();
        boolean boolean10 = board3.withinBorders((int) (short) 1, (int) (byte) 1);
        boolean boolean11 = board3.invariant();
        boolean boolean12 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) (byte) 1, 5);
        int int8 = board4.getHeight();
        int int9 = board4.getHeight();
        int int10 = board4.getHeight();
        boolean boolean11 = board4.invariant();
        int int12 = board4.getHeight();
        int int13 = board4.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        boolean boolean9 = board2.invariant();
        boolean boolean12 = board2.withinBorders((int) '4', (int) (short) -1);
        int int13 = board2.getHeight();
        boolean boolean16 = board2.withinBorders((int) (byte) 10, 0);
        boolean boolean17 = board2.invariant();
        int int18 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getHeight();
        int int8 = board3.getWidth();
        java.lang.Class<?> wildcardClass9 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        boolean boolean19 = board16.withinBorders((int) ' ', 10);
        int int20 = board16.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        boolean boolean13 = board5.withinBorders((int) (short) -1, (-1));
        int int14 = board5.getWidth();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        boolean boolean9 = board2.invariant();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        boolean boolean14 = board2.withinBorders(4, (int) '#');
        int int15 = board2.getWidth();
        int int16 = board2.getHeight();
        boolean boolean19 = board2.withinBorders((int) '4', (int) (short) 1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        boolean boolean12 = board6.invariant();
        boolean boolean13 = board6.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        int int18 = board2.getHeight();
        int int19 = board2.getHeight();
        int int20 = board2.getWidth();
        java.lang.Class<?> wildcardClass21 = board2.getClass();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
        int int14 = board2.getWidth();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        nl.tudelft.jpacman.board.Board board18 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board19 = new nl.tudelft.jpacman.board.Board(squareArray2);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
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
        int int12 = board11.getHeight();
        int int13 = board11.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 1, (int) (byte) 10);
        boolean boolean8 = board2.invariant();
        boolean boolean11 = board2.withinBorders((int) (short) 100, (int) ' ');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        boolean boolean7 = board3.withinBorders((int) (short) 1, 0);
        int int8 = board3.getWidth();
        int int9 = board3.getWidth();
        boolean boolean12 = board3.withinBorders((int) 'a', 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean8 = board5.withinBorders((int) (short) 100, 0);
        boolean boolean9 = board5.invariant();
        int int10 = board5.getHeight();
        boolean boolean13 = board5.withinBorders((int) (byte) 100, 10);
        boolean boolean14 = board5.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
        int int10 = board2.getWidth();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
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
        int int12 = board5.getWidth();
        int int13 = board5.getWidth();
        int int14 = board5.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((int) (byte) 0, (int) (short) 1);
        boolean boolean11 = board2.withinBorders(0, (int) '#');
        boolean boolean12 = board2.invariant();
        int int13 = board2.getHeight();
        int int14 = board2.getHeight();
        boolean boolean17 = board2.withinBorders(2, (int) 'a');
        java.lang.Class<?> wildcardClass18 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        boolean boolean18 = board2.withinBorders(4, (int) (byte) 10);
        boolean boolean19 = board2.invariant();
        boolean boolean22 = board2.withinBorders((int) (short) 1, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        int int10 = board3.getWidth();
        java.lang.Class<?> wildcardClass11 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        nl.tudelft.jpacman.board.Board board13 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board14 = new nl.tudelft.jpacman.board.Board(squareArray3);
        int int15 = board14.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
        boolean boolean14 = board3.withinBorders(0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        boolean boolean26 = board2.withinBorders(5, 10);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        int int7 = board2.getHeight();
        boolean boolean8 = board2.invariant();
        boolean boolean11 = board2.withinBorders(0, (int) ' ');
        int int12 = board2.getHeight();
        java.lang.Class<?> wildcardClass13 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        boolean boolean13 = board2.invariant();
        boolean boolean14 = board2.invariant();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
        boolean boolean22 = board2.invariant();
        int int23 = board2.getHeight();
        boolean boolean26 = board2.withinBorders(0, 100);
        int int27 = board2.getHeight();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders((int) ' ', 100);
        int int13 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        boolean boolean11 = board2.withinBorders(0, (int) (byte) 100);
        int int12 = board2.getHeight();
        boolean boolean13 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        boolean boolean18 = board2.withinBorders((int) ' ', 10);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        boolean boolean7 = board4.withinBorders((int) 'a', (int) (short) 100);
        boolean boolean8 = board4.invariant();
        int int9 = board4.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
        int int18 = board2.getWidth();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        boolean boolean12 = board9.withinBorders((int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
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
        int int18 = board2.getHeight();
        int int19 = board2.getWidth();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int7 = board6.getHeight();
        boolean boolean8 = board6.invariant();
        boolean boolean9 = board6.invariant();
        int int10 = board6.getHeight();
        boolean boolean11 = board6.invariant();
        boolean boolean14 = board6.withinBorders((int) ' ', (int) (short) 100);
        int int15 = board6.getWidth();
        boolean boolean16 = board6.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getHeight();
        int int6 = board2.getHeight();
        int int7 = board2.getWidth();
        boolean boolean8 = board2.invariant();
        boolean boolean11 = board2.withinBorders(1, 3);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean7 = board4.withinBorders((-1), (int) (byte) 100);
        boolean boolean10 = board4.withinBorders(0, (int) (short) 100);
        int int11 = board4.getWidth();
        boolean boolean14 = board4.withinBorders(10, (int) (short) 100);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board6.invariant();
        boolean boolean10 = board6.withinBorders((int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
        int int12 = board3.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean4 = board3.invariant();
        int int5 = board3.getHeight();
        boolean boolean6 = board3.invariant();
        boolean boolean7 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders(10, 10);
        boolean boolean13 = board3.withinBorders((int) (short) 10, (int) (short) -1);
        java.lang.Class<?> wildcardClass14 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        int int9 = board2.getWidth();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        int int12 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
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
        boolean boolean19 = board16.withinBorders((int) ' ', 10);
        boolean boolean20 = board16.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        boolean boolean7 = board5.invariant();
        int int8 = board5.getWidth();
        java.lang.Class<?> wildcardClass9 = board5.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        nl.tudelft.jpacman.board.Square[][] squareArray0 = new nl.tudelft.jpacman.board.Square[][] {};
        nl.tudelft.jpacman.board.Board board1 = new nl.tudelft.jpacman.board.Board(squareArray0);
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray0);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray0);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray0);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray0);
        boolean boolean6 = board5.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[][] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        boolean boolean9 = board2.invariant();
        boolean boolean10 = board2.invariant();
        boolean boolean11 = board2.invariant();
        boolean boolean14 = board2.withinBorders(4, (int) '#');
        int int15 = board2.getWidth();
        int int16 = board2.getWidth();
        int int17 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
        int int14 = board2.getHeight();
        boolean boolean17 = board2.withinBorders(100, 0);
        java.lang.Class<?> wildcardClass18 = board2.getClass();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
        int int12 = board2.getWidth();
        boolean boolean13 = board2.invariant();
        boolean boolean14 = board2.invariant();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean8 = board2.invariant();
        boolean boolean11 = board2.withinBorders(0, (int) (byte) 0);
        int int12 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int5 = board4.getWidth();
        int int6 = board4.getWidth();
        boolean boolean9 = board4.withinBorders(10, (int) '#');
        boolean boolean10 = board4.invariant();
        boolean boolean11 = board4.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        boolean boolean9 = board2.invariant();
        boolean boolean12 = board2.withinBorders((int) '4', (int) (short) -1);
        int int13 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
        int int22 = board2.getWidth();
        int int23 = board2.getWidth();
        java.lang.Class<?> wildcardClass24 = board2.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        nl.tudelft.jpacman.board.Board board13 = new nl.tudelft.jpacman.board.Board(squareArray3);
        int int14 = board13.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        int int9 = board2.getWidth();
        boolean boolean10 = board2.invariant();
        boolean boolean13 = board2.withinBorders(10, 0);
        int int14 = board2.getWidth();
        boolean boolean17 = board2.withinBorders((int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getWidth();
        int int6 = board3.getHeight();
        int int7 = board3.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getHeight();
        boolean boolean10 = board3.withinBorders((int) ' ', (int) (byte) -1);
        boolean boolean11 = board3.invariant();
        int int12 = board3.getWidth();
        boolean boolean15 = board3.withinBorders((int) '4', (int) (short) 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        int int9 = board2.getWidth();
        int int10 = board2.getWidth();
        int int11 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int4 = board3.getHeight();
        boolean boolean5 = board3.invariant();
        java.lang.Class<?> wildcardClass6 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        nl.tudelft.jpacman.board.Square[][] squareArray0 = new nl.tudelft.jpacman.board.Square[][] {};
        nl.tudelft.jpacman.board.Board board1 = new nl.tudelft.jpacman.board.Board(squareArray0);
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray0);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray0);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray0);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray0);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray0);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray0);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[][] {});
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        int int8 = board3.getHeight();
        boolean boolean9 = board3.invariant();
        boolean boolean12 = board3.withinBorders(1, (int) (short) 100);
        java.lang.Class<?> wildcardClass13 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        boolean boolean9 = board2.withinBorders(100, (int) (byte) -1);
        boolean boolean10 = board2.invariant();
        int int11 = board2.getWidth();
        java.lang.Class<?> wildcardClass12 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) -1, (int) '4');
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        boolean boolean11 = board2.withinBorders(100, (int) (short) 10);
        int int12 = board2.getWidth();
        boolean boolean15 = board2.withinBorders(10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
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
        java.lang.Class<?> wildcardClass10 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders(10, 10);
        boolean boolean13 = board3.withinBorders((int) (short) 0, (int) 'a');
        boolean boolean16 = board3.withinBorders(10, (int) (byte) 1);
        boolean boolean19 = board3.withinBorders((int) (byte) 0, (int) '4');
        java.lang.Class<?> wildcardClass20 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) 'a', (int) (byte) 10);
        boolean boolean8 = board2.invariant();
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        int int9 = board2.getWidth();
        int int10 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        boolean boolean7 = board3.withinBorders((int) (short) 1, 0);
        int int8 = board3.getWidth();
        boolean boolean9 = board3.invariant();
        int int10 = board3.getWidth();
        boolean boolean13 = board3.withinBorders(10, 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) 'a', (int) (byte) 10);
        boolean boolean8 = board2.invariant();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders((int) '#', 1);
        boolean boolean15 = board2.withinBorders((int) (byte) 100, (int) ' ');
        int int16 = board2.getWidth();
        boolean boolean17 = board2.invariant();
        int int18 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getHeight();
        int int6 = board2.getWidth();
        int int7 = board2.getWidth();
        boolean boolean8 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        boolean boolean16 = board7.withinBorders((int) (byte) 0, 0);
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
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', 1);
        boolean boolean9 = board3.withinBorders(4, (int) (short) 100);
        boolean boolean12 = board3.withinBorders((int) (short) 100, 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        int int7 = board2.getWidth();
        java.lang.Class<?> wildcardClass8 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray4 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3 };
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray4);
        boolean boolean6 = board5.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
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
        int int15 = board8.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders(0, (int) (byte) -1);
        int int11 = board2.getHeight();
        int int12 = board2.getWidth();
        java.lang.Class<?> wildcardClass13 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        int int10 = board6.getHeight();
        boolean boolean11 = board6.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int7 = board6.getHeight();
        boolean boolean8 = board6.invariant();
        boolean boolean9 = board6.invariant();
        int int10 = board6.getHeight();
        boolean boolean11 = board6.invariant();
        boolean boolean14 = board6.withinBorders((int) ' ', (int) (short) 100);
        boolean boolean15 = board6.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
        int int16 = board2.getWidth();
        int int17 = board2.getWidth();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        boolean boolean14 = board6.withinBorders(2, (int) (byte) 0);
        int int15 = board6.getHeight();
        boolean boolean16 = board6.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
        boolean boolean23 = board2.withinBorders(2, 5);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        boolean boolean9 = board2.withinBorders(100, (int) (byte) -1);
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
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getHeight();
        boolean boolean6 = board3.invariant();
        int int7 = board3.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        int int10 = board7.getWidth();
        int int11 = board7.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        boolean boolean8 = board2.invariant();
        boolean boolean11 = board2.withinBorders((int) (short) 1, (int) '#');
        int int12 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) -1, (int) '4');
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders((int) (short) -1, 0);
        boolean boolean15 = board2.withinBorders((int) (short) 10, 4);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) -1, (int) '4');
        boolean boolean7 = board2.invariant();
        boolean boolean8 = board2.invariant();
        boolean boolean11 = board2.withinBorders(0, (int) (short) 100);
        boolean boolean14 = board2.withinBorders((int) (byte) 10, (int) ' ');
        int int15 = board2.getWidth();
        boolean boolean16 = board2.invariant();
        boolean boolean19 = board2.withinBorders((int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        boolean boolean7 = board3.withinBorders(100, (int) (byte) -1);
        int int8 = board3.getHeight();
        boolean boolean9 = board3.invariant();
        boolean boolean12 = board3.withinBorders((int) ' ', (int) (byte) -1);
        boolean boolean15 = board3.withinBorders((-1), (int) (byte) 0);
        int int16 = board3.getWidth();
        int int17 = board3.getHeight();
        int int18 = board3.getWidth();
        int int19 = board3.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getHeight();
        boolean boolean10 = board3.withinBorders(0, (int) (short) 1);
        int int11 = board3.getHeight();
        boolean boolean14 = board3.withinBorders((int) 'a', (int) (byte) -1);
        int int15 = board3.getHeight();
        boolean boolean16 = board3.invariant();
        int int17 = board3.getWidth();
        java.lang.Class<?> wildcardClass18 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getHeight();
        boolean boolean10 = board3.withinBorders((int) ' ', (int) (byte) -1);
        int int11 = board3.getWidth();
        int int12 = board3.getWidth();
        int int13 = board3.getHeight();
        int int14 = board3.getWidth();
        java.lang.Class<?> wildcardClass15 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        boolean boolean20 = board2.withinBorders(4, (int) (byte) -1);
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
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        boolean boolean7 = board3.withinBorders(100, (int) (byte) -1);
        int int8 = board3.getWidth();
        boolean boolean11 = board3.withinBorders((int) (short) 100, (int) '4');
        boolean boolean12 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
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
        boolean boolean20 = board2.withinBorders((int) '4', 0);
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
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean7 = board4.withinBorders((int) '4', (int) (byte) 10);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getHeight();
        boolean boolean10 = board3.withinBorders((int) ' ', (int) (byte) -1);
        int int11 = board3.getWidth();
        int int12 = board3.getWidth();
        int int13 = board3.getHeight();
        int int14 = board3.getWidth();
        boolean boolean15 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) -1, (int) '4');
        boolean boolean7 = board2.invariant();
        boolean boolean8 = board2.invariant();
        boolean boolean11 = board2.withinBorders(0, (int) (short) 100);
        boolean boolean12 = board2.invariant();
        int int13 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        boolean boolean17 = board2.invariant();
        boolean boolean18 = board2.invariant();
        boolean boolean19 = board2.invariant();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
        int int14 = board2.getHeight();
        boolean boolean17 = board2.withinBorders((int) (short) 100, 100);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        boolean boolean14 = board6.withinBorders(2, (int) (byte) 0);
        int int15 = board6.getHeight();
        int int16 = board6.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        boolean boolean8 = board7.invariant();
        boolean boolean11 = board7.withinBorders((int) (byte) 100, (int) (byte) 10);
        int int12 = board7.getWidth();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        nl.tudelft.jpacman.board.Board board15 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board16 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board17 = new nl.tudelft.jpacman.board.Board(squareArray1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
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
        int int10 = board2.getWidth();
        int int11 = board2.getHeight();
        boolean boolean14 = board2.withinBorders((int) (byte) 10, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
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
        int int20 = board2.getWidth();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean5 = board4.invariant();
        boolean boolean8 = board4.withinBorders((int) (short) 10, (int) (byte) 1);
        boolean boolean9 = board4.invariant();
        int int10 = board4.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        int int13 = board12.getHeight();
        int int14 = board12.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders(10, 10);
        boolean boolean13 = board3.withinBorders((int) (short) 0, (int) 'a');
        boolean boolean16 = board3.withinBorders(10, (int) (byte) 1);
        boolean boolean19 = board3.withinBorders((int) (byte) 0, (int) '4');
        boolean boolean20 = board3.invariant();
        int int21 = board3.getHeight();
        boolean boolean22 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        int int5 = board3.getWidth();
        boolean boolean6 = board3.invariant();
        boolean boolean9 = board3.withinBorders((int) (byte) -1, (int) 'a');
        int int10 = board3.getHeight();
        int int11 = board3.getWidth();
        int int12 = board3.getWidth();
        int int13 = board3.getHeight();
        int int14 = board3.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getWidth();
        boolean boolean10 = board2.withinBorders((int) (short) 0, (int) '4');
        int int11 = board2.getWidth();
        boolean boolean12 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int6 = board5.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        boolean boolean13 = board2.invariant();
        boolean boolean16 = board2.withinBorders((-1), 1);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
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
        int int18 = board2.getWidth();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((int) (byte) 0, (int) (short) 1);
        boolean boolean11 = board2.withinBorders(0, (int) '#');
        boolean boolean12 = board2.invariant();
        boolean boolean13 = board2.invariant();
        int int14 = board2.getHeight();
        boolean boolean15 = board2.invariant();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
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
        boolean boolean13 = board10.withinBorders((int) ' ', (int) (short) 10);
        java.lang.Class<?> wildcardClass14 = board10.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        int int16 = board2.getWidth();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        int int5 = board3.getWidth();
        int int6 = board3.getWidth();
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders((int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }
}

