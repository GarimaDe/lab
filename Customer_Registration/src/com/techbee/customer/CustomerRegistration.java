package com.techbee.customer;

public class CustomerRegistration {
	String last_name;
	String customer_id;
	String email_address;
	Long contact_number;
	String address;
	String state;
	String pincode;
	String user_password;
	
	String first_name;
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public Long getContact_number() {
		return contact_number;
	}
	public void setContact_number(Long contact_number) {
		this.contact_number = contact_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	@Override
	public String toString() {
		return "CustomerRegistration [first_name=" + first_name + ", last_name=" + last_name + ", customer_id="
				+ customer_id + ", email_address=" + email_address + ", contact_number=" + contact_number + ", address="
				+ address + ", state=" + state + ", pincode=" + pincode + ", user_password=" + user_password + "]";
	}
	


}