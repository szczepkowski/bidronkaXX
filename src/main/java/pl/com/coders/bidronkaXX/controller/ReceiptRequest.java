package pl.com.coders.bidronkaXX.controller;

import pl.com.coders.bidronkaXX.domain.Product;

import java.util.List;

public class ReceiptRequest {

    private List<Product> products;

    public ReceiptRequest(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public ReceiptRequest() {
    }
}
