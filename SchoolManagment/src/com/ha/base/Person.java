package com.ha.base;

public class Person {

	
	private String name;
	private long  phoneNumber;
	
	private String mailID;
	private String address;
	
	private static String schoolName;
	private static String schoolAddress;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		if(String.valueOf(phoneNumber).length()==10) {
		this.phoneNumber = phoneNumber;}
		
		else {
			System.out.println("Invalid phone number");
		}
	}
	
}
