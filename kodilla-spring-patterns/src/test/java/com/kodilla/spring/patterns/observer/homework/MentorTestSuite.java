package com.kodilla.spring.patterns.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class MentorTestSuite {

	@Test
	public void testMentorUpdate() {
		//Given
		TaskList johnTaskList = new TaskList("John's task list", "Johny Bravo");
		TaskList laraTaskList = new TaskList("Lara's task list", "Lara Croft");
		TaskList richardTaskList = new TaskList("Richard's task list", "Richard Swetru");
		
		Mentor rambo = new Mentor("Rambo 1");
		Mentor gary = new Mentor("Gary Oak");
		Mentor chwytak = new Mentor("Niecny chwytak");
		
		johnTaskList.registerObserver(gary);
		johnTaskList.registerObserver(chwytak);
		laraTaskList.registerObserver(rambo);
		laraTaskList.registerObserver(chwytak);
		richardTaskList.registerObserver(gary);
		richardTaskList.registerObserver(rambo);
		
		
		//When
		johnTaskList.addTask("John's task one");
		laraTaskList.addTask("Lara's first task");
		laraTaskList.addTask("Lara's second task");
		richardTaskList.addTask("Richard's first task");
		richardTaskList.addTask("Richard's second task");
		richardTaskList.addTask("Richard's third task");
		
		//Then
		Assert.assertEquals(4,  gary.getCount());
		Assert.assertEquals(5,  rambo.getCount());
		Assert.assertEquals(3,  chwytak.getCount());
	}
	

}
