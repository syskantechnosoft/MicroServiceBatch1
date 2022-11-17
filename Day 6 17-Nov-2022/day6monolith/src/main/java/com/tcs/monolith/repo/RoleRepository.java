package com.tcs.monolith.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.monolith.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
