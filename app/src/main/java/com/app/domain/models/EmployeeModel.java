package com.app.domain.models;

import java.util.Date;;

public class EmployeeModel {
	public enum Role {
		ADMIN,
		EMPLOYEE
	}
	
	private String name;
	private String email;
	private String password;
	private Role role = Role.EMPLOYEE;
	private Date admission_date;
	private Boolean status = true;
	private Date latest_login;
	
	public EmployeeModel(String name, String email) {
		this.name = name;
		this.email = email;

	}
	
	/* --------------------------------------- */
	/* -------------- Getters ---------------- */
	/* --------------------------------------- */
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public Role getRole() {
		return this.role;
	}
	
	public Boolean getStatus() {
		return this.status;
	}
	
	public Date getAdmissionDate() {
		return this.admission_date;
	}
	
	public Date getLatestLogin() {
		return this.latest_login;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	/* --------------------------------------- */
	/* -------------- Setters ---------------- */
	/* --------------------------------------- */
	
	public void setPassword(String _password) {
		this.password = _password;
	}
	
	public void setRole(Role _role) {
		this.role = _role;
	}
	
	public void setAdmissionDate(Date _admission_date) {
		this.admission_date = _admission_date;
	}
	
	public void setStatus(Boolean _status) {
		this.status = _status;
	}
	
	public void setLatestLogin(Date _latest_login) {
		this.latest_login = _latest_login;
	}
}
