package com.student;

public class Address {
	
	private int houseNo;
	private String city;
	private int pincode;
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return "house_no : "+houseNo   + "," + "city :  "+city +","+"pincode : "+pincode;
	}

	
	
	
	
	
	
	
	
	
	
	
		}
		
		
		

	



