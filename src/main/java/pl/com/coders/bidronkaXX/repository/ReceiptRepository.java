package pl.com.coders.bidronkaXX.repository;

import org.springframework.stereotype.Repository;
import pl.com.coders.bidronkaXX.domain.Receipt;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
//TODO add tests
public class ReceiptRepository {

    private final List<Receipt> receipts = new ArrayList<>();

    public boolean add(Receipt receipt) {

        //TODO FIXME throw exception if receipt exits
        this.receipts.add(receipt);
        return true;
    }

    public Receipt get(UUID uuid) {
        return this.receipts.stream()
                .filter(receipt -> uuid.equals(receipt.getId()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Receipt not found with " + uuid));
    }

    //TODO add method delete receipt

    //TODO add me to update receipt

}
