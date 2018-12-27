package com.cts.sba.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This ParentTask model is used to create the setter, getter methods and
 * constructor.
 * 
 * @author PrasadPenchala
 * @version 1.0
 * @since
 * 
 */
@Entity
@Table(name = "ParentTask")
public class ParentTask implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int parentId;

	private String parentTask;

/*	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getParentTask() {
		return parentTask;
	}

	public void setParentTask(String parentTask) {
		this.parentTask = parentTask;
	}
*/
	
	public ParentTask() {
		super();

	}

	/*public ParentTask(int parentId, String parentTask) {
		this.parentId = parentId;
		this.parentTask = parentTask;
	}
*/

}
