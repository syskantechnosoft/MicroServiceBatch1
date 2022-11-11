package com.tcs.jpademo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tcs.jpademo.entity.Employee;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpademo");
		EntityManager em = emf.createEntityManager();

		Employee employee = new Employee();
		employee.setId(101);
		employee.setName("JPA");
		employee.setEmail("jpa@gmail.com");

		// Insert Operation
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();

		System.out.println("1 record added!!!");

		// readbyId operation
		em.getTransaction().begin();
		Employee e = em.find(Employee.class, 101);
		System.out.println(e);
		em.getTransaction().commit();

		// update Operation
		em.getTransaction().begin();
		Employee e2 = em.find(Employee.class, 101);
		e2.setEmail("updated@gmail.com");
		e2.setName("updated");
		em.persist(e2);
		em.getTransaction().commit();
		System.out.println("1 Record updated!!!");

		// readbyId operation
		em.getTransaction().begin();
		Employee e3 = em.find(Employee.class, 101);
		System.out.println(e3);
		em.getTransaction().commit();

		// delete Operation
		em.getTransaction().begin();
		Employee e1 = em.find(Employee.class, 101);
		em.remove(e1);
		em.getTransaction().commit();
		System.out.println("1 Record Removed!!!!");

		// readAll operation
		em.getTransaction().begin();
		Query query = em.createNamedQuery("Employee.findAll");
		List<Employee> employees = query.getResultList();
		for (Employee employee2 : employees) {
			System.out.println(employee2);
		}
		em.getTransaction().commit();
	}

}
