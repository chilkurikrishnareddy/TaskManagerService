package com.cts.sba.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.cts.sba.dao.ParentTaskRepository;
import com.cts.sba.dao.TaskRepository;
import com.cts.sba.model.Task;

/**
 * @author PrasadPenchala
 * @version 1.0
 * @since
 *
 */
public class TaskServiceImpl implements TaskService {

	private static final Logger logger = LogManager.getLogger(TaskService.class);

	@Autowired
	private TaskRepository taskRepository;

	@SuppressWarnings("unused")
	@Autowired
	private ParentTaskRepository parentTaskRepositort;

	@Override
	public List<Task> getTasks() {
		logger.info("Enter into getTasks method in TaskServiceImpl.......");
		return taskRepository.findAll();
	}

	@Override
	public Task getTask(int taskId) {
		logger.info("Enter into getTask method in TaskServiceImpl.......");
		return taskRepository.getOne(taskId);
	}

	@Override
	public Task createTask(Task task) {
		logger.info("Enter into createTask method in TaskServiceImpl.......");
		return taskRepository.save(task);
	}

	@Override
	public void deleteTask(Task task) {
		logger.info("Enter into deleteTask method in TaskServiceImpl.......");
		taskRepository.delete(task);
	}

	@Override
	public Task updateTask(Task task) {
		logger.info("Enter into updateTask method in TaskServiceImpl.......");
		return taskRepository.save(task);
	}

}
