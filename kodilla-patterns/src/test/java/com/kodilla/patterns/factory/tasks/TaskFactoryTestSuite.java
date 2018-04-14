package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testMakeDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task drivingtask = taskFactory.makeTask(TaskFactory.DRIVING);

        //When
        drivingtask.executeTask();
        String name = drivingtask.getTaskName();

        //Then
        Assert.assertEquals(true, drivingtask.isTaskExecuted());
        Assert.assertEquals("Example driving task", name);
    }

    @Test
    public void testMakeShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task shoppingtask = taskFactory.makeTask(TaskFactory.SHOPPING);

        //When
        shoppingtask.executeTask();
        String name = shoppingtask.getTaskName();

        //Then
        Assert.assertEquals(true, shoppingtask.isTaskExecuted());
        Assert.assertEquals("Example shopping task", name);
    }

    @Test
    public void testMakePaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING);

        //When
        paintingTask.executeTask();
        String name = paintingTask.getTaskName();

        //Then
        Assert.assertEquals(true, paintingTask.isTaskExecuted());
        Assert.assertEquals("Example painting task", name);
    }


}
