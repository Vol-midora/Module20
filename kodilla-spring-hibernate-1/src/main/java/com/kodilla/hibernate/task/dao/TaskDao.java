package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.tasks.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

import javax.transaction.Transactional;


@Repository
@Transactional
public interface TaskDao extends CrudRepository<Task, Integer> {
	List<Task> findByDuration(int duration);
}
