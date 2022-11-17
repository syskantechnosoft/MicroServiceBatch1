package com.tcs.monolith.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.monolith.model.Role;
import com.tcs.monolith.repo.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepository roleRepository;

	@Override
	public List<Role> getEntities() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}

	@Override
	public Role getEntityById(int id) {
		// TODO Auto-generated method stub
		return roleRepository.findById(id).get();
	}

	@Override
	public void addEntity(Role role) {
		// TODO Auto-generated method stub
		roleRepository.save(role);
	}

	@Override
	public void editEntity(int id, Role role) {
		// TODO Auto-generated method stub
		roleRepository.save(role);
	}

	@Override
	public void deleteEntity(int id) {
		// TODO Auto-generated method stub
		roleRepository.deleteById(id);
	}

}
