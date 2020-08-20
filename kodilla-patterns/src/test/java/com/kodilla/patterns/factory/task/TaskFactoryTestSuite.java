package com.kodilla.patterns.factory.task;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopingTask(){
        //Give
        TaskFactory factory = new TaskFactory();
        //When
        Task shoping = factory.makeTask(TaskFactory.SHOPING);
        shoping.executeTask();
        //Then
        Assert.assertEquals("Shoping Task", shoping.getTaskName());
        Assert.assertTrue(shoping.isTaskExecuted());
    }
    @Test
    public void testFactoryPaintingTask(){
        //Give
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Painting Task", painting.getTaskName());
        Assert.assertFalse(painting.isTaskExecuted());
    }
    @Test
    public void testFactoryDrivingTask(){
        //Give
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        Assert.assertEquals("Driving Task", driving.getTaskName());
        Assert.assertTrue(driving.isTaskExecuted());
    }
}
