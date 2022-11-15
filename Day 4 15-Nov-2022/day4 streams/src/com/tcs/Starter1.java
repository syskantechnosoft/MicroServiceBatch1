package com.tcs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Starter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(100, "Lenovo Laptop", 45000.00f));
		productList.add(new Product(101, "Hp Laptop", 55000.00f));
		productList.add(new Product(102, "Sony Laptop", 75000.00f));
		productList.add(new Product(103, "Apple Laptop", 145000.00f));
		productList.add(new Product(104, "Samsung Laptop", 65000.00f));
		
		List<Float> productPriceList = new ArrayList<Float>();
		
		for (Product p : productList) {
			if(p.getPrice()<=65000)
				productPriceList.add(p.getPrice());
			
		}
		
		System.out.println(productPriceList);
		
		List<Float> productPriceList1 = productList.stream()
				.filter(p->p.getPrice()<=65000)
				.map(p->p.getPrice())
				.collect(Collectors.toList());
		
		System.out.println(productPriceList1);
	}

}
