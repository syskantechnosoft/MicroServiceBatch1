package com.tcs.onlineapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.onlineapp.entity.Product;
import com.tcs.onlineapp.repo.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		Product pdt = new Product();
		Optional<Product> optionalProduct = productRepository.findById(id);
		if (optionalProduct.isPresent())
			pdt = optionalProduct.get();
		return pdt;
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		productRepository.save(product);

	}

	@Override
	public void editProduct(int id, Product product) {
		// TODO Auto-generated method stub
		productRepository.save(product);
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		productRepository.deleteById(id);
	}

}
