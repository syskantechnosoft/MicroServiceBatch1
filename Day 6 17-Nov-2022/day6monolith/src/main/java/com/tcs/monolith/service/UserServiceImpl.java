package com.tcs.monolith.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.monolith.model.User;
import com.tcs.monolith.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> getUSers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	@Override
	public void editUser(int id, User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

}
