package com.tcs.onlineapp.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Cart {
	@Id
	private int id;
	private List<Product> products;
}
