package pt.up.fe.demo;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyClassTest {

  MyClass tester;

  @BeforeEach
  void initializeTester() {
    tester = new MyClass();
  }

  @Test
  public void testExceptionIsThrown() {
    assertThrows(IllegalArgumentException.class, () -> tester.multiply(1000, 5));
  }

  @Test
  public void testMultiply() {
    assertEquals(50, tester.multiply(10, 5), "10 x 5 must be 50");
  }

  @Test
  public void testGrouped() {
    assertAll(
            () -> assertThrows(IllegalArgumentException.class, () -> tester.multiply(1000, 5)),
            () -> assertEquals(50, tester.multiply(10, 5), "10 x 5 must be 50")
    );
  }
}
