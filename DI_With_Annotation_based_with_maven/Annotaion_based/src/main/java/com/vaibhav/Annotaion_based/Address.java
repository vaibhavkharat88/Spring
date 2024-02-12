package com.vaibhav.Annotaion_based;

public class Address {
	private String addressLine1;
	private String addressLine2;
	private String city;
	private int code;
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " AddressLine1 " +  addressLine1  + " addressLine2 "+ addressLine2 + " city " +  city + " code " + code	;
	} 
	
	

}
