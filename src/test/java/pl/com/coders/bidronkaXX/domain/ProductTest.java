package pl.com.coders.bidronkaXX.domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testProduct() {
        Product butter = new Product("masło", 6F);
        Product bread = new Product("chleb", 5F);
        Product water = new Product("woda", 2.50F);

        List<Product> products = new ArrayList<>();
        products.add(butter);
        products.add(bread);
        products.add(water);

    }
}