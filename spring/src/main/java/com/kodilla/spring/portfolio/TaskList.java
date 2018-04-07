package com.kodilla.spring.portfolio;
import java.util.*;

public class TaskList {
	
private List<String> tasks;

public TaskList() {
	tasks = new ArrayList<String>();
}

public ArrayList<String> getTasks() {
	return (ArrayList<String>) tasks;
}

}
