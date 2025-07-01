package pt.up.fe.basket;

import java.util.Objects;

public class Product {

    private final String name;

    private final double price;

    public Product(final String name, final double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.price);
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (! (obj instanceof Product)) {
            return false;
        }
        Product otherProduct = (Product) obj;
        return this.name.equals(otherProduct.name) && this.price == otherProduct.price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + '\'' + ", price=" + price + '}';
    }
}
