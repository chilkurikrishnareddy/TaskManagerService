package com.cts.sba.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * This Project model is used to create the setter, getter methods and
 * constructor.
 * 
 * @author PrasadPenchala
 * @version 1.0
 * @since
 *
 */
@Entity
@Table(name = "project")
public class Project implements Serializable {

	private static final long serialVersionUID = 1L;

	public Project() {

	}

	public Project(int projectId, String project, Date startDate, Date endDate, int priority) {
		this.projectId = projectId;
		this.project = project;
		this.startDate = startDate;
		this.endDate = endDate;
		this.priority = priority;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int projectId;
	private String project;
	private Date startDate;
	private Date endDate;
	private int priority;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private Set<User> users;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "task_Id")
	private Set<Task> tasks;

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public Set<Task> getTasks() {
		return tasks;
	}

	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
	}
	

	/*public Project(String project, Date startDate, Date endDate, int priority) {
		super();
		this.project = project;
		this.startDate = startDate;
		this.endDate = endDate;
		this.priority = priority;
	}*/

}
