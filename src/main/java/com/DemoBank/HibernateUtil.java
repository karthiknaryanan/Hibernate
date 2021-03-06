package com.DemoBank;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import exercises.Movie;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;
	static {
		try {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.Movie.xml").addAnnotatedClass(Customer.class);
			sessionFactory = cfg.buildSessionFactory();

		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}