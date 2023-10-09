package pl.com.coders.bidronkaXX.exceptions;

public class ReceiptNotFoundException extends Exception {

    public ReceiptNotFoundException(String uuid) {
        super("Receipt not found with uuid :" + uuid);
    }
}
