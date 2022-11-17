package com.tcs.onlineapp.service;

import com.tcs.onlineapp.entity.Cart;

public interface CartService {

	public Cart getCart(int id);

	public void addCart(Cart cart);

	public void editCart(int id, Cart cart);

	public void deleteCart(int id);

}
