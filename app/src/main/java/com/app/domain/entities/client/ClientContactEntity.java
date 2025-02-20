package com.app.domain.entities.client;

public class ClientContactEntity {
	private String Telephone;
	private String Email;
	
	public ClientContactEntity(String telephone, String email) {
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
