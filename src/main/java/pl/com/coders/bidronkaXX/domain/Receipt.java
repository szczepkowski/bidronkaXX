package pl.com.coders.bidronkaXX.domain;

import java.util.List;

public class Receipt {

    private List<Product> products;

    public Receipt(List<Product> products) {
        this.products = products;
    }

    //TODO finish ticket - calculate cost of all products
    public Float totalCost(List<Product> products) {
        return 0F;
    }

    //TODO finish ticket add to receipt
    public Product add(Product product) {
        return null;
    }
}
