package com.tcs.onlineapp.service;

import java.util.List;

import com.tcs.onlineapp.entity.User;

public interface UserService {

	public List<User> getUsers();

	public User getUser(int id);

	public void addUser(User user);

	public void editUser(int id, User user);

	public void deleteUser(int id);

}
