package com.jensderond;

public class Customer {

	private String name;
	private String email;
	private String mobileNumber;

	public Customer(String name) {
		this.name = name;
	}

	public void getBooking() {
		// TODO - implement Customer.getBooking
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
}