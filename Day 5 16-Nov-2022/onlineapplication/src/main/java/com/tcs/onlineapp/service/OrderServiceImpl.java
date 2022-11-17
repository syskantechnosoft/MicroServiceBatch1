package com.tcs.onlineapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.onlineapp.entity.Order;
import com.tcs.onlineapp.repo.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderRepository;

	@Override
	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	@Override
	public Order getOrder(int id) {
		// TODO Auto-generated method stub
		Order pdt = new Order();
		Optional<Order> optionalOrder = orderRepository.findById(id);
		if (optionalOrder.isPresent())
			pdt = optionalOrder.get();
		return pdt;
	}

	@Override
	public void addOrder(Order order) {
		// TODO Auto-generated method stub
		orderRepository.save(order);

	}

	@Override
	public void editOrder(int id, Order order) {
		// TODO Auto-generated method stub
		orderRepository.save(order);
	}

	@Override
	public void deleteOrder(int id) {
		// TODO Auto-generated method stub
		orderRepository.deleteById(id);
	}

}
