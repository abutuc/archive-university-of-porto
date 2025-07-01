package pt.up.fe.basket;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Basket {

    private double totalValue = 0;

    private Map<Product, Integer> basket = new HashMap<Product, Integer>();

    public void add(final Product product, final int quantityToAdd) {
        // Pre-condition ensuring that product is not null
        assert product != null : "Product cannot be null";
        // Pre-condition ensuring that quantityToAdd is greater than 0
        assert quantityToAdd > 0 : "Quantity has to be greater than zero";
        // For the post-condition to happen, we need to save the old total value
        double currentTotalValue = this.totalValue;

        // Add the product to the basket, or update its current quantity
        int currentQuantity = this.basket.getOrDefault(product, 0);
        int newQuantity = currentQuantity + quantityToAdd;
        this.basket.put(product, newQuantity);

        // Update the total value
        double currentValueInTheBasketForTheProduct = product.getPrice() * currentQuantity;
        double newValueForTheProduct = product.getPrice() * newQuantity;
        this.totalValue = this.totalValue - currentValueInTheBasketForTheProduct + newValueForTheProduct;

        // Post-condition ensuring that the product was added to the cart
        assert this.basket.containsKey(product) : "Product was not inserted in the basket";
        // The post-condition ensures that the total value is greater than before
        assert totalValue > currentTotalValue : "Total value should be greater than previous total value";
    }

    public void remove(final Product product) {
        // Pre-condition ensuring that product is not null
        assert product != null : "Product cannot be null";
        // Pre-condition ensuring that product is in the basket
        assert this.basket.containsKey(product) : "Product must already be in the basket";

        // Update the total value
        int currentQuantity = this.basket.get(product);
        this.totalValue -= product.getPrice() * currentQuantity;

        // Remove the product from the basket
        this.basket.remove(product);

        // Post-condition ensuring that the product is no longer in the basket
        assert !this.basket.containsKey(product) : "Product is still in the basket";
        // Post-condition ensuring that the total value is greater than or equal to 0
        assert this.totalValue >= 0 : "Total value cannot be negative";
    }

    public double getTotalValue() {
        return this.totalValue;
    }

    public Set<Product> getProducts() {
        return this.basket.keySet();
    }

    public int quantityOf(Product product) {
        assert this.basket.containsKey(product);
        return this.basket.get(product);
    }
}
