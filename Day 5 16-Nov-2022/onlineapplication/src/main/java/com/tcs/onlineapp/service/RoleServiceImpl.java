package com.tcs.onlineapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.onlineapp.entity.Role;
import com.tcs.onlineapp.repo.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepository roleRepository;

	@Override
	public List<Role> getRoles() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}

	@Override
	public Role getRole(int id) {
		// TODO Auto-generated method stub
		Role pdt = new Role();
		Optional<Role> optionalRole = roleRepository.findById(id);
		if (optionalRole.isPresent())
			pdt = optionalRole.get();
		return pdt;
	}

	@Override
	public void addRole(Role role) {
		// TODO Auto-generated method stub
		roleRepository.save(role);

	}

	@Override
	public void editRole(int id, Role role) {
		// TODO Auto-generated method stub
		roleRepository.save(role);
	}

	@Override
	public void deleteRole(int id) {
		// TODO Auto-generated method stub
		roleRepository.deleteById(id);
	}

}
