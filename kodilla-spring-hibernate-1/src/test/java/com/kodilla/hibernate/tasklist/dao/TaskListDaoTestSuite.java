package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
	
	@Autowired
	private TaskListDao dao;
	private final String NAME = "Task List Name";
	private final String DESCRIPTION = "Test Description";
	
	@Test
	public void test() {
		//Given
		TaskList taskList = new TaskList(NAME, DESCRIPTION);
		
		//When
		dao.save(taskList);
		//Then
		Assert.assertEquals(DESCRIPTION, dao.findbyListName(NAME));
		
		
		//Cleanup
		dao.deleteById(taskList.getId());
	}

}
