package com.tcs.monolith.service;

import java.util.List;

import com.tcs.monolith.model.User;

public interface UserService {
	
	public List<User> getUSers();
	
	public User getUserById(int id);
	
	public void addUser(User user);
	
	public void editUser(int id, User user);
	
	public void deleteUser(int id);

}
