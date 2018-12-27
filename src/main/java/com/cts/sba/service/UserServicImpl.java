package com.cts.sba.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.cts.sba.dao.ParentTaskRepository;
import com.cts.sba.dao.UserRepository;
import com.cts.sba.model.User;

/**
 * @author PrasadPenchala
 * @version 1.0
 * @since
 *
 */
public class UserServicImpl implements UserService {

	private static final Logger logger = LogManager.getLogger(UserService.class);

	@Autowired
	private UserRepository userRepository;

	@SuppressWarnings("unused")
	@Autowired
	private ParentTaskRepository parentTaskRepository;

	@Override
	public List<User> getUsers() {
		logger.info("Enter into getUsers method in UserServiceImpl.......");
		return userRepository.findAll();
	}

	@Override
	public User getUser(int userId) {
		logger.info("Enter into getUser method in UserServiceImpl.......");
		return userRepository.getOne(userId);
	}

	@Override
	public User createUser(User user) {
		logger.info("Enter into createUser method in UserServiceImpl......." + user.getFirstName());
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(User user) {
		logger.info("Enter into deleteUser method in UserServiceImpl.......");
		userRepository.delete(user);
	}

	@Override
	public User updateUser(User user) {
		logger.info("Enter into updateUser method in UserServiceImpl.......");
		return userRepository.save(user);
	}

}
