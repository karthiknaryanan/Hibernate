package com.karthik.demo;

import org.hibernate.cfg.Configuration;
import org.hibernate.*;



public class App {
	
public static void main(String[] args) {
	Students student = new Students();
	student.setId(106);
	student.setName("Prabas");
	student.setCountry("US");
	student.setMobile("8115225525");
	
	Laptop lap = new Laptop();
	lap.setlId(10);
	lap.setlName("Dell");
	
	
	
	Configuration config = new Configuration().configure().addAnnotatedClass(Students.class).addAnnotatedClass(Laptop.class);
	SessionFactory sf= config.buildSessionFactory();
	Session session = sf.openSession();
	Transaction tx = session.beginTransaction();
	
	session.save(student);
	session.save(lap);
	
	tx.commit();
}
 
 
 

}
