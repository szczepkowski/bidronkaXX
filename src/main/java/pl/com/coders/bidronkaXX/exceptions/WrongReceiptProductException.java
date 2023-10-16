package pl.com.coders.bidronkaXX.exceptions;

import pl.com.coders.bidronkaXX.domain.Product;

public class WrongReceiptProductException extends Exception{

    public WrongReceiptProductException(Product product) {
        super("Receipt Product price and name cannot be null" + product.toString());
    }
}
