package com.tcs.onlineapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.onlineapp.entity.User;
import com.tcs.onlineapp.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		User pdt = new User();
		Optional<User> optionalUser = userRepository.findById(id);
		if (optionalUser.isPresent())
			pdt = optionalUser.get();
		return pdt;
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
