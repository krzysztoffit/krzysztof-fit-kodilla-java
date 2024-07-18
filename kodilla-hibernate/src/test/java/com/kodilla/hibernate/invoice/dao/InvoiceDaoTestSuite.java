package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        // given
        Product tv = new Product("TV");
        Product smartphone = new Product("Smartphone");
        Product smartwatch = new Product("Smartwach");

        Item TV1 = new Item(tv, new BigDecimal("1500"), 100, new BigDecimal(100 * 1500));
        Item TV2 = new Item(tv, new BigDecimal("1800"), 100, new BigDecimal(100 * 1800));
        Item TV3 = new Item(tv, new BigDecimal("2300"), 100, new BigDecimal(100 * 2300));

        Item smartphone1 = new Item(smartphone, new BigDecimal("500"), 100, new BigDecimal(100 * 500));
        Item smartphone2 = new Item(smartphone, new BigDecimal("800"), 100, new BigDecimal(100 * 800));
        Item smartphone3 = new Item(smartphone, new BigDecimal("300"), 100, new BigDecimal(100 * 300));

        Item smartwatch1 = new Item(smartwatch, new BigDecimal("1500"), 100, new BigDecimal(100 * 100));
        Item smartwatch2 = new Item(smartwatch, new BigDecimal("1800"), 100, new BigDecimal(100 * 80));
        Item smartwatch3 = new Item(smartwatch, new BigDecimal("2300"), 100, new BigDecimal(100 * 30));

        Invoice invoice = new Invoice("123456", List.of(
                TV1, TV2, TV3,
                smartphone1, smartphone2, smartphone3,
                smartwatch1, smartwatch2, smartwatch3
        ));

        // when
        invoiceDao.save(invoice);
        int id = invoice.getId();

        // then
        assertNotEquals(0, id);

        // cleanUp
        invoiceDao.deleteById(id);
    }
}
