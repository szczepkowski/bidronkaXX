package pl.com.coders.bidronkaXX.controller;

import pl.com.coders.bidronkaXX.domain.Product;

import java.util.List;
import java.util.UUID;

public class ReceiptView {

    private UUID id;
    private List<Product> products;
    private Float sum = 0F;

    public ReceiptView(UUID id, List<Product> products, Float sum) {
        this.id = id;
        this.products = products;
        this.sum = sum;
    }

    public ReceiptView() {
    }

    public UUID getId() {
        return id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Float getSum() {
        return sum;
    }
}
