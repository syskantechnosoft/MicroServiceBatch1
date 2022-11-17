package com.tcs.onlineapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.onlineapp.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
