package com.student;


public class Student {
	private int rollNO;
	private String name;
	private Address address;
	
	public void setRollNO(int rollNO) {
		this.rollNO = rollNO;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	public void Show() {
		System.out.println("Roll_No : " + rollNO);
		System.out.println("name : " + name);
		System.out.println("Address : " + address);
		
	}
	
	
	

}
