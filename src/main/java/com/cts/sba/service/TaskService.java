package com.cts.sba.service;

import java.util.List;

import com.cts.sba.model.Task;

/**
 * @author PrasadPenchala
 * @version 1.0
 * @since
 *
 */
public interface TaskService {

	public List<Task> getTasks();

	public Task getTask(int taskId);

	public Task createTask(Task task);

	public void deleteTask(Task task);

	public Task updateTask(Task task);
}
