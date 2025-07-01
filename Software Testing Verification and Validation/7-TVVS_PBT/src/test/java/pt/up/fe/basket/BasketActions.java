package pt.up.fe.basket;

import net.jqwik.api.Arbitraries;
import net.jqwik.api.Arbitrary;
import net.jqwik.api.Combinators;
import net.jqwik.api.stateful.Action;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BasketActions {

    // A static list of hard-coded products
    private static List<Product> randomProducts = Arrays.asList(
            new Product("TV", 100),
            new Product("PlayStation", 150.3),
            new Product("Refrigerator", 180.27),
            new Product("Soda", 2.69)
    );

    public static Arbitrary<AddAction> addAction() {
        // Creates an arbitrary product out of the list of predefined products
        List<Arbitrary<Product>> arbitraryProducts = new ArrayList<Arbitrary<Product>>();
        for (Product product : randomProducts) {
            arbitraryProducts.add(Arbitraries.of(product));
        }
        Arbitrary<Product> products = Arbitraries.oneOf(arbitraryProducts);

        // Creates arbitrary quantities
        Arbitrary<Integer> quantities = Arbitraries.integers().between(1, 100);

        // Combines products and quantities, and generates AddActions
        return Combinators.combine(products, quantities).as((product, quantity) -> new AddAction(product, quantity));
    }

    public static Arbitrary<RemoveAction> removeAction() {
        // Returns an arbitrary remove action
        return Arbitraries.of(new RemoveAction());
    }

    private static class AddAction implements Action<Basket> {

        private final Product product;

        private final int quantity;

        public AddAction(final Product product, final int quantity) {
            this.product = product;
            this.quantity = quantity;
        }

        /**
         * The run method receives a Basket and, in this case, adds a new random product to it.
         *
         * @param basket the current state
         * @return
         */
        @Override
        public Basket run(Basket basket) {
            // Gets the current total value of the basket, so we can make the assertion later
            double currentTotalValue = basket.getTotalValue();

            // Adds the product to the basket
            basket.add(this.product, this.quantity);

            double newProductValue = this.product.getPrice() * this.quantity;
            double newTotalValue = currentTotalValue + newProductValue;

            // Asserts that the value of the basket is correct after the addition
            assertEquals(newTotalValue, basket.getTotalValue(), 0.00000001);

            // Returns the current basket so the next action starts from it
            return basket;
        }

        @Override
        public String toString() {
            return "AddAction{product=" + product + ", quantity=" + quantity + '}';
        }
    }

    private static class RemoveAction implements Action<Basket> {

        /**
         * The run method receives a Basket and, in this case, remove a new random product from it.
         *
         * @param basket the current state
         * @return
         */
        @Override
        public Basket run(Basket basket) {
            // Gets the current total value of the basket, so we can make the assertion later
            double currentTotalValue = basket.getTotalValue();

            // If the basket is empty, we skip this action. This may happen, as we do not control the sequence jqwik generates.
            Set<Product> productsInBasket = basket.getProducts();
            if (productsInBasket.isEmpty()) {
                return basket;
            }

            // Picks a random element in the basket to be removed
            Product randomProduct = productsInBasket.stream().skip(new Random().nextInt(productsInBasket.size())).findFirst().orElse(null);
            assertNotNull(randomProduct);
            double currentProductQuantity = basket.quantityOf(randomProduct);
            basket.remove(randomProduct);

            // Asserts the value of the basket without the random product we removed
            double basketTotalValueWithoutRandomProduct = currentTotalValue - randomProduct.getPrice() * currentProductQuantity;
            assertEquals(basketTotalValueWithoutRandomProduct, basket.getTotalValue(), 0.00000001);

            // Returns the current basket so the next action can continue from here
            return basket;
        }

        @Override
        public String toString() {
            return "RemoveAction";
        }
    }
}
