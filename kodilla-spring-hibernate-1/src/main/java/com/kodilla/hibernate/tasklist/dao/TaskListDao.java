package com.kodilla.hibernate.tasklist.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kodilla.hibernate.tasklist.TaskList;

import java.util.*;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface TaskListDao extends CrudRepository<TaskList, Integer> {
	List <TaskList> findbyListName(String name);
}
