package pl.com.coders.bidronkaXX.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.coders.bidronkaXX.controller.ReceiptRequest;
import pl.com.coders.bidronkaXX.controller.ReceiptView;
import pl.com.coders.bidronkaXX.domain.Receipt;
import pl.com.coders.bidronkaXX.exceptions.ReceiptAlreadyExistException;
import pl.com.coders.bidronkaXX.exceptions.ReceiptNotFoundException;
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
        return new ReceiptView(savedReceipt.getId(), savedReceipt.getProducts(), savedReceipt.getSum());
    }

    public ReceiptView get(UUID uuid) throws ReceiptNotFoundException {
        Receipt receipt = receiptRepository.get(uuid);
        return new ReceiptView(receipt.getId(), receipt.getProducts(), receipt.getSum());
    }

    //TODO dopisać metodę delete + testy

    //TODO dopisać metodę update + testy
}
