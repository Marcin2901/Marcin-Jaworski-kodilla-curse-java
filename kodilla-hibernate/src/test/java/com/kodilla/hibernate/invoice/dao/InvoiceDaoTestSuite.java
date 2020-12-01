package com.kodilla.hibernate.invoice.dao;


//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class InvoiceDaoTestSuite {
//
//    @Autowired
//    InvoiceDau invoiceDau;
//
//
//
//    @Test
//    public void testInvoiceDaoSave() {
//       //Give
//        Product phone = new Product("phone");
//
//
//        Item phoneItem = new Item( new BigDecimal(100), 10, new BigDecimal(15));
//        Item phoneItem2 = new Item( new BigDecimal(1000), 10, new BigDecimal(18));
//        Item phoneItem3 = new Item( new BigDecimal(500), 10, new BigDecimal(23));
//
//        phoneItem.setProduct(phone);
//        phoneItem2.setProduct(phone);
//        phoneItem3.setProduct(phone);
//
//        phone.getItem().add(phoneItem);
//        phone.getItem().add(phoneItem2);
//        phone.getItem().add(phoneItem3);
//
////        productDau.save(phone);
////        itemDau.save(phoneItem);
////        itemDau.save(phoneItem2);
////        itemDau.save(phoneItem3);
//
//
//        Invoice invoice = new Invoice("1");
//        phoneItem.setInvoice(invoice);
//        phoneItem2.setInvoice(invoice);
//        phoneItem3.setInvoice(invoice);
//
//        invoice.getItems().add(phoneItem);
//        invoice.getItems().add(phoneItem2);
//        invoice.getItems().add(phoneItem3);
//
//
//
//
//       //When
//        invoiceDau.save(invoice);
//        int id = invoice.getId();
//
//       //Then
//        Assert.assertNotEquals(0, id);
//
////       // ClearUp
//        try {
//            invoiceDau.deleteById(id);
//        } catch (Exception e) {
//         //   do nothing
//        }
//    }
//
//}
