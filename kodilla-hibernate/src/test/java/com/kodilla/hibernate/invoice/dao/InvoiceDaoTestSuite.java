package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    public InvoiceDao invoiceDao;


    @Test
    void testInvoiceDaoSaved() {
        //Given
        Product lenovoLaptop = new Product("Lenovo laptop");
        Product dellLaptop = new Product("Dell laptop");
        Product asusLaptop = new Product("Asus laptop");
        Product hpLaptop = new Product("HP laptop");

        Item pos1 = new Item(lenovoLaptop, new BigDecimal(1600), 5, new BigDecimal(8000));
        Item pos2 = new Item(dellLaptop, new BigDecimal(2400), 3, new BigDecimal(7200));
        Item pos3 = new Item(asusLaptop, new BigDecimal(1100), 7, new BigDecimal(7700));
        Item pos4 = new Item(hpLaptop, new BigDecimal(3200), 4, new BigDecimal(12800));

        Invoice nr2020121701 = new Invoice("2020121701");
        Invoice nr2020121702 = new Invoice("2020121702");
        nr2020121701.getItems().add(pos1);
        nr2020121701.getItems().add(pos2);
        nr2020121702.getItems().add(pos3);
        nr2020121702.getItems().add(pos4);

        //When
        invoiceDao.save(nr2020121701);
        int id = nr2020121701.getId();

        //Then
        Assertions.assertEquals(56, id);

        //Cleanup
        invoiceDao.deleteById(id);






    }

}
