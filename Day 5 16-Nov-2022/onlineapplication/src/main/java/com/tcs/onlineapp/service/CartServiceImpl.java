package com.tcs.onlineapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.onlineapp.entity.Cart;
import com.tcs.onlineapp.repo.CartRepository;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	CartRepository cartRepository;

	
	@Override
	public Cart getCart(int id) {
		// TODO Auto-generated method stub
		Cart obj = new Cart();
		Optional<Cart> optionalCart = cartRepository.findById(id);
		if (optionalCart.isPresent())
			obj = optionalCart.get();
		return obj;
	}

	@Override
	public void addCart(Cart cart) {
		// TODO Auto-generated method stub
		cartRepository.save(cart);

	}

	@Override
	public void editCart(int id, Cart cart) {
		// TODO Auto-generated method stub
		cartRepository.save(cart);
	}

	@Override
	public void deleteCart(int id) {
		// TODO Auto-generated method stub
		cartRepository.deleteById(id);
	}

}
