package pl.com.coders.bidronkaXX.repository;

import org.junit.jupiter.api.Test;
import pl.com.coders.bidronkaXX.domain.Product;
import pl.com.coders.bidronkaXX.domain.Receipt;
import pl.com.coders.bidronkaXX.exceptions.ReceiptAlreadyExistException;
import pl.com.coders.bidronkaXX.exceptions.ReceiptNotFoundException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReceiptRepositoryTest {

    private final ReceiptRepository receiptRepository = new ReceiptRepository();

    @Test
    void add() throws ReceiptNotFoundException, ReceiptAlreadyExistException {
        List<Product> products = List.of(new Product("masło", 6.5F), new Product("chleb", 5F));
        Receipt receipt = new Receipt(products);
        receiptRepository.add(receipt);
        Receipt receipt1 = receiptRepository.get(receipt.getId());

        assertEquals(11.5F, receipt1.getSum());
        assertEquals(2, receipt1.getProducts().size());

    }

    @Test
    void get() throws ReceiptNotFoundException, ReceiptAlreadyExistException {
        List<Product> products = List.of(new Product("masło", 6.5F), new Product("chleb", 5F));
        Receipt receipt = new Receipt(products);
        receiptRepository.add(receipt);

        Receipt receipt1 = receiptRepository.get(receipt.getId());

        assertEquals(receipt, receipt1);
    }
}