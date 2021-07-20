package com.ojas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeeDetails")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_DETAILS")
	private int eid;
	@Column(name = "FIRSTNAME")
	private String firstName;
	@Column(name = "LASTNAME")
	private String lastName;
	@Column(name = "GMAIL")
	private String gmail;
	public Employee() {
		super();
	}
	public Employee(int eid, String firstName, String lastName, String gmail) {
		super();
		this.eid = eid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gmail = gmail;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", firstName=" + firstName + ", lastName=" + lastName + ", gmail=" + gmail
				+ "]";
	}
	
	
	

}
