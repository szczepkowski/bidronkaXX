package pl.com.coders.bidronkaXX.repository;

import org.springframework.stereotype.Repository;
import pl.com.coders.bidronkaXX.domain.Receipt;
import pl.com.coders.bidronkaXX.exceptions.ReceiptAlreadyExistException;
import pl.com.coders.bidronkaXX.exceptions.ReceiptNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class ReceiptRepository {

    private final List<Receipt> receipts = new ArrayList<>();

    public boolean add(Receipt receipt) throws ReceiptAlreadyExistException {

        List<Receipt> savedReceipts = receipts.stream().
                filter(receipt1 -> receipt1.getId().equals(receipt.getId()))
                .toList();

        if (!savedReceipts.isEmpty()) {
            throw new ReceiptAlreadyExistException(receipt.getId().toString());
        }

        this.receipts.add(receipt);
        return true;
    }

    public Receipt get(UUID uuid) throws ReceiptNotFoundException {
        return this.receipts.stream()
                .filter(receipt -> uuid.equals(receipt.getId()))
                .findFirst()
                .orElseThrow(() -> new ReceiptNotFoundException("Receipt not found with " + uuid));
    }

    //TODO add method delete receipt + test

    //TODO add me to update receipt + test

}
