package com.tcs.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tcs.hibernate.entity.Song;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Song.class);

		// Create Session Factory
		SessionFactory sessionFactory = cfg.buildSessionFactory();

		// Initialize Session Object
		Session session = sessionFactory.openSession();

		Song song1 = new Song();

		song1.setId(1);
		song1.setSongName("Broken Angel");
		song1.setArtist("Akon");

		session.beginTransaction();

		// Here we have used
		// save() method of JPA
		session.save(song1);

		session.getTransaction().commit();

		System.out.println("1 Record Added!!!");
	}

}
