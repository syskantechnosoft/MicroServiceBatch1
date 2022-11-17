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

import com.tcs.monolith.model.Role;
import com.tcs.monolith.service.RoleService;

@RestController
public class RoleController {

	@Autowired
	RoleService roleService;

	@GetMapping("/roles")
	public List<Role> getEntities() {
		return roleService.getEntities();
	}

	@GetMapping("/roles/{id}")
	public Role getEntityById(@PathVariable int id) {
		return roleService.getEntityById(id);
	}

	@PostMapping("/roles")
	public void addEntity(@RequestBody Role role) {
		roleService.addEntity(role);
	}

	@PutMapping("/roles/{id}")
	public void editEntity(@PathVariable int id, @RequestBody Role role) {
		roleService.editEntity(id, role);
	}

	@DeleteMapping("/roles/{id}")
	public void deleteEntity(@PathVariable int id) {
		roleService.deleteEntity(id);
	}
}
