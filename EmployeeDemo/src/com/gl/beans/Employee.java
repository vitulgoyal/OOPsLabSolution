package com.gl.beans;

import com.gl.enums.Department;

public class Employee {
	
	private String firstName;
	private String lastName;
	private Department department; 

	private String emailID;
	private String password;
	
	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	

}
