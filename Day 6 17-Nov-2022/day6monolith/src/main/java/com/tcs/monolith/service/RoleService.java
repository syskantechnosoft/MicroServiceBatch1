package com.tcs.monolith.service;

import java.util.List;

import com.tcs.monolith.model.Role;

public interface RoleService {

	public List<Role> getEntities();

	public Role getEntityById(int id);

	public void addEntity(Role role);

	public void editEntity(int id, Role role);

	public void deleteEntity(int id);

}
