package com.app.domain.entities.employee;

public class EmployeeContactEntity {
	private String Telephone;
	private String Email;
	
	public EmployeeContactEntity(String telephone, String email) {
		this.Telephone = telephone;
		this.Email = email;
	}
	
	public String getTelephone() {
		return this.Telephone;
	}
	
	public String getEmail() {
		return this.Email;
	}
}
