package com.karthik.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Students {

	@Id
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	private String name;
	private String country;
	private String mobile;
	/*
	 * @OneToMany private Laptop laptop;
	 * 
	 * public Laptop getLaptop() { return laptop; }
	 * 
	 * public void setLaptop(Laptop laptop) { this.laptop = laptop; }
	 */

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
