package app.model;

import java.text.DateFormat;

public class EmployeeModel {
	public enum Role {
		ADMIN,
		EMPLOYEE
	}
	
	private int id;
	private String name;
	private String email;
	private String password;
	private Role role = Role.EMPLOYEE;
	private DateFormat admission_date;
	private Boolean status = true;
	private DateFormat latest_login;
	
	public EmployeeModel(int id, 
		String name, 
		String email
		) {
		this.id = id;
		this.name = name;
		this.email = email;

	}
	
	/* --------------------------------------- */
	/* -------------- Getters ---------------- */
	/* --------------------------------------- */
	
	public int getId() {
		return this.id;
	}
	
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
	
	public DateFormat getAdmissionDate() {
		return this.admission_date;
	}
	
	public DateFormat getLatestLogin() {
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
	
	public void setAdmissionDate(DateFormat _admission_date) {
		this.admission_date = _admission_date;
	}
	
	public void setStatus(Boolean _status) {
		this.status = _status;
	}
	
	public void setLatestLogin(DateFormat _latest_login) {
		this.latest_login = _latest_login;
	}
}
