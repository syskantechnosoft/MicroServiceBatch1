package com.tcs.monolith.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.monolith.model.User;
import com.tcs.monolith.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/users")
	public List<User> getUsers() {
		return userService.getUSers();
	}

	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}

	@PostMapping("/users")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}

	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
	}

	@PutMapping("/users/{id}")
	public void editUser(@PathVariable int id, @RequestBody User user) {
		userService.editUser(id, user);
	}
}
