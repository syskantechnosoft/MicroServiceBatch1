package com.tcs.monolith.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.monolith.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
