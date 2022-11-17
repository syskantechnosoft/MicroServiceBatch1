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

import com.tcs.onlineapp.entity.Order;
import com.tcs.onlineapp.service.OrderService;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

	@Autowired
	OrderService orderService;

	@GetMapping("/")
	public List<Order> getOrders() {
		return orderService.getOrders();
	}

	@GetMapping("/{id}")
	public Order getOrderById(@PathVariable int id) {
		return orderService.getOrder(id);
	}

	@PostMapping("/")
	public void addOrder(@RequestBody Order order) {
		orderService.addOrder(order);
	}
	
	@PutMapping("/{id}")
	public void editOrder(@PathVariable int id, @RequestBody Order order) {
		orderService.editOrder(id, order);
	}
	
	@DeleteMapping("/{id}")
	public void deleteOrder(@PathVariable int id) {
		orderService.deleteOrder(id);
	}
}
