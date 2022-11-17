package com.tcs.onlineapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.onlineapp.entity.Role;
import com.tcs.onlineapp.service.RoleService;

@RestController
@RequestMapping("/api/v1/roles")
public class RoleController {

	@Autowired
	RoleService roleService;

	@GetMapping("/")
	public List<Role> getRoles() {
		return roleService.getRoles();
	}

	@GetMapping("/{id}")
	public Role getRoleById(@PathVariable int id) {
		return roleService.getRole(id);
	}

	@PostMapping("/")
	public void addRole(@RequestBody Role role) {
		roleService.addRole(role);
	}

	@PutMapping("/{id}")
	public void editRole(@PathVariable int id, @RequestBody Role role) {
		roleService.editRole(id, role);
	}

	@DeleteMapping("/{id}")
	public void deleteRole(@PathVariable int id) {
		roleService.deleteRole(id);
	}
}
