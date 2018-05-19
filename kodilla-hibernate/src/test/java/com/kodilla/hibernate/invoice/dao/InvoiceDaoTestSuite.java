package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Product1");
        Product product2 = new Product("Product2");
        Product product3 = new Product("Product3");
        Product product4 = new Product("Product4");
        Product product5 = new Product("Product5");

        Item item1 = new Item(product1, new BigDecimal("11"), 5);
        Item item2 = new Item(product2, new BigDecimal("150"), 99);
        Item item3 = new Item(product3, new BigDecimal(150.50), 167);
        Item item4 = new Item(product4, new BigDecimal(0.50), 1067);
        Item item5 = new Item(product5, new BigDecimal(25.50), 76);

        Invoice invoice1 = new Invoice("001");
        Invoice invoice2 = new Invoice("002");
        Invoice invoice3 = new Invoice("003");

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item3);


        invoice2.getItems().add(item2);

        invoice3.getItems().add(item5);
        invoice3.getItems().add(item4);

        //When
        invoiceDao.save(invoice1);
        invoiceDao.save(invoice2);
        invoiceDao.save(invoice3);

        //Then
        Assert.assertNotEquals(0, invoice1.getId());
        Assert.assertNotEquals(0, invoice2.getId());
        Assert.assertNotEquals(0, invoice3.getId());

        //Cleanup
        try {
            invoiceDao.delete(invoice1.getId());
            invoiceDao.delete(invoice2.getId());
            invoiceDao.delete(invoice3.getId());
        } catch (Exception e){}


    }

}
