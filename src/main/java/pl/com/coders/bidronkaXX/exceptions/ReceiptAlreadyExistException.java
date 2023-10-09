package pl.com.coders.bidronkaXX.exceptions;

public class ReceiptAlreadyExistException extends Exception{

    public ReceiptAlreadyExistException(String uuid) {
        super("Receipt already exist with uuid :" + uuid);
    }
}
