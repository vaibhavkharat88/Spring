package com.vaibhav.Annotaion_based;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private int id;
	private String name;
	private String Salary;
	
	@Autowired
	private Address address;


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	
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


	public String getSalary() {
		return Salary;
	}


	public void setSalary(String salary) {
		Salary = salary;
	}


	@Override
	
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	public void show() {
		System.out.println(" id " +  id  + " name " + name + " salary "+  Salary );
	 
}
}
