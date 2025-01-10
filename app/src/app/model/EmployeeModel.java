package app.model;

import java.text.DateFormat;

public class EmployeeModel {
	public enum Role {
		ADMIN,
		EMPLOYEE
	}
	
	private String name;
	private String email;
	private String password;
	private Role role = Role.EMPLOYEE;
	private DateFormat admission_date;
	private Boolean status;
	private DateFormat latest_login;
	
	public EmployeeModel(String name, 
		String email, 
		String password, 
		Role role, 
		DateFormat admission_date, 
		Boolean status, 
		DateFormat latest_login) {
		
		this.name = name;
		this.email = email;
		this.password = password;
		this.role = role;
		this.admission_date = admission_date;
		this.status = status;
		this.latest_login = latest_login;
	}
}
