package pl.com.coders.bidronkaXX.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.com.coders.bidronkaXX.domain.Product;
import pl.com.coders.bidronkaXX.exceptions.ReceiptAlreadyExistException;
import pl.com.coders.bidronkaXX.exceptions.ReceiptNotFoundException;
import pl.com.coders.bidronkaXX.exceptions.WrongReceiptProductException;
import pl.com.coders.bidronkaXX.service.ReceiptService;

import java.util.UUID;

@RestController
@RequestMapping("/receipt")
//https://restfulapi.net/
public class ReceiptController {

    @Autowired
    private ReceiptService receiptService;

    @PostMapping
    public ReceiptView create(@RequestBody ReceiptRequest receiptRequest) throws ReceiptNotFoundException, ReceiptAlreadyExistException {
        return receiptService.add(receiptRequest);
    }

    //TODO create REST api method POST addProductToReceipt + testy

    @GetMapping({"/{uuid}"})
    public ReceiptView get(@PathVariable UUID uuid) throws ReceiptNotFoundException {
        return receiptService.get(uuid);
    }

    @PostMapping({"/finish/{uuid}"})
    public ReceiptView finish(@PathVariable UUID uuid) throws ReceiptNotFoundException {
        return this.receiptService.finish(uuid);
    }

    @PostMapping({"/{uuid}/addProduct"})
    public ReceiptView finish(@PathVariable UUID uuid,@RequestBody Product product) throws ReceiptNotFoundException, WrongReceiptProductException {
        return this.receiptService.addProduct(uuid, product);
    }

    //TODO create REMOVE product from RECEIPT
    //TODO REMOVE RECEIPT
}
