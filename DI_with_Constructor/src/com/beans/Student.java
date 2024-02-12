package com.beans;



public class Student {
	private int rollNO;
	private String name;
	private Address address;
	
	public Student(int rollNO,String name,Address address) {
		this.rollNO=rollNO;
		this.name=name;
		this.address =address;
	}
	public void Show() {
		System.out.println("Roll_No : " + rollNO);
		System.out.println("name : " + name);
		System.out.println("Address : " + address);
		
	}

}
