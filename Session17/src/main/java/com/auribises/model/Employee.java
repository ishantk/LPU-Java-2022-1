package com.auribises.model;

public class Employee {

	Integer eid;
	String name;
	String email;
	Integer salary;
	
	public Employee() {
	
	}

	public Employee(Integer eid, String name, String email, Integer salary) {
		this.eid = eid;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
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

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", email=" + email + ", salary=" + salary + "]";
	}
	
}
