package com.cts.sba.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * This Task model is used to create the setter, getter methods and constructor.
 * 
 * @author PrasadPenchala
 * @version 1.0
 * @since
 *
 */
@Entity
@Table(name = "task")
public class Task implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int task_id;

	private String task;
	private Date startDate;
	private Date endDate;
	private int priority;
	private String status;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "parentId")
	private ParentTask parentId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "projectId")
	private Project project;

	public Task() {
	}

	public Task(int task_id, String task, Date startdate, Date enddate, int priority, String status) {
		this.task_id = task_id;
		this.task = task;
		this.startDate = startDate;
		this.endDate = endDate;
		this.priority = priority;
		this.status = status;
	}

	public int getTask_id() {
		return task_id;
	}

	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartdate(Date startdate) {
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ParentTask getParentId() {
		return parentId;
	}

	public void setParentId(ParentTask parentId) {
		this.parentId = parentId;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}
