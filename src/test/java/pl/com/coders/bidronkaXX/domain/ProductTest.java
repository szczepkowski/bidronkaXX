package pl.com.coders.bidronkaXX.domain;

import org.junit.jupiter.api.Test;
import pl.com.coders.bidronkaXX.math.Calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

        List<Float> prices = products.stream().map(product -> product.getPrice())
                .collect(Collectors.toList());

        Calculator calculator = new Calculator();
        float sum = calculator.addFloats(prices);


        for (Product product : products) {
            System.out.println(product.getName() + " " + product.getPrice() + " PLN");
        }
        System.out.println();
        System.out.println("w sumie " +sum + " PLN");
    }
}