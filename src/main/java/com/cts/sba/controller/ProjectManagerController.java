package com.cts.sba.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.sba.ProjectManagerServiceApplication;
import com.cts.sba.dao.ParentTaskRepository;
import com.cts.sba.dao.ProjectRepository;
import com.cts.sba.dao.TaskRepository;
import com.cts.sba.dao.UserRepository;
import com.cts.sba.model.ParentTask;
import com.cts.sba.model.Project;
import com.cts.sba.model.Task;
import com.cts.sba.model.User;

/**
 * This Controller is used to add, update, view and delete task details.
 * 
 * @author Prasad Penchala
 * @version 1.0
 * @since
 *
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class ProjectManagerController {

	private static final Logger logger = LogManager.getLogger(ProjectManagerServiceApplication.class);

	@Autowired
	private ParentTaskRepository parentTaskRepository;

	@Autowired
	private TaskRepository taskRepository;
	@Autowired
	private ProjectRepository projectRepository;
	@Autowired
	private UserRepository userRepository;

	/**
	 * @param parentTaskData
	 * @return parentTaskData
	 */
	@PostMapping("/parent/task")
	public ParentTask createParentTask(@RequestBody ParentTask parentTaskData) {
		/*logger.info("Enter into createParentTask method in controller.......");*/
		return parentTaskRepository.save(parentTaskData);
	}

	/**
	 * @param taskData
	 * @return taskData
	 */
	@PostMapping("/add/task")
	public Task createTask(@RequestBody Task taskData) {
	/*	logger.info("Enter into createTask method in controller.......");*/
		return taskRepository.save(taskData);
	}

	/**
	 * @return list of parent tasks
	 */
	@GetMapping("/parent/tasks/list")
	public List<ParentTask> getParentTasks() {
	/*	logger.info("Enter into getParentTasks method in controller.......");*/
		return parentTaskRepository.findAll();
	}

	/**
	 * @return list of tasks
	 */
	@GetMapping("/tasks/list")
	public List<Task> getTasks() {
	/*	logger.info("Enter into geTasks method in controller.......");
*/		return taskRepository.findAll();
	}

	/**
	 * @param taskId
	 * @return taskId
	 */
	@DeleteMapping("/task/{taskId}")
	public int deleteTask(@PathVariable int taskId) {
/*		logger.info("Enter into deleteTask method in controller.......");
*/		taskRepository.deleteById(taskId);
		return taskId;
	}

	/**
	 * @param taskData
	 * @return taskData
	 */
	@PutMapping("/task/{taskId}")
	public Task updateTask(@RequestBody Task taskData) {
		/*logger.info("Enter into updateTask method in controller.......");*/
		return taskRepository.save(taskData);
	}

	/**
	 * @param userdata
	 * @return userdata
	 */
	@PostMapping("/users")
	public User createUser(@RequestBody User userdata) {
		/*logger.info("Enter into createUser method in controller......." + userdata);
*/		return userRepository.save(userdata);
	}

	/**
	 * @param user
	 * @return user
	 */
	@PutMapping("/users/{userId}")
	public User updateUser(@RequestBody User user) {
		/*logger.info("Enter into updateUser method in controller.......");*/
		return userRepository.save(user);
	}

	/**
	 * @param userId
	 * @return userId
	 */
	@DeleteMapping("/users/{userId}")
	public int deleteUser(@PathVariable int userId) {
		/*logger.info("Enter into deleteUser method in controller.......");*/
		userRepository.deleteById(userId);
		return userId;
	}

	/**
	 * @return list of users
	 */
	@GetMapping("/users/list")
	public List<User> getUsers() {
		/*logger.info("Enter into getUsers method in controller.......");*/
		return userRepository.findAll();

	}

	/**
	 * @param projectData
	 * @return projectData
	 */
	@PostMapping("/projects")
	public Project createProject(@RequestBody Project projectData) {
	/*	logger.info("Enter into createProject method in controller.......");*/
		return projectRepository.save(projectData);
	}

	/**
	 * @return list of projects
	 */
	@GetMapping("/projects/list")
	public List<Project> getProjects() {
		/*logger.info("Enter into getProjects method in controller.......");*/
		return projectRepository.findAll();
	}

	/**
	 * @param projectData
	 * @return projectData
	 */
	@PutMapping("/projects/{projectId}")
	public Project updateProject(@RequestBody Project projectData) {
		/*logger.info("Enter into updateProject method in controller.......");*/
		return projectRepository.save(projectData);
	}

	/**
	 * @param projectId
	 * @return projectId
	 */
	@DeleteMapping("/projects/{projectId}")
	public int deleteProject(@PathVariable int projectId) {
		/*logger.info("Enter into deleteProject method in controller......." + projectId);
*/		projectRepository.deleteById(projectId);
		return projectId;
	}

}
