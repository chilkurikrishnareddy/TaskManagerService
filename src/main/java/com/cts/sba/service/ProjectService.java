package com.cts.sba.service;

import java.util.List;

import com.cts.sba.model.Project;

/**
 * @author PrasadPenchala
 * @version 1.0
 * @since
 *
 */
public interface ProjectService {

	public List<Project> getProjects();

	public Project getProject(int projectId);

	public Project createProject(Project project);

	public void deleteProject(Project project);

	public Project updateProject(Project project);

}
