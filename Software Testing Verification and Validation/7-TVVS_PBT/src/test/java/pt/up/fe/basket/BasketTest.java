package pt.up.fe.basket;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketTest {

    private Basket basket;

    @BeforeEach
    public void setUp() {
        this.basket = new Basket();
    }

    @Test
    public void addProducts() {
        this.basket.add(new Product("TV", 10.5), 2);
        this.basket.add(new Product("Playstation", 100.0), 1);
        assertEquals(10.5*2 + 100.0*1, this.basket.getTotalValue(),0.0);
    }

    @Test
    public void addSameProductTwice() {
        Product product = new Product("TV", 10.5);
        this.basket.add(product, 2);
        this.basket.add(product, 3);
        assertEquals(10.5*5, this.basket.getTotalValue(), 0.0);
    }

    @Test
    public void removeProducts() {
        this.basket.add(new Product("TV", 100.0), 1);
        Product product = new Product("PlayStation", 10.0);
        this.basket.add(product, 2);
        this.basket.remove(product);
        assertEquals(100.0, this.basket.getTotalValue(),0.0);
    }

    @Test // Note: This test fails == reveals a bug
    public void testZeroValue() {
        Product p1 = new Product("TV", 100.0);
        Product p2 = new Product("PlayStation", 150.3);
        this.basket.add(p1, 4);
        this.basket.add(p2, 1);
        this.basket.remove(p1);
        this.basket.remove(p2);
    }

    // add tests for exceptional cases, e.g., remove a product that is not
    // in the basket, etc ...
}
