package com.tcs.onlineapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.onlineapp.entity.Cart;
import com.tcs.onlineapp.service.CartService;

@RestController
@RequestMapping("/api/v1/carts")
public class CartController {

	@Autowired
	CartService cartService;

	@GetMapping("/{id}")
	public Cart getCartById(@PathVariable int id) {
		return cartService.getCart(id);
	}

	@PostMapping("/")
	public void addCart(@RequestBody Cart cart) {
		cartService.addCart(cart);
	}

	@PutMapping("/{id}")
	public void editCart(@PathVariable int id, @RequestBody Cart cart) {
		cartService.editCart(id, cart);
	}

	@DeleteMapping("/{id}")
	public void deleteCart(@PathVariable int id) {
		cartService.deleteCart(id);
	}
}
