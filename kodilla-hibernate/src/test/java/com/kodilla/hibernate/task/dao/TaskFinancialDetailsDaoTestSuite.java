package com.kodilla.hibernate.task.dao;

//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class TaskFinancialDetailsDaoTestSuite {
//    @Autowired
//    TaskFinancialDetailsDao taskFinancialDetails;
//    @Test
//    public void testFindByPaid() {
//     //Give
//        TaskFinancialDetails taskFinancial= new TaskFinancialDetails(new BigDecimal(115), true);
//     //When
//      taskFinancialDetails.save(taskFinancial);
//      List<TaskFinancialDetails> list = taskFinancialDetails.findByPaid(true);
//      boolean result = list.get(0).isPaid();
//     //Then
//        Assert.assertEquals(true, result);
//        Assert.assertEquals(1, list.size());
//     //CleanUp
//        int id = list.get(0).getId();
//        taskFinancialDetails.deleteById(id);
//    }
//}
