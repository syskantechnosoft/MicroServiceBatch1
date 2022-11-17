package com.tcs.onlineapp.service;

import java.util.List;

import com.tcs.onlineapp.entity.Product;

public interface ProductService {

	public List<Product> getProducts();

	public Product getProduct(int id);

	public void addProduct(Product product);

	public void editProduct(int id, Product product);

	public void deleteProduct(int id);

}
