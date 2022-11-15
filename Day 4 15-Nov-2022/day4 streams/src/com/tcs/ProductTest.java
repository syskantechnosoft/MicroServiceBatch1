package com.tcs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductTest {
	private List<Product> productList = new ArrayList<Product>();

	public ProductTest() {
		// System.out.println("New Object is created!!!");
		this.productList = new ArrayList<Product>();
		this.productList.add(new Product(100, "Lenovo Laptop", 45000.00f));
		this.productList.add(new Product(101, "Hp Laptop", 55000.00f));
		this.productList.add(new Product(102, "Sony Laptop", 75000.00f));
		this.productList.add(new Product(103, "Apple Laptop", 145000.00f));
		this.productList.add(new Product(104, "Samsung Laptop", 65000.00f));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductTest pt = new ProductTest();
		pt.productList.stream().filter(p -> p.getPrice() == 55000).forEach(p -> System.out.println(p.getName()));

		float totalPrice = pt.productList.stream().map(p -> p.getPrice()).reduce(0.0f, (sum, price) -> sum + price);
		float totalPrice2 = pt.productList.stream().map(p -> p.getPrice()).reduce(0.0f, Float::sum);
		
		double totalPrice3 = pt.productList.stream().collect(Collectors.summingDouble(p->p.getPrice()));
		System.out.println(totalPrice3);
		System.out.println("Total Price =" + totalPrice2);
		
		Product maxPrice = pt.productList.stream().max((p1,p2)->p1.getPrice()>p2.getPrice()?1:-1).get();
		Product minPrice = pt.productList.stream().min((p1,p2)->p1.getPrice()>p2.getPrice()?1:-1).get();
		
		System.out.println(maxPrice.getName() +" " + maxPrice.getPrice());
		System.out.println(minPrice.getName() +" " + minPrice.getPrice());
		
		
		long count = pt.productList.stream().filter(p->p.getPrice()>55000).count();
		
		System.out.println("count ="+count);
	}

}
