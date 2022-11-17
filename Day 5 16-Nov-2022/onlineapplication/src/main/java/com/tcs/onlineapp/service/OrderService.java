package com.tcs.onlineapp.service;

import java.util.List;

import com.tcs.onlineapp.entity.Order;

public interface OrderService {

	public List<Order> getOrders();

	public Order getOrder(int id);

	public void addOrder(Order order);

	public void editOrder(int id, Order order);

	public void deleteOrder(int id);

}
