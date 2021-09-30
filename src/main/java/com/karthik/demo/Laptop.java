package com.karthik.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	
	@Id
	private int lId;
	private String lName;
	
	/*
	 * @ManyToOne private Students student;
	 */
	
	/*
	 * public Students getStudent() { return student; } public void
	 * setStudent(Students student) { this.student = student; }
	 */
	public int getlId() {
		return lId;
	}
	public void setlId(int lId) {
		this.lId = lId;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}

}
