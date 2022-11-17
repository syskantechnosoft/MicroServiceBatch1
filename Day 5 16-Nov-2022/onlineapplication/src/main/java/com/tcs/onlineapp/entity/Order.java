package com.tcs.onlineapp.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int cartId;
	private List<Product> productList;
	private String address;
	private String paymentMethod;
	private float totalPrice;
	
	public void findTotalPrice() {
		this.totalPrice =0.0f;
		for (Product product : productList) {
			this.totalPrice += product.getUnitPrice();
		}
	}

}
