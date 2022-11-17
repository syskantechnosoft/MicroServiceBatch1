package com.tcs.onlineapp.service;

import java.util.List;

import com.tcs.onlineapp.entity.Role;

public interface RoleService {
	
	public List<Role> getRoles();

	public Role getRole(int id);

	public void addRole(Role role);

	public void editRole(int id, Role role);

	public void deleteRole(int id);

}
