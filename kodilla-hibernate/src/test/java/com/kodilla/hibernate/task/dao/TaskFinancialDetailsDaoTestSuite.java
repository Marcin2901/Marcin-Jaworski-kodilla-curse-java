package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.TaskFinancialDetails;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskFinancialDetailsDaoTestSuite {
    @Autowired
    TaskFinancialDetailsDao taskFinancialDetails;
    @Test
    public void testFindByPaid() {
     //Give
        TaskFinancialDetails taskFinancial= new TaskFinancialDetails(new BigDecimal(115), true);
     //When
      taskFinancialDetails.save(taskFinancial);
      List<TaskFinancialDetails> list = taskFinancialDetails.findByPaid(true);
      boolean result = list.get(0).isPaid();
     //Then
        Assert.assertEquals(true, result);
        Assert.assertEquals(1, list.size());
     //CleanUp
        int id = list.get(0).getId();
        taskFinancialDetails.deleteById(id);
    }
}
