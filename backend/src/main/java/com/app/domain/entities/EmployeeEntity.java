package com.app.domain.entities;

import java.util.Date;;

public class EmployeeEntity {
	
	public enum ROLE {
		ADMIN,
		ATTENDANT,
		TECHNICIAN
	}
	
	private String Name;
	private String Email;
	private String Password;
	private String CPF;
	private ROLE Role = ROLE.ATTENDANT;
	private Date Admission_date;
	private Boolean Status = true;
	private Date Latest_login;
	
	public EmployeeEntity(String name, String email, String password, String cpf, ROLE role, Date admission_date, Boolean status) {
		this.Name = name;
		this.Email = email;
		this.Password = password;
		this.CPF = cpf;
		this.Role = role != null ? role : ROLE.ATTENDANT;
		this.Admission_date = admission_date != null ? admission_date : new Date();
		this.Status = status != null ? status : true;
	}
	
	/* --------------------------------------- */
	/* -------------- Getters ---------------- */
	/* --------------------------------------- */
	
	public String getName() {
		return this.Name;
	}
	
	public String getEmail() {
		return this.Email;
	}

	public String getPassword() {
		return this.Password;
	}

	public String getCPF() {
		return this.CPF;
	}

	
	public ROLE getRole() {
		return this.Role;
	}
	
	public Boolean getStatus() {
		return this.Status;
	}
	
	public Date getAdmissionDate() {
		return this.Admission_date;
	}
	
	public Date getLatestLogin() {
		return this.Latest_login;
	}
}
