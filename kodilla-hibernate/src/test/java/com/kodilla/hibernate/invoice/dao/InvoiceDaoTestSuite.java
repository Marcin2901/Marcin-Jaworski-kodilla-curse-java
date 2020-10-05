package com.kodilla.hibernate.invoice.dao;


import com.kodilla.hibernate.invoice.dou.InvoiceDau;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDau invoiceDau;

    @Test
    public void testInvoiceDaoSave() {
//        //Give
//        Product phone = new Product("phone");
//      //  Product pc = new Product("pc");
//      //  Product tv = new Product("tv");
//
//        Item phoneItem = new Item( new BigDecimal(100), 10, new BigDecimal(15));
//        Item pcItem = new Item(new BigDecimal(1000), 10, new BigDecimal(18));
//   //     Item tvItem = new Item(tv, new BigDecimal(500), 10, new BigDecimal(23));
//        phoneItem.setProduct(phone);
//  //      pcItem.setProduct(pc);
//
//        List<Item> it = new ArrayList<>();
//        it.add(phoneItem);
//        it.add(pcItem);
//
//        phone.setItem(it);
//
//
//
////        phoneItem.setProduct(phone);
////        pcItem.setProduct(pc);
//     //   tvItem.setProduct(tv);
////
//       Invoice invoice = new Invoice("1",phone.getItem());
//
//////        invoice.getItems().add(phoneItem);
////        invoice.getItems().add(pcItem);
////  //      phoneItem.setInvoice(invoice);
////        pcItem.setInvoice(invoice);
//  //   invoice.getItems().add(pcItem);
//    //  invoice.getItems().add(tvItem);
//
//
//
//        //When
//    //  productDau.save(phone);
////        itemDau.save(phoneItem);
//
//   invoiceDau.save(invoice);
//       int id = invoice.getId();
//
//        //Then
//       // Assert.assertNotEquals(0, id);
//
//       // ClearUp
//        try {
//            invoiceDau.deleteById(id);
//        } catch (Exception e) {
//            //do nothing
//        }
    }
}
