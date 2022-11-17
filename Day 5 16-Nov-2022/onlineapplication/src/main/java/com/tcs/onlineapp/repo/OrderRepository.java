package com.tcs.onlineapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.onlineapp.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
