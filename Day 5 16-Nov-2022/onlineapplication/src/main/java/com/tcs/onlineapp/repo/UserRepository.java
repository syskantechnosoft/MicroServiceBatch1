package com.tcs.onlineapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.onlineapp.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
