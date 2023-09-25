package pl.com.coders.bidronkaXX.domain;

import java.time.LocalDateTime;

public class Product {

    private final String name;
    private final Float price;

    private final LocalDateTime created;
    private final LocalDateTime updated;

    public Product(String name, Float price) {
        this.name = name;
        this.price = price;
        this.created = LocalDateTime.now();
        this.updated = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public Float getPrice() {
        return price;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }
}
