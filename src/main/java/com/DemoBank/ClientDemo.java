package com.DemoBank;

import java.util.Scanner;

import org.hibernate.HibernateException;

public class ClientDemo {

	public static void main(String[] args) {
		CustomerDAO custdao = new CustomerDAO();
		try {
			/*
			 * System.out.println("CREATE");
			 * System.out.println("Enter the Customer Details"); Scanner scan = new
			 * Scanner(System.in); System.out.println("Enter the Customer Number"); int id =
			 * scan.nextInt(); System.out.println("Enter the Customer name"); String name =
			 * scan.next(); Customer customer = new Customer(id, name);
			 * custdao.addCustomer(customer); System.out.println("Created One Customer");
			 * scan.close();
			 */
			/*
			 * System.out.println("CREATE");
			 * System.out.println("Enter the Customer Details"); Scanner scan = new
			 * Scanner(System.in); int id= scan.nextInt(); custdao.readCustomer(id);
			 * scan.close();
			 */
			System.out.println("UPDATE");
		    System.out.println("Enter the Customer Id"); 
		    Scanner scan = new Scanner(System.in);
		    int id= scan.nextInt();
		    custdao.updateCustomer(id);
		    scan.close();
		} catch (HibernateException e) {
			System.out.println("Exception " + e);
		}
	}

}
