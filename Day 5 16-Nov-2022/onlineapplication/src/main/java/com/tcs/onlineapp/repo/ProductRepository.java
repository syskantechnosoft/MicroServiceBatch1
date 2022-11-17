package com.tcs.onlineapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.onlineapp.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
