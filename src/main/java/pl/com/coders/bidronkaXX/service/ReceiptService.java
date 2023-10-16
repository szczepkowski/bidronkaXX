package pl.com.coders.bidronkaXX.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.coders.bidronkaXX.controller.ReceiptRequest;
import pl.com.coders.bidronkaXX.controller.ReceiptView;
import pl.com.coders.bidronkaXX.domain.Product;
import pl.com.coders.bidronkaXX.domain.Receipt;
import pl.com.coders.bidronkaXX.exceptions.ReceiptAlreadyExistException;
import pl.com.coders.bidronkaXX.exceptions.ReceiptNotFoundException;
import pl.com.coders.bidronkaXX.exceptions.WrongReceiptProductException;
import pl.com.coders.bidronkaXX.repository.ReceiptRepository;

import java.util.UUID;

@Service
//TODO TESTS mockito
//https://www.baeldung.com/mockito-annotations
public class ReceiptService {

    @Autowired
    private ReceiptRepository receiptRepository;

    public ReceiptView add(ReceiptRequest receiptRequest) throws ReceiptAlreadyExistException, ReceiptNotFoundException {
        Receipt receipt = new Receipt(receiptRequest.getProducts());
        receiptRepository.add(receipt);

        Receipt savedReceipt = receiptRepository.get(receipt.getId());
        return new ReceiptView(savedReceipt.getId(), savedReceipt.getProducts(), savedReceipt.getSum(), savedReceipt.getStatus());
    }

    public ReceiptView get(UUID uuid) throws ReceiptNotFoundException {
        Receipt receipt = receiptRepository.get(uuid);
        return new ReceiptView(receipt.getId(), receipt.getProducts(), receipt.getSum(), receipt.getStatus());
    }

    public ReceiptView finish(UUID uuid) throws ReceiptNotFoundException {
        Receipt receipt = receiptRepository.get(uuid);
        receipt.finish();
        Receipt update = receiptRepository.update(receipt);
        return new ReceiptView(update.getId(), update.getProducts(), update.getSum(), update.getStatus());
    }

    public ReceiptView addProduct(UUID uuid, Product product) throws ReceiptNotFoundException, WrongReceiptProductException {
        if (product.getPrice() == null || product.getName() == null) {
            throw new WrongReceiptProductException(product);
        }
        Receipt receipt = this.receiptRepository.get(uuid);
        receipt.addProduct(product);
        Receipt update = this.receiptRepository.update(receipt);
        return new ReceiptView(update.getId(), update.getProducts(), update.getSum(), update.getStatus());
    }


    //TODO dopisać metodę delete + testy

    //TODO dopisać metodę update + testy
}
