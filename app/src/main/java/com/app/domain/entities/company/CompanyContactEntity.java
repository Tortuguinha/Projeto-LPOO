package com.app.domain.entities.company;

public class CompanyContactEntity {
	private String Telephone;
	private String Email;
	
	public CompanyContactEntity(String telephone, String email) {
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
