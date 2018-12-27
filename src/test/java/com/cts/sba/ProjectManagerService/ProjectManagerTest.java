package com.cts.sba.ProjectManagerService;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.cts.sba.dao.ProjectRepository;
import com.cts.sba.dao.TaskRepository;
import com.cts.sba.dao.UserRepository;
import com.cts.sba.model.Project;
import com.cts.sba.model.Task;
import com.cts.sba.model.User;
import com.cts.sba.service.ProjectServiceImpl;
import com.cts.sba.service.TaskServiceImpl;
import com.cts.sba.service.UserServicImpl;

public class ProjectManagerTest {

	private static final Logger logger = LogManager.getLogger(ProjectManagerTest.class);

	@Mock
	private UserRepository userRepository;

	@InjectMocks
	private UserServicImpl userService;

	@Mock
	private TaskRepository taskRepository;

	@InjectMocks
	private TaskServiceImpl taskService;

	@Mock
	private ProjectRepository projectRepository;

	@InjectMocks
	private ProjectServiceImpl projectService;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testCreateUser() {
		logger.info("Enter into testCreateUser method in ProjectManagerTest...........");
		User user = new User();
		user.setFirstName("Kiran");
		user.setLastName("kumar");
		user.setEmployeeId(1001);
		userService.createUser(user);

	}

	@Test
	public void testGetUsers() {
		logger.info("Enter into  testGetUsers method in ProjectManagerTest...........");
		List<User> toDoList = new ArrayList<User>();
		toDoList.add(new User(1, "Sravan", "Kumar", 319));
		toDoList.add(new User(2, "Sandeep", "Kumar", 318));
		when(userRepository.findAll()).thenReturn(toDoList);
		List<User> result = userService.getUsers();
		assertEquals(2, result.size());

	}

	@Test
	public void testDeleteUser() {
		logger.info("Enter into  testDeleteUser method in ProjectManagerTest...........");
		User user = new User(1, "Sai", "Kiran", 311);
		userService.deleteUser(user);
		verify(userRepository, times(1)).delete(user);
	}

	@Test
	public void testUpdateUser() {
		logger.info("Enter into  testUpdateUser method in ProjectManagerTest...........");
		User user = new User();
		user.setEmployeeId(1001);
		user.setLastName("Kiran");
		userService.updateUser((user));
	}

	@Test
	public void testCreateTask() {
		logger.info("Enter into  testCreateTask method in ProjectManagerTest...........");
		Task task = new Task();
		task.setTask_id(1);
		task.setTask("Task1");
		task.setStartdate(new Date());
		task.setEndDate(new Date());
		task.setPriority(14);
		taskService.createTask(task);

	}

	@Test
	public void testGetTasks() {
		logger.info("Enter into  testGetTasks method in ProjectManagerTest...........");
		List<Task> toDoList = new ArrayList<Task>();
		toDoList.add(new Task(101, "Task12", new Date(), new Date(), 22, "In progress"));
		toDoList.add(new Task(102, "Task13", new Date(), new Date(), 43, "Completed"));
		when(taskRepository.findAll()).thenReturn(toDoList);
		List<Task> result = taskService.getTasks();
		assertEquals(2, result.size());
	}

	@Test
	public void testDeleteTask() {
		logger.info("Enter into  testDeleteTask method in ProjectManagerTest...........");
		Task task = new Task(101, "Task12", new Date(), new Date(), 22, "In progress");
		taskService.deleteTask(task);
		verify(taskRepository, times(1)).delete(task);
	}

	@Test
	public void testUpdateTask() {
		logger.info("Enter into  testUpdateTask method in ProjectManagerTest...........");
		Task task = new Task();
		task.setTask("Task12");
		task.setTask_id(1);
		taskService.updateTask(task);
	}

	@Test
	public void testCreateProject() {
		logger.info("Enter into  testCreateProject method in ProjectManagerTest...........");
		Project project = new Project();
		project.setProjectId(201);
		project.setProject("TaskManager");
		project.setStartDate(new Date());
		project.setEndDate(new Date());
		project.setPriority(20);
		projectService.createProject(project);
	}

	@Test
	public void testGetProjects() {
		logger.info("Enter into  testGetProjects method in ProjectManagerTest...........");
		List<Project> toDoList = new ArrayList<Project>();
		toDoList.add(new Project(1, "BMS", new Date(), new Date(), 25));
		toDoList.add(new Project(2, "ProjectManager", new Date(), new Date(), 52));
		when(projectRepository.findAll()).thenReturn(toDoList);
		List<Project> result = projectService.getProjects();
		assertEquals(2, result.size());

	}

	@Test
	public void testDeleteProject() {
		logger.info("Enter into  testDeleteProject method in ProjectManagerTest...........");
		Project project = new Project(1, "BMS", new Date(), new Date(), 25);
		projectService.deleteProject(project);
		verify(projectRepository, times(1)).delete(project);
	}

	@Test
	public void testUpdateProject() {
		logger.info("Enter into  testUpdateProject method in ProjectManagerTest...........");
		Project project = new Project();
		project.setProject("TaskManger");
		project.setPriority(35);
		projectService.updateProject(project);

	}
}
