package nl.tudelft.jpacman.board;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        java.lang.Class<?> wildcardClass3 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        java.lang.Class<?> wildcardClass3 = squareArray1.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        java.lang.Class<?> wildcardClass6 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getWidth();
        java.lang.Class<?> wildcardClass6 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        java.lang.Class<?> wildcardClass8 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        java.lang.Class<?> wildcardClass5 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        java.lang.Class<?> wildcardClass4 = squareArray1.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        boolean boolean11 = board2.withinBorders(0, (int) ' ');
        boolean boolean12 = board2.invariant();
        java.lang.Class<?> wildcardClass13 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        boolean boolean11 = board2.withinBorders((int) (byte) 100, (int) (short) -1);
        boolean boolean12 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        boolean boolean11 = board2.withinBorders(0, (int) ' ');
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
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        java.lang.Class<?> wildcardClass4 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int4 = board3.getWidth();
        java.lang.Class<?> wildcardClass5 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        boolean boolean9 = board2.withinBorders((int) 'a', 2);
        java.lang.Class<?> wildcardClass10 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getHeight();
        java.lang.Class<?> wildcardClass6 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        java.lang.Class<?> wildcardClass6 = board5.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders(0, (int) (short) 1);
        int int7 = board2.getHeight();
        java.lang.Class<?> wildcardClass8 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
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
        java.lang.Class<?> wildcardClass17 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        int int10 = board2.getHeight();
        java.lang.Class<?> wildcardClass11 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        java.lang.Class<?> wildcardClass10 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        boolean boolean9 = board2.invariant();
        int int10 = board2.getHeight();
        java.lang.Class<?> wildcardClass11 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray1);
        java.lang.Class<?> wildcardClass9 = squareArray1.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean4 = board3.invariant();
        boolean boolean5 = board3.invariant();
        java.lang.Class<?> wildcardClass6 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        java.lang.Class<?> wildcardClass6 = squareArray1.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
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
        java.lang.Class<?> wildcardClass18 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders(0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass7 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        java.lang.Class<?> wildcardClass5 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
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
        java.lang.Class<?> wildcardClass13 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
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
        java.lang.Class<?> wildcardClass16 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getHeight();
        int int6 = board2.getHeight();
        int int7 = board2.getWidth();
        java.lang.Class<?> wildcardClass8 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders(10, 10);
        boolean boolean13 = board3.withinBorders((int) (short) 0, (int) 'a');
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
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        int int7 = board2.getHeight();
        java.lang.Class<?> wildcardClass8 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
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
        boolean boolean12 = board2.invariant();
        java.lang.Class<?> wildcardClass13 = board2.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders((int) (short) 10, 1);
        java.lang.Class<?> wildcardClass11 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
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
        java.lang.Class<?> wildcardClass12 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        int int9 = board2.getHeight();
        int int10 = board2.getHeight();
        java.lang.Class<?> wildcardClass11 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        boolean boolean7 = board3.withinBorders(100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        boolean boolean9 = board2.withinBorders((int) (short) -1, 2);
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
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        java.lang.Class<?> wildcardClass6 = squareArray2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        java.lang.Class<?> wildcardClass7 = board5.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
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
        int int10 = board7.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
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
        java.lang.Class<?> wildcardClass14 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) -1, (int) '4');
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        java.lang.Class<?> wildcardClass9 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders(0, (int) (short) 10);
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
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean8 = board5.withinBorders((int) (short) 100, 0);
        java.lang.Class<?> wildcardClass9 = board5.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((int) (byte) 0, (int) (short) 1);
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
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int7 = board6.getHeight();
        java.lang.Class<?> wildcardClass8 = board6.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
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
        java.lang.Class<?> wildcardClass17 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders((int) (short) 10, 1);
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
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        boolean boolean9 = board5.withinBorders(0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
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
        java.lang.Class<?> wildcardClass19 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        java.lang.Class<?> wildcardClass8 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) -1, (int) '4');
        java.lang.Class<?> wildcardClass7 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders(0, (int) (byte) -1);
        boolean boolean13 = board2.withinBorders(100, 1);
        java.lang.Class<?> wildcardClass14 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders(10, 10);
        boolean boolean13 = board3.withinBorders((int) (short) 0, (int) 'a');
        boolean boolean14 = board3.invariant();
        java.lang.Class<?> wildcardClass15 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        boolean boolean10 = board2.withinBorders((int) '#', (int) 'a');
        boolean boolean13 = board2.withinBorders((int) '4', (int) (short) 1);
        java.lang.Class<?> wildcardClass14 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        boolean boolean9 = board2.withinBorders((int) (byte) 100, (int) ' ');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        int int7 = board2.getHeight();
        int int8 = board2.getWidth();
        java.lang.Class<?> wildcardClass9 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getWidth();
        boolean boolean6 = board3.invariant();
        java.lang.Class<?> wildcardClass7 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getWidth();
        int int6 = board3.getWidth();
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders((int) '4', (int) (byte) 100);
        boolean boolean11 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
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
        int int12 = board2.getHeight();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        int int8 = board3.getWidth();
        int int9 = board3.getHeight();
        boolean boolean12 = board3.withinBorders(0, (int) '#');
        boolean boolean15 = board3.withinBorders(2, (int) (short) -1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) -1, (int) '4');
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        boolean boolean11 = board2.withinBorders((int) '#', 1);
        java.lang.Class<?> wildcardClass12 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
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
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        int int5 = board3.getWidth();
        int int6 = board3.getWidth();
        java.lang.Class<?> wildcardClass7 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        boolean boolean7 = board2.invariant();
        boolean boolean10 = board2.withinBorders(1, (int) (short) 100);
        java.lang.Class<?> wildcardClass11 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        boolean boolean9 = board2.invariant();
        int int10 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((int) (byte) 0, (int) (short) 1);
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
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders(0, (int) (byte) -1);
        int int11 = board2.getWidth();
        int int12 = board2.getHeight();
        java.lang.Class<?> wildcardClass13 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        boolean boolean5 = board4.invariant();
        java.lang.Class<?> wildcardClass6 = board4.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) 'a', (int) (byte) 10);
        boolean boolean8 = board2.invariant();
        java.lang.Class<?> wildcardClass9 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int8 = board7.getWidth();
        java.lang.Class<?> wildcardClass9 = board7.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
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
        boolean boolean12 = board2.invariant();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        int int9 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
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
        boolean boolean16 = board7.withinBorders((int) '4', (int) ' ');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        java.lang.Class<?> wildcardClass5 = board4.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        boolean boolean7 = board3.withinBorders((int) (short) 1, 0);
        boolean boolean10 = board3.withinBorders((int) (short) 1, (int) '4');
        java.lang.Class<?> wildcardClass11 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders(10, 10);
        boolean boolean13 = board3.withinBorders((int) (byte) -1, 100);
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
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
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
        java.lang.Class<?> wildcardClass16 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int5 = board4.getWidth();
        java.lang.Class<?> wildcardClass6 = board4.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
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
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        java.lang.Class<?> wildcardClass8 = squareArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        int int5 = board3.getWidth();
        boolean boolean6 = board3.invariant();
        boolean boolean9 = board3.withinBorders((int) (byte) -1, (int) 'a');
        int int10 = board3.getHeight();
        java.lang.Class<?> wildcardClass11 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        boolean boolean11 = board2.withinBorders(0, (int) 'a');
        java.lang.Class<?> wildcardClass12 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
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
        java.lang.Class<?> wildcardClass15 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders((int) (short) 10, 1);
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
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        boolean boolean7 = board5.invariant();
        java.lang.Class<?> wildcardClass8 = board5.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) '4', (int) (byte) -1);
        boolean boolean8 = board4.invariant();
        int int9 = board4.getWidth();
        int int10 = board4.getHeight();
        java.lang.Class<?> wildcardClass11 = board4.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) -1, (int) '4');
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        boolean boolean11 = board2.withinBorders(100, (int) (short) 10);
        java.lang.Class<?> wildcardClass12 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
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
        boolean boolean14 = board2.invariant();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        int int9 = board2.getWidth();
        boolean boolean10 = board2.invariant();
        java.lang.Class<?> wildcardClass11 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        boolean boolean7 = board3.withinBorders((int) (short) 1, 0);
        boolean boolean10 = board3.withinBorders((int) (short) 1, (int) '4');
        boolean boolean11 = board3.invariant();
        java.lang.Class<?> wildcardClass12 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        int int5 = board3.getWidth();
        int int6 = board3.getWidth();
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders((int) (byte) 10, (int) (byte) 100);
        int int11 = board3.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray5);
        java.lang.Class<?> wildcardClass9 = squareArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((int) (byte) 0, (int) (short) 1);
        boolean boolean11 = board2.withinBorders(0, (int) '#');
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
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        java.lang.Class<?> wildcardClass8 = board7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int7 = board6.getHeight();
        int int8 = board6.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
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
        int int18 = board2.getHeight();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders(0, (-1));
        java.lang.Class<?> wildcardClass13 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        int int8 = board3.getHeight();
        boolean boolean9 = board3.invariant();
        int int10 = board3.getWidth();
        java.lang.Class<?> wildcardClass11 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        int int8 = board3.getHeight();
        java.lang.Class<?> wildcardClass9 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        int int5 = board3.getWidth();
        int int6 = board3.getWidth();
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders((int) (short) -1, 1);
        java.lang.Class<?> wildcardClass11 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
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
        boolean boolean14 = board2.withinBorders(5, (int) ' ');
        boolean boolean15 = board2.invariant();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getWidth();
        boolean boolean6 = board3.invariant();
        int int7 = board3.getWidth();
        java.lang.Class<?> wildcardClass8 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getWidth();
        int int6 = board3.getWidth();
        int int7 = board3.getWidth();
        boolean boolean8 = board3.invariant();
        java.lang.Class<?> wildcardClass9 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getHeight();
        java.lang.Class<?> wildcardClass6 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
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
        java.lang.Class<?> wildcardClass12 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        boolean boolean11 = board2.withinBorders((int) (byte) 100, (int) (short) -1);
        int int12 = board2.getWidth();
        boolean boolean13 = board2.invariant();
        java.lang.Class<?> wildcardClass14 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders(10, 10);
        int int11 = board3.getHeight();
        int int12 = board3.getHeight();
        java.lang.Class<?> wildcardClass13 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        java.lang.Class<?> wildcardClass5 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray1);
        java.lang.Class<?> wildcardClass9 = board8.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) -1, (int) '4');
        boolean boolean7 = board2.invariant();
        java.lang.Class<?> wildcardClass8 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getWidth();
        boolean boolean6 = board3.invariant();
        int int7 = board3.getWidth();
        int int8 = board3.getHeight();
        java.lang.Class<?> wildcardClass9 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        boolean boolean10 = board7.withinBorders((int) (short) 0, 0);
        java.lang.Class<?> wildcardClass11 = board7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int8 = board7.getWidth();
        boolean boolean11 = board7.withinBorders((int) '#', (int) (byte) 10);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        boolean boolean9 = board2.withinBorders((int) '4', (int) (short) 1);
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
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
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
        java.lang.Class<?> wildcardClass14 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
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
        int int10 = board2.getHeight();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        int int8 = board2.getWidth();
        int int9 = board2.getHeight();
        boolean boolean10 = board2.invariant();
        java.lang.Class<?> wildcardClass11 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        java.lang.Class<?> wildcardClass5 = board4.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean8 = board5.withinBorders((int) (short) 100, 0);
        int int9 = board5.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        boolean boolean7 = board4.withinBorders((int) 'a', (int) (short) 100);
        boolean boolean8 = board4.invariant();
        boolean boolean9 = board4.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders((int) (short) 10, 1);
        int int11 = board2.getHeight();
        boolean boolean14 = board2.withinBorders(0, (int) (short) 100);
        java.lang.Class<?> wildcardClass15 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        java.lang.Class<?> wildcardClass5 = board4.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean8 = board5.withinBorders((int) (short) 100, 0);
        boolean boolean9 = board5.invariant();
        int int10 = board5.getHeight();
        java.lang.Class<?> wildcardClass11 = board5.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
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
        boolean boolean20 = board2.withinBorders((int) (short) 1, 0);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getWidth();
        int int6 = board3.getWidth();
        int int7 = board3.getHeight();
        int int8 = board3.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        int int5 = board3.getWidth();
        int int6 = board3.getWidth();
        int int7 = board3.getWidth();
        java.lang.Class<?> wildcardClass8 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        boolean boolean7 = board3.withinBorders(100, (int) (byte) -1);
        int int8 = board3.getHeight();
        boolean boolean9 = board3.invariant();
        boolean boolean12 = board3.withinBorders((int) ' ', (int) (byte) -1);
        int int13 = board3.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
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
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        java.lang.Class<?> wildcardClass7 = squareArray2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders(0, (int) (byte) 10);
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders(100, 1);
        boolean boolean13 = board3.withinBorders((int) (short) -1, 10);
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
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getWidth();
        int int6 = board3.getWidth();
        int int7 = board3.getHeight();
        boolean boolean8 = board3.invariant();
        java.lang.Class<?> wildcardClass9 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
        java.lang.Class<?> wildcardClass18 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        java.lang.Class<?> wildcardClass9 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        boolean boolean7 = board3.withinBorders(2, 10);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders(10, 10);
        boolean boolean13 = board3.withinBorders((int) (short) 0, (int) 'a');
        boolean boolean16 = board3.withinBorders(10, (int) (byte) 1);
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
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
        java.lang.Class<?> wildcardClass22 = board3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders(10, 10);
        boolean boolean13 = board3.withinBorders(0, (int) '4');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray3);
        boolean boolean8 = board7.invariant();
        boolean boolean9 = board7.invariant();
        java.lang.Class<?> wildcardClass10 = board7.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        boolean boolean7 = board2.invariant();
        java.lang.Class<?> wildcardClass8 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        java.lang.Class<?> wildcardClass7 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        boolean boolean9 = board2.invariant();
        int int10 = board2.getWidth();
        java.lang.Class<?> wildcardClass11 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) '4', (int) (byte) -1);
        boolean boolean8 = board4.invariant();
        int int9 = board4.getHeight();
        java.lang.Class<?> wildcardClass10 = board4.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders(0, (int) (byte) 10);
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders((-1), (int) (byte) 100);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int7 = board6.getHeight();
        boolean boolean10 = board6.withinBorders((int) ' ', (int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = board6.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders(0, (int) (byte) 10);
        boolean boolean7 = board3.invariant();
        java.lang.Class<?> wildcardClass8 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
        java.lang.Class<?> wildcardClass14 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
        java.lang.Class<?> wildcardClass16 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean6 = board2.invariant();
        java.lang.Class<?> wildcardClass7 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
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
        boolean boolean16 = board2.invariant();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
        java.lang.Class<?> wildcardClass17 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders((int) (short) 10, 1);
        int int11 = board2.getHeight();
        boolean boolean12 = board2.invariant();
        int int13 = board2.getHeight();
        boolean boolean16 = board2.withinBorders((int) (byte) 100, 0);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
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
        java.lang.Class<?> wildcardClass16 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
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
        java.lang.Class<?> wildcardClass12 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders(10, 10);
        int int11 = board3.getWidth();
        boolean boolean14 = board3.withinBorders((int) (byte) -1, 5);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders((int) (short) 10, 1);
        int int11 = board2.getWidth();
        boolean boolean14 = board2.withinBorders(1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
        boolean boolean20 = board2.withinBorders((int) (short) 1, 0);
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
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
        java.lang.Class<?> wildcardClass10 = board5.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean4 = board3.invariant();
        boolean boolean5 = board3.invariant();
        boolean boolean6 = board3.invariant();
        int int7 = board3.getWidth();
        boolean boolean8 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        boolean boolean16 = board2.withinBorders(5, 10);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((int) (byte) 10, (int) (short) -1);
        boolean boolean9 = board2.invariant();
        int int10 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        boolean boolean7 = board3.withinBorders(100, (int) (byte) -1);
        int int8 = board3.getHeight();
        boolean boolean11 = board3.withinBorders(10, 0);
        boolean boolean14 = board3.withinBorders((int) (byte) -1, 0);
        int int15 = board3.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board6.invariant();
        int int8 = board6.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((int) (byte) 10, (int) (short) -1);
        boolean boolean9 = board2.invariant();
        boolean boolean12 = board2.withinBorders(1, (int) '#');
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
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        boolean boolean11 = board2.withinBorders(0, (int) 'a');
        boolean boolean12 = board2.invariant();
        java.lang.Class<?> wildcardClass13 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
        java.lang.Class<?> wildcardClass18 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) -1, (int) '4');
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        int int9 = board2.getWidth();
        java.lang.Class<?> wildcardClass10 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        boolean boolean9 = board2.withinBorders(100, (int) (byte) -1);
        int int10 = board2.getWidth();
        boolean boolean13 = board2.withinBorders((int) (short) 100, (int) (short) 10);
        boolean boolean16 = board2.withinBorders((int) ' ', (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        int int7 = board5.getWidth();
        boolean boolean8 = board5.invariant();
        java.lang.Class<?> wildcardClass9 = board5.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        int int9 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        boolean boolean11 = board2.withinBorders((int) (byte) 1, (-1));
        boolean boolean14 = board2.withinBorders((int) 'a', (int) (byte) 100);
        int int15 = board2.getWidth();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        java.lang.Class<?> wildcardClass14 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray4 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3 };
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray4);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray4);
        java.lang.Class<?> wildcardClass7 = squareArray4.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        java.lang.Class<?> wildcardClass15 = board7.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
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
        int int13 = board2.getHeight();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        boolean boolean9 = board2.withinBorders(100, (int) (byte) -1);
        int int10 = board2.getWidth();
        boolean boolean13 = board2.withinBorders((int) (short) 100, (int) (short) 10);
        int int14 = board2.getHeight();
        boolean boolean15 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
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
        java.lang.Class<?> wildcardClass13 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) 'a', (int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = board4.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        boolean boolean9 = board2.withinBorders(100, (int) (byte) -1);
        boolean boolean10 = board2.invariant();
        java.lang.Class<?> wildcardClass11 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        int int4 = board2.getHeight();
        java.lang.Class<?> wildcardClass5 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        boolean boolean7 = board5.invariant();
        int int8 = board5.getHeight();
        java.lang.Class<?> wildcardClass9 = board5.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders(0, 2);
        java.lang.Class<?> wildcardClass11 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        java.lang.Class<?> wildcardClass8 = board7.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
        int int17 = board2.getHeight();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        int int7 = board2.getHeight();
        boolean boolean8 = board2.invariant();
        boolean boolean11 = board2.withinBorders((int) (short) 1, 2);
        int int12 = board2.getHeight();
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
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
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
        boolean boolean14 = board2.invariant();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray3);
        boolean boolean8 = board7.invariant();
        java.lang.Class<?> wildcardClass9 = board7.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
        boolean boolean13 = board2.withinBorders(10, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        int int10 = board2.getHeight();
        int int11 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean4 = board3.invariant();
        int int5 = board3.getWidth();
        boolean boolean6 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders(0, (int) (byte) -1);
        int int11 = board2.getHeight();
        java.lang.Class<?> wildcardClass12 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getWidth();
        boolean boolean10 = board2.withinBorders((int) '#', 10);
        boolean boolean13 = board2.withinBorders((int) (byte) 100, (int) (short) 10);
        int int14 = board2.getHeight();
        boolean boolean17 = board2.withinBorders((int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean8 = board5.withinBorders((int) (short) 100, 0);
        boolean boolean9 = board5.invariant();
        int int10 = board5.getWidth();
        boolean boolean11 = board5.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        boolean boolean8 = board2.invariant();
        boolean boolean11 = board2.withinBorders((int) (short) -1, 0);
        boolean boolean14 = board2.withinBorders(0, 0);
        java.lang.Class<?> wildcardClass15 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        java.lang.Class<?> wildcardClass15 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        boolean boolean7 = board3.withinBorders(100, (int) (byte) -1);
        boolean boolean10 = board3.withinBorders(0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
        int int20 = board2.getHeight();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) 'a', (int) (byte) 1);
        boolean boolean8 = board4.invariant();
        boolean boolean11 = board4.withinBorders((int) (short) 1, (int) (short) 0);
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
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
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
        boolean boolean20 = board2.withinBorders((int) 'a', 1);
        int int21 = board2.getHeight();
        int int22 = board2.getHeight();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        boolean boolean9 = board2.invariant();
        int int10 = board2.getWidth();
        boolean boolean13 = board2.withinBorders(0, (int) (short) -1);
        java.lang.Class<?> wildcardClass14 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders(0, (int) (byte) -1);
        int int11 = board2.getWidth();
        int int12 = board2.getWidth();
        java.lang.Class<?> wildcardClass13 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
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
        java.lang.Class<?> wildcardClass12 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
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
        int int14 = board2.getHeight();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        int int9 = board2.getWidth();
        int int10 = board2.getWidth();
        java.lang.Class<?> wildcardClass11 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean4 = board3.invariant();
        java.lang.Class<?> wildcardClass5 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray3);
        java.lang.Class<?> wildcardClass7 = squareArray3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        nl.tudelft.jpacman.board.Square[][] squareArray0 = new nl.tudelft.jpacman.board.Square[][] {};
        nl.tudelft.jpacman.board.Board board1 = new nl.tudelft.jpacman.board.Board(squareArray0);
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray0);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray0);
        boolean boolean4 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[][] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) -1, (int) '4');
        boolean boolean7 = board2.invariant();
        int int8 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) -1, (int) '4');
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        boolean boolean11 = board2.withinBorders((int) '#', 1);
        boolean boolean14 = board2.withinBorders(5, (int) (short) 1);
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
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders(10, 10);
        boolean boolean13 = board3.withinBorders((int) (short) 0, (int) 'a');
        int int14 = board3.getHeight();
        java.lang.Class<?> wildcardClass15 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        java.lang.Class<?> wildcardClass4 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) '4', (int) (byte) -1);
        boolean boolean10 = board4.withinBorders((int) (byte) 1, (int) '#');
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
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) 'a', (int) (byte) 1);
        int int8 = board4.getHeight();
        boolean boolean11 = board4.withinBorders((int) ' ', 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        java.lang.Class<?> wildcardClass12 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board6.invariant();
        boolean boolean8 = board6.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((int) (byte) 10, (int) (short) -1);
        boolean boolean11 = board2.withinBorders((int) (short) 100, (int) (short) 10);
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
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        java.lang.Class<?> wildcardClass14 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
        java.lang.Class<?> wildcardClass10 = squareArray2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray5);
        boolean boolean9 = board8.invariant();
        java.lang.Class<?> wildcardClass10 = board8.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean8 = board5.withinBorders(100, 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
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
        int int24 = board2.getHeight();
        boolean boolean27 = board2.withinBorders((int) '4', (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
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
        boolean boolean14 = board2.withinBorders((int) (short) -1, (int) '4');
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
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
        boolean boolean20 = board2.withinBorders((int) 'a', 1);
        java.lang.Class<?> wildcardClass21 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getWidth();
        boolean boolean10 = board2.withinBorders((int) '#', 10);
        boolean boolean13 = board2.withinBorders((int) (byte) 100, (int) (short) 10);
        int int14 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
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
        int int12 = board5.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) -1, (int) '4');
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        boolean boolean11 = board2.withinBorders(100, (int) (short) 10);
        boolean boolean12 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        java.lang.Class<?> wildcardClass8 = squareArray1.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        boolean boolean11 = board2.withinBorders((-1), 0);
        java.lang.Class<?> wildcardClass12 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
        boolean boolean22 = board2.withinBorders((int) (short) 0, 100);
        java.lang.Class<?> wildcardClass23 = board2.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
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
        java.lang.Class<?> wildcardClass10 = board7.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean10 = board7.withinBorders(0, (int) 'a');
        int int11 = board7.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        int int7 = board2.getWidth();
        boolean boolean8 = board2.invariant();
        boolean boolean11 = board2.withinBorders((int) 'a', 3);
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
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) -1, (int) '4');
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        java.lang.Class<?> wildcardClass10 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
        java.lang.Class<?> wildcardClass13 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        int int24 = board2.getHeight();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board5.invariant();
        boolean boolean7 = board5.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getWidth();
        boolean boolean8 = board2.invariant();
        java.lang.Class<?> wildcardClass9 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean5 = board4.invariant();
        int int6 = board4.getHeight();
        java.lang.Class<?> wildcardClass7 = board4.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((int) (byte) 10, (int) (short) -1);
        boolean boolean9 = board2.invariant();
        boolean boolean10 = board2.invariant();
        java.lang.Class<?> wildcardClass11 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        boolean boolean7 = board3.withinBorders(100, (int) (byte) -1);
        int int8 = board3.getWidth();
        int int9 = board3.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        int int5 = board3.getWidth();
        boolean boolean6 = board3.invariant();
        int int7 = board3.getWidth();
        int int8 = board3.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
        boolean boolean10 = board7.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
        boolean boolean14 = board2.withinBorders(1, (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
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
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) -1, (int) '4');
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        boolean boolean11 = board2.withinBorders((int) '#', 1);
        int int12 = board2.getWidth();
        java.lang.Class<?> wildcardClass13 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int5 = board4.getWidth();
        boolean boolean6 = board4.invariant();
        boolean boolean9 = board4.withinBorders(1, (int) (short) 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getHeight();
        java.lang.Class<?> wildcardClass8 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        java.lang.Class<?> wildcardClass18 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        int int9 = board2.getWidth();
        java.lang.Class<?> wildcardClass10 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int5 = board4.getHeight();
        int int6 = board4.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders((int) 'a', (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
        java.lang.Class<?> wildcardClass10 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean4 = board3.invariant();
        int int5 = board3.getWidth();
        int int6 = board3.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray2);
        java.lang.Class<?> wildcardClass9 = squareArray2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
        boolean boolean15 = board2.withinBorders((-1), 100);
        int int16 = board2.getHeight();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
        boolean boolean11 = board10.invariant();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        boolean boolean11 = board2.withinBorders(0, (int) ' ');
        int int12 = board2.getWidth();
        java.lang.Class<?> wildcardClass13 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getWidth();
        boolean boolean10 = board2.withinBorders((int) '#', 10);
        boolean boolean13 = board2.withinBorders((int) (byte) 100, (int) (short) 10);
        int int14 = board2.getHeight();
        java.lang.Class<?> wildcardClass15 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        java.lang.Class<?> wildcardClass12 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
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
        boolean boolean14 = board2.withinBorders(0, (-1));
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        java.lang.Class<?> wildcardClass11 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        java.lang.Class<?> wildcardClass13 = board12.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean4 = board3.invariant();
        int int5 = board3.getHeight();
        java.lang.Class<?> wildcardClass6 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
        boolean boolean14 = board2.withinBorders((int) ' ', (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
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
        java.lang.Class<?> wildcardClass11 = board7.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        boolean boolean7 = board3.withinBorders((int) (short) 1, 0);
        java.lang.Class<?> wildcardClass8 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        int int8 = board3.getHeight();
        boolean boolean9 = board3.invariant();
        java.lang.Class<?> wildcardClass10 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        int int13 = board3.getWidth();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
        boolean boolean14 = board2.withinBorders(2, 0);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
        int int11 = board8.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray3);
        boolean boolean8 = board5.withinBorders((int) (byte) 10, 100);
        boolean boolean11 = board5.withinBorders((int) (byte) 0, (int) 'a');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray4 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3 };
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray4);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray4);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray4);
        boolean boolean10 = board7.withinBorders((int) '4', (int) (byte) 100);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders(0, (int) (short) 10);
        int int8 = board2.getHeight();
        boolean boolean9 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        boolean boolean9 = board2.withinBorders((int) 'a', 2);
        boolean boolean10 = board2.invariant();
        int int11 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders((int) 'a', (int) (byte) 0);
        boolean boolean13 = board2.invariant();
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
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray4 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3 };
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray4);
        int int6 = board5.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        boolean boolean19 = board2.withinBorders((int) (byte) -1, 0);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        java.lang.Class<?> wildcardClass5 = squareArray3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        int int7 = board2.getHeight();
        int int8 = board2.getWidth();
        int int9 = board2.getHeight();
        java.lang.Class<?> wildcardClass10 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
        boolean boolean12 = board7.invariant();
        int int13 = board7.getHeight();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        boolean boolean8 = board2.invariant();
        boolean boolean11 = board2.withinBorders(3, 100);
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
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        java.lang.Class<?> wildcardClass12 = board8.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders(10, 10);
        boolean boolean13 = board3.withinBorders((int) (byte) -1, 100);
        boolean boolean14 = board3.invariant();
        int int15 = board3.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) -1, (int) '4');
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        boolean boolean11 = board2.withinBorders((int) '#', 1);
        int int12 = board2.getWidth();
        int int13 = board2.getWidth();
        java.lang.Class<?> wildcardClass14 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        int int8 = board2.getWidth();
        java.lang.Class<?> wildcardClass9 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean5 = board4.invariant();
        boolean boolean8 = board4.withinBorders((int) (short) 10, (int) (byte) 1);
        boolean boolean11 = board4.withinBorders((int) (short) 0, 0);
        int int12 = board4.getHeight();
        boolean boolean13 = board4.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
        boolean boolean20 = board3.withinBorders(0, 1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        int int12 = board3.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        boolean boolean25 = board2.invariant();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        java.lang.Class<?> wildcardClass14 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) (byte) 1, 5);
        boolean boolean8 = board4.invariant();
        boolean boolean9 = board4.invariant();
        java.lang.Class<?> wildcardClass10 = board4.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
        int int15 = board7.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray3);
        java.lang.Class<?> wildcardClass6 = squareArray3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int8 = board7.getWidth();
        int int9 = board7.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders((int) (short) 10, 1);
        int int11 = board2.getWidth();
        int int12 = board2.getWidth();
        java.lang.Class<?> wildcardClass13 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray3);
        java.lang.Class<?> wildcardClass7 = board6.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) '4', (int) (byte) -1);
        boolean boolean8 = board4.invariant();
        int int9 = board4.getWidth();
        java.lang.Class<?> wildcardClass10 = board4.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        boolean boolean7 = board5.invariant();
        boolean boolean8 = board5.invariant();
        int int9 = board5.getWidth();
        java.lang.Class<?> wildcardClass10 = board5.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
        java.lang.Class<?> wildcardClass11 = board7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        boolean boolean9 = board2.withinBorders(100, (int) (byte) -1);
        int int10 = board2.getWidth();
        int int11 = board2.getWidth();
        java.lang.Class<?> wildcardClass12 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders(10, 10);
        boolean boolean13 = board3.withinBorders((int) (short) 0, (int) 'a');
        int int14 = board3.getHeight();
        boolean boolean15 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
        boolean boolean16 = board2.withinBorders(5, (int) (byte) 0);
        boolean boolean19 = board2.withinBorders(5, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
        boolean boolean20 = board2.withinBorders(0, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        int int7 = board5.getWidth();
        boolean boolean8 = board5.invariant();
        boolean boolean11 = board5.withinBorders(5, 0);
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
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
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
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        boolean boolean7 = board5.invariant();
        boolean boolean10 = board5.withinBorders((int) 'a', 0);
        boolean boolean11 = board5.invariant();
        java.lang.Class<?> wildcardClass12 = board5.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders(0, (int) (byte) 10);
        boolean boolean7 = board3.invariant();
        boolean boolean10 = board3.withinBorders((int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        boolean boolean9 = board2.withinBorders((int) (short) -1, 2);
        boolean boolean10 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
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
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        int int9 = board2.getWidth();
        boolean boolean10 = board2.invariant();
        boolean boolean13 = board2.withinBorders((int) (short) 0, (int) '#');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int5 = board4.getWidth();
        boolean boolean8 = board4.withinBorders(0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int4 = board3.getHeight();
        boolean boolean5 = board3.invariant();
        boolean boolean6 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        int int16 = board2.getWidth();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
        int int12 = board3.getWidth();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean7 = board4.withinBorders(0, (int) 'a');
        boolean boolean10 = board4.withinBorders(4, 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        boolean boolean7 = board5.invariant();
        int int8 = board5.getHeight();
        boolean boolean11 = board5.withinBorders((-1), (int) (short) 10);
        int int12 = board5.getHeight();
        java.lang.Class<?> wildcardClass13 = board5.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
        java.lang.Class<?> wildcardClass11 = board8.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getHeight();
        boolean boolean10 = board3.withinBorders(0, (int) (short) 1);
        int int11 = board3.getHeight();
        boolean boolean14 = board3.withinBorders(0, (int) (byte) 100);
        int int15 = board3.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        int int4 = board2.getWidth();
        int int5 = board2.getHeight();
        int int6 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders(0, (int) (short) 1);
        java.lang.Class<?> wildcardClass7 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        boolean boolean7 = board5.invariant();
        int int8 = board5.getHeight();
        int int9 = board5.getHeight();
        java.lang.Class<?> wildcardClass10 = board5.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
        java.lang.Class<?> wildcardClass11 = board10.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertArrayEquals(squareArray3, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        boolean boolean12 = board5.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) 'a', (int) (byte) 1);
        int int8 = board4.getWidth();
        boolean boolean11 = board4.withinBorders(5, 5);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders(0, (int) (byte) -1);
        int int11 = board2.getHeight();
        int int12 = board2.getWidth();
        int int13 = board2.getWidth();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        boolean boolean13 = board2.withinBorders(5, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
        boolean boolean17 = board2.withinBorders(100, (int) '4');
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
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean4 = board3.invariant();
        boolean boolean5 = board3.invariant();
        boolean boolean6 = board3.invariant();
        boolean boolean9 = board3.withinBorders((int) (byte) -1, (int) (byte) 100);
        boolean boolean10 = board3.invariant();
        boolean boolean13 = board3.withinBorders((int) (short) -1, 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
        int int14 = board2.getHeight();
        java.lang.Class<?> wildcardClass15 = board2.getClass();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        boolean boolean11 = board2.withinBorders((int) (byte) 1, (-1));
        boolean boolean14 = board2.withinBorders(2, (int) (byte) -1);
        boolean boolean17 = board2.withinBorders((int) (short) 10, (int) (short) -1);
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
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        int int9 = board2.getWidth();
        boolean boolean10 = board2.invariant();
        java.lang.Class<?> wildcardClass11 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean8 = board5.withinBorders((int) '#', (int) (byte) 10);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        int int18 = board2.getWidth();
        int int19 = board2.getHeight();
        boolean boolean22 = board2.withinBorders(0, 0);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        boolean boolean7 = board3.withinBorders((int) (short) 1, 0);
        int int8 = board3.getWidth();
        boolean boolean9 = board3.invariant();
        int int10 = board3.getWidth();
        int int11 = board3.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
        java.lang.Class<?> wildcardClass12 = board11.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
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
        boolean boolean17 = board3.invariant();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
        int int10 = board7.getWidth();
        java.lang.Class<?> wildcardClass11 = board7.getClass();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int5 = board4.getWidth();
        int int6 = board4.getWidth();
        int int7 = board4.getHeight();
        java.lang.Class<?> wildcardClass8 = board4.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
        int int16 = board2.getWidth();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean5 = board4.invariant();
        boolean boolean8 = board4.withinBorders((int) (short) 10, (int) (byte) 1);
        boolean boolean9 = board4.invariant();
        int int10 = board4.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        boolean boolean19 = board2.withinBorders(0, 0);
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
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
        boolean boolean18 = board7.withinBorders((-1), (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        boolean boolean13 = board2.invariant();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean8 = board2.invariant();
        boolean boolean9 = board2.invariant();
        java.lang.Class<?> wildcardClass10 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
        int int12 = board2.getWidth();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) (byte) 1, 5);
        boolean boolean10 = board4.withinBorders(10, (-1));
        int int11 = board4.getWidth();
        boolean boolean12 = board4.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
        boolean boolean16 = board2.withinBorders(1, (int) '4');
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) -1, (int) '4');
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        boolean boolean11 = board2.withinBorders(100, (int) (short) 10);
        int int12 = board2.getWidth();
        int int13 = board2.getWidth();
        java.lang.Class<?> wildcardClass14 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
        int int16 = board2.getHeight();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
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
        boolean boolean13 = board12.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        boolean boolean7 = board3.withinBorders((int) (short) 1, 0);
        boolean boolean10 = board3.withinBorders((int) (short) 1, (int) '4');
        boolean boolean13 = board3.withinBorders(0, (int) (byte) 10);
        int int14 = board3.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
        int int12 = board2.getHeight();
        int int13 = board2.getHeight();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) '4', (int) (byte) -1);
        boolean boolean10 = board4.withinBorders((int) (byte) 1, (int) '#');
        boolean boolean11 = board4.invariant();
        boolean boolean12 = board4.invariant();
        boolean boolean15 = board4.withinBorders(0, (int) (short) -1);
        java.lang.Class<?> wildcardClass16 = board4.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
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
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        int int8 = board3.getHeight();
        boolean boolean9 = board3.invariant();
        int int10 = board3.getWidth();
        int int11 = board3.getHeight();
        int int12 = board3.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        boolean boolean7 = board5.invariant();
        int int8 = board5.getHeight();
        int int9 = board5.getHeight();
        int int10 = board5.getHeight();
        java.lang.Class<?> wildcardClass11 = board5.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        boolean boolean20 = board2.withinBorders((int) ' ', 5);
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
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray3 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray5 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2, squareArray3, squareArray4 };
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray5);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray5);
        boolean boolean9 = board8.invariant();
        int int10 = board8.getHeight();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        boolean boolean20 = board2.withinBorders((int) (byte) 10, (int) (short) -1);
        boolean boolean23 = board2.withinBorders((int) (short) 100, 4);
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
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        boolean boolean7 = board4.withinBorders((int) 'a', (int) (short) 100);
        boolean boolean8 = board4.invariant();
        int int9 = board4.getHeight();
        java.lang.Class<?> wildcardClass10 = board4.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders((int) (short) 10, 1);
        int int11 = board2.getWidth();
        boolean boolean14 = board2.withinBorders(1, (int) (byte) -1);
        boolean boolean15 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        java.lang.Class<?> wildcardClass11 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders(10, 10);
        boolean boolean13 = board3.withinBorders((int) (short) 10, (int) (short) -1);
        boolean boolean14 = board3.invariant();
        int int15 = board3.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        boolean boolean7 = board3.withinBorders((int) (short) 1, 0);
        int int8 = board3.getWidth();
        int int9 = board3.getWidth();
        java.lang.Class<?> wildcardClass10 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
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
        java.lang.Class<?> wildcardClass10 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getWidth();
        boolean boolean6 = board3.invariant();
        boolean boolean9 = board3.withinBorders((int) (byte) -1, 10);
        boolean boolean10 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        boolean boolean9 = board2.withinBorders((int) '4', (int) (short) 1);
        int int10 = board2.getHeight();
        boolean boolean13 = board2.withinBorders(0, (-1));
        int int14 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean4 = board3.invariant();
        int int5 = board3.getHeight();
        int int6 = board3.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
        boolean boolean19 = board7.invariant();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int5 = board4.getWidth();
        int int6 = board4.getWidth();
        boolean boolean9 = board4.withinBorders(10, (int) '#');
        int int10 = board4.getHeight();
        boolean boolean13 = board4.withinBorders((int) '4', (int) 'a');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders((int) (short) 100, (int) (short) 10);
        boolean boolean15 = board2.withinBorders((int) ' ', (int) (short) 10);
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
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        boolean boolean9 = board2.withinBorders(100, (int) (byte) -1);
        int int10 = board2.getWidth();
        boolean boolean13 = board2.withinBorders((int) (short) 100, (int) (short) 10);
        int int14 = board2.getHeight();
        java.lang.Class<?> wildcardClass15 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        boolean boolean11 = board2.withinBorders((int) (byte) 10, (int) (byte) 0);
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
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        boolean boolean11 = board2.withinBorders(0, (int) 'a');
        int int12 = board2.getHeight();
        java.lang.Class<?> wildcardClass13 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        int int17 = board2.getHeight();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders(10, 10);
        int int11 = board3.getWidth();
        boolean boolean14 = board3.withinBorders((int) (short) 100, (-1));
        int int15 = board3.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) -1, (int) '4');
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
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
        java.lang.Class<?> wildcardClass16 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        boolean boolean21 = board2.invariant();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        boolean boolean7 = board5.invariant();
        int int8 = board5.getWidth();
        int int9 = board5.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
        int int25 = board2.getHeight();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        boolean boolean11 = board2.withinBorders((int) (byte) 1, (-1));
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
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        boolean boolean9 = board2.invariant();
        boolean boolean10 = board2.invariant();
        int int11 = board2.getHeight();
        int int12 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        int int7 = board5.getWidth();
        boolean boolean10 = board5.withinBorders(2, (int) (short) 1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        int int7 = board5.getWidth();
        int int8 = board5.getHeight();
        java.lang.Class<?> wildcardClass9 = board5.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        boolean boolean18 = board4.withinBorders((int) (short) 1, (int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        boolean boolean7 = board3.withinBorders(100, (int) (byte) -1);
        boolean boolean10 = board3.withinBorders((int) (short) 1, 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
        java.lang.Class<?> wildcardClass12 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int4 = board3.getWidth();
        int int5 = board3.getHeight();
        int int6 = board3.getWidth();
        boolean boolean7 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        int int19 = board3.getWidth();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
        boolean boolean17 = board4.invariant();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
        boolean boolean12 = board8.withinBorders(3, (int) 'a');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        boolean boolean10 = board2.withinBorders((int) '#', (int) 'a');
        java.lang.Class<?> wildcardClass11 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        boolean boolean11 = board2.withinBorders((int) (byte) 1, (-1));
        boolean boolean14 = board2.withinBorders(2, (int) (byte) -1);
        boolean boolean15 = board2.invariant();
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
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders(0, (int) (byte) 10);
        boolean boolean7 = board3.invariant();
        int int8 = board3.getWidth();
        int int9 = board3.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) (byte) 1, 5);
        boolean boolean8 = board4.invariant();
        java.lang.Class<?> wildcardClass9 = board4.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) '4', (int) (byte) -1);
        boolean boolean8 = board4.invariant();
        boolean boolean11 = board4.withinBorders((int) 'a', (int) (short) 10);
        boolean boolean14 = board4.withinBorders(1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
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
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        boolean boolean7 = board5.invariant();
        int int8 = board5.getWidth();
        boolean boolean11 = board5.withinBorders((-1), 2);
        java.lang.Class<?> wildcardClass12 = board5.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
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
        boolean boolean10 = board9.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        boolean boolean12 = board7.withinBorders((int) (byte) 100, 2);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        boolean boolean11 = board2.withinBorders(0, (int) ' ');
        int int12 = board2.getWidth();
        int int13 = board2.getHeight();
        java.lang.Class<?> wildcardClass14 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        boolean boolean9 = board2.invariant();
        int int10 = board2.getHeight();
        boolean boolean11 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean8 = board2.invariant();
        boolean boolean11 = board2.withinBorders(0, (int) (byte) 0);
        int int12 = board2.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        int int12 = board7.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
        int int13 = board3.getHeight();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        boolean boolean13 = board2.withinBorders((int) (short) -1, 0);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        java.lang.Class<?> wildcardClass12 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) -1, (int) '4');
        boolean boolean9 = board2.withinBorders((int) '#', 3);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getWidth();
        boolean boolean6 = board3.invariant();
        boolean boolean7 = board3.invariant();
        boolean boolean10 = board3.withinBorders((int) (short) 1, (int) (byte) 1);
        int int11 = board3.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) '4', (int) (byte) -1);
        boolean boolean8 = board4.invariant();
        boolean boolean11 = board4.withinBorders(0, (-1));
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
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        int int24 = board2.getHeight();
        int int25 = board2.getWidth();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        int int20 = board2.getHeight();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getHeight();
        int int6 = board2.getHeight();
        boolean boolean7 = board2.invariant();
        int int8 = board2.getWidth();
        java.lang.Class<?> wildcardClass9 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        int int12 = board2.getWidth();
        int int13 = board2.getHeight();
        java.lang.Class<?> wildcardClass14 = board2.getClass();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders(0, (int) (short) 1);
        int int7 = board2.getHeight();
        int int8 = board2.getHeight();
        boolean boolean11 = board2.withinBorders((int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        boolean boolean14 = board6.withinBorders(4, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = board6.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getWidth();
        boolean boolean6 = board3.invariant();
        boolean boolean9 = board3.withinBorders((int) (byte) -1, 10);
        int int10 = board3.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
        java.lang.Class<?> wildcardClass19 = board3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean7 = board4.withinBorders((int) (byte) 100, (int) (short) 0);
        int int8 = board4.getHeight();
        boolean boolean11 = board4.withinBorders(10, 3);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean8 = board7.invariant();
        java.lang.Class<?> wildcardClass9 = board7.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders(0, (int) (byte) -1);
        int int11 = board2.getWidth();
        int int12 = board2.getWidth();
        int int13 = board2.getHeight();
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
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
        boolean boolean19 = board2.withinBorders(0, 2);
        int int20 = board2.getWidth();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        int int11 = board6.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean8 = board5.withinBorders((-1), (int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = board5.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getHeight();
        boolean boolean8 = board3.withinBorders(100, (int) (short) 10);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) 'a', (int) (byte) 1);
        boolean boolean8 = board4.invariant();
        int int9 = board4.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) 'a', (int) (byte) 1);
        int int8 = board4.getWidth();
        java.lang.Class<?> wildcardClass9 = board4.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) 'a', (int) (byte) 1);
        int int8 = board4.getHeight();
        boolean boolean11 = board4.withinBorders(0, (int) 'a');
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        boolean boolean7 = board4.withinBorders((int) 'a', (int) (short) 100);
        int int8 = board4.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((int) (byte) 10, (int) (short) -1);
        boolean boolean9 = board2.invariant();
        boolean boolean12 = board2.withinBorders((int) (short) -1, (int) 'a');
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
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        boolean boolean9 = board2.invariant();
        int int10 = board2.getWidth();
        java.lang.Class<?> wildcardClass11 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        int int9 = board2.getWidth();
        int int10 = board2.getHeight();
        java.lang.Class<?> wildcardClass11 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) 'a', (int) (byte) 1);
        int int8 = board4.getHeight();
        int int9 = board4.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((int) (byte) 10, (int) (short) -1);
        boolean boolean11 = board2.withinBorders((int) (short) 100, (int) (short) 10);
        int int12 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        int int14 = board2.getWidth();
        java.lang.Class<?> wildcardClass15 = board2.getClass();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean4 = board3.invariant();
        int int5 = board3.getWidth();
        int int6 = board3.getHeight();
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders((int) (short) 10, 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        boolean boolean7 = board2.invariant();
        int int8 = board2.getWidth();
        boolean boolean9 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
        boolean boolean27 = board2.withinBorders((int) (byte) 0, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        int int5 = board4.getWidth();
        int int6 = board4.getWidth();
        boolean boolean9 = board4.withinBorders(10, (int) '#');
        int int10 = board4.getHeight();
        boolean boolean11 = board4.invariant();
        boolean boolean14 = board4.withinBorders(1, 0);
        int int15 = board4.getWidth();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        int int5 = board3.getWidth();
        boolean boolean6 = board3.invariant();
        boolean boolean9 = board3.withinBorders((int) (byte) -1, (int) 'a');
        boolean boolean10 = board3.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        int int7 = board2.getWidth();
        int int8 = board2.getWidth();
        boolean boolean9 = board2.invariant();
        boolean boolean12 = board2.withinBorders((int) (byte) -1, 2);
        boolean boolean13 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
        int int13 = board2.getWidth();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        int int6 = board2.getHeight();
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders((int) '4', (int) (byte) 1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board4.withinBorders((int) '4', (int) (byte) -1);
        boolean boolean8 = board4.invariant();
        int int9 = board4.getWidth();
        int int10 = board4.getHeight();
        boolean boolean13 = board4.withinBorders((int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        boolean boolean9 = board2.withinBorders(100, (int) (byte) -1);
        int int10 = board2.getWidth();
        int int11 = board2.getWidth();
        boolean boolean14 = board2.withinBorders(10, (int) (byte) 1);
        int int15 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        int int25 = board2.getWidth();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        boolean boolean9 = board2.invariant();
        int int10 = board2.getHeight();
        boolean boolean11 = board2.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders((-1), (int) (byte) -1);
        boolean boolean9 = board2.invariant();
        boolean boolean12 = board2.withinBorders(4, (int) '#');
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
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean6 = board5.invariant();
        boolean boolean7 = board5.invariant();
        boolean boolean8 = board5.invariant();
        java.lang.Class<?> wildcardClass9 = board5.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        int int8 = board2.getHeight();
        int int9 = board2.getWidth();
        boolean boolean10 = board2.invariant();
        java.lang.Class<?> wildcardClass11 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        boolean boolean7 = board4.withinBorders(2, (int) (byte) 0);
        boolean boolean8 = board4.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        boolean boolean15 = board2.invariant();
        java.lang.Class<?> wildcardClass16 = board2.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        boolean boolean17 = board12.withinBorders((int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) 0, (int) (short) 0);
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        boolean boolean11 = board2.withinBorders((-1), 0);
        boolean boolean14 = board2.withinBorders((int) (short) 0, (int) '#');
        boolean boolean17 = board2.withinBorders(10, (int) (byte) 1);
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
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray3);
        int int9 = board8.getWidth();
        int int10 = board8.getWidth();
        boolean boolean11 = board8.invariant();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        java.lang.Class<?> wildcardClass12 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        int int25 = board2.getHeight();
        int int26 = board2.getWidth();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray3);
        java.lang.Class<?> wildcardClass9 = board8.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        boolean boolean10 = board3.withinBorders(10, 10);
        int int11 = board3.getHeight();
        java.lang.Class<?> wildcardClass12 = board3.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        boolean boolean21 = board3.withinBorders(1, (int) (short) -1);
        java.lang.Class<?> wildcardClass22 = board3.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders(0, (int) (byte) -1);
        int int11 = board2.getHeight();
        int int12 = board2.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) (byte) -1, (int) '4');
        int int7 = board2.getWidth();
        int int8 = board2.getHeight();
        boolean boolean11 = board2.withinBorders((int) '#', 1);
        boolean boolean14 = board2.withinBorders(5, (int) (short) 1);
        int int15 = board2.getHeight();
        java.lang.Class<?> wildcardClass16 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray2 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray3 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1, squareArray2 };
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board7 = new nl.tudelft.jpacman.board.Board(squareArray3);
        nl.tudelft.jpacman.board.Board board8 = new nl.tudelft.jpacman.board.Board(squareArray3);
        int int9 = board8.getWidth();
        java.lang.Class<?> wildcardClass10 = board8.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertArrayEquals(squareArray2, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        int int5 = board2.getWidth();
        boolean boolean8 = board2.withinBorders(0, (int) (short) 10);
        boolean boolean11 = board2.withinBorders(0, (int) ' ');
        int int12 = board2.getHeight();
        boolean boolean15 = board2.withinBorders(1, 0);
        java.lang.Class<?> wildcardClass16 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        boolean boolean14 = board2.withinBorders((int) (byte) 1, 10);
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
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        java.lang.Class<?> wildcardClass11 = board2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board5.invariant();
        java.lang.Class<?> wildcardClass7 = board5.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders((int) 'a', (int) (byte) 10);
        int int7 = board2.getWidth();
        boolean boolean10 = board2.withinBorders((int) '#', 10);
        boolean boolean13 = board2.withinBorders((int) (byte) 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass14 = board2.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
        boolean boolean16 = board2.invariant();
        int int17 = board2.getHeight();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getWidth();
        int int8 = board3.getHeight();
        boolean boolean9 = board3.invariant();
        boolean boolean12 = board3.withinBorders(0, (int) (short) 1);
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
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int3 = board2.getWidth();
        boolean boolean4 = board2.invariant();
        boolean boolean7 = board2.withinBorders((int) (byte) 0, (int) 'a');
        boolean boolean8 = board2.invariant();
        int int9 = board2.getHeight();
        boolean boolean12 = board2.withinBorders((int) (short) 0, 100);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
        int int16 = board2.getWidth();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        boolean boolean6 = board3.withinBorders((int) 'a', (int) '4');
        int int7 = board3.getHeight();
        boolean boolean10 = board3.withinBorders((int) ' ', (int) (byte) -1);
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
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getHeight();
        boolean boolean7 = board3.withinBorders((int) (short) 1, 0);
        int int8 = board3.getWidth();
        boolean boolean9 = board3.invariant();
        int int10 = board3.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[] squareArray1 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray2 = new nl.tudelft.jpacman.board.Square[][] { squareArray0, squareArray1 };
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board4 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board5 = new nl.tudelft.jpacman.board.Board(squareArray2);
        nl.tudelft.jpacman.board.Board board6 = new nl.tudelft.jpacman.board.Board(squareArray2);
        boolean boolean7 = board6.invariant();
        boolean boolean10 = board6.withinBorders(0, 0);
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertArrayEquals(squareArray1, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        int int5 = board3.getWidth();
        boolean boolean8 = board3.withinBorders((int) (byte) 100, 1);
        int int9 = board3.getHeight();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        nl.tudelft.jpacman.board.Square[] squareArray0 = new nl.tudelft.jpacman.board.Square[] {};
        nl.tudelft.jpacman.board.Square[][] squareArray1 = new nl.tudelft.jpacman.board.Square[][] { squareArray0 };
        nl.tudelft.jpacman.board.Board board2 = new nl.tudelft.jpacman.board.Board(squareArray1);
        nl.tudelft.jpacman.board.Board board3 = new nl.tudelft.jpacman.board.Board(squareArray1);
        int int4 = board3.getWidth();
        boolean boolean7 = board3.withinBorders(100, (int) (byte) -1);
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
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        int int21 = board2.getWidth();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        java.lang.Class<?> wildcardClass12 = board7.getClass();
        org.junit.Assert.assertNotNull(squareArray0);
        org.junit.Assert.assertArrayEquals(squareArray0, new nl.tudelft.jpacman.board.Square[] {});
        org.junit.Assert.assertNotNull(squareArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        int int17 = board2.getHeight();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }
}

