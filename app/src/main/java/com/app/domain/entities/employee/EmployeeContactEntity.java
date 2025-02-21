package com.app.domain.entities.employee;

public class EmployeeContactEntity {
	private String Telephone;
	private String Email;

	public EmployeeContactEntity(String telephone, String email) {
	    if (telephone == null || telephone.isEmpty()) {
	        throw new IllegalArgumentException("Telephone cannot be null or empty");
	    }
	    if (email == null || email.isEmpty()) {
	        throw new IllegalArgumentException("Email cannot be null or empty");
	    }
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
