package com.tcs.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tcs.hibernate.entity.Song;

public class Starter {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
//		cfg.addAnnotatedClass(Song.class);

		// Create Session Factory
		SessionFactory sessionFactory = cfg.buildSessionFactory();

		// Initialize Session Object
		Session session = sessionFactory.openSession();	
		
		Song s1= new Song();
		s1.setId(2);
		s1.setSongName("Test");
		s1.setArtist("testing");
		
		session.beginTransaction();
		// Here we have used save() method of JPA
		session.save(s1);
		session.getTransaction().commit();
		System.out.println("1 Record Added!!!");
	}

}
