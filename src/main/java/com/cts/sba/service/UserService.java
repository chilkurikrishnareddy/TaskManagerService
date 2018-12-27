package com.cts.sba.service;

import java.util.List;

import com.cts.sba.model.User;

/**
 * @author PrasadPenchala
 * @version 1.0
 * @since
 *
 */
public interface UserService {

	public List<User> getUsers();

	public User getUser(int userId);

	public User createUser(User user);

	public void deleteUser(User user);

	public User updateUser(User user);

}
