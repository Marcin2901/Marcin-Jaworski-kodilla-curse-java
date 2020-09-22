package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.dao.TaskDao;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private TaskDao taskDao;
    @Test
    public void findByListName() {
        //Given
        TaskList taskList1 = new TaskList("List 1", "algo");

        //When
        taskListDao.save(taskList1);
      List<TaskList> readTaskList = taskListDao.findByListName("List 1");
      String name = readTaskList.get(0).getListName();

      //Then
        Assert.assertEquals("List 1", name);
      //CleanUp
        int id = readTaskList.get(0).getId();
        taskListDao.deleteById(id);

    }
}
