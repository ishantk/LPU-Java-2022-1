package com.auribises.session20b.model;

import org.springframework.data.annotation.Id;

public class Customer {
	
	@Id
	String id;
	
	String name;
	String phone;
	String email;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String id, String name, String phone, String email) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}
	
	
}
