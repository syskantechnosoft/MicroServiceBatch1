package com.tcs.onlineapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.onlineapp.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

}
