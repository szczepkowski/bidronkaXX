package pl.com.coders.bidronkaXX.domain;

import pl.com.coders.bidronkaXX.math.Calculator;

import java.util.List;
import java.util.UUID;

public class Receipt {

    private final Calculator calculator = new Calculator();

    private final UUID id;
    private final List<Product> products;
    private Float sum = 0F;

    public Receipt(List<Product> products) {
        this.id = UUID.randomUUID();
        this.products = products;
        totalCost(products);
    }

    public void totalCost(List<Product> products) {
        sum = calculator.add(products);
    }

    public UUID getId() {
        return id;
    }

    public void add(Product product) {
        products.add(product);
        totalCost(products);
    }

    public List<Product> getProducts() {
        return products;
    }

    public Float getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "calculator=" + calculator +
                ", id=" + id +
                ", products=" + products +
                ", sum=" + sum +
                '}';
    }
}
