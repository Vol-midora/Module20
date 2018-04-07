package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.*;

@Configuration
public class BoardConfig {

	@Bean
	@Scope("prototype")
	public TaskList getTaskList() {
		return new TaskList();
	}
	
	@Bean
	public Board getBoard(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
		return new Board(toDoList, inProgressList, doneList);
	}
	
}
