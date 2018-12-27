package com.cts.sba.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.cts.sba.dao.ParentTaskRepository;
import com.cts.sba.dao.ProjectRepository;
import com.cts.sba.model.Project;

/**
 * 
 * @author PrasadPenchala
 * @version 1.0
 * @since
 *
 */
public class ProjectServiceImpl implements ProjectService {

	private static final Logger logger = LogManager.getLogger(ProjectService.class);

	@Autowired
	private ProjectRepository projectRepository;

	@SuppressWarnings("unused")
	@Autowired
	private ParentTaskRepository parentTaskRepository;

	@Override
	public List<Project> getProjects() {
		logger.info("Enter into getProjects method in ProjectServiceImpl.......");
		return projectRepository.findAll();
	}

	/*@Override
	public Project getProject(int projectId) {
		logger.info("Enter into getProject method in ProjectServiceImpl.......");
		return projectRepository.getOne(projectId);
	}*/

	@Override
	public Project createProject(Project project) {
		logger.info("Enter into createProject method in ProjectServiceImpl.......");
		return projectRepository.save(project);
	}

	@Override
	public void deleteProject(Project project) {
		logger.info("Enter into deleteProject method in ProjectServiceImpl.......");
		projectRepository.delete(project);
	}

	@Override
	public Project updateProject(Project project) {
		logger.info("Enter into updateProject method in ProjectServiceImpl..");
		return projectRepository.save(project);
	}

	@Override
	public Project getProject(int projectId) {
		// TODO Auto-generated method stub
		return null;
	}

}
