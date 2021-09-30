package com.DemoBank;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerDAO implements ICustomer {

	public void addCustomer(Customer c1) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(c1);
		tx.commit();
		session.close();

	}

	public void readCustomer(int custId) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Customer customer = session.get(Customer.class, 101);
		System.out.println("Name :" + customer.getCustomerName());
		tx.commit();
		session.close();

	}

	public void updateCustomer(String name) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Customer customer = session.get(Customer.class, 101);
		customer.setCustomerName(name);
		System.out.println("Updated the Customer Name");
		tx.commit();
		session.close();
	}

	public void updateCustomer(int custId) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Customer customer = session.get(Customer.class, 101);
		customer.setCustomerId(custId);
		session.update(customer);
		System.out.println("Updated the Customer Id");
		tx.commit();
		session.close();
	}

}
