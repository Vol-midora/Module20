package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.Assert;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

	@Test
	public void testTaskAdd() {
		//Given
		ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
		Board board = context.getBean(Board.class);
		
		//When
		board.getToDoList().getTasks().add("TaskToDo1");
		board.getInProgressList().getTasks().add("TaskInProgress1");
		board.getDoneList().getTasks().add("TaskDone1");
		
		//Then
		Assert.assertEquals(board.getToDoList().getTasks().size(), 1);
		Assert.assertEquals(board.getInProgressList().getTasks().size(), 1);
		Assert.assertEquals(board.getDoneList().getTasks().size(), 1);
	}
}
