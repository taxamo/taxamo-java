import com.taxamo.client.api.TaxamoApi;
import com.taxamo.client.common.ApiException;
import com.taxamo.client.model.*;

import java.math.BigDecimal;
import java.util.Arrays;

public class TaxamoExample {

    public static void main(String[] args) throws ApiException {

        //initialize API object, provide your private token here!
        TaxamoApi api = new TaxamoApi("SamplePrivateTestKey1");

        long t = System.currentTimeMillis();
        CreateTransactionOut createTransactionOut = api.createTransaction(new CreateTransactionIn()
                .setTransaction(new InputTransaction()
                        .setCurrencyCode("USD")
                        .setBuyerIp("127.0.0.1")
                        .setBillingCountryCode("IE")
                        .setForceCountryCode("FR")
                        .setOrderDate("2014-06-01")
                        .setTransactionLines(Arrays.asList(
                                new InputTransactionLine()
                                        .setAmount(new BigDecimal(200))
                                        .setCustomId("line1"),
                                new InputTransactionLine()
                                        .setAmount(new BigDecimal(100))
                                        .setCustomId("line2")
                                        .setProductType("e-book")))));

        //first API call will take longer due to SSL handshake
        String key = createTransactionOut.getTransaction().getKey();
        System.out.println("Created transaction with key: " + key + " in " + (System.currentTimeMillis() - t) + "ms,\n" +
                           "Total amount: " + createTransactionOut.getTransaction().getTotalAmount());

        t = System.currentTimeMillis();

        //retrieve transaction details
        GetTransactionOut getTransactionOut = api.getTransaction(key);
        System.out.println("Retrieved transaction in " + (System.currentTimeMillis() - t) + "ms: " + getTransactionOut.getTransaction().getKey());


        t = System.currentTimeMillis();

        //confirm a transaction for it to appear in VAT settlement
        api.confirmTransaction(key, new ConfirmTransactionIn());
        System.out.println("Confirmed transaction with key: " + key + " in " + (System.currentTimeMillis() - t) + "ms");

    }
}