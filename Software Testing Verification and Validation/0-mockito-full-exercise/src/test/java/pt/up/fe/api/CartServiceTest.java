package pt.up.fe.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class CartServiceTest {

  @Mock
  PriceCalculator priceCalculatorMock;

  @InjectMocks
  CartService cartService;

  @Test
  public void testCalculateTotalPrice() {
    // TODO: Mock the PriceCalculator
    // TODO: Create CartService and inject the mock
    // TODO: Stub the behavior of the mock using when(...).thenReturn(...)
    // TODO: Call the method under test, i.e., calculateTotalPrice
    // TODO: Assert the result
    // TODO: Verify that the mock was interacted with correctly

    assertNotNull(priceCalculatorMock);

    when(priceCalculatorMock.getPrice("123")).thenReturn(23.0);
    when(priceCalculatorMock.getPrice("xpto")).thenReturn(5.0);

    double totalPrice = cartService.calculateTotalPrice(List.of("123", "xpto", "xpto"));

    assertEquals(33.0, totalPrice, 0);

    verify(priceCalculatorMock, times(1)).getPrice("123");
    verify(priceCalculatorMock, times(2)).getPrice("xpto");
  }
}
